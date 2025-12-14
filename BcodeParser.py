# Generated from Bcode.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,29,162,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,1,0,1,0,1,1,1,1,1,1,1,1,1,1,3,1,42,
        8,1,5,1,44,8,1,10,1,12,1,47,9,1,1,1,1,1,1,1,1,1,1,1,5,1,54,8,1,10,
        1,12,1,57,9,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,2,70,
        8,2,1,2,1,2,1,3,1,3,3,3,76,8,3,1,3,1,3,1,3,3,3,81,8,3,4,3,83,8,3,
        11,3,12,3,84,1,4,1,4,3,4,89,8,4,1,4,1,4,1,4,3,4,94,8,4,1,5,1,5,1,
        5,1,6,1,6,1,6,1,6,3,6,103,8,6,1,6,1,6,3,6,107,8,6,1,6,3,6,110,8,
        6,3,6,112,8,6,1,7,1,7,1,7,1,7,1,7,1,7,3,7,120,8,7,1,7,1,7,1,7,1,
        7,3,7,126,8,7,1,8,1,8,1,8,1,8,5,8,132,8,8,10,8,12,8,135,9,8,1,8,
        1,8,1,9,1,9,1,9,1,9,1,9,3,9,144,8,9,1,9,1,9,1,10,1,10,1,11,1,11,
        1,12,1,12,1,13,1,13,1,14,1,14,1,15,1,15,1,16,1,16,1,16,1,55,0,17,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,0,6,1,0,6,9,1,0,10,
        11,1,0,13,18,1,0,19,20,3,0,5,5,22,23,29,29,1,0,25,28,171,0,34,1,
        0,0,0,2,36,1,0,0,0,4,69,1,0,0,0,6,75,1,0,0,0,8,88,1,0,0,0,10,95,
        1,0,0,0,12,98,1,0,0,0,14,113,1,0,0,0,16,127,1,0,0,0,18,138,1,0,0,
        0,20,147,1,0,0,0,22,149,1,0,0,0,24,151,1,0,0,0,26,153,1,0,0,0,28,
        155,1,0,0,0,30,157,1,0,0,0,32,159,1,0,0,0,34,35,3,2,1,0,35,1,1,0,
        0,0,36,37,5,1,0,0,37,38,3,30,15,0,38,45,5,13,0,0,39,41,3,10,5,0,
        40,42,5,18,0,0,41,40,1,0,0,0,41,42,1,0,0,0,42,44,1,0,0,0,43,39,1,
        0,0,0,44,47,1,0,0,0,45,43,1,0,0,0,45,46,1,0,0,0,46,48,1,0,0,0,47,
        45,1,0,0,0,48,49,5,14,0,0,49,50,5,19,0,0,50,51,3,32,16,0,51,55,5,
        15,0,0,52,54,3,4,2,0,53,52,1,0,0,0,54,57,1,0,0,0,55,56,1,0,0,0,55,
        53,1,0,0,0,56,58,1,0,0,0,57,55,1,0,0,0,58,59,3,18,9,0,59,60,5,16,
        0,0,60,61,5,17,0,0,61,3,1,0,0,0,62,70,3,6,3,0,63,70,3,8,4,0,64,70,
        3,10,5,0,65,70,3,12,6,0,66,70,3,14,7,0,67,70,3,30,15,0,68,70,3,16,
        8,0,69,62,1,0,0,0,69,63,1,0,0,0,69,64,1,0,0,0,69,65,1,0,0,0,69,66,
        1,0,0,0,69,67,1,0,0,0,69,68,1,0,0,0,70,71,1,0,0,0,71,72,5,17,0,0,
        72,5,1,0,0,0,73,76,3,28,14,0,74,76,3,30,15,0,75,73,1,0,0,0,75,74,
        1,0,0,0,76,82,1,0,0,0,77,80,3,20,10,0,78,81,3,28,14,0,79,81,3,30,
        15,0,80,78,1,0,0,0,80,79,1,0,0,0,81,83,1,0,0,0,82,77,1,0,0,0,83,
        84,1,0,0,0,84,82,1,0,0,0,84,85,1,0,0,0,85,7,1,0,0,0,86,89,3,28,14,
        0,87,89,3,30,15,0,88,86,1,0,0,0,88,87,1,0,0,0,89,90,1,0,0,0,90,93,
        3,22,11,0,91,94,3,28,14,0,92,94,3,30,15,0,93,91,1,0,0,0,93,92,1,
        0,0,0,94,9,1,0,0,0,95,96,3,32,16,0,96,97,3,30,15,0,97,11,1,0,0,0,
        98,99,3,10,5,0,99,111,5,12,0,0,100,112,3,28,14,0,101,103,5,13,0,
        0,102,101,1,0,0,0,102,103,1,0,0,0,103,106,1,0,0,0,104,107,3,6,3,
        0,105,107,3,8,4,0,106,104,1,0,0,0,106,105,1,0,0,0,107,109,1,0,0,
        0,108,110,5,14,0,0,109,108,1,0,0,0,109,110,1,0,0,0,110,112,1,0,0,
        0,111,100,1,0,0,0,111,102,1,0,0,0,112,13,1,0,0,0,113,114,3,30,15,
        0,114,125,5,12,0,0,115,126,3,28,14,0,116,119,5,13,0,0,117,120,3,
        6,3,0,118,120,3,8,4,0,119,117,1,0,0,0,119,118,1,0,0,0,120,121,1,
        0,0,0,121,122,5,14,0,0,122,126,1,0,0,0,123,126,3,6,3,0,124,126,3,
        8,4,0,125,115,1,0,0,0,125,116,1,0,0,0,125,123,1,0,0,0,125,124,1,
        0,0,0,126,15,1,0,0,0,127,128,5,21,0,0,128,133,5,13,0,0,129,132,3,
        28,14,0,130,132,3,30,15,0,131,129,1,0,0,0,131,130,1,0,0,0,132,135,
        1,0,0,0,133,131,1,0,0,0,133,134,1,0,0,0,134,136,1,0,0,0,135,133,
        1,0,0,0,136,137,5,14,0,0,137,17,1,0,0,0,138,143,5,20,0,0,139,144,
        3,28,14,0,140,144,3,30,15,0,141,144,3,6,3,0,142,144,3,8,4,0,143,
        139,1,0,0,0,143,140,1,0,0,0,143,141,1,0,0,0,143,142,1,0,0,0,144,
        145,1,0,0,0,145,146,5,17,0,0,146,19,1,0,0,0,147,148,7,0,0,0,148,
        21,1,0,0,0,149,150,7,1,0,0,150,23,1,0,0,0,151,152,7,2,0,0,152,25,
        1,0,0,0,153,154,7,3,0,0,154,27,1,0,0,0,155,156,7,4,0,0,156,29,1,
        0,0,0,157,158,5,24,0,0,158,31,1,0,0,0,159,160,7,5,0,0,160,33,1,0,
        0,0,18,41,45,55,69,75,80,84,88,93,102,106,109,111,119,125,131,133,
        143
    ]

class BcodeParser ( Parser ):

    grammarFileName = "Bcode.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'+'", "'-'", "'*'", "'/'", 
                     "'>'", "'<'", "'='", "'('", "')'", "'{'", "'}'", "';'", 
                     "','", "'returns'", "'return'", "'cprint'", "<INVALID>", 
                     "'NONE'", "<INVALID>", "'int'", "'bool'", "'none'", 
                     "'string'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "ITEM_COMMENT", "ITEM_WHITESPACE", 
                      "ITEM_NEWLINE", "LITERAL_STRING", "OPERATOR_ADD", 
                      "OPERATOR_SUBTR", "OPERATOR_MULT", "OPERATOR_DIV", 
                      "OPERATOR_GTHAN", "OPERATOR_LTHAN", "OPERATOR_ASSIGN", 
                      "SYMBOL_OPENPAR", "SYMBOL_CLOSEPAR", "SYMBOL_OPENBRACE", 
                      "SYMBOL_CLOSEBRACE", "SYMBOL_SEMICOLON", "SYMBOL_COMMA", 
                      "STRUCTURE_RETURNS", "STRUCTURE_RETURN", "FUNCTION_CPRINT", 
                      "LITERAL_BOOL", "LITERAL_NONE", "ITEM_VARNAME", "TYPE_INTEGER", 
                      "TYPE_BOOL", "TYPE_NONE", "TYPE_STRING", "LITERAL_INTEGER" ]

    RULE_start_ = 0
    RULE_program = 1
    RULE_statement = 2
    RULE_expr_arith = 3
    RULE_expr_cmp = 4
    RULE_var_def = 5
    RULE_var_asg = 6
    RULE_var_reasg = 7
    RULE_fnc_cprint = 8
    RULE_stm_return = 9
    RULE_opr_arith = 10
    RULE_opr_cmp = 11
    RULE_sym = 12
    RULE_str = 13
    RULE_lit = 14
    RULE_var = 15
    RULE_typ = 16

    ruleNames =  [ "start_", "program", "statement", "expr_arith", "expr_cmp", 
                   "var_def", "var_asg", "var_reasg", "fnc_cprint", "stm_return", 
                   "opr_arith", "opr_cmp", "sym", "str", "lit", "var", "typ" ]

    EOF = Token.EOF
    T__0=1
    ITEM_COMMENT=2
    ITEM_WHITESPACE=3
    ITEM_NEWLINE=4
    LITERAL_STRING=5
    OPERATOR_ADD=6
    OPERATOR_SUBTR=7
    OPERATOR_MULT=8
    OPERATOR_DIV=9
    OPERATOR_GTHAN=10
    OPERATOR_LTHAN=11
    OPERATOR_ASSIGN=12
    SYMBOL_OPENPAR=13
    SYMBOL_CLOSEPAR=14
    SYMBOL_OPENBRACE=15
    SYMBOL_CLOSEBRACE=16
    SYMBOL_SEMICOLON=17
    SYMBOL_COMMA=18
    STRUCTURE_RETURNS=19
    STRUCTURE_RETURN=20
    FUNCTION_CPRINT=21
    LITERAL_BOOL=22
    LITERAL_NONE=23
    ITEM_VARNAME=24
    TYPE_INTEGER=25
    TYPE_BOOL=26
    TYPE_NONE=27
    TYPE_STRING=28
    LITERAL_INTEGER=29

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Start_Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def program(self):
            return self.getTypedRuleContext(BcodeParser.ProgramContext,0)


        def getRuleIndex(self):
            return BcodeParser.RULE_start_

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart_" ):
                listener.enterStart_(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart_" ):
                listener.exitStart_(self)




    def start_(self):

        localctx = BcodeParser.Start_Context(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.program()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def var(self):
            return self.getTypedRuleContext(BcodeParser.VarContext,0)


        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def STRUCTURE_RETURNS(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURNS, 0)

        def typ(self):
            return self.getTypedRuleContext(BcodeParser.TypContext,0)


        def SYMBOL_OPENBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_OPENBRACE, 0)

        def stm_return(self):
            return self.getTypedRuleContext(BcodeParser.Stm_returnContext,0)


        def SYMBOL_CLOSEBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0)

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def var_def(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.Var_defContext)
            else:
                return self.getTypedRuleContext(BcodeParser.Var_defContext,i)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.StatementContext)
            else:
                return self.getTypedRuleContext(BcodeParser.StatementContext,i)


        def SYMBOL_COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.SYMBOL_COMMA)
            else:
                return self.getToken(BcodeParser.SYMBOL_COMMA, i)

        def getRuleIndex(self):
            return BcodeParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = BcodeParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(BcodeParser.T__0)
            self.state = 37
            self.var()
            self.state = 38
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 45
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 503316480) != 0):
                self.state = 39
                self.var_def()
                self.state = 41
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==18:
                    self.state = 40
                    self.match(BcodeParser.SYMBOL_COMMA)


                self.state = 47
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 48
            self.match(BcodeParser.SYMBOL_CLOSEPAR)
            self.state = 49
            self.match(BcodeParser.STRUCTURE_RETURNS)
            self.state = 50
            self.typ()
            self.state = 51
            self.match(BcodeParser.SYMBOL_OPENBRACE)
            self.state = 55
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 52
                    self.statement() 
                self.state = 57
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

            self.state = 58
            self.stm_return()
            self.state = 59
            self.match(BcodeParser.SYMBOL_CLOSEBRACE)
            self.state = 60
            self.match(BcodeParser.SYMBOL_SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def expr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Expr_arithContext,0)


        def expr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Expr_cmpContext,0)


        def var_def(self):
            return self.getTypedRuleContext(BcodeParser.Var_defContext,0)


        def var_asg(self):
            return self.getTypedRuleContext(BcodeParser.Var_asgContext,0)


        def var_reasg(self):
            return self.getTypedRuleContext(BcodeParser.Var_reasgContext,0)


        def var(self):
            return self.getTypedRuleContext(BcodeParser.VarContext,0)


        def fnc_cprint(self):
            return self.getTypedRuleContext(BcodeParser.Fnc_cprintContext,0)


        def getRuleIndex(self):
            return BcodeParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = BcodeParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 69
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.state = 62
                self.expr_arith()
                pass

            elif la_ == 2:
                self.state = 63
                self.expr_cmp()
                pass

            elif la_ == 3:
                self.state = 64
                self.var_def()
                pass

            elif la_ == 4:
                self.state = 65
                self.var_asg()
                pass

            elif la_ == 5:
                self.state = 66
                self.var_reasg()
                pass

            elif la_ == 6:
                self.state = 67
                self.var()
                pass

            elif la_ == 7:
                self.state = 68
                self.fnc_cprint()
                pass


            self.state = 71
            self.match(BcodeParser.SYMBOL_SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expr_arithContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lit(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.LitContext)
            else:
                return self.getTypedRuleContext(BcodeParser.LitContext,i)


        def var(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.VarContext)
            else:
                return self.getTypedRuleContext(BcodeParser.VarContext,i)


        def opr_arith(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.Opr_arithContext)
            else:
                return self.getTypedRuleContext(BcodeParser.Opr_arithContext,i)


        def getRuleIndex(self):
            return BcodeParser.RULE_expr_arith

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_arith" ):
                listener.enterExpr_arith(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_arith" ):
                listener.exitExpr_arith(self)




    def expr_arith(self):

        localctx = BcodeParser.Expr_arithContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_expr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 73
                self.lit()
                pass
            elif token in [24]:
                self.state = 74
                self.var()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 82 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 77
                self.opr_arith()
                self.state = 80
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [5, 22, 23, 29]:
                    self.state = 78
                    self.lit()
                    pass
                elif token in [24]:
                    self.state = 79
                    self.var()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 84 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 960) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Expr_cmpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Opr_cmpContext,0)


        def lit(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.LitContext)
            else:
                return self.getTypedRuleContext(BcodeParser.LitContext,i)


        def var(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.VarContext)
            else:
                return self.getTypedRuleContext(BcodeParser.VarContext,i)


        def getRuleIndex(self):
            return BcodeParser.RULE_expr_cmp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_cmp" ):
                listener.enterExpr_cmp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_cmp" ):
                listener.exitExpr_cmp(self)




    def expr_cmp(self):

        localctx = BcodeParser.Expr_cmpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_expr_cmp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 86
                self.lit()
                pass
            elif token in [24]:
                self.state = 87
                self.var()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 90
            self.opr_cmp()
            self.state = 93
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 91
                self.lit()
                pass
            elif token in [24]:
                self.state = 92
                self.var()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_defContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def typ(self):
            return self.getTypedRuleContext(BcodeParser.TypContext,0)


        def var(self):
            return self.getTypedRuleContext(BcodeParser.VarContext,0)


        def getRuleIndex(self):
            return BcodeParser.RULE_var_def

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_def" ):
                listener.enterVar_def(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_def" ):
                listener.exitVar_def(self)




    def var_def(self):

        localctx = BcodeParser.Var_defContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_var_def)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.typ()
            self.state = 96
            self.var()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_asgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def var_def(self):
            return self.getTypedRuleContext(BcodeParser.Var_defContext,0)


        def OPERATOR_ASSIGN(self):
            return self.getToken(BcodeParser.OPERATOR_ASSIGN, 0)

        def lit(self):
            return self.getTypedRuleContext(BcodeParser.LitContext,0)


        def expr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Expr_arithContext,0)


        def expr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Expr_cmpContext,0)


        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_var_asg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_asg" ):
                listener.enterVar_asg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_asg" ):
                listener.exitVar_asg(self)




    def var_asg(self):

        localctx = BcodeParser.Var_asgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_var_asg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.var_def()
            self.state = 99
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 111
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,12,self._ctx)
            if la_ == 1:
                self.state = 100
                self.lit()
                pass

            elif la_ == 2:
                self.state = 102
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==13:
                    self.state = 101
                    self.match(BcodeParser.SYMBOL_OPENPAR)


                self.state = 106
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
                if la_ == 1:
                    self.state = 104
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 105
                    self.expr_cmp()
                    pass


                self.state = 109
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==14:
                    self.state = 108
                    self.match(BcodeParser.SYMBOL_CLOSEPAR)


                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_reasgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def var(self):
            return self.getTypedRuleContext(BcodeParser.VarContext,0)


        def OPERATOR_ASSIGN(self):
            return self.getToken(BcodeParser.OPERATOR_ASSIGN, 0)

        def lit(self):
            return self.getTypedRuleContext(BcodeParser.LitContext,0)


        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def expr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Expr_arithContext,0)


        def expr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Expr_cmpContext,0)


        def getRuleIndex(self):
            return BcodeParser.RULE_var_reasg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_reasg" ):
                listener.enterVar_reasg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_reasg" ):
                listener.exitVar_reasg(self)




    def var_reasg(self):

        localctx = BcodeParser.Var_reasgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_var_reasg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.var()
            self.state = 114
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 125
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,14,self._ctx)
            if la_ == 1:
                self.state = 115
                self.lit()
                pass

            elif la_ == 2:
                self.state = 116
                self.match(BcodeParser.SYMBOL_OPENPAR)
                self.state = 119
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
                if la_ == 1:
                    self.state = 117
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 118
                    self.expr_cmp()
                    pass


                self.state = 121
                self.match(BcodeParser.SYMBOL_CLOSEPAR)
                pass

            elif la_ == 3:
                self.state = 123
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 124
                self.expr_cmp()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Fnc_cprintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION_CPRINT(self):
            return self.getToken(BcodeParser.FUNCTION_CPRINT, 0)

        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def lit(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.LitContext)
            else:
                return self.getTypedRuleContext(BcodeParser.LitContext,i)


        def var(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.VarContext)
            else:
                return self.getTypedRuleContext(BcodeParser.VarContext,i)


        def getRuleIndex(self):
            return BcodeParser.RULE_fnc_cprint

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFnc_cprint" ):
                listener.enterFnc_cprint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFnc_cprint" ):
                listener.exitFnc_cprint(self)




    def fnc_cprint(self):

        localctx = BcodeParser.Fnc_cprintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_fnc_cprint)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 127
            self.match(BcodeParser.FUNCTION_CPRINT)
            self.state = 128
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 133
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 566231072) != 0):
                self.state = 131
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [5, 22, 23, 29]:
                    self.state = 129
                    self.lit()
                    pass
                elif token in [24]:
                    self.state = 130
                    self.var()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 135
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 136
            self.match(BcodeParser.SYMBOL_CLOSEPAR)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Stm_returnContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRUCTURE_RETURN(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURN, 0)

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def lit(self):
            return self.getTypedRuleContext(BcodeParser.LitContext,0)


        def var(self):
            return self.getTypedRuleContext(BcodeParser.VarContext,0)


        def expr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Expr_arithContext,0)


        def expr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Expr_cmpContext,0)


        def getRuleIndex(self):
            return BcodeParser.RULE_stm_return

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStm_return" ):
                listener.enterStm_return(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStm_return" ):
                listener.exitStm_return(self)




    def stm_return(self):

        localctx = BcodeParser.Stm_returnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_stm_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(BcodeParser.STRUCTURE_RETURN)
            self.state = 143
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 139
                self.lit()
                pass

            elif la_ == 2:
                self.state = 140
                self.var()
                pass

            elif la_ == 3:
                self.state = 141
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 142
                self.expr_cmp()
                pass


            self.state = 145
            self.match(BcodeParser.SYMBOL_SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opr_arithContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPERATOR_ADD(self):
            return self.getToken(BcodeParser.OPERATOR_ADD, 0)

        def OPERATOR_SUBTR(self):
            return self.getToken(BcodeParser.OPERATOR_SUBTR, 0)

        def OPERATOR_MULT(self):
            return self.getToken(BcodeParser.OPERATOR_MULT, 0)

        def OPERATOR_DIV(self):
            return self.getToken(BcodeParser.OPERATOR_DIV, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_opr_arith

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpr_arith" ):
                listener.enterOpr_arith(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpr_arith" ):
                listener.exitOpr_arith(self)




    def opr_arith(self):

        localctx = BcodeParser.Opr_arithContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_opr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 960) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opr_cmpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def OPERATOR_GTHAN(self):
            return self.getToken(BcodeParser.OPERATOR_GTHAN, 0)

        def OPERATOR_LTHAN(self):
            return self.getToken(BcodeParser.OPERATOR_LTHAN, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_opr_cmp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpr_cmp" ):
                listener.enterOpr_cmp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpr_cmp" ):
                listener.exitOpr_cmp(self)




    def opr_cmp(self):

        localctx = BcodeParser.Opr_cmpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_opr_cmp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 149
            _la = self._input.LA(1)
            if not(_la==10 or _la==11):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SymContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def SYMBOL_OPENBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_OPENBRACE, 0)

        def SYMBOL_CLOSEBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0)

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def SYMBOL_COMMA(self):
            return self.getToken(BcodeParser.SYMBOL_COMMA, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_sym

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSym" ):
                listener.enterSym(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSym" ):
                listener.exitSym(self)




    def sym(self):

        localctx = BcodeParser.SymContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_sym)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 516096) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StrContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRUCTURE_RETURNS(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURNS, 0)

        def STRUCTURE_RETURN(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURN, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_str

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStr" ):
                listener.enterStr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStr" ):
                listener.exitStr(self)




    def str_(self):

        localctx = BcodeParser.StrContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_str)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 153
            _la = self._input.LA(1)
            if not(_la==19 or _la==20):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LitContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LITERAL_BOOL(self):
            return self.getToken(BcodeParser.LITERAL_BOOL, 0)

        def LITERAL_NONE(self):
            return self.getToken(BcodeParser.LITERAL_NONE, 0)

        def LITERAL_STRING(self):
            return self.getToken(BcodeParser.LITERAL_STRING, 0)

        def LITERAL_INTEGER(self):
            return self.getToken(BcodeParser.LITERAL_INTEGER, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_lit

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLit" ):
                listener.enterLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLit" ):
                listener.exitLit(self)




    def lit(self):

        localctx = BcodeParser.LitContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_lit)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 155
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 549453856) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VarContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_var

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar" ):
                listener.enterVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar" ):
                listener.exitVar(self)




    def var(self):

        localctx = BcodeParser.VarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_var)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 157
            self.match(BcodeParser.ITEM_VARNAME)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TypContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE_INTEGER(self):
            return self.getToken(BcodeParser.TYPE_INTEGER, 0)

        def TYPE_BOOL(self):
            return self.getToken(BcodeParser.TYPE_BOOL, 0)

        def TYPE_NONE(self):
            return self.getToken(BcodeParser.TYPE_NONE, 0)

        def TYPE_STRING(self):
            return self.getToken(BcodeParser.TYPE_STRING, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_typ

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTyp" ):
                listener.enterTyp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTyp" ):
                listener.exitTyp(self)




    def typ(self):

        localctx = BcodeParser.TypContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_typ)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 159
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 503316480) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





