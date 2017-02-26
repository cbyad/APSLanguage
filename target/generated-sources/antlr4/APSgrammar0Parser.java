// Generated from APSgrammar0.g4 by ANTLR 4.4

	package antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class APSgrammar0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, STRING=24, 
		ESC=25, LINE_COMMENT=26, COMMENT=27, IDENT=28, NUM=29, SPACE=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'add'", "'WHILE'", "'true'", "'sub'", "';'", "'['", "'mul'", 
		"'IF'", "']'", "'bool'", "'or'", "'CONST'", "'lt'", "'VAR'", "'div'", 
		"'int'", "'eq'", "'('", "')'", "'and'", "'not'", "'false'", "'SET'", "STRING", 
		"ESC", "LINE_COMMENT", "COMMENT", "IDENT", "NUM", "SPACE"
	};
	public static final int
		RULE_prog = 0, RULE_cmds = 1, RULE_dec = 2, RULE_stat = 3, RULE_type = 4, 
		RULE_expr = 5;
	public static final String[] ruleNames = {
		"prog", "cmds", "dec", "stat", "type", "expr"
	};

	@Override
	public String getGrammarFileName() { return "APSgrammar0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public APSgrammar0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTprogram node;
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class ProgrammContext extends ProgContext {
		public CmdsContext cmds;
		public List<CmdsContext> listcmds = new ArrayList<CmdsContext>();
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(APSgrammar0Parser.EOF, 0); }
		public ProgrammContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitProgramm(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgrammContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__17);
			setState(13); ((ProgrammContext)_localctx).cmds = cmds();
			((ProgrammContext)_localctx).listcmds.add(((ProgrammContext)_localctx).cmds);
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(14); match(T__14);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdsContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTcommands node;
		public CmdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmds; }
	 
		public CmdsContext() { }
		public void copyFrom(CmdsContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class StatCmdsContext extends CmdsContext {
		public StatContext statement;
		public CmdsContext cmds;
		public List<CmdsContext> commandes = new ArrayList<CmdsContext>();
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public StatCmdsContext(CmdsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterStatCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitStatCmds(this);
		}
	}
	public static class DecCmdsContext extends CmdsContext {
		public DecContext declaration;
		public CmdsContext cmds;
		public List<CmdsContext> commandes = new ArrayList<CmdsContext>();
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public DecCmdsContext(CmdsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterDecCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitDecCmds(this);
		}
	}

	public final CmdsContext cmds() throws RecognitionException {
		CmdsContext _localctx = new CmdsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmds);
		int _la;
		try {
			setState(31);
			switch (_input.LA(1)) {
			case T__21:
			case T__15:
			case T__0:
				_localctx = new StatCmdsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22); ((StatCmdsContext)_localctx).statement = stat();
				setState(25);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(23); match(T__18);
					setState(24); ((StatCmdsContext)_localctx).cmds = cmds();
					((StatCmdsContext)_localctx).commandes.add(((StatCmdsContext)_localctx).cmds);
					}
				}

				}
				break;
			case T__11:
			case T__9:
				_localctx = new DecCmdsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27); ((DecCmdsContext)_localctx).declaration = dec();
				setState(28); match(T__18);
				setState(29); ((DecCmdsContext)_localctx).cmds = cmds();
				((DecCmdsContext)_localctx).commandes.add(((DecCmdsContext)_localctx).cmds);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTdeclaration node;
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class ConstantDecContext extends DecContext {
		public Token ident;
		public ExprContext arg;
		public TypeContext typ;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public ConstantDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterConstantDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitConstantDec(this);
		}
	}
	public static class VariableDecContext extends DecContext {
		public Token ident;
		public TypeContext typ;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public VariableDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitVariableDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new VariableDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33); match(T__9);
				setState(34); ((VariableDecContext)_localctx).ident = match(IDENT);
				setState(35); ((VariableDecContext)_localctx).typ = type();
				}
				break;
			case T__11:
				_localctx = new ConstantDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(T__11);
				setState(37); ((ConstantDecContext)_localctx).ident = match(IDENT);
				setState(38); ((ConstantDecContext)_localctx).arg = expr();
				setState(39); ((ConstantDecContext)_localctx).typ = type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTstatement node;
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class AlternativeContext extends StatContext {
		public ExprContext condition;
		public ProgContext consequence;
		public ProgContext alternant;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public AlternativeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitAlternative(this);
		}
	}
	public static class VariableAssignContext extends StatContext {
		public Token ident;
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public VariableAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitVariableAssign(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExprContext condition;
		public ProgContext body;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitWhile(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43); match(T__0);
				setState(44); ((VariableAssignContext)_localctx).ident = match(IDENT);
				setState(45); ((VariableAssignContext)_localctx).arg = expr();
				}
				break;
			case T__15:
				_localctx = new AlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46); match(T__15);
				setState(47); ((AlternativeContext)_localctx).condition = expr();
				setState(48); ((AlternativeContext)_localctx).consequence = prog();
				setState(49); ((AlternativeContext)_localctx).alternant = prog();
				}
				break;
			case T__21:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(T__21);
				setState(52); ((WhileContext)_localctx).condition = expr();
				setState(53); ((WhileContext)_localctx).body = prog();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTtype node;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitTypeBool(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitTypeInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(T__7);
				}
				break;
			case T__13:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTexpression node;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class ConstNumericContext extends ExprContext {
		public Token constNum;
		public TerminalNode NUM() { return getToken(APSgrammar0Parser.NUM, 0); }
		public ConstNumericContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterConstNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitConstNumeric(this);
		}
	}
	public static class BinaryContext extends ExprContext {
		public Token op;
		public ExprContext arg1;
		public ExprContext arg2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitBinary(this);
		}
	}
	public static class ConsTrueContext extends ExprContext {
		public ConsTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterConsTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitConsTrue(this);
		}
	}
	public static class ConstFalseContext extends ExprContext {
		public ConstFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterConstFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitConstFalse(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitUnary(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(T__20);
				}
				break;
			case 2:
				_localctx = new ConstFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(T__1);
				}
				break;
			case 3:
				_localctx = new ConstNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63); ((ConstNumericContext)_localctx).constNum = match(NUM);
				}
				break;
			case 4:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(T__5);
				setState(65); ((UnaryContext)_localctx).op = match(T__2);
				setState(66); ((UnaryContext)_localctx).arg = expr();
				setState(67); match(T__4);
				}
				break;
			case 5:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69); match(T__5);
				setState(70);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__3) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(71); ((BinaryContext)_localctx).arg1 = expr();
				setState(72); ((BinaryContext)_localctx).arg2 = expr();
				setState(73); match(T__4);
				}
				break;
			case 6:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75); match(T__5);
				setState(76);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__19) | (1L << T__16) | (1L << T__10) | (1L << T__8) | (1L << T__6))) != 0)) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(77); ((BinaryContext)_localctx).arg1 = expr();
				setState(78); ((BinaryContext)_localctx).arg2 = expr();
				setState(79); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 V\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5:\n\5\3\6\3\6\5\6>\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\7\2\2\b\2\4"+
		"\6\b\n\f\2\4\4\2\r\r\26\26\b\2\3\3\6\6\t\t\17\17\21\21\23\23[\2\16\3\2"+
		"\2\2\4!\3\2\2\2\6+\3\2\2\2\b9\3\2\2\2\n=\3\2\2\2\fS\3\2\2\2\16\17\7\b"+
		"\2\2\17\23\5\4\3\2\20\22\7\13\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3"+
		"\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3"+
		"\2\2\2\30\33\5\b\5\2\31\32\7\7\2\2\32\34\5\4\3\2\33\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\"\3\2\2\2\35\36\5\6\4\2\36\37\7\7\2\2\37 \5\4\3\2 \"\3\2\2\2"+
		"!\30\3\2\2\2!\35\3\2\2\2\"\5\3\2\2\2#$\7\20\2\2$%\7\36\2\2%,\5\n\6\2&"+
		"\'\7\16\2\2\'(\7\36\2\2()\5\f\7\2)*\5\n\6\2*,\3\2\2\2+#\3\2\2\2+&\3\2"+
		"\2\2,\7\3\2\2\2-.\7\31\2\2./\7\36\2\2/:\5\f\7\2\60\61\7\n\2\2\61\62\5"+
		"\f\7\2\62\63\5\2\2\2\63\64\5\2\2\2\64:\3\2\2\2\65\66\7\4\2\2\66\67\5\f"+
		"\7\2\678\5\2\2\28:\3\2\2\29-\3\2\2\29\60\3\2\2\29\65\3\2\2\2:\t\3\2\2"+
		"\2;>\7\22\2\2<>\7\f\2\2=;\3\2\2\2=<\3\2\2\2>\13\3\2\2\2?T\7\5\2\2@T\7"+
		"\30\2\2AT\7\37\2\2BC\7\24\2\2CD\7\27\2\2DE\5\f\7\2EF\7\25\2\2FT\3\2\2"+
		"\2GH\7\24\2\2HI\t\2\2\2IJ\5\f\7\2JK\5\f\7\2KL\7\25\2\2LT\3\2\2\2MN\7\24"+
		"\2\2NO\t\3\2\2OP\5\f\7\2PQ\5\f\7\2QR\7\25\2\2RT\3\2\2\2S?\3\2\2\2S@\3"+
		"\2\2\2SA\3\2\2\2SB\3\2\2\2SG\3\2\2\2SM\3\2\2\2T\r\3\2\2\2\t\23\33!+9="+
		"S";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}