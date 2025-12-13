// Generated from Bcode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BcodeParser}.
 */
public interface BcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BcodeParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(BcodeParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(BcodeParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#expr_arith}.
	 * @param ctx the parse tree
	 */
	void enterExpr_arith(BcodeParser.Expr_arithContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#expr_arith}.
	 * @param ctx the parse tree
	 */
	void exitExpr_arith(BcodeParser.Expr_arithContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(BcodeParser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(BcodeParser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(BcodeParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(BcodeParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#var_asg}.
	 * @param ctx the parse tree
	 */
	void enterVar_asg(BcodeParser.Var_asgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#var_asg}.
	 * @param ctx the parse tree
	 */
	void exitVar_asg(BcodeParser.Var_asgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#var_reasg}.
	 * @param ctx the parse tree
	 */
	void enterVar_reasg(BcodeParser.Var_reasgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#var_reasg}.
	 * @param ctx the parse tree
	 */
	void exitVar_reasg(BcodeParser.Var_reasgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#fnc_cprint}.
	 * @param ctx the parse tree
	 */
	void enterFnc_cprint(BcodeParser.Fnc_cprintContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#fnc_cprint}.
	 * @param ctx the parse tree
	 */
	void exitFnc_cprint(BcodeParser.Fnc_cprintContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#stm_return}.
	 * @param ctx the parse tree
	 */
	void enterStm_return(BcodeParser.Stm_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#stm_return}.
	 * @param ctx the parse tree
	 */
	void exitStm_return(BcodeParser.Stm_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BcodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BcodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BcodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BcodeParser.ProgramContext ctx);
}