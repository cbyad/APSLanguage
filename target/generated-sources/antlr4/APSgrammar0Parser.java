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
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, IDENT=24, 
		NUM=25, SPACE=26, ESC=27, LINE_COMMENT=28, COMMENT=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'add'", "'WHILE'", "'true'", "'sub'", "';'", "'['", "'mul'", 
		"'IF'", "']'", "'bool'", "'or'", "'CONST'", "'lt'", "'VAR'", "'div'", 
		"'int'", "'eq'", "'('", "')'", "'and'", "'not'", "'false'", "'SET'", "IDENT", 
		"NUM", "SPACE", "ESC", "LINE_COMMENT", "COMMENT"
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
		try {
			_localctx = new ProgrammContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__17);
			setState(13); ((ProgrammContext)_localctx).cmds = cmds();
			((ProgrammContext)_localctx).listcmds.add(((ProgrammContext)_localctx).cmds);
			setState(14); match(T__14);
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
		public List<CmdsContext> cmds() {
			return getRuleContexts(CmdsContext.class);
		}
		public CmdsContext cmds(int i) {
			return getRuleContext(CmdsContext.class,i);
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
		try {
			int _alt;
			setState(28);
			switch (_input.LA(1)) {
			case T__21:
			case T__15:
			case T__0:
				_localctx = new StatCmdsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16); ((StatCmdsContext)_localctx).statement = stat();
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(17); match(T__18);
						setState(18); ((StatCmdsContext)_localctx).cmds = cmds();
						((StatCmdsContext)_localctx).commandes.add(((StatCmdsContext)_localctx).cmds);
						}
						} 
					}
					setState(23);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case T__11:
			case T__9:
				_localctx = new DecCmdsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24); ((DecCmdsContext)_localctx).declaration = dec();
				setState(25); match(T__18);
				setState(26); ((DecCmdsContext)_localctx).cmds = cmds();
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
		public TypeContext typ;
		public ExprContext arg;
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
			setState(38);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new VariableDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(T__9);
				setState(31); ((VariableDecContext)_localctx).ident = match(IDENT);
				setState(32); ((VariableDecContext)_localctx).typ = type();
				}
				break;
			case T__11:
				_localctx = new ConstantDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(33); match(T__11);
				setState(34); ((ConstantDecContext)_localctx).ident = match(IDENT);
				setState(35); ((ConstantDecContext)_localctx).typ = type();
				setState(36); ((ConstantDecContext)_localctx).arg = expr();
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
			setState(52);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(T__0);
				setState(41); ((VariableAssignContext)_localctx).ident = match(IDENT);
				setState(42); ((VariableAssignContext)_localctx).arg = expr();
				}
				break;
			case T__15:
				_localctx = new AlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43); match(T__15);
				setState(44); ((AlternativeContext)_localctx).condition = expr();
				setState(45); ((AlternativeContext)_localctx).consequence = prog();
				setState(46); ((AlternativeContext)_localctx).alternant = prog();
				}
				break;
			case T__21:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48); match(T__21);
				setState(49); ((WhileContext)_localctx).condition = expr();
				setState(50); ((WhileContext)_localctx).body = prog();
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
			setState(56);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54); match(T__7);
				}
				break;
			case T__13:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55); match(T__13);
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(T__20);
				}
				break;
			case 2:
				_localctx = new ConstFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(T__1);
				}
				break;
			case 3:
				_localctx = new ConstNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); ((ConstNumericContext)_localctx).constNum = match(NUM);
				}
				break;
			case 4:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61); match(T__5);
				setState(62); ((UnaryContext)_localctx).op = match(T__2);
				setState(63); ((UnaryContext)_localctx).arg = expr();
				setState(64); match(T__4);
				}
				break;
			case 5:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66); match(T__5);
				setState(67);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__3) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(68); ((BinaryContext)_localctx).arg1 = expr();
				setState(69); ((BinaryContext)_localctx).arg2 = expr();
				setState(70); match(T__4);
				}
				break;
			case 6:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(72); match(T__5);
				setState(73);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__19) | (1L << T__16) | (1L << T__10) | (1L << T__8) | (1L << T__6))) != 0)) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(74); ((BinaryContext)_localctx).arg1 = expr();
				setState(75); ((BinaryContext)_localctx).arg2 = expr();
				setState(76); match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\26"+
		"\n\3\f\3\16\3\31\13\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\67\n\5\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\7\2\2\b\2\4\6\b\n\f\2"+
		"\4\4\2\r\r\26\26\b\2\3\3\6\6\t\t\17\17\21\21\23\23W\2\16\3\2\2\2\4\36"+
		"\3\2\2\2\6(\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\fP\3\2\2\2\16\17\7\b\2\2\17"+
		"\20\5\4\3\2\20\21\7\13\2\2\21\3\3\2\2\2\22\27\5\b\5\2\23\24\7\7\2\2\24"+
		"\26\5\4\3\2\25\23\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\37\3\2\2\2\31\27\3\2\2\2\32\33\5\6\4\2\33\34\7\7\2\2\34\35\5\4\3\2\35"+
		"\37\3\2\2\2\36\22\3\2\2\2\36\32\3\2\2\2\37\5\3\2\2\2 !\7\20\2\2!\"\7\32"+
		"\2\2\")\5\n\6\2#$\7\16\2\2$%\7\32\2\2%&\5\n\6\2&\'\5\f\7\2\')\3\2\2\2"+
		"( \3\2\2\2(#\3\2\2\2)\7\3\2\2\2*+\7\31\2\2+,\7\32\2\2,\67\5\f\7\2-.\7"+
		"\n\2\2./\5\f\7\2/\60\5\2\2\2\60\61\5\2\2\2\61\67\3\2\2\2\62\63\7\4\2\2"+
		"\63\64\5\f\7\2\64\65\5\2\2\2\65\67\3\2\2\2\66*\3\2\2\2\66-\3\2\2\2\66"+
		"\62\3\2\2\2\67\t\3\2\2\28;\7\22\2\29;\7\f\2\2:8\3\2\2\2:9\3\2\2\2;\13"+
		"\3\2\2\2<Q\7\5\2\2=Q\7\30\2\2>Q\7\33\2\2?@\7\24\2\2@A\7\27\2\2AB\5\f\7"+
		"\2BC\7\25\2\2CQ\3\2\2\2DE\7\24\2\2EF\t\2\2\2FG\5\f\7\2GH\5\f\7\2HI\7\25"+
		"\2\2IQ\3\2\2\2JK\7\24\2\2KL\t\3\2\2LM\5\f\7\2MN\5\f\7\2NO\7\25\2\2OQ\3"+
		"\2\2\2P<\3\2\2\2P=\3\2\2\2P>\3\2\2\2P?\3\2\2\2PD\3\2\2\2PJ\3\2\2\2Q\r"+
		"\3\2\2\2\b\27\36(\66:P";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}