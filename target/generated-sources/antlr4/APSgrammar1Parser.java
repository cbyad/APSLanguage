// Generated from APSgrammar1.g4 by ANTLR 4.4

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
public class APSgrammar1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, IDENT=28, NUM=29, SPACE=30, ESC=31, LINE_COMMENT=32, 
		COMMENT=33;
	public static final String[] tokenNames = {
		"<INVALID>", "'WHILE'", "'true'", "';'", "'IF'", "'VAR'", "'int'", "'eq'", 
		"'('", "'*'", "','", "'false'", "'add'", "'->'", "'sub'", "':'", "'['", 
		"'mul'", "']'", "'bool'", "'or'", "'CONST'", "'lt'", "'div'", "')'", "'and'", 
		"'not'", "'SET'", "IDENT", "NUM", "SPACE", "ESC", "LINE_COMMENT", "COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_cmds = 1, RULE_dec = 2, RULE_stat = 3, RULE_type = 4, 
		RULE_expr = 5, RULE_args = 6, RULE_exprs = 7, RULE_types = 8;
	public static final String[] ruleNames = {
		"prog", "cmds", "dec", "stat", "type", "expr", "args", "exprs", "types"
	};

	@Override
	public String getGrammarFileName() { return "APSgrammar1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public APSgrammar1Parser(TokenStream input) {
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
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitProgramm(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new ProgrammContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(T__11);
			setState(19); ((ProgrammContext)_localctx).cmds = cmds();
			((ProgrammContext)_localctx).listcmds.add(((ProgrammContext)_localctx).cmds);
			setState(20); match(T__9);
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
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterStatCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitStatCmds(this);
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
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterDecCmds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitDecCmds(this);
		}
	}

	public final CmdsContext cmds() throws RecognitionException {
		CmdsContext _localctx = new CmdsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmds);
		try {
			int _alt;
			setState(34);
			switch (_input.LA(1)) {
			case T__26:
			case T__23:
			case T__0:
				_localctx = new StatCmdsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22); ((StatCmdsContext)_localctx).statement = stat();
				setState(27);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(23); match(T__24);
						setState(24); ((StatCmdsContext)_localctx).cmds = cmds();
						((StatCmdsContext)_localctx).commandes.add(((StatCmdsContext)_localctx).cmds);
						}
						} 
					}
					setState(29);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case T__22:
			case T__6:
				_localctx = new DecCmdsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30); ((DecCmdsContext)_localctx).declaration = dec();
				setState(31); match(T__24);
				setState(32); ((DecCmdsContext)_localctx).cmds = cmds();
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
		public TerminalNode IDENT() { return getToken(APSgrammar1Parser.IDENT, 0); }
		public ConstantDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterConstantDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitConstantDec(this);
		}
	}
	public static class VariableDecContext extends DecContext {
		public Token ident;
		public TypeContext typ;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar1Parser.IDENT, 0); }
		public VariableDecContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterVariableDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitVariableDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new VariableDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36); match(T__22);
				setState(37); ((VariableDecContext)_localctx).ident = match(IDENT);
				setState(38); ((VariableDecContext)_localctx).typ = type();
				}
				break;
			case T__6:
				_localctx = new ConstantDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(T__6);
				setState(40); ((ConstantDecContext)_localctx).ident = match(IDENT);
				setState(41); ((ConstantDecContext)_localctx).typ = type();
				setState(42); ((ConstantDecContext)_localctx).arg = expr();
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
		public CmdsContext cmds;
		public List<CmdsContext> consequence = new ArrayList<CmdsContext>();
		public List<CmdsContext> alternant = new ArrayList<CmdsContext>();
		public List<CmdsContext> cmds() {
			return getRuleContexts(CmdsContext.class);
		}
		public CmdsContext cmds(int i) {
			return getRuleContext(CmdsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AlternativeContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitAlternative(this);
		}
	}
	public static class VariableAssignContext extends StatContext {
		public Token ident;
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar1Parser.IDENT, 0); }
		public VariableAssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitVariableAssign(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExprContext condition;
		public CmdsContext cmds;
		public List<CmdsContext> body = new ArrayList<CmdsContext>();
		public CmdsContext cmds() {
			return getRuleContext(CmdsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitWhile(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(T__0);
				setState(47); ((VariableAssignContext)_localctx).ident = match(IDENT);
				setState(48); ((VariableAssignContext)_localctx).arg = expr();
				}
				break;
			case T__23:
				_localctx = new AlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(T__23);
				setState(50); ((AlternativeContext)_localctx).condition = expr();
				setState(51); match(T__11);
				setState(52); ((AlternativeContext)_localctx).cmds = cmds();
				((AlternativeContext)_localctx).consequence.add(((AlternativeContext)_localctx).cmds);
				setState(53); match(T__9);
				setState(54); match(T__11);
				setState(55); ((AlternativeContext)_localctx).cmds = cmds();
				((AlternativeContext)_localctx).alternant.add(((AlternativeContext)_localctx).cmds);
				setState(56); match(T__9);
				}
				break;
			case T__26:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58); match(T__26);
				setState(59); ((WhileContext)_localctx).condition = expr();
				setState(60); match(T__11);
				setState(61); ((WhileContext)_localctx).cmds = cmds();
				((WhileContext)_localctx).body.add(((WhileContext)_localctx).cmds);
				setState(62); match(T__9);
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
	public static class TypeFonctionnelContext extends TypeContext {
		public TypesContext types;
		public List<TypesContext> typs = new ArrayList<TypesContext>();
		public TypeContext typ;
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeFonctionnelContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterTypeFonctionnel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitTypeFonctionnel(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitTypeBool(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitTypeInt(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66); match(T__21);
				}
				break;
			case T__8:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(T__8);
				}
				break;
			case T__19:
				_localctx = new TypeFonctionnelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(68); match(T__19);
				setState(69); ((TypeFonctionnelContext)_localctx).types = types();
				((TypeFonctionnelContext)_localctx).typs.add(((TypeFonctionnelContext)_localctx).types);
				setState(70); match(T__14);
				setState(71); ((TypeFonctionnelContext)_localctx).typ = type();
				setState(72); match(T__3);
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
	public static class AbstractionExprContext extends ExprContext {
		public ArgsContext args;
		public List<ArgsContext> abs = new ArrayList<ArgsContext>();
		public ExprContext exp;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AbstractionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterAbstractionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitAbstractionExpr(this);
		}
	}
	public static class ApplicationExprContext extends ExprContext {
		public ExprsContext exprs;
		public List<ExprsContext> app = new ArrayList<ExprsContext>();
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ApplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterApplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitApplicationExpr(this);
		}
	}
	public static class IdentExprContext extends ExprContext {
		public Token ident;
		public TerminalNode IDENT() { return getToken(APSgrammar1Parser.IDENT, 0); }
		public IdentExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterIdentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitIdentExpr(this);
		}
	}
	public static class ConstNumericContext extends ExprContext {
		public Token constNum;
		public TerminalNode NUM() { return getToken(APSgrammar1Parser.NUM, 0); }
		public ConstNumericContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterConstNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitConstNumeric(this);
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
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitBinary(this);
		}
	}
	public static class ConsTrueContext extends ExprContext {
		public ConsTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterConsTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitConsTrue(this);
		}
	}
	public static class ConstFalseContext extends ExprContext {
		public ConstFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterConstFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitConstFalse(this);
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
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitUnary(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		int _la;
		try {
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ConsTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(T__25);
				}
				break;
			case 2:
				_localctx = new ConstFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(T__16);
				}
				break;
			case 3:
				_localctx = new ConstNumericContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78); ((ConstNumericContext)_localctx).constNum = match(NUM);
				}
				break;
			case 4:
				_localctx = new IdentExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79); ((IdentExprContext)_localctx).ident = match(IDENT);
				}
				break;
			case 5:
				_localctx = new UnaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80); match(T__19);
				setState(81); ((UnaryContext)_localctx).op = match(T__1);
				setState(82); ((UnaryContext)_localctx).arg = expr();
				setState(83); match(T__3);
				}
				break;
			case 6:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85); match(T__19);
				setState(86);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__2) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(87); ((BinaryContext)_localctx).arg1 = expr();
				setState(88); ((BinaryContext)_localctx).arg2 = expr();
				setState(89); match(T__3);
				}
				break;
			case 7:
				_localctx = new BinaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91); match(T__19);
				setState(92);
				((BinaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__15) | (1L << T__13) | (1L << T__10) | (1L << T__5) | (1L << T__4))) != 0)) ) {
					((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(93); ((BinaryContext)_localctx).arg1 = expr();
				setState(94); ((BinaryContext)_localctx).arg2 = expr();
				setState(95); match(T__3);
				}
				break;
			case 8:
				_localctx = new AbstractionExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97); match(T__11);
				setState(98); ((AbstractionExprContext)_localctx).args = args();
				((AbstractionExprContext)_localctx).abs.add(((AbstractionExprContext)_localctx).args);
				setState(99); match(T__9);
				setState(100); ((AbstractionExprContext)_localctx).exp = expr();
				}
				break;
			case 9:
				_localctx = new ApplicationExprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(102); match(T__19);
				setState(103); ((ApplicationExprContext)_localctx).exprs = exprs();
				((ApplicationExprContext)_localctx).app.add(((ApplicationExprContext)_localctx).exprs);
				setState(104); match(T__3);
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

	public static class ArgsContext extends ParserRuleContext {
		public com.aps1.interfaces.IASTabstraction node;
		public Token ident;
		public TypeContext typ;
		public ArgsContext args;
		public List<ArgsContext> arg = new ArrayList<ArgsContext>();
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(APSgrammar1Parser.IDENT, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108); ((ArgsContext)_localctx).ident = match(IDENT);
			setState(109); match(T__12);
			setState(110); ((ArgsContext)_localctx).typ = type();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111); match(T__17);
					setState(112); ((ArgsContext)_localctx).args = args();
					((ArgsContext)_localctx).arg.add(((ArgsContext)_localctx).args);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
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

	public static class ExprsContext extends ParserRuleContext {
		public com.aps1.interfaces.IASTapplication node;
		public ExprContext exp;
		public ExprsContext exprs;
		public List<ExprsContext> exps = new ArrayList<ExprsContext>();
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((ExprsContext)_localctx).exp = expr();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119); ((ExprsContext)_localctx).exprs = exprs();
					((ExprsContext)_localctx).exps.add(((ExprsContext)_localctx).exprs);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
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

	public static class TypesContext extends ParserRuleContext {
		public com.aps1.interfaces.IASTtypes node;
		public TypeContext typ;
		public TypesContext types;
		public List<TypesContext> typs = new ArrayList<TypesContext>();
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APSgrammar1Listener ) ((APSgrammar1Listener)listener).exitTypes(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); ((TypesContext)_localctx).typ = type();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); match(T__18);
					setState(127); ((TypesContext)_localctx).types = types();
					((TypesContext)_localctx).typs.add(((TypesContext)_localctx).types);
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\3\3\5\3%"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16\bw\13\b\3\t\3"+
		"\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\7\n\u0083\n\n\f\n\16\n\u0086\13"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\4\2\26\26\33\33\7\2\t\t\16\16\20"+
		"\20\23\23\30\31\u0090\2\24\3\2\2\2\4$\3\2\2\2\6.\3\2\2\2\bB\3\2\2\2\n"+
		"L\3\2\2\2\fl\3\2\2\2\16n\3\2\2\2\20x\3\2\2\2\22\177\3\2\2\2\24\25\7\22"+
		"\2\2\25\26\5\4\3\2\26\27\7\24\2\2\27\3\3\2\2\2\30\35\5\b\5\2\31\32\7\5"+
		"\2\2\32\34\5\4\3\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36%\3\2\2\2\37\35\3\2\2\2 !\5\6\4\2!\"\7\5\2\2\"#\5\4\3\2#%\3\2\2"+
		"\2$\30\3\2\2\2$ \3\2\2\2%\5\3\2\2\2&\'\7\7\2\2\'(\7\36\2\2(/\5\n\6\2)"+
		"*\7\27\2\2*+\7\36\2\2+,\5\n\6\2,-\5\f\7\2-/\3\2\2\2.&\3\2\2\2.)\3\2\2"+
		"\2/\7\3\2\2\2\60\61\7\35\2\2\61\62\7\36\2\2\62C\5\f\7\2\63\64\7\6\2\2"+
		"\64\65\5\f\7\2\65\66\7\22\2\2\66\67\5\4\3\2\678\7\24\2\289\7\22\2\29:"+
		"\5\4\3\2:;\7\24\2\2;C\3\2\2\2<=\7\3\2\2=>\5\f\7\2>?\7\22\2\2?@\5\4\3\2"+
		"@A\7\24\2\2AC\3\2\2\2B\60\3\2\2\2B\63\3\2\2\2B<\3\2\2\2C\t\3\2\2\2DM\7"+
		"\b\2\2EM\7\25\2\2FG\7\n\2\2GH\5\22\n\2HI\7\17\2\2IJ\5\n\6\2JK\7\32\2\2"+
		"KM\3\2\2\2LD\3\2\2\2LE\3\2\2\2LF\3\2\2\2M\13\3\2\2\2Nm\7\4\2\2Om\7\r\2"+
		"\2Pm\7\37\2\2Qm\7\36\2\2RS\7\n\2\2ST\7\34\2\2TU\5\f\7\2UV\7\32\2\2Vm\3"+
		"\2\2\2WX\7\n\2\2XY\t\2\2\2YZ\5\f\7\2Z[\5\f\7\2[\\\7\32\2\2\\m\3\2\2\2"+
		"]^\7\n\2\2^_\t\3\2\2_`\5\f\7\2`a\5\f\7\2ab\7\32\2\2bm\3\2\2\2cd\7\22\2"+
		"\2de\5\16\b\2ef\7\24\2\2fg\5\f\7\2gm\3\2\2\2hi\7\n\2\2ij\5\20\t\2jk\7"+
		"\32\2\2km\3\2\2\2lN\3\2\2\2lO\3\2\2\2lP\3\2\2\2lQ\3\2\2\2lR\3\2\2\2lW"+
		"\3\2\2\2l]\3\2\2\2lc\3\2\2\2lh\3\2\2\2m\r\3\2\2\2no\7\36\2\2op\7\21\2"+
		"\2pu\5\n\6\2qr\7\f\2\2rt\5\16\b\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\17\3\2\2\2wu\3\2\2\2x|\5\f\7\2y{\5\20\t\2zy\3\2\2\2{~\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\21\3\2\2\2~|\3\2\2\2\177\u0084\5\n\6\2\u0080\u0081"+
		"\7\13\2\2\u0081\u0083\5\22\n\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\13\35$.BLlu|\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}