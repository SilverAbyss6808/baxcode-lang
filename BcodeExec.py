
# this stuff handles all the commands pretty much

from antlr4 import *
from BcodeLexer import BcodeLexer
from BcodeParser import BcodeParser
from BcodeListener import BcodeListener


class BcodeExec(BcodeListener):

    active_vars = {}

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

        if   (op == '+'): return (val1 + val2)
        elif (op == '-'): return (val1 - val2)
        elif (op == '*'): return (val1 * val2)
        elif (op == '/'): return (val1 / val2)
        
    def exitExpr_cmp(self, ctx:BcodeParser.Expr_cmpContext):
        op = ctx.getChild(1).getText()
        val1 = ctx.getChild(0).getText()
        val2 = ctx.getChild(2).getText()

        if (val1[0].isupper()): 
            val1 = BcodeExec.active_vars[val1]
        else: val1 = int(val1)

        if (val2[0].isupper()): 
            val2 = BcodeExec.active_vars[val2]
        else: val2 = int(val2)

        if (op == '>'): return (val1 > val2)
        elif (op == '<'): return (val1 < val2)

    def exitVar_def(self, ctx:BcodeParser.Var_defContext):
        name = ctx.getChild(1).getText()
        BcodeExec.active_vars[name] = None

    def exitVar_asg(self, ctx:BcodeParser.Var_asgContext):
        typename = ctx.getChild(0)
        type = typename.getChild(0).getText()
        name = typename.getChild(1).getText()
        value = ctx.getChild(2).getText()

        if (len(value) != 0 and value != None and value[0] == '\"'):
            value = value[1:len(value)-1]

        BcodeExec.active_vars[name] = value

    def exitVar_reasg(self, ctx:BcodeParser.Var_reasgContext):
        pass

    def exitVar(self, ctx:BcodeParser.VarContext):
        if ctx.getChild(0).getText() in BcodeExec.active_vars:
            return BcodeExec.active_vars[ctx.getChild(0).getText()]

    def exitFnc_cprint(self, ctx:BcodeParser.Fnc_cprintContext):
        litvar = ctx.getChild(2).getText()
        lenvar = len(litvar)

        if (litvar[0].isupper()):
            litvar = BcodeExec.active_vars[litvar]

        if (lenvar != 0 and litvar != None and litvar[0] == '\"'):
            litvar = litvar[1:lenvar-1]

        print(litvar)

    def exitStm_return(self, ctx:BcodeParser.Stm_returnContext):
        pass

    def exitStatement(self, ctx:BcodeParser.StatementContext):
        pass

    def enterProgram(self, ctx:BcodeParser.ProgramContext):
        pass

    def exitProgram(self, ctx:BcodeParser.ProgramContext):
        pass

    def enterStart_(self, ctx:BcodeParser.Start_Context):
        pass

    def exitStart_(self, ctx:BcodeParser.Start_Context):
        pass

