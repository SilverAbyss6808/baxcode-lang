# Generated from Bcode.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .BcodeParser import BcodeParser
else:
    from BcodeParser import BcodeParser

# This class defines a complete listener for a parse tree produced by BcodeParser.
class BcodeListener(ParseTreeListener):

    # Enter a parse tree produced by BcodeParser#opr_arith.
    def enterOpr_arith(self, ctx:BcodeParser.Opr_arithContext):
        pass

    # Exit a parse tree produced by BcodeParser#opr_arith.
    def exitOpr_arith(self, ctx:BcodeParser.Opr_arithContext):
        pass


    # Enter a parse tree produced by BcodeParser#opr_cmp.
    def enterOpr_cmp(self, ctx:BcodeParser.Opr_cmpContext):
        pass

    # Exit a parse tree produced by BcodeParser#opr_cmp.
    def exitOpr_cmp(self, ctx:BcodeParser.Opr_cmpContext):
        pass


    # Enter a parse tree produced by BcodeParser#sym.
    def enterSym(self, ctx:BcodeParser.SymContext):
        pass

    # Exit a parse tree produced by BcodeParser#sym.
    def exitSym(self, ctx:BcodeParser.SymContext):
        pass


    # Enter a parse tree produced by BcodeParser#str.
    def enterStr(self, ctx:BcodeParser.StrContext):
        pass

    # Exit a parse tree produced by BcodeParser#str.
    def exitStr(self, ctx:BcodeParser.StrContext):
        pass


    # Enter a parse tree produced by BcodeParser#lit.
    def enterLit(self, ctx:BcodeParser.LitContext):
        pass

    # Exit a parse tree produced by BcodeParser#lit.
    def exitLit(self, ctx:BcodeParser.LitContext):
        pass


    # Enter a parse tree produced by BcodeParser#var.
    def enterVar(self, ctx:BcodeParser.VarContext):
        pass

    # Exit a parse tree produced by BcodeParser#var.
    def exitVar(self, ctx:BcodeParser.VarContext):
        pass


    # Enter a parse tree produced by BcodeParser#typ.
    def enterTyp(self, ctx:BcodeParser.TypContext):
        pass

    # Exit a parse tree produced by BcodeParser#typ.
    def exitTyp(self, ctx:BcodeParser.TypContext):
        pass


    # Enter a parse tree produced by BcodeParser#expr_arith.
    def enterExpr_arith(self, ctx:BcodeParser.Expr_arithContext):
        pass

    # Exit a parse tree produced by BcodeParser#expr_arith.
    def exitExpr_arith(self, ctx:BcodeParser.Expr_arithContext):
        pass


    # Enter a parse tree produced by BcodeParser#expr_cmp.
    def enterExpr_cmp(self, ctx:BcodeParser.Expr_cmpContext):
        pass

    # Exit a parse tree produced by BcodeParser#expr_cmp.
    def exitExpr_cmp(self, ctx:BcodeParser.Expr_cmpContext):
        pass


    # Enter a parse tree produced by BcodeParser#var_def.
    def enterVar_def(self, ctx:BcodeParser.Var_defContext):
        pass

    # Exit a parse tree produced by BcodeParser#var_def.
    def exitVar_def(self, ctx:BcodeParser.Var_defContext):
        pass


    # Enter a parse tree produced by BcodeParser#var_asg.
    def enterVar_asg(self, ctx:BcodeParser.Var_asgContext):
        pass

    # Exit a parse tree produced by BcodeParser#var_asg.
    def exitVar_asg(self, ctx:BcodeParser.Var_asgContext):
        pass


    # Enter a parse tree produced by BcodeParser#var_reasg.
    def enterVar_reasg(self, ctx:BcodeParser.Var_reasgContext):
        pass

    # Exit a parse tree produced by BcodeParser#var_reasg.
    def exitVar_reasg(self, ctx:BcodeParser.Var_reasgContext):
        pass


    # Enter a parse tree produced by BcodeParser#fnc_cprint.
    def enterFnc_cprint(self, ctx:BcodeParser.Fnc_cprintContext):
        pass

    # Exit a parse tree produced by BcodeParser#fnc_cprint.
    def exitFnc_cprint(self, ctx:BcodeParser.Fnc_cprintContext):
        pass


    # Enter a parse tree produced by BcodeParser#stm_return.
    def enterStm_return(self, ctx:BcodeParser.Stm_returnContext):
        pass

    # Exit a parse tree produced by BcodeParser#stm_return.
    def exitStm_return(self, ctx:BcodeParser.Stm_returnContext):
        pass


    # Enter a parse tree produced by BcodeParser#statement.
    def enterStatement(self, ctx:BcodeParser.StatementContext):
        pass

    # Exit a parse tree produced by BcodeParser#statement.
    def exitStatement(self, ctx:BcodeParser.StatementContext):
        pass


    # Enter a parse tree produced by BcodeParser#program.
    def enterProgram(self, ctx:BcodeParser.ProgramContext):
        pass

    # Exit a parse tree produced by BcodeParser#program.
    def exitProgram(self, ctx:BcodeParser.ProgramContext):
        pass


    # Enter a parse tree produced by BcodeParser#start_.
    def enterStart_(self, ctx:BcodeParser.Start_Context):
        pass

    # Exit a parse tree produced by BcodeParser#start_.
    def exitStart_(self, ctx:BcodeParser.Start_Context):
        pass



del BcodeParser