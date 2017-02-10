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
		public StatContext statement;
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
		public DecContext declaration;
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
			setState(44);
			switch (_input.LA(1)) {
			case T__21:
			case T__15:
			case T__0:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27); ((StatementContext)_localctx).statement = stat();
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
				setState(37); ((DeclarationContext)_localctx).declaration = dec();
				setState(38); match(T__18);
				setState(40); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(39); ((DeclarationContext)_localctx).cmd = cmd();
						((DeclarationContext)_localctx).cmds.add(((DeclarationContext)_localctx).cmd);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(42); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ConstantDecContext extends DecContext {
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
			setState(54);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new VariableDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(T__9);
				setState(47); match(IDENT);
				setState(48); ((VariableDecContext)_localctx).typ = type();
				}
				break;
			case T__11:
				_localctx = new ConstantDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(T__11);
				setState(50); match(IDENT);
				setState(51); ((ConstantDecContext)_localctx).arg = expr();
				setState(52); ((ConstantDecContext)_localctx).typ = type();
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
			setState(68);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56); match(T__0);
				setState(57); match(IDENT);
				setState(58); ((VariableAssignContext)_localctx).arg = expr();
				}
				break;
			case T__15:
				_localctx = new AlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59); match(T__15);
				setState(60); ((AlternativeContext)_localctx).condition = expr();
				setState(61); ((AlternativeContext)_localctx).consequence = prog();
				setState(62); ((AlternativeContext)_localctx).alternant = prog();
				}
				break;
			case T__21:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64); match(T__21);
				setState(65); ((WhileContext)_localctx).condition = expr();
				setState(66); ((WhileContext)_localctx).body = prog();
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
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolContext extends TypeContext {
		public BoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitBool(this);
		}
	}
	public static class IntContext extends TypeContext {
		public IntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar0Listener ) ((APSgrammar0Listener)listener).exitInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(T__7);
				}
				break;
			case T__13:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(T__13);
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
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(T__20);
				}
				break;
			case 2:
				_localctx = new ConstFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75); match(T__1);
				}
				break;
			case 3:
				_localctx = new ConstNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76); ((ConstNumericContext)_localctx).constNum = match(NUM);
				}
				break;
			case 4:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77); match(T__5);
				setState(78); ((UnaryContext)_localctx).op = match(T__2);
				setState(79); ((UnaryContext)_localctx).arg = expr();
				setState(80); match(T__4);
				}
				break;
			case 5:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82); match(T__5);
				setState(83);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__3) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(84); ((BinaryContext)_localctx).arg1 = expr();
				setState(85); ((BinaryContext)_localctx).arg2 = expr();
				setState(86); match(T__4);
				}
				break;
			case 6:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88); match(T__5);
				setState(89);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__19) | (1L << T__16) | (1L << T__10) | (1L << T__8) | (1L << T__6))) != 0)) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(90); ((BinaryContext)_localctx).arg1 = expr();
				setState(91); ((BinaryContext)_localctx).arg2 = expr();
				setState(92); match(T__4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\5\3 \n\3\3\3\7\3#\n\3"+
		"\f\3\16\3&\13\3\3\3\3\3\3\3\6\3+\n\3\r\3\16\3,\5\3/\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5G\n\5\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\2\2\b\2\4\6\b"+
		"\n\f\2\4\4\2\r\r\26\26\b\2\3\3\6\6\t\t\17\17\21\21\23\23k\2\16\3\2\2\2"+
		"\4.\3\2\2\2\68\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\f`\3\2\2\2\16\22\7\b\2\2"+
		"\17\21\5\4\3\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2"+
		"\23\30\3\2\2\2\24\22\3\2\2\2\25\27\7\13\2\2\26\25\3\2\2\2\27\32\3\2\2"+
		"\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2"+
		"\3\34\3\3\2\2\2\35$\5\b\5\2\36 \7\7\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3"+
		"\2\2\2!#\5\4\3\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%/\3\2\2\2"+
		"&$\3\2\2\2\'(\5\6\4\2(*\7\7\2\2)+\5\4\3\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2"+
		"\2,-\3\2\2\2-/\3\2\2\2.\35\3\2\2\2.\'\3\2\2\2/\5\3\2\2\2\60\61\7\20\2"+
		"\2\61\62\7\32\2\2\629\5\n\6\2\63\64\7\16\2\2\64\65\7\32\2\2\65\66\5\f"+
		"\7\2\66\67\5\n\6\2\679\3\2\2\28\60\3\2\2\28\63\3\2\2\29\7\3\2\2\2:;\7"+
		"\31\2\2;<\7\32\2\2<G\5\f\7\2=>\7\n\2\2>?\5\f\7\2?@\5\2\2\2@A\5\2\2\2A"+
		"G\3\2\2\2BC\7\4\2\2CD\5\f\7\2DE\5\2\2\2EG\3\2\2\2F:\3\2\2\2F=\3\2\2\2"+
		"FB\3\2\2\2G\t\3\2\2\2HK\7\22\2\2IK\7\f\2\2JH\3\2\2\2JI\3\2\2\2K\13\3\2"+
		"\2\2La\7\5\2\2Ma\7\30\2\2Na\7\33\2\2OP\7\24\2\2PQ\7\27\2\2QR\5\f\7\2R"+
		"S\7\25\2\2Sa\3\2\2\2TU\7\24\2\2UV\t\2\2\2VW\5\f\7\2WX\5\f\7\2XY\7\25\2"+
		"\2Ya\3\2\2\2Z[\7\24\2\2[\\\t\3\2\2\\]\5\f\7\2]^\5\f\7\2^_\7\25\2\2_a\3"+
		"\2\2\2`L\3\2\2\2`M\3\2\2\2`N\3\2\2\2`O\3\2\2\2`T\3\2\2\2`Z\3\2\2\2a\r"+
		"\3\2\2\2\f\22\30\37$,.8FJ`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}