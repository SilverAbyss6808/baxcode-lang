
# this stuff handles all the commands pretty much

from antlr4 import *
from BcodeLexer import BcodeLexer
from BcodeParser import BcodeParser
from BcodeListener import BcodeListener


class BcodeExec(BcodeListener):

    active_vars = {}
    temp = 0

    def exitExpr_arith(self, ctx:BcodeParser.Expr_arithContext):
        op = ctx.getChild(1).getText()

        val1 = ctx.getChild(0).getText()
        val2 = ctx.getChild(2).getText()

        if (val1[0].isupper()): 
            val1 = BcodeExec.active_vars[val1]
        else: val1 = int(val1)

        if (val2[0].isupper()): 
            val2 = BcodeExec.active_vars[val2]
        else: val2 = int(val2)

        if   (op == '+'): BcodeExec.temp = val1 + val2
        elif (op == '-'): BcodeExec.temp = val1 - val2
        elif (op == '*'): BcodeExec.temp = val1 * val2
        elif (op == '/'): BcodeExec.temp = val1 / val2
        
    def exitVar_def(self, ctx:BcodeParser.Var_defContext):
        name = ctx.getChild(1)
        BcodeExec.active_vars[name] = None

    def exitVar_asg(self, ctx:BcodeParser.Var_asgContext):
        name = ctx.getChild(1).getText()
        value = ctx.getChild(3).getText()

        op_found = False

        if (len(value) != 0 and value != None and value[0] == '\"'):
            value = value[1:len(value)-1]
        
        # checks if numeric value is actually an expression, sets variable to result if it is
        for i in range(0, len(value)):
            if ((value[i] == '+' or
                 value[i] == '-' or
                 value[i] == '*' or
                 value[i] == '/') and op_found == False):
                BcodeExec.active_vars[name] = BcodeExec.temp
                op_found = True
        
        if (op_found == False):
            BcodeExec.active_vars[name] = value

    def exitVar(self, ctx:BcodeParser.VarContext):
        if ctx.getChild(0).getText() in BcodeExec.active_vars:
            return BcodeExec.active_vars[ctx.getChild(0).getText()]

    def exitFnc_cprint(self, ctx:BcodeParser.Fnc_cprintContext):
        litvar = ctx.getChild(2).getText()

        if (litvar[0].isupper()):
            litvar = BcodeExec.active_vars[litvar]

        if (type(litvar) == str and litvar[0] == '\"'):
            litvar = litvar[1:len(litvar) - 1]

        print(litvar)

