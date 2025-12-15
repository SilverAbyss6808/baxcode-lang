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
        4,1,29,80,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,1,0,1,0,1,1,1,1,1,1,1,1,1,1,3,1,22,8,1,5,1,24,8,1,10,1,12,1,27,
        9,1,1,1,1,1,1,1,1,1,1,1,5,1,34,8,1,10,1,12,1,37,9,1,1,1,1,1,1,1,
        1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,3,2,60,8,2,1,2,1,2,1,2,1,2,5,2,66,8,2,10,2,12,2,69,9,2,1,
        3,1,3,1,3,1,4,1,4,1,5,1,5,1,6,1,6,1,6,1,35,1,4,7,0,2,4,6,8,10,12,
        0,4,3,0,5,5,22,23,29,29,1,0,6,9,1,0,10,11,1,0,25,28,81,0,14,1,0,
        0,0,2,16,1,0,0,0,4,59,1,0,0,0,6,70,1,0,0,0,8,73,1,0,0,0,10,75,1,
        0,0,0,12,77,1,0,0,0,14,15,3,2,1,0,15,1,1,0,0,0,16,17,5,1,0,0,17,
        18,5,24,0,0,18,25,5,13,0,0,19,21,3,4,2,0,20,22,5,18,0,0,21,20,1,
        0,0,0,21,22,1,0,0,0,22,24,1,0,0,0,23,19,1,0,0,0,24,27,1,0,0,0,25,
        23,1,0,0,0,25,26,1,0,0,0,26,28,1,0,0,0,27,25,1,0,0,0,28,29,5,14,
        0,0,29,30,5,19,0,0,30,31,3,12,6,0,31,35,5,15,0,0,32,34,3,6,3,0,33,
        32,1,0,0,0,34,37,1,0,0,0,35,36,1,0,0,0,35,33,1,0,0,0,36,38,1,0,0,
        0,37,35,1,0,0,0,38,39,5,16,0,0,39,40,5,17,0,0,40,3,1,0,0,0,41,42,
        6,2,-1,0,42,43,3,12,6,0,43,44,5,24,0,0,44,45,5,12,0,0,45,46,3,4,
        2,6,46,60,1,0,0,0,47,48,3,12,6,0,48,49,5,24,0,0,49,60,1,0,0,0,50,
        60,5,24,0,0,51,52,5,21,0,0,52,53,5,13,0,0,53,54,3,4,2,0,54,55,5,
        14,0,0,55,60,1,0,0,0,56,57,5,20,0,0,57,60,3,4,2,2,58,60,7,0,0,0,
        59,41,1,0,0,0,59,47,1,0,0,0,59,50,1,0,0,0,59,51,1,0,0,0,59,56,1,
        0,0,0,59,58,1,0,0,0,60,67,1,0,0,0,61,62,10,7,0,0,62,63,3,8,4,0,63,
        64,3,4,2,8,64,66,1,0,0,0,65,61,1,0,0,0,66,69,1,0,0,0,67,65,1,0,0,
        0,67,68,1,0,0,0,68,5,1,0,0,0,69,67,1,0,0,0,70,71,3,4,2,0,71,72,5,
        17,0,0,72,7,1,0,0,0,73,74,7,1,0,0,74,9,1,0,0,0,75,76,7,2,0,0,76,
        11,1,0,0,0,77,78,7,3,0,0,78,13,1,0,0,0,5,21,25,35,59,67
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
    RULE_expression = 2
    RULE_line = 3
    RULE_opr_arith = 4
    RULE_opr_cmp = 5
    RULE_typ = 6

    ruleNames =  [ "start_", "program", "expression", "line", "opr_arith", 
                   "opr_cmp", "typ" ]

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
            self.state = 14
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

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

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

        def SYMBOL_CLOSEBRACE(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEBRACE, 0)

        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(BcodeParser.ExpressionContext,i)


        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.LineContext)
            else:
                return self.getTypedRuleContext(BcodeParser.LineContext,i)


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
            self.state = 16
            self.match(BcodeParser.T__0)
            self.state = 17
            self.match(BcodeParser.ITEM_VARNAME)
            self.state = 18
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 25
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1072693280) != 0):
                self.state = 19
                self.expression(0)
                self.state = 21
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==18:
                    self.state = 20
                    self.match(BcodeParser.SYMBOL_COMMA)


                self.state = 27
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 28
            self.match(BcodeParser.SYMBOL_CLOSEPAR)
            self.state = 29
            self.match(BcodeParser.STRUCTURE_RETURNS)
            self.state = 30
            self.typ()
            self.state = 31
            self.match(BcodeParser.SYMBOL_OPENBRACE)
            self.state = 35
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,2,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 32
                    self.line() 
                self.state = 37
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,2,self._ctx)

            self.state = 38
            self.match(BcodeParser.SYMBOL_CLOSEBRACE)
            self.state = 39
            self.match(BcodeParser.SYMBOL_SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return BcodeParser.RULE_expression

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class Fnc_cprintContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def FUNCTION_CPRINT(self):
            return self.getToken(BcodeParser.FUNCTION_CPRINT, 0)
        def SYMBOL_OPENPAR(self):
            return self.getToken(BcodeParser.SYMBOL_OPENPAR, 0)
        def expression(self):
            return self.getTypedRuleContext(BcodeParser.ExpressionContext,0)

        def SYMBOL_CLOSEPAR(self):
            return self.getToken(BcodeParser.SYMBOL_CLOSEPAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFnc_cprint" ):
                listener.enterFnc_cprint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFnc_cprint" ):
                listener.exitFnc_cprint(self)


    class Expr_arithContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(BcodeParser.ExpressionContext,i)

        def opr_arith(self):
            return self.getTypedRuleContext(BcodeParser.Opr_arithContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr_arith" ):
                listener.enterExpr_arith(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr_arith" ):
                listener.exitExpr_arith(self)


    class Var_asgContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def typ(self):
            return self.getTypedRuleContext(BcodeParser.TypContext,0)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)
        def OPERATOR_ASSIGN(self):
            return self.getToken(BcodeParser.OPERATOR_ASSIGN, 0)
        def expression(self):
            return self.getTypedRuleContext(BcodeParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_asg" ):
                listener.enterVar_asg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_asg" ):
                listener.exitVar_asg(self)


    class Var_defContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def typ(self):
            return self.getTypedRuleContext(BcodeParser.TypContext,0)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_def" ):
                listener.enterVar_def(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_def" ):
                listener.exitVar_def(self)


    class VarContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ITEM_VARNAME(self):
            return self.getToken(BcodeParser.ITEM_VARNAME, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar" ):
                listener.enterVar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar" ):
                listener.exitVar(self)


    class LitContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LITERAL_BOOL(self):
            return self.getToken(BcodeParser.LITERAL_BOOL, 0)
        def LITERAL_NONE(self):
            return self.getToken(BcodeParser.LITERAL_NONE, 0)
        def LITERAL_STRING(self):
            return self.getToken(BcodeParser.LITERAL_STRING, 0)
        def LITERAL_INTEGER(self):
            return self.getToken(BcodeParser.LITERAL_INTEGER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLit" ):
                listener.enterLit(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLit" ):
                listener.exitLit(self)


    class Stm_returnContext(ExpressionContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a BcodeParser.ExpressionContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRUCTURE_RETURN(self):
            return self.getToken(BcodeParser.STRUCTURE_RETURN, 0)
        def expression(self):
            return self.getTypedRuleContext(BcodeParser.ExpressionContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStm_return" ):
                listener.enterStm_return(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStm_return" ):
                listener.exitStm_return(self)



    def expression(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = BcodeParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 4
        self.enterRecursionRule(localctx, 4, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 59
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                localctx = BcodeParser.Var_asgContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 42
                self.typ()
                self.state = 43
                self.match(BcodeParser.ITEM_VARNAME)
                self.state = 44
                self.match(BcodeParser.OPERATOR_ASSIGN)
                self.state = 45
                self.expression(6)
                pass

            elif la_ == 2:
                localctx = BcodeParser.Var_defContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 47
                self.typ()
                self.state = 48
                self.match(BcodeParser.ITEM_VARNAME)
                pass

            elif la_ == 3:
                localctx = BcodeParser.VarContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 50
                self.match(BcodeParser.ITEM_VARNAME)
                pass

            elif la_ == 4:
                localctx = BcodeParser.Fnc_cprintContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 51
                self.match(BcodeParser.FUNCTION_CPRINT)
                self.state = 52
                self.match(BcodeParser.SYMBOL_OPENPAR)
                self.state = 53
                self.expression(0)
                self.state = 54
                self.match(BcodeParser.SYMBOL_CLOSEPAR)
                pass

            elif la_ == 5:
                localctx = BcodeParser.Stm_returnContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 56
                self.match(BcodeParser.STRUCTURE_RETURN)
                self.state = 57
                self.expression(2)
                pass

            elif la_ == 6:
                localctx = BcodeParser.LitContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 58
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 549453856) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 67
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,4,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    localctx = BcodeParser.Expr_arithContext(self, BcodeParser.ExpressionContext(self, _parentctx, _parentState))
                    self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                    self.state = 61
                    if not self.precpred(self._ctx, 7):
                        from antlr4.error.Errors import FailedPredicateException
                        raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                    self.state = 62
                    self.opr_arith()
                    self.state = 63
                    self.expression(8) 
                self.state = 69
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,4,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class LineContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(BcodeParser.ExpressionContext,0)


        def SYMBOL_SEMICOLON(self):
            return self.getToken(BcodeParser.SYMBOL_SEMICOLON, 0)

        def getRuleIndex(self):
            return BcodeParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)




    def line(self):

        localctx = BcodeParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_line)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.expression(0)
            self.state = 71
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
        self.enterRule(localctx, 8, self.RULE_opr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
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
        self.enterRule(localctx, 10, self.RULE_opr_cmp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
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
        self.enterRule(localctx, 12, self.RULE_typ)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 77
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



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[2] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx:ExpressionContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 7)
         




