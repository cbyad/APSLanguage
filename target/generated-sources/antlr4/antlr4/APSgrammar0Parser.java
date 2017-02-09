// Generated from APSgrammar0.g4 by ANTLR 4.4

	package antlr4 ;

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
		NUM=25, SPACE=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'add'", "'WHILE'", "'true'", "'sub'", "';'", "'['", "'mul'", 
		"'IF'", "']'", "'bool'", "'or'", "'CONST'", "'lt'", "'VAR'", "'div'", 
		"'int'", "'eq'", "'('", "')'", "'and'", "'not'", "'false'", "'SET'", "IDENT", 
		"NUM", "SPACE"
	};
	public static final int
		RULE_prog = 0, RULE_cmd = 1, RULE_dec = 2, RULE_stat = 3, RULE_type = 4, 
		RULE_expr = 5;
	public static final String[] ruleNames = {
		"prog", "cmd", "dec", "stat", "type", "expr"
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
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
		public TerminalNode EOF() { return getToken(APSgrammar0Parser.EOF, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); match(T__17);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__15) | (1L << T__11) | (1L << T__9) | (1L << T__0))) != 0)) {
				{
				{
				setState(13); ((ProgContext)_localctx).cmd = cmd();
				((ProgContext)_localctx).cmds.add(((ProgContext)_localctx).cmd);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(19); match(T__14);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(EOF);
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

	public static class CmdContext extends ParserRuleContext {
		public com.aps0.interfaces.IASTCommands node;
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	public static class StatementContext extends CmdContext {
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public StatementContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitStatement(this);
		}
	}
	public static class DeclarationContext extends CmdContext {
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public DeclarationContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitDeclaration(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		int _la;
		try {
			int _alt;
			setState(45);
			switch (_input.LA(1)) {
			case T__21:
			case T__15:
			case T__0:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27); stat();
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(29);
						_la = _input.LA(1);
						if (_la==T__18) {
							{
							setState(28); match(T__18);
							}
						}

						setState(31); ((StatementContext)_localctx).cmd = cmd();
						((StatementContext)_localctx).cmds.add(((StatementContext)_localctx).cmd);
						}
						} 
					}
					setState(36);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case T__11:
			case T__9:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37); dec();
				setState(38); match(T__18);
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39); ((DeclarationContext)_localctx).cmd = cmd();
						((DeclarationContext)_localctx).cmds.add(((DeclarationContext)_localctx).cmd);
						}
						} 
					}
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
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
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public VariableContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitVariable(this);
		}
	}
	public static class ConstantContext extends DecContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public ConstantContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitConstant(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(T__9);
				setState(48); match(IDENT);
				setState(49); type();
				}
				break;
			case T__11:
				_localctx = new ConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(T__11);
				setState(51); match(IDENT);
				setState(52); expr();
				setState(53); type();
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BindingContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar0Parser.IDENT, 0); }
		public BindingContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitBinding(this);
		}
	}
	public static class LoopContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public LoopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitLoop(this);
		}
	}
	public static class AlternativeContext extends StatContext {
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

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new BindingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57); match(T__0);
				setState(58); match(IDENT);
				setState(59); expr();
				}
				break;
			case T__15:
				_localctx = new AlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(T__15);
				setState(61); expr();
				setState(62); prog();
				setState(63); prog();
				}
				break;
			case T__21:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65); match(T__21);
				setState(66); expr();
				setState(67); prog();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
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
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(T__20);
				}
				break;
			case 2:
				_localctx = new ConstFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74); match(T__1);
				}
				break;
			case 3:
				_localctx = new ConstNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75); ((ConstNumericContext)_localctx).constNum = match(NUM);
				}
				break;
			case 4:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76); match(T__5);
				setState(77); match(T__2);
				setState(78); expr();
				setState(79); match(T__4);
				}
				break;
			case 5:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81); match(T__5);
				setState(82); match(T__3);
				setState(83); expr();
				setState(84); expr();
				setState(85); match(T__4);
				}
				break;
			case 6:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(87); match(T__5);
				setState(88); match(T__12);
				setState(89); expr();
				setState(90); expr();
				setState(91); match(T__4);
				}
				break;
			case 7:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(93); match(T__5);
				setState(94); match(T__22);
				setState(95); expr();
				setState(96); expr();
				setState(97); match(T__4);
				}
				break;
			case 8:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99); match(T__5);
				setState(100); match(T__16);
				setState(101); expr();
				setState(102); expr();
				setState(103); match(T__4);
				}
				break;
			case 9:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(105); match(T__5);
				setState(106); match(T__19);
				setState(107); expr();
				setState(108); expr();
				setState(109); match(T__4);
				}
				break;
			case 10:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(111); match(T__5);
				setState(112); match(T__8);
				setState(113); expr();
				setState(114); expr();
				setState(115); match(T__4);
				}
				break;
			case 11:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(117); match(T__5);
				setState(118); match(T__10);
				setState(119); expr();
				setState(120); expr();
				setState(121); match(T__4);
				}
				break;
			case 12:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(123); match(T__5);
				setState(124); match(T__6);
				setState(125); expr();
				setState(126); expr();
				setState(127); match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24"+
		"\13\2\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\5\3 \n\3\3\3\7\3"+
		"#\n\3\f\3\16\3&\13\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\5\3\60\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5H\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\7\2"+
		"\2\b\2\4\6\b\n\f\2\3\4\2\f\f\22\22\u0093\2\16\3\2\2\2\4/\3\2\2\2\69\3"+
		"\2\2\2\bG\3\2\2\2\nI\3\2\2\2\f\u0083\3\2\2\2\16\22\7\b\2\2\17\21\5\4\3"+
		"\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\30\3\2\2"+
		"\2\24\22\3\2\2\2\25\27\7\13\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2"+
		"\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2\3\34\3\3\2"+
		"\2\2\35$\5\b\5\2\36 \7\7\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\5\4"+
		"\3\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\60\3\2\2\2&$\3\2\2\2"+
		"\'(\5\6\4\2(,\7\7\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2"+
		"\2-\60\3\2\2\2.,\3\2\2\2/\35\3\2\2\2/\'\3\2\2\2\60\5\3\2\2\2\61\62\7\20"+
		"\2\2\62\63\7\32\2\2\63:\5\n\6\2\64\65\7\16\2\2\65\66\7\32\2\2\66\67\5"+
		"\f\7\2\678\5\n\6\28:\3\2\2\29\61\3\2\2\29\64\3\2\2\2:\7\3\2\2\2;<\7\31"+
		"\2\2<=\7\32\2\2=H\5\f\7\2>?\7\n\2\2?@\5\f\7\2@A\5\2\2\2AB\5\2\2\2BH\3"+
		"\2\2\2CD\7\4\2\2DE\5\f\7\2EF\5\2\2\2FH\3\2\2\2G;\3\2\2\2G>\3\2\2\2GC\3"+
		"\2\2\2H\t\3\2\2\2IJ\t\2\2\2J\13\3\2\2\2K\u0084\7\5\2\2L\u0084\7\30\2\2"+
		"M\u0084\7\33\2\2NO\7\24\2\2OP\7\27\2\2PQ\5\f\7\2QR\7\25\2\2R\u0084\3\2"+
		"\2\2ST\7\24\2\2TU\7\26\2\2UV\5\f\7\2VW\5\f\7\2WX\7\25\2\2X\u0084\3\2\2"+
		"\2YZ\7\24\2\2Z[\7\r\2\2[\\\5\f\7\2\\]\5\f\7\2]^\7\25\2\2^\u0084\3\2\2"+
		"\2_`\7\24\2\2`a\7\3\2\2ab\5\f\7\2bc\5\f\7\2cd\7\25\2\2d\u0084\3\2\2\2"+
		"ef\7\24\2\2fg\7\t\2\2gh\5\f\7\2hi\5\f\7\2ij\7\25\2\2j\u0084\3\2\2\2kl"+
		"\7\24\2\2lm\7\6\2\2mn\5\f\7\2no\5\f\7\2op\7\25\2\2p\u0084\3\2\2\2qr\7"+
		"\24\2\2rs\7\21\2\2st\5\f\7\2tu\5\f\7\2uv\7\25\2\2v\u0084\3\2\2\2wx\7\24"+
		"\2\2xy\7\17\2\2yz\5\f\7\2z{\5\f\7\2{|\7\25\2\2|\u0084\3\2\2\2}~\7\24\2"+
		"\2~\177\7\23\2\2\177\u0080\5\f\7\2\u0080\u0081\5\f\7\2\u0081\u0082\7\25"+
		"\2\2\u0082\u0084\3\2\2\2\u0083K\3\2\2\2\u0083L\3\2\2\2\u0083M\3\2\2\2"+
		"\u0083N\3\2\2\2\u0083S\3\2\2\2\u0083Y\3\2\2\2\u0083_\3\2\2\2\u0083e\3"+
		"\2\2\2\u0083k\3\2\2\2\u0083q\3\2\2\2\u0083w\3\2\2\2\u0083}\3\2\2\2\u0084"+
		"\r\3\2\2\2\13\22\30\37$,/9G\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}