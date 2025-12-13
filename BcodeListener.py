# Generated from Bcode.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .BcodeParser import BcodeParser
else:
    from BcodeParser import BcodeParser

# This class defines a complete listener for a parse tree produced by BcodeParser.
class BcodeListener(ParseTreeListener):

    # Enter a parse tree produced by BcodeParser#start_.
    def enterStart_(self, ctx:BcodeParser.Start_Context):
        pass

    # Exit a parse tree produced by BcodeParser#start_.
    def exitStart_(self, ctx:BcodeParser.Start_Context):
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



del BcodeParser