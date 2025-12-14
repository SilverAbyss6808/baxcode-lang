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
        4,1,29,198,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,3,1,
        4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,3,7,51,8,7,1,7,1,7,1,7,3,7,56,8,7,
        4,7,58,8,7,11,7,12,7,59,1,8,1,8,3,8,64,8,8,1,8,1,8,1,8,3,8,69,8,
        8,1,9,1,9,1,9,1,10,1,10,1,10,1,10,3,10,78,8,10,1,10,1,10,3,10,82,
        8,10,1,10,3,10,85,8,10,3,10,87,8,10,1,11,1,11,1,11,1,11,1,11,1,11,
        3,11,95,8,11,1,11,1,11,1,11,1,11,3,11,101,8,11,1,12,1,12,1,12,1,
        12,5,12,107,8,12,10,12,12,12,110,9,12,1,12,1,12,1,13,1,13,1,13,1,
        13,1,13,3,13,119,8,13,1,13,1,13,1,14,1,14,5,14,125,8,14,10,14,12,
        14,128,9,14,1,14,1,14,5,14,132,8,14,10,14,12,14,135,9,14,1,14,1,
        14,5,14,139,8,14,10,14,12,14,142,9,14,1,14,1,14,5,14,146,8,14,10,
        14,12,14,149,9,14,1,14,1,14,5,14,153,8,14,10,14,12,14,156,9,14,1,
        14,1,14,5,14,160,8,14,10,14,12,14,163,9,14,1,14,3,14,166,8,14,1,
        14,1,14,1,15,1,15,1,15,1,15,1,15,3,15,175,8,15,5,15,177,8,15,10,
        15,12,15,180,9,15,1,15,1,15,1,15,1,15,1,15,5,15,187,8,15,10,15,12,
        15,190,9,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,188,0,17,0,2,4,
        6,8,10,12,14,16,18,20,22,24,26,28,30,32,0,6,1,0,6,9,1,0,10,11,1,
        0,13,18,1,0,19,20,3,0,5,5,22,23,29,29,1,0,25,28,213,0,34,1,0,0,0,
        2,36,1,0,0,0,4,38,1,0,0,0,6,40,1,0,0,0,8,42,1,0,0,0,10,44,1,0,0,
        0,12,46,1,0,0,0,14,50,1,0,0,0,16,63,1,0,0,0,18,70,1,0,0,0,20,73,
        1,0,0,0,22,88,1,0,0,0,24,102,1,0,0,0,26,113,1,0,0,0,28,165,1,0,0,
        0,30,169,1,0,0,0,32,195,1,0,0,0,34,35,7,0,0,0,35,1,1,0,0,0,36,37,
        7,1,0,0,37,3,1,0,0,0,38,39,7,2,0,0,39,5,1,0,0,0,40,41,7,3,0,0,41,
        7,1,0,0,0,42,43,7,4,0,0,43,9,1,0,0,0,44,45,5,24,0,0,45,11,1,0,0,
        0,46,47,7,5,0,0,47,13,1,0,0,0,48,51,3,8,4,0,49,51,3,10,5,0,50,48,
        1,0,0,0,50,49,1,0,0,0,51,57,1,0,0,0,52,55,3,0,0,0,53,56,3,8,4,0,
        54,56,3,10,5,0,55,53,1,0,0,0,55,54,1,0,0,0,56,58,1,0,0,0,57,52,1,
        0,0,0,58,59,1,0,0,0,59,57,1,0,0,0,59,60,1,0,0,0,60,15,1,0,0,0,61,
        64,3,8,4,0,62,64,3,10,5,0,63,61,1,0,0,0,63,62,1,0,0,0,64,65,1,0,
        0,0,65,68,3,2,1,0,66,69,3,8,4,0,67,69,3,10,5,0,68,66,1,0,0,0,68,
        67,1,0,0,0,69,17,1,0,0,0,70,71,3,12,6,0,71,72,3,10,5,0,72,19,1,0,
        0,0,73,74,3,18,9,0,74,86,5,12,0,0,75,87,3,8,4,0,76,78,5,13,0,0,77,
        76,1,0,0,0,77,78,1,0,0,0,78,81,1,0,0,0,79,82,3,14,7,0,80,82,3,16,
        8,0,81,79,1,0,0,0,81,80,1,0,0,0,82,84,1,0,0,0,83,85,5,14,0,0,84,
        83,1,0,0,0,84,85,1,0,0,0,85,87,1,0,0,0,86,75,1,0,0,0,86,77,1,0,0,
        0,87,21,1,0,0,0,88,89,3,10,5,0,89,100,5,12,0,0,90,101,3,8,4,0,91,
        94,5,13,0,0,92,95,3,14,7,0,93,95,3,16,8,0,94,92,1,0,0,0,94,93,1,
        0,0,0,95,96,1,0,0,0,96,97,5,14,0,0,97,101,1,0,0,0,98,101,3,14,7,
        0,99,101,3,16,8,0,100,90,1,0,0,0,100,91,1,0,0,0,100,98,1,0,0,0,100,
        99,1,0,0,0,101,23,1,0,0,0,102,103,5,21,0,0,103,108,5,13,0,0,104,
        107,3,8,4,0,105,107,3,10,5,0,106,104,1,0,0,0,106,105,1,0,0,0,107,
        110,1,0,0,0,108,106,1,0,0,0,108,109,1,0,0,0,109,111,1,0,0,0,110,
        108,1,0,0,0,111,112,5,14,0,0,112,25,1,0,0,0,113,118,5,20,0,0,114,
        119,3,8,4,0,115,119,3,10,5,0,116,119,3,14,7,0,117,119,3,16,8,0,118,
        114,1,0,0,0,118,115,1,0,0,0,118,116,1,0,0,0,118,117,1,0,0,0,119,
        120,1,0,0,0,120,121,5,17,0,0,121,27,1,0,0,0,122,126,3,14,7,0,123,
        125,3,28,14,0,124,123,1,0,0,0,125,128,1,0,0,0,126,124,1,0,0,0,126,
        127,1,0,0,0,127,166,1,0,0,0,128,126,1,0,0,0,129,133,3,16,8,0,130,
        132,3,28,14,0,131,130,1,0,0,0,132,135,1,0,0,0,133,131,1,0,0,0,133,
        134,1,0,0,0,134,166,1,0,0,0,135,133,1,0,0,0,136,140,3,18,9,0,137,
        139,3,28,14,0,138,137,1,0,0,0,139,142,1,0,0,0,140,138,1,0,0,0,140,
        141,1,0,0,0,141,166,1,0,0,0,142,140,1,0,0,0,143,147,3,20,10,0,144,
        146,3,28,14,0,145,144,1,0,0,0,146,149,1,0,0,0,147,145,1,0,0,0,147,
        148,1,0,0,0,148,166,1,0,0,0,149,147,1,0,0,0,150,154,3,22,11,0,151,
        153,3,28,14,0,152,151,1,0,0,0,153,156,1,0,0,0,154,152,1,0,0,0,154,
        155,1,0,0,0,155,166,1,0,0,0,156,154,1,0,0,0,157,161,3,10,5,0,158,
        160,3,28,14,0,159,158,1,0,0,0,160,163,1,0,0,0,161,159,1,0,0,0,161,
        162,1,0,0,0,162,166,1,0,0,0,163,161,1,0,0,0,164,166,3,24,12,0,165,
        122,1,0,0,0,165,129,1,0,0,0,165,136,1,0,0,0,165,143,1,0,0,0,165,
        150,1,0,0,0,165,157,1,0,0,0,165,164,1,0,0,0,166,167,1,0,0,0,167,
        168,5,17,0,0,168,29,1,0,0,0,169,170,5,1,0,0,170,171,3,10,5,0,171,
        178,5,13,0,0,172,174,3,18,9,0,173,175,5,18,0,0,174,173,1,0,0,0,174,
        175,1,0,0,0,175,177,1,0,0,0,176,172,1,0,0,0,177,180,1,0,0,0,178,
        176,1,0,0,0,178,179,1,0,0,0,179,181,1,0,0,0,180,178,1,0,0,0,181,
        182,5,14,0,0,182,183,5,19,0,0,183,184,3,12,6,0,184,188,5,15,0,0,
        185,187,3,28,14,0,186,185,1,0,0,0,187,190,1,0,0,0,188,189,1,0,0,
        0,188,186,1,0,0,0,189,191,1,0,0,0,190,188,1,0,0,0,191,192,3,26,13,
        0,192,193,5,16,0,0,193,194,5,17,0,0,194,31,1,0,0,0,195,196,3,30,
        15,0,196,33,1,0,0,0,24,50,55,59,63,68,77,81,84,86,94,100,106,108,
        118,126,133,140,147,154,161,165,174,178,188
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

    RULE_opr_arith = 0
    RULE_opr_cmp = 1
    RULE_sym = 2
    RULE_str = 3
    RULE_lit = 4
    RULE_var = 5
    RULE_typ = 6
    RULE_expr_arith = 7
    RULE_expr_cmp = 8
    RULE_var_def = 9
    RULE_var_asg = 10
    RULE_var_reasg = 11
    RULE_fnc_cprint = 12
    RULE_stm_return = 13
    RULE_statement = 14
    RULE_program = 15
    RULE_start_ = 16

    ruleNames =  [ "opr_arith", "opr_cmp", "sym", "str", "lit", "var", "typ", 
                   "expr_arith", "expr_cmp", "var_def", "var_asg", "var_reasg", 
                   "fnc_cprint", "stm_return", "statement", "program", "start_" ]

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
        self.enterRule(localctx, 0, self.RULE_opr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
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
        self.enterRule(localctx, 2, self.RULE_opr_cmp)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
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
        self.enterRule(localctx, 4, self.RULE_sym)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
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
        self.enterRule(localctx, 6, self.RULE_str)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
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
        self.enterRule(localctx, 8, self.RULE_lit)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
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
        self.enterRule(localctx, 10, self.RULE_var)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
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
        self.enterRule(localctx, 12, self.RULE_typ)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46
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
        self.enterRule(localctx, 14, self.RULE_expr_arith)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 48
                self.lit()
                pass
            elif token in [24]:
                self.state = 49
                self.var()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 57 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 52
                self.opr_arith()
                self.state = 55
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [5, 22, 23, 29]:
                    self.state = 53
                    self.lit()
                    pass
                elif token in [24]:
                    self.state = 54
                    self.var()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 59 
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
        self.enterRule(localctx, 16, self.RULE_expr_cmp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 61
                self.lit()
                pass
            elif token in [24]:
                self.state = 62
                self.var()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 65
            self.opr_cmp()
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5, 22, 23, 29]:
                self.state = 66
                self.lit()
                pass
            elif token in [24]:
                self.state = 67
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
        self.enterRule(localctx, 18, self.RULE_var_def)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.typ()
            self.state = 71
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
        self.enterRule(localctx, 20, self.RULE_var_asg)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 73
            self.var_def()
            self.state = 74
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 86
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.state = 75
                self.lit()
                pass

            elif la_ == 2:
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==13:
                    self.state = 76
                    self.match(BcodeParser.SYMBOL_OPENPAR)


                self.state = 81
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
                if la_ == 1:
                    self.state = 79
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 80
                    self.expr_cmp()
                    pass


                self.state = 84
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==14:
                    self.state = 83
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
        self.enterRule(localctx, 22, self.RULE_var_reasg)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self.var()
            self.state = 89
            self.match(BcodeParser.OPERATOR_ASSIGN)
            self.state = 100
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.state = 90
                self.lit()
                pass

            elif la_ == 2:
                self.state = 91
                self.match(BcodeParser.SYMBOL_OPENPAR)
                self.state = 94
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                if la_ == 1:
                    self.state = 92
                    self.expr_arith()
                    pass

                elif la_ == 2:
                    self.state = 93
                    self.expr_cmp()
                    pass


                self.state = 96
                self.match(BcodeParser.SYMBOL_CLOSEPAR)
                pass

            elif la_ == 3:
                self.state = 98
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 99
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
        self.enterRule(localctx, 24, self.RULE_fnc_cprint)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 102
            self.match(BcodeParser.FUNCTION_CPRINT)
            self.state = 103
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 108
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 566231072) != 0):
                self.state = 106
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [5, 22, 23, 29]:
                    self.state = 104
                    self.lit()
                    pass
                elif token in [24]:
                    self.state = 105
                    self.var()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 111
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
        self.enterRule(localctx, 26, self.RULE_stm_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 113
            self.match(BcodeParser.STRUCTURE_RETURN)
            self.state = 118
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.state = 114
                self.lit()
                pass

            elif la_ == 2:
                self.state = 115
                self.var()
                pass

            elif la_ == 3:
                self.state = 116
                self.expr_arith()
                pass

            elif la_ == 4:
                self.state = 117
                self.expr_cmp()
                pass


            self.state = 120
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


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(BcodeParser.StatementContext)
            else:
                return self.getTypedRuleContext(BcodeParser.StatementContext,i)


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
        self.enterRule(localctx, 28, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 165
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.state = 122
                self.expr_arith()
                self.state = 126
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 123
                    self.statement()
                    self.state = 128
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 2:
                self.state = 129
                self.expr_cmp()
                self.state = 133
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 130
                    self.statement()
                    self.state = 135
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 3:
                self.state = 136
                self.var_def()
                self.state = 140
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 137
                    self.statement()
                    self.state = 142
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 4:
                self.state = 143
                self.var_asg()
                self.state = 147
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 144
                    self.statement()
                    self.state = 149
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 5:
                self.state = 150
                self.var_reasg()
                self.state = 154
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 151
                    self.statement()
                    self.state = 156
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 6:
                self.state = 157
                self.var()
                self.state = 161
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1071644704) != 0):
                    self.state = 158
                    self.statement()
                    self.state = 163
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 7:
                self.state = 164
                self.fnc_cprint()
                pass


            self.state = 167
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
        self.enterRule(localctx, 30, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 169
            self.match(BcodeParser.T__0)
            self.state = 170
            self.var()
            self.state = 171
            self.match(BcodeParser.SYMBOL_OPENPAR)
            self.state = 178
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 503316480) != 0):
                self.state = 172
                self.var_def()
                self.state = 174
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==18:
                    self.state = 173
                    self.match(BcodeParser.SYMBOL_COMMA)


                self.state = 180
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 181
            self.match(BcodeParser.SYMBOL_CLOSEPAR)
            self.state = 182
            self.match(BcodeParser.STRUCTURE_RETURNS)
            self.state = 183
            self.typ()
            self.state = 184
            self.match(BcodeParser.SYMBOL_OPENBRACE)
            self.state = 188
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,23,self._ctx)
            while _alt!=1 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1+1:
                    self.state = 185
                    self.statement() 
                self.state = 190
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,23,self._ctx)

            self.state = 191
            self.stm_return()
            self.state = 192
            self.match(BcodeParser.SYMBOL_CLOSEBRACE)
            self.state = 193
            self.match(BcodeParser.SYMBOL_SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


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
        self.enterRule(localctx, 32, self.RULE_start_)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 195
            self.program()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





