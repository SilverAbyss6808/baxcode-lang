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
        4,1,36,120,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,1,1,1,1,1,4,1,26,8,1,11,1,12,
        1,27,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,3,4,43,
        8,4,1,4,1,4,1,4,1,4,3,4,49,8,4,1,5,1,5,1,5,1,5,1,5,1,5,3,5,57,8,
        5,1,5,1,5,1,5,1,5,3,5,63,8,5,1,6,1,6,1,6,5,6,68,8,6,10,6,12,6,71,
        9,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,3,7,80,8,7,1,8,1,8,1,8,1,8,1,8,1,
        8,1,8,3,8,89,8,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,3,9,98,8,9,5,9,100,
        8,9,10,9,12,9,103,9,9,1,9,1,9,1,9,1,9,1,9,5,9,110,8,9,10,9,12,9,
        113,9,9,1,9,1,9,1,9,1,9,1,9,1,9,0,0,10,0,2,4,6,8,10,12,14,16,18,
        0,1,2,0,22,22,34,34,131,0,20,1,0,0,0,2,22,1,0,0,0,4,29,1,0,0,0,6,
        33,1,0,0,0,8,36,1,0,0,0,10,50,1,0,0,0,12,64,1,0,0,0,14,74,1,0,0,
        0,16,88,1,0,0,0,18,92,1,0,0,0,20,21,3,18,9,0,21,1,1,0,0,0,22,25,
        7,0,0,0,23,24,5,30,0,0,24,26,7,0,0,0,25,23,1,0,0,0,26,27,1,0,0,0,
        27,25,1,0,0,0,27,28,1,0,0,0,28,3,1,0,0,0,29,30,7,0,0,0,30,31,5,31,
        0,0,31,32,7,0,0,0,32,5,1,0,0,0,33,34,5,36,0,0,34,35,5,22,0,0,35,
        7,1,0,0,0,36,37,3,6,3,0,37,48,5,9,0,0,38,49,5,34,0,0,39,42,5,10,
        0,0,40,43,3,2,1,0,41,43,3,4,2,0,42,40,1,0,0,0,42,41,1,0,0,0,43,44,
        1,0,0,0,44,45,5,11,0,0,45,49,1,0,0,0,46,49,3,2,1,0,47,49,3,4,2,0,
        48,38,1,0,0,0,48,39,1,0,0,0,48,46,1,0,0,0,48,47,1,0,0,0,49,9,1,0,
        0,0,50,51,5,22,0,0,51,62,5,9,0,0,52,63,5,34,0,0,53,56,5,10,0,0,54,
        57,3,2,1,0,55,57,3,4,2,0,56,54,1,0,0,0,56,55,1,0,0,0,57,58,1,0,0,
        0,58,59,5,11,0,0,59,63,1,0,0,0,60,63,3,2,1,0,61,63,3,4,2,0,62,52,
        1,0,0,0,62,53,1,0,0,0,62,60,1,0,0,0,62,61,1,0,0,0,63,11,1,0,0,0,
        64,65,5,19,0,0,65,69,5,10,0,0,66,68,7,0,0,0,67,66,1,0,0,0,68,71,
        1,0,0,0,69,67,1,0,0,0,69,70,1,0,0,0,70,72,1,0,0,0,71,69,1,0,0,0,
        72,73,5,11,0,0,73,13,1,0,0,0,74,79,5,18,0,0,75,80,5,34,0,0,76,80,
        5,22,0,0,77,80,3,2,1,0,78,80,3,4,2,0,79,75,1,0,0,0,79,76,1,0,0,0,
        79,77,1,0,0,0,79,78,1,0,0,0,80,15,1,0,0,0,81,89,3,2,1,0,82,89,3,
        4,2,0,83,89,3,6,3,0,84,89,3,8,4,0,85,89,3,10,5,0,86,89,3,12,6,0,
        87,89,3,14,7,0,88,81,1,0,0,0,88,82,1,0,0,0,88,83,1,0,0,0,88,84,1,
        0,0,0,88,85,1,0,0,0,88,86,1,0,0,0,88,87,1,0,0,0,89,90,1,0,0,0,90,
        91,5,14,0,0,91,17,1,0,0,0,92,93,5,16,0,0,93,94,5,22,0,0,94,101,5,
        10,0,0,95,97,3,6,3,0,96,98,5,15,0,0,97,96,1,0,0,0,97,98,1,0,0,0,
        98,100,1,0,0,0,99,95,1,0,0,0,100,103,1,0,0,0,101,99,1,0,0,0,101,
        102,1,0,0,0,102,104,1,0,0,0,103,101,1,0,0,0,104,105,5,11,0,0,105,
        106,5,17,0,0,106,107,5,36,0,0,107,111,5,12,0,0,108,110,3,16,8,0,
        109,108,1,0,0,0,110,113,1,0,0,0,111,109,1,0,0,0,111,112,1,0,0,0,
        112,114,1,0,0,0,113,111,1,0,0,0,114,115,3,14,7,0,115,116,5,13,0,
        0,116,117,5,14,0,0,117,118,5,0,0,1,118,19,1,0,0,0,11,27,42,48,56,
        62,69,79,88,97,101,111
    ]

class BcodeParser ( Parser ):

    grammarFileName = "Bcode.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "'+'", "'-'", 
                     "'*'", "'/'", "'>'", "'<'", "'='", "'('", "')'", "'{'", 
                     "'}'", "';'", "','", "'program'", "'returns'", "'return'", 
                     "'cprint'", "<INVALID>", "'NONE'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'int'", "'bool'", "'none'", "'string'" ]

    symbolicNames = [ "<INVALID>", "ITEM_COMMENT", "LITERAL_STRING", "OPERATOR_ADD", 
                      "OPERATOR_SUBTR", "OPERATOR_MULT", "OPERATOR_DIV", 
                      "OPERATOR_GTHAN", "OPERATOR_LTHAN", "OPERATOR_ASSIGN", 
                      "SYMBOL_OPENPAR", "SYMBOL_CLOSEPAR", "SYMBOL_OPENBRACE", 
                      "SYMBOL_CLOSEBRACE", "SYMBOL_SEMICOLON", "SYMBOL_COMMA", 
                      "STRUCTURE_PROGRAM", "STRUCTURE_RETURNS", "STRUCTURE_RETURN", 
                      "FUNCTION_CPRINT", "LITERAL_BOOL", "LITERAL_NONE", 
                      "ITEM_VARNAME", "ITEM_WHITESPACE", "ITEM_NEWLINE", 
                      "TYPE_INTEGER", "TYPE_BOOL", "TYPE_NONE", "TYPE_STRING", 
                      "LITERAL_INTEGER", "OPERATOR_ARITH", "OPERATOR_CMP", 
                      "SYMBOL", "STRUCTURE", "LITERAL", "ITEM", "TYPE" ]

    RULE_start_ = 0
    RULE_expr_arith = 1
    RULE_expr_cmp = 2
    RULE_var_def = 3
    RULE_var_asg = 4
    RULE_var_reasg = 5
    RULE_fnc_cprint = 6
    RULE_stm_return = 7
    RULE_statement = 8
    RULE_program = 9

    ruleNames =  [ "start_", "expr_arith", "expr_cmp", "var_def", "var_asg", 
                   "var_reasg", "fnc_cprint", "stm_return", "statement", 
                   "program" ]

    EOF = Token.EOF
    ITEM_COMMENT=1
    LITERAL_STRING=2
    OPERATOR_ADD=3
    OPERATOR_SUBTR=4
    OPERATOR_MULT=5
    OPERATOR_DIV=6
    OPERATOR_GTHAN=7
    OPERATOR_LTHAN=8
    OPERATOR_ASSIGN=9
    SYMBOL_OPENPAR=10
    SYMBOL_CLOSEPAR=11
    SYMBOL_OPENBRACE=12
    SYMBOL_CLOSEBRACE=13
    SYMBOL_SEMICOLON=14
    SYMBOL_COMMA=15
    STRUCTURE_PROGRAM=16
    STRUCTURE_RETURNS=17
    STRUCTURE_RETURN=18
    FUNCTION_CPRINT=19
    LITERAL_BOOL=20
    LITERAL_NONE=21
    ITEM_VARNAME=22
    ITEM_WHITESPACE=23
    ITEM_NEWLINE=24
    TYPE_INTEGER=25
    TYPE_BOOL=26
    TYPE_NONE=27
    TYPE_STRING=28
    LITERAL_INTEGER=29
    OPERATOR_ARITH=30
    OPERATOR_CMP=31
    SYMBOL=32
    STRUCTURE=33
    LITERAL=34
    ITEM=35
    TYPE=36

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
            self.state = 20
            self.program()
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

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.LITERAL)
            else:
                return self.getToken(BcodeParser.LITERAL, i)

        def ITEM_VARNAME(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.ITEM_VARNAME)
            else:
                return self.getToken(BcodeParser.ITEM_VARNAME, i)

        def OPERATOR_ARITH(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.OPERATOR_ARITH)
            else:
                return self.getToken(BcodeParser.OPERATOR_ARITH, i)

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
        self.enterRule(localctx, 2, self.RULE_expr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 22
            _la = self._input.LA(1)
            if not(_la==22 or _la==34):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 25 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 23
                self.match(BcodeParser.OPERATOR_ARITH)
                self.state = 24
                _la = self._input.LA(1)
                if not(_la==22 or _la==34):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 27 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==30):
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

        def OPERATOR_CMP(self):
            return self.getToken(BcodeParser.OPERATOR_CMP, 0)

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.LITERAL)
            else:
                return self.getToken(BcodeParser.LITERAL, i)

        def ITEM_VARNAME(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.ITEM_VARNAME)
            else:
                return self.getToken(BcodeParser.ITEM_VARNAME, i)

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
        self.enterRule(localctx, 4, self.RULE_expr_cmp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            _la = self._input.LA(1)
            if not(_la==22 or _la==34):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 30
            self.match(BcodeParser.OPERATOR_CMP)
            self.state = 31
            _la = self._input.LA(1)
            if not(_la==22 or _la==34):
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


    class Var_defContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE(self):
            return self.getToken(BcodeParser.TYPE, 0)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

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
        self.enterRule(localctx, 6, self.RULE_var_def)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 33
            self.match(BcodeParser.TYPE)
            self.state = 34
            self.match(BcodeParser.ITEM_VARNAME)
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

        def LITERAL(self):
            return self.getToken(BcodeParser.LITERAL, 0)

        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def expr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Expr_arithContext,0)


        def expr_cmp(self):
            return self.getTypedRuleContext(BcodeParser.Expr_cmpContext,0)


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
        self.enterRule(localctx, 8, self.RULE_var_asg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.var_def()
            self.state = 37
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 48
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 38
                self.match(BcodeParser.LITERAL)
                pass

            elif la_ == 2:
                self.state = 39
                self.match(BcodeParser.SYMBOL_OPENPAR)
                self.state = 42
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
                if la_ == 1:
                    self.state = 40
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 41
                    self.expr_cmp()
                    pass


                self.state = 44
                self.match(BcodeParser.SYMBOL_CLOSEPAR)
                pass

            elif la_ == 3:
                self.state = 46
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 47
                self.expr_cmp()
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

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

        def OPERATOR_ASSIGN(self):
            return self.getToken(BcodeParser.OPERATOR_ASSIGN, 0)

        def LITERAL(self):
            return self.getToken(BcodeParser.LITERAL, 0)

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
        self.enterRule(localctx, 10, self.RULE_var_reasg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(BcodeParser.ITEM_VARNAME)
            self.state = 51
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 62
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,4,self._ctx)
            if la_ == 1:
                self.state = 52
                self.match(BcodeParser.LITERAL)
                pass

            elif la_ == 2:
                self.state = 53
                self.match(BcodeParser.SYMBOL_OPENPAR)
                self.state = 56
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
                if la_ == 1:
                    self.state = 54
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 55
                    self.expr_cmp()
                    pass


                self.state = 58
                self.match(BcodeParser.SYMBOL_CLOSEPAR)
                pass

            elif la_ == 3:
                self.state = 60
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 61
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

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.LITERAL)
            else:
                return self.getToken(BcodeParser.LITERAL, i)

        def ITEM_VARNAME(self, i:int=None):
            if i is None:
                return self.getTokens(BcodeParser.ITEM_VARNAME)
            else:
                return self.getToken(BcodeParser.ITEM_VARNAME, i)

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
        self.enterRule(localctx, 12, self.RULE_fnc_cprint)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.match(BcodeParser.FUNCTION_CPRINT)
            self.state = 65
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 69
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==22 or _la==34:
                self.state = 66
                _la = self._input.LA(1)
                if not(_la==22 or _la==34):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 71
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 72
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

        def LITERAL(self):
            return self.getToken(BcodeParser.LITERAL, 0)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

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
        self.enterRule(localctx, 14, self.RULE_stm_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 74
            self.match(BcodeParser.STRUCTURE_RETURN)
            self.state = 79
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.state = 75
                self.match(BcodeParser.LITERAL)
                pass

            elif la_ == 2:
                self.state = 76
                self.match(BcodeParser.ITEM_VARNAME)
                pass

            elif la_ == 3:
                self.state = 77
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 78
                self.expr_cmp()
                pass


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


        def fnc_cprint(self):
            return self.getTypedRuleContext(BcodeParser.Fnc_cprintContext,0)


        def stm_return(self):
            return self.getTypedRuleContext(BcodeParser.Stm_returnContext,0)


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
        self.enterRule(localctx, 16, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.state = 81
                self.expr_arith()
                pass

            elif la_ == 2:
                self.state = 82
                self.expr_cmp()
                pass

            elif la_ == 3:
                self.state = 83
                self.var_def()
                pass

            elif la_ == 4:
                self.state = 84
                self.var_asg()
                pass

            elif la_ == 5:
                self.state = 85
                self.var_reasg()
                pass

            elif la_ == 6:
                self.state = 86
                self.fnc_cprint()
                pass

            elif la_ == 7:
                self.state = 87
                self.stm_return()
                pass


            self.state = 90
            self.match(BcodeParser.SYMBOL_SEMICOLON)
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

        def STRUCTURE_PROGRAM(self):
            return self.getToken(BcodeParser.STRUCTURE_PROGRAM, 0)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def STRUCTURE_RETURNS(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURNS, 0)

        def TYPE(self):
            return self.getToken(BcodeParser.TYPE, 0)

        def SYMBOL_OPENBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_OPENBRACE, 0)

        def stm_return(self):
            return self.getTypedRuleContext(BcodeParser.Stm_returnContext,0)


        def SYMBOL_CLOSEBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0)

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def EOF(self):
            return self.getToken(BcodeParser.EOF, 0)

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
        self.enterRule(localctx, 18, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(BcodeParser.STRUCTURE_PROGRAM)
            self.state = 93
            self.match(BcodeParser.ITEM_VARNAME)
            self.state = 94
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 101
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==36:
                self.state = 95
                self.var_def()
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 96
                    self.match(BcodeParser.SYMBOL_COMMA)


                self.state = 103
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 104
            self.match(BcodeParser.SYMBOL_CLOSEPAR)
            self.state = 105
            self.match(BcodeParser.STRUCTURE_RETURNS)
            self.state = 106
            self.match(BcodeParser.TYPE)
            self.state = 107
            self.match(BcodeParser.SYMBOL_OPENBRACE)
            self.state = 111
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 108
                    self.statement() 
                self.state = 113
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

            self.state = 114
            self.stm_return()
            self.state = 115
            self.match(BcodeParser.SYMBOL_CLOSEBRACE)
            self.state = 116
            self.match(BcodeParser.SYMBOL_SEMICOLON)
            self.state = 117
            self.match(BcodeParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





