// Generated from c:/random downloads/Code/Python/baxcode-lang/with_antlr/Bcode.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BcodeParser}.
 */
public interface BcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_operator}.
	 * @param ctx the parse tree
	 */
	void enterAct_operator(BcodeParser.Act_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_operator}.
	 * @param ctx the parse tree
	 */
	void exitAct_operator(BcodeParser.Act_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_var_definition_noassign}.
	 * @param ctx the parse tree
	 */
	void enterAct_var_definition_noassign(BcodeParser.Act_var_definition_noassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_var_definition_noassign}.
	 * @param ctx the parse tree
	 */
	void exitAct_var_definition_noassign(BcodeParser.Act_var_definition_noassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_var_definition_assign}.
	 * @param ctx the parse tree
	 */
	void enterAct_var_definition_assign(BcodeParser.Act_var_definition_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_var_definition_assign}.
	 * @param ctx the parse tree
	 */
	void exitAct_var_definition_assign(BcodeParser.Act_var_definition_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_structure_def}.
	 * @param ctx the parse tree
	 */
	void enterAct_structure_def(BcodeParser.Act_structure_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_structure_def}.
	 * @param ctx the parse tree
	 */
	void exitAct_structure_def(BcodeParser.Act_structure_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_function_def}.
	 * @param ctx the parse tree
	 */
	void enterAct_function_def(BcodeParser.Act_function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_function_def}.
	 * @param ctx the parse tree
	 */
	void exitAct_function_def(BcodeParser.Act_function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#act_program_def}.
	 * @param ctx the parse tree
	 */
	void enterAct_program_def(BcodeParser.Act_program_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#act_program_def}.
	 * @param ctx the parse tree
	 */
	void exitAct_program_def(BcodeParser.Act_program_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcodeParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(BcodeParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcodeParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(BcodeParser.ActionContext ctx);
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
}