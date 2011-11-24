package com.deepsky.lang.parser.plsql;

import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.deepsky.generated.plsql.PLSqlTokenTypes;
import com.deepsky.integration.PlSqlElementType;

public interface PLSqlTypesAdopted {
	PlSqlElementType DROP_VIEW = new PlSqlElementType("DROP_VIEW", PLSqlTokenTypes.DROP_VIEW);
	PlSqlElementType CREATE_VIEW_COLUMN_DEF = new PlSqlElementType("CREATE_VIEW_COLUMN_DEF", PLSqlTokenTypes.CREATE_VIEW_COLUMN_DEF);
	PlSqlElementType PROCEDURE_SPEC = new PlSqlElementType("PROCEDURE_SPEC", PLSqlTokenTypes.PROCEDURE_SPEC);
	PlSqlElementType MERGE_COMMAND = new PlSqlElementType("MERGE_COMMAND", PLSqlTokenTypes.MERGE_COMMAND);
	PlSqlElementType DML_TRIGGER_CLAUSE = new PlSqlElementType("DML_TRIGGER_CLAUSE", PLSqlTokenTypes.DML_TRIGGER_CLAUSE);
	PlSqlElementType DROP_DB_LINK = new PlSqlElementType("DROP_DB_LINK", PLSqlTokenTypes.DROP_DB_LINK);
	PlSqlElementType SQLPLUS_EXIT = new PlSqlElementType("SQLPLUS_EXIT", PLSqlTokenTypes.SQLPLUS_EXIT);
	PlSqlElementType HEAP_ORGINIZED = new PlSqlElementType("HEAP_ORGINIZED", PLSqlTokenTypes.HEAP_ORGINIZED);
	PlSqlElementType SYNONYM_OBJ = new PlSqlElementType("SYNONYM_OBJ", PLSqlTokenTypes.SYNONYM_OBJ);
	PlSqlElementType SQLPLUS_VARIABLE = new PlSqlElementType("SQLPLUS_VARIABLE", PLSqlTokenTypes.SQLPLUS_VARIABLE);
	PlSqlElementType SELECT_EXPRESSION = new PlSqlElementType("SELECT_EXPRESSION", PLSqlTokenTypes.SELECT_EXPRESSION);
	PlSqlElementType DROP_PACKAGE = new PlSqlElementType("DROP_PACKAGE", PLSqlTokenTypes.DROP_PACKAGE);
	PlSqlElementType FUNCTION_SPEC = new PlSqlElementType("FUNCTION_SPEC", PLSqlTokenTypes.FUNCTION_SPEC);
	PlSqlElementType OBJECT_NAME = new PlSqlElementType("OBJECT_NAME", PLSqlTokenTypes.OBJECT_NAME);
	PlSqlElementType STRING_LITERAL = new PlSqlElementType("STRING_LITERAL", PLSqlTokenTypes.STRING_LITERAL);
	PlSqlElementType EXCEPTION_SECTION = new PlSqlElementType("EXCEPTION_SECTION", PLSqlTokenTypes.EXCEPTION_SECTION);
	PlSqlElementType DROP_SEQUENCE = new PlSqlElementType("DROP_SEQUENCE", PLSqlTokenTypes.DROP_SEQUENCE);
	PlSqlElementType FORALL_LOOP_SPEC = new PlSqlElementType("FORALL_LOOP_SPEC", PLSqlTokenTypes.FORALL_LOOP_SPEC);
	PlSqlElementType SYSTIMESTAMP_CONST = new PlSqlElementType("SYSTIMESTAMP_CONST", PLSqlTokenTypes.SYSTIMESTAMP_CONST);
	PlSqlElementType MEMBER_OF = new PlSqlElementType("MEMBER_OF", PLSqlTokenTypes.MEMBER_OF);
	PlSqlElementType TABLE_NAME_DDL = new PlSqlElementType("TABLE_NAME_DDL", PLSqlTokenTypes.TABLE_NAME_DDL);
	PlSqlElementType LAG_FUNCTION = new PlSqlElementType("LAG_FUNCTION", PLSqlTokenTypes.LAG_FUNCTION);
	PlSqlElementType DROP_TRIGGER = new PlSqlElementType("DROP_TRIGGER", PLSqlTokenTypes.DROP_TRIGGER);
	PlSqlElementType PLSQL_VAR_REF = new PlSqlElementType("PLSQL_VAR_REF", PLSqlTokenTypes.PLSQL_VAR_REF);
	PlSqlElementType CREATE_TRIGGER = new PlSqlElementType("CREATE_TRIGGER", PLSqlTokenTypes.CREATE_TRIGGER);
	PlSqlElementType PARTITION_SPEC = new PlSqlElementType("PARTITION_SPEC", PLSqlTokenTypes.PARTITION_SPEC);
	PlSqlElementType SERIALLY_REUSABLE_PRAGMA = new PlSqlElementType("SERIALLY_REUSABLE_PRAGMA", PLSqlTokenTypes.SERIALLY_REUSABLE_PRAGMA);
	PlSqlElementType TRUNCATE_TABLE = new PlSqlElementType("TRUNCATE_TABLE", PLSqlTokenTypes.TRUNCATE_TABLE);
	PlSqlElementType COLUMN_OUTER_JOIN = new PlSqlElementType("COLUMN_OUTER_JOIN", PLSqlTokenTypes.COLUMN_OUTER_JOIN);
	PlSqlElementType FROM_SUBQUERY = new PlSqlElementType("FROM_SUBQUERY", PLSqlTokenTypes.FROM_SUBQUERY);
	PlSqlElementType SQLPLUS_PROMPT = new PlSqlElementType("SQLPLUS_PROMPT", PLSqlTokenTypes.SQLPLUS_PROMPT);
	PlSqlElementType SQLPLUS_DEFINE = new PlSqlElementType("SQLPLUS_DEFINE", PLSqlTokenTypes.SQLPLUS_DEFINE);
	PlSqlElementType CURSOR_DECLARATION = new PlSqlElementType("CURSOR_DECLARATION", PLSqlTokenTypes.CURSOR_DECLARATION);
	PlSqlElementType ELSIF_STATEMENT = new PlSqlElementType("ELSIF_STATEMENT", PLSqlTokenTypes.ELSIF_STATEMENT);
	PlSqlElementType WHERE_CONDITION = new PlSqlElementType("WHERE_CONDITION", PLSqlTokenTypes.WHERE_CONDITION);
	PlSqlElementType BETWEEN_CONDITION = new PlSqlElementType("BETWEEN_CONDITION", PLSqlTokenTypes.BETWEEN_CONDITION);
	PlSqlElementType CUSTOM_AGGR_FUNCTION = new PlSqlElementType("CUSTOM_AGGR_FUNCTION", PLSqlTokenTypes.CUSTOM_AGGR_FUNCTION);
	PlSqlElementType NOT_NULL_STMT = new PlSqlElementType("NOT_NULL_STMT", PLSqlTokenTypes.NOT_NULL_STMT);
	PlSqlElementType PARAMETER_NAME = new PlSqlElementType("PARAMETER_NAME", PLSqlTokenTypes.PARAMETER_NAME);
	PlSqlElementType RANGE_PARTITION = new PlSqlElementType("RANGE_PARTITION", PLSqlTokenTypes.RANGE_PARTITION);
	PlSqlElementType CURSOR_STATE = new PlSqlElementType("CURSOR_STATE", PLSqlTokenTypes.CURSOR_STATE);
	PlSqlElementType SORTED_DEF = new PlSqlElementType("SORTED_DEF", PLSqlTokenTypes.SORTED_DEF);
	PlSqlElementType VAR_REF = new PlSqlElementType("VAR_REF", PLSqlTokenTypes.VAR_REF);
	PlSqlElementType CONDITIONAL_COMPILATION = new PlSqlElementType("CONDITIONAL_COMPILATION", PLSqlTokenTypes.CONDITIONAL_COMPILATION);
	PlSqlElementType DROP_ROLE = new PlSqlElementType("DROP_ROLE", PLSqlTokenTypes.DROP_ROLE);
	PlSqlElementType CURSOR_LOOP_SPEC = new PlSqlElementType("CURSOR_LOOP_SPEC", PLSqlTokenTypes.CURSOR_LOOP_SPEC);
	PlSqlElementType EXPR_COLUMN = new PlSqlElementType("EXPR_COLUMN", PLSqlTokenTypes.EXPR_COLUMN);
	PlSqlElementType TRIGGER_TARGET = new PlSqlElementType("TRIGGER_TARGET", PLSqlTokenTypes.TRIGGER_TARGET);
	PlSqlElementType RANK_FUNCTION = new PlSqlElementType("RANK_FUNCTION", PLSqlTokenTypes.RANK_FUNCTION);
	PlSqlElementType REF_CURSOR = new PlSqlElementType("REF_CURSOR", PLSqlTokenTypes.REF_CURSOR);
	PlSqlElementType DROP_FUNCTION = new PlSqlElementType("DROP_FUNCTION", PLSqlTokenTypes.DROP_FUNCTION);
	PlSqlElementType IF_STATEMENT = new PlSqlElementType("IF_STATEMENT", PLSqlTokenTypes.IF_STATEMENT);
	PlSqlElementType LEAD_FUNCTION = new PlSqlElementType("LEAD_FUNCTION", PLSqlTokenTypes.LEAD_FUNCTION);
	PlSqlElementType TABLE_FUNCTION = new PlSqlElementType("TABLE_FUNCTION", PLSqlTokenTypes.TABLE_FUNCTION);
	PlSqlElementType PARENTHESIZED_EXPR = new PlSqlElementType("PARENTHESIZED_EXPR", PLSqlTokenTypes.PARENTHESIZED_EXPR);
	PlSqlElementType ERROR_TOKEN_A = new PlSqlElementType("ERROR_TOKEN_A", PLSqlTokenTypes.ERROR_TOKEN_A);
	PlSqlElementType EXCEPTION_PRAGMA = new PlSqlElementType("EXCEPTION_PRAGMA", PLSqlTokenTypes.EXCEPTION_PRAGMA);
	PlSqlElementType COND_COMP_ERROR = new PlSqlElementType("COND_COMP_ERROR", PLSqlTokenTypes.COND_COMP_ERROR);
	PlSqlElementType DROP_INDEX = new PlSqlElementType("DROP_INDEX", PLSqlTokenTypes.DROP_INDEX);
	PlSqlElementType PARAMETER_SPEC = new PlSqlElementType("PARAMETER_SPEC", PLSqlTokenTypes.PARAMETER_SPEC);
	PlSqlElementType EXTERNAL_TYPE = new PlSqlElementType("EXTERNAL_TYPE", PLSqlTokenTypes.EXTERNAL_TYPE);
	PlSqlElementType TABLE_REF = new PlSqlElementType("TABLE_REF", PLSqlTokenTypes.TABLE_REF);
	PlSqlElementType CALLABLE_NAME_REF = new PlSqlElementType("CALLABLE_NAME_REF", PLSqlTokenTypes.CALLABLE_NAME_REF);
	PlSqlElementType CURSOR_REF_LOOP_SPEC = new PlSqlElementType("CURSOR_REF_LOOP_SPEC", PLSqlTokenTypes.CURSOR_REF_LOOP_SPEC);
	PlSqlElementType TIMEZONE_SPEC = new PlSqlElementType("TIMEZONE_SPEC", PLSqlTokenTypes.TIMEZONE_SPEC);
	PlSqlElementType SQLPLUS_COLUMN = new PlSqlElementType("SQLPLUS_COLUMN", PLSqlTokenTypes.SQLPLUS_COLUMN);
	PlSqlElementType RELATION_CONDITION = new PlSqlElementType("RELATION_CONDITION", PLSqlTokenTypes.RELATION_CONDITION);
	PlSqlElementType SELECT_EXPRESSION_UNION = new PlSqlElementType("SELECT_EXPRESSION_UNION", PLSqlTokenTypes.SELECT_EXPRESSION_UNION);
	PlSqlElementType DATATYPE = new PlSqlElementType("DATATYPE", PLSqlTokenTypes.DATATYPE);
	PlSqlElementType ELSE_STATEMENT = new PlSqlElementType("ELSE_STATEMENT", PLSqlTokenTypes.ELSE_STATEMENT);
	PlSqlElementType NUMERIC_LOOP_SPEC = new PlSqlElementType("NUMERIC_LOOP_SPEC", PLSqlTokenTypes.NUMERIC_LOOP_SPEC);
	PlSqlElementType CREATE_TABLESPACE = new PlSqlElementType("CREATE_TABLESPACE", PLSqlTokenTypes.CREATE_TABLESPACE);
	PlSqlElementType PLSQL_EXPR_LIST_USING = new PlSqlElementType("PLSQL_EXPR_LIST_USING", PLSqlTokenTypes.PLSQL_EXPR_LIST_USING);
	PlSqlElementType FUNCTION_CALL = new PlSqlElementType("FUNCTION_CALL", PLSqlTokenTypes.FUNCTION_CALL);
	PlSqlElementType CONSTRAINT = new PlSqlElementType("CONSTRAINT", PLSqlTokenTypes.CONSTRAINT);
	PlSqlElementType INTERFACE_PRAGMA = new PlSqlElementType("INTERFACE_PRAGMA", PLSqlTokenTypes.INTERFACE_PRAGMA);
	PlSqlElementType PARAMETER_REF = new PlSqlElementType("PARAMETER_REF", PLSqlTokenTypes.PARAMETER_REF);
	PlSqlElementType SQLPLUS_REPFOOTER = new PlSqlElementType("SQLPLUS_REPFOOTER", PLSqlTokenTypes.SQLPLUS_REPFOOTER);
	PlSqlElementType DROP_LIBRARY = new PlSqlElementType("DROP_LIBRARY", PLSqlTokenTypes.DROP_LIBRARY);
	PlSqlElementType TABLE_REFERENCE_LIST = new PlSqlElementType("TABLE_REFERENCE_LIST", PLSqlTokenTypes.TABLE_REFERENCE_LIST);
	PlSqlElementType COND_COMP_SEQ = new PlSqlElementType("COND_COMP_SEQ", PLSqlTokenTypes.COND_COMP_SEQ);
	PlSqlElementType NUMERIC_LITERAL = new PlSqlElementType("NUMERIC_LITERAL", PLSqlTokenTypes.NUMERIC_LITERAL);
	PlSqlElementType V_COLUMN_DEF = new PlSqlElementType("V_COLUMN_DEF", PLSqlTokenTypes.V_COLUMN_DEF);
	PlSqlElementType EXCEPTION_DECL = new PlSqlElementType("EXCEPTION_DECL", PLSqlTokenTypes.EXCEPTION_DECL);
	PlSqlElementType FETCH_STATEMENT = new PlSqlElementType("FETCH_STATEMENT", PLSqlTokenTypes.FETCH_STATEMENT);
	PlSqlElementType NUM_LOOP_INDEX = new PlSqlElementType("NUM_LOOP_INDEX", PLSqlTokenTypes.NUM_LOOP_INDEX);
	PlSqlElementType C_RECORD_ITEM_REF = new PlSqlElementType("C_RECORD_ITEM_REF", PLSqlTokenTypes.C_RECORD_ITEM_REF);
	PlSqlElementType DROP_DIRECTORY = new PlSqlElementType("DROP_DIRECTORY", PLSqlTokenTypes.DROP_DIRECTORY);
	PlSqlElementType GOTO_STATEMENT = new PlSqlElementType("GOTO_STATEMENT", PLSqlTokenTypes.GOTO_STATEMENT);
	PlSqlElementType SPEC_CALL_ARGUMENT_LIST = new PlSqlElementType("SPEC_CALL_ARGUMENT_LIST", PLSqlTokenTypes.SPEC_CALL_ARGUMENT_LIST);
	PlSqlElementType FK_SPEC = new PlSqlElementType("FK_SPEC", PLSqlTokenTypes.FK_SPEC);
	PlSqlElementType BIND_VAR = new PlSqlElementType("BIND_VAR", PLSqlTokenTypes.BIND_VAR);
	PlSqlElementType SUBQUERY_UPDATE_COMMAND = new PlSqlElementType("SUBQUERY_UPDATE_COMMAND", PLSqlTokenTypes.SUBQUERY_UPDATE_COMMAND);
	PlSqlElementType INSERT_COMMAND = new PlSqlElementType("INSERT_COMMAND", PLSqlTokenTypes.INSERT_COMMAND);
	PlSqlElementType SQLPLUS_EXEC = new PlSqlElementType("SQLPLUS_EXEC", PLSqlTokenTypes.SQLPLUS_EXEC);
	PlSqlElementType LOGICAL_EXPR = new PlSqlElementType("LOGICAL_EXPR", PLSqlTokenTypes.LOGICAL_EXPR);
	PlSqlElementType SUBQUERY = new PlSqlElementType("SUBQUERY", PLSqlTokenTypes.SUBQUERY);
	PlSqlElementType ALIAS_NAME = new PlSqlElementType("ALIAS_NAME", PLSqlTokenTypes.ALIAS_NAME);
	PlSqlElementType CREATE_SYNONYM = new PlSqlElementType("CREATE_SYNONYM", PLSqlTokenTypes.CREATE_SYNONYM);
	PlSqlElementType SQLPLUS_WHENEVER = new PlSqlElementType("SQLPLUS_WHENEVER", PLSqlTokenTypes.SQLPLUS_WHENEVER);
	PlSqlElementType COLUMN_PK_SPEC = new PlSqlElementType("COLUMN_PK_SPEC", PLSqlTokenTypes.COLUMN_PK_SPEC);
	PlSqlElementType ASTERISK_COLUMN = new PlSqlElementType("ASTERISK_COLUMN", PLSqlTokenTypes.ASTERISK_COLUMN);
	PlSqlElementType ROWCOUNT_EXRESSION = new PlSqlElementType("ROWCOUNT_EXRESSION", PLSqlTokenTypes.ROWCOUNT_EXRESSION);
	PlSqlElementType DROP_USER = new PlSqlElementType("DROP_USER", PLSqlTokenTypes.DROP_USER);
	PlSqlElementType SYNONYM_NAME = new PlSqlElementType("SYNONYM_NAME", PLSqlTokenTypes.SYNONYM_NAME);
	PlSqlElementType SQLPLUS_RUNSCRIPT = new PlSqlElementType("SQLPLUS_RUNSCRIPT", PLSqlTokenTypes.SQLPLUS_RUNSCRIPT);
	PlSqlElementType FOR_UPDATE_CLAUSE = new PlSqlElementType("FOR_UPDATE_CLAUSE", PLSqlTokenTypes.FOR_UPDATE_CLAUSE);
	PlSqlElementType SUBTYPE_DECL = new PlSqlElementType("SUBTYPE_DECL", PLSqlTokenTypes.SUBTYPE_DECL);
	PlSqlElementType RAISE_STATEMENT = new PlSqlElementType("RAISE_STATEMENT", PLSqlTokenTypes.RAISE_STATEMENT);
	PlSqlElementType SEQUENCE_EXPR = new PlSqlElementType("SEQUENCE_EXPR", PLSqlTokenTypes.SEQUENCE_EXPR);
	PlSqlElementType RETURN_TYPE = new PlSqlElementType("RETURN_TYPE", PLSqlTokenTypes.RETURN_TYPE);
	PlSqlElementType COMMIT_STATEMENT = new PlSqlElementType("COMMIT_STATEMENT", PLSqlTokenTypes.COMMIT_STATEMENT);
	PlSqlElementType SIMPLE_UPDATE_COMMAND = new PlSqlElementType("SIMPLE_UPDATE_COMMAND", PLSqlTokenTypes.SIMPLE_UPDATE_COMMAND);
	PlSqlElementType HASH_PARTITION = new PlSqlElementType("HASH_PARTITION", PLSqlTokenTypes.HASH_PARTITION);
	PlSqlElementType FROM_PLAIN_TABLE = new PlSqlElementType("FROM_PLAIN_TABLE", PLSqlTokenTypes.FROM_PLAIN_TABLE);
	PlSqlElementType PK_SPEC = new PlSqlElementType("PK_SPEC", PLSqlTokenTypes.PK_SPEC);
	PlSqlElementType SCHEMA_NAME = new PlSqlElementType("SCHEMA_NAME", PLSqlTokenTypes.SCHEMA_NAME);
	PlSqlElementType AT_TIME_ZONE_EXPR = new PlSqlElementType("AT_TIME_ZONE_EXPR", PLSqlTokenTypes.AT_TIME_ZONE_EXPR);
	PlSqlElementType ISNULL_CONDITION = new PlSqlElementType("ISNULL_CONDITION", PLSqlTokenTypes.ISNULL_CONDITION);
	PlSqlElementType SQLPLUS_QUIT = new PlSqlElementType("SQLPLUS_QUIT", PLSqlTokenTypes.SQLPLUS_QUIT);
	PlSqlElementType INDEX_NAME = new PlSqlElementType("INDEX_NAME", PLSqlTokenTypes.INDEX_NAME);
	PlSqlElementType SQLPLUS_COMMAND = new PlSqlElementType("SQLPLUS_COMMAND", PLSqlTokenTypes.SQLPLUS_COMMAND);
	PlSqlElementType SQLPLUS_SPOOL = new PlSqlElementType("SQLPLUS_SPOOL", PLSqlTokenTypes.SQLPLUS_SPOOL);
	PlSqlElementType CAST_FUNC = new PlSqlElementType("CAST_FUNC", PLSqlTokenTypes.CAST_FUNC);
	PlSqlElementType BOOLEAN_LITERAL = new PlSqlElementType("BOOLEAN_LITERAL", PLSqlTokenTypes.BOOLEAN_LITERAL);
	PlSqlElementType IN_CONDITION = new PlSqlElementType("IN_CONDITION", PLSqlTokenTypes.IN_CONDITION);
	PlSqlElementType SUBQUERY_EXPR = new PlSqlElementType("SUBQUERY_EXPR", PLSqlTokenTypes.SUBQUERY_EXPR);
	PlSqlElementType DBTIMEZONE = new PlSqlElementType("DBTIMEZONE", PLSqlTokenTypes.DBTIMEZONE);
	PlSqlElementType VARRAY_COLLECTION = new PlSqlElementType("VARRAY_COLLECTION", PLSqlTokenTypes.VARRAY_COLLECTION);
	PlSqlElementType SYNONYM_OBJ_WITH_LINK = new PlSqlElementType("SYNONYM_OBJ_WITH_LINK", PLSqlTokenTypes.SYNONYM_OBJ_WITH_LINK);
	PlSqlElementType SUBQUERY_CONDITION = new PlSqlElementType("SUBQUERY_CONDITION", PLSqlTokenTypes.SUBQUERY_CONDITION);
	PlSqlElementType COLUMN_TYPE_REF = new PlSqlElementType("COLUMN_TYPE_REF", PLSqlTokenTypes.COLUMN_TYPE_REF);
	PlSqlElementType COLLECTION_METHOD_CALL = new PlSqlElementType("COLLECTION_METHOD_CALL", PLSqlTokenTypes.COLLECTION_METHOD_CALL);
	PlSqlElementType INSTEADOF_TRIGGER = new PlSqlElementType("INSTEADOF_TRIGGER", PLSqlTokenTypes.INSTEADOF_TRIGGER);
	PlSqlElementType TIMESTAMP_CONST = new PlSqlElementType("TIMESTAMP_CONST", PLSqlTokenTypes.TIMESTAMP_CONST);
	PlSqlElementType LAST_STMT_RESULT_BOOL = new PlSqlElementType("LAST_STMT_RESULT_BOOL", PLSqlTokenTypes.LAST_STMT_RESULT_BOOL);
	PlSqlElementType CALL_ARGUMENT = new PlSqlElementType("CALL_ARGUMENT", PLSqlTokenTypes.CALL_ARGUMENT);
	PlSqlElementType ANSI_JOIN_TAB_SPEC = new PlSqlElementType("ANSI_JOIN_TAB_SPEC", PLSqlTokenTypes.ANSI_JOIN_TAB_SPEC);
	PlSqlElementType TABLE_COLLECTION = new PlSqlElementType("TABLE_COLLECTION", PLSqlTokenTypes.TABLE_COLLECTION);
	PlSqlElementType LAST_STMT_RESULT_NUM = new PlSqlElementType("LAST_STMT_RESULT_NUM", PLSqlTokenTypes.LAST_STMT_RESULT_NUM);
	PlSqlElementType UPDATE_COMMAND = new PlSqlElementType("UPDATE_COMMAND", PLSqlTokenTypes.UPDATE_COMMAND);
	PlSqlElementType TRIM_FUNC = new PlSqlElementType("TRIM_FUNC", PLSqlTokenTypes.TRIM_FUNC);
	PlSqlElementType CONSTRAINT_NAME = new PlSqlElementType("CONSTRAINT_NAME", PLSqlTokenTypes.CONSTRAINT_NAME);
	PlSqlElementType ORDER_CLAUSE = new PlSqlElementType("ORDER_CLAUSE", PLSqlTokenTypes.ORDER_CLAUSE);
	PlSqlElementType FUNCTION_BODY = new PlSqlElementType("FUNCTION_BODY", PLSqlTokenTypes.FUNCTION_BODY);
	PlSqlElementType COLUMN_SPEC_LIST = new PlSqlElementType("COLUMN_SPEC_LIST", PLSqlTokenTypes.COLUMN_SPEC_LIST);
	PlSqlElementType PACKAGE_INIT_SECTION = new PlSqlElementType("PACKAGE_INIT_SECTION", PLSqlTokenTypes.PACKAGE_INIT_SECTION);
	PlSqlElementType ASSIGNMENT_STATEMENT = new PlSqlElementType("ASSIGNMENT_STATEMENT", PLSqlTokenTypes.ASSIGNMENT_STATEMENT);
	PlSqlElementType IDENT_ASTERISK_COLUMN = new PlSqlElementType("IDENT_ASTERISK_COLUMN", PLSqlTokenTypes.IDENT_ASTERISK_COLUMN);
	PlSqlElementType OBJECT_TYPE_DEF = new PlSqlElementType("OBJECT_TYPE_DEF", PLSqlTokenTypes.OBJECT_TYPE_DEF);
	PlSqlElementType SQLCODE_SYSVAR = new PlSqlElementType("SQLCODE_SYSVAR", PLSqlTokenTypes.SQLCODE_SYSVAR);
	PlSqlElementType LOOP_STATEMENT = new PlSqlElementType("LOOP_STATEMENT", PLSqlTokenTypes.LOOP_STATEMENT);
	PlSqlElementType SQLPLUS_START = new PlSqlElementType("SQLPLUS_START", PLSqlTokenTypes.SQLPLUS_START);
	PlSqlElementType CURSOR_LOOP_INDEX = new PlSqlElementType("CURSOR_LOOP_INDEX", PLSqlTokenTypes.CURSOR_LOOP_INDEX);
	PlSqlElementType INTERVAL_YEAR_TO_MONTH_EXPR = new PlSqlElementType("INTERVAL_YEAR_TO_MONTH_EXPR", PLSqlTokenTypes.INTERVAL_YEAR_TO_MONTH_EXPR);
	PlSqlElementType DROP_PROCEDURE = new PlSqlElementType("DROP_PROCEDURE", PLSqlTokenTypes.DROP_PROCEDURE);
	PlSqlElementType LABEL_NAME = new PlSqlElementType("LABEL_NAME", PLSqlTokenTypes.LABEL_NAME);
	PlSqlElementType COLLECTION_METHOD_CALL2 = new PlSqlElementType("COLLECTION_METHOD_CALL2", PLSqlTokenTypes.COLLECTION_METHOD_CALL2);
	PlSqlElementType COLUMN_SPEC = new PlSqlElementType("COLUMN_SPEC", PLSqlTokenTypes.COLUMN_SPEC);
	PlSqlElementType PACKAGE_BODY = new PlSqlElementType("PACKAGE_BODY", PLSqlTokenTypes.PACKAGE_BODY);
	PlSqlElementType SEQUENCE_REF = new PlSqlElementType("SEQUENCE_REF", PLSqlTokenTypes.SEQUENCE_REF);
	PlSqlElementType VARIABLE_DECLARATION = new PlSqlElementType("VARIABLE_DECLARATION", PLSqlTokenTypes.VARIABLE_DECLARATION);
	PlSqlElementType SQLPLUS_SHOW = new PlSqlElementType("SQLPLUS_SHOW", PLSqlTokenTypes.SQLPLUS_SHOW);
	PlSqlElementType TYPE_NAME_REF = new PlSqlElementType("TYPE_NAME_REF", PLSqlTokenTypes.TYPE_NAME_REF);
	PlSqlElementType ALTER_TABLESPACE = new PlSqlElementType("ALTER_TABLESPACE", PLSqlTokenTypes.ALTER_TABLESPACE);
	PlSqlElementType ROWID = new PlSqlElementType("ROWID", PLSqlTokenTypes.ROWID);
	PlSqlElementType PROCEDURE_CALL = new PlSqlElementType("PROCEDURE_CALL", PLSqlTokenTypes.PROCEDURE_CALL);
	PlSqlElementType EXTRACT_DATE_FUNC = new PlSqlElementType("EXTRACT_DATE_FUNC", PLSqlTokenTypes.EXTRACT_DATE_FUNC);
	PlSqlElementType CURRENT_OF_CLAUSE = new PlSqlElementType("CURRENT_OF_CLAUSE", PLSqlTokenTypes.CURRENT_OF_CLAUSE);
	PlSqlElementType DATATYPE_PARAM_INFO = new PlSqlElementType("DATATYPE_PARAM_INFO", PLSqlTokenTypes.DATATYPE_PARAM_INFO);
	PlSqlElementType ROWNUM = new PlSqlElementType("ROWNUM", PLSqlTokenTypes.ROWNUM);
	PlSqlElementType COMMENT = new PlSqlElementType("COMMENT", PLSqlTokenTypes.COMMENT);
	PlSqlElementType EXEC_NAME_REF = new PlSqlElementType("EXEC_NAME_REF", PLSqlTokenTypes.EXEC_NAME_REF);
	PlSqlElementType TABLE_REF_WITH_LINK = new PlSqlElementType("TABLE_REF_WITH_LINK", PLSqlTokenTypes.TABLE_REF_WITH_LINK);
	PlSqlElementType COLUMN_CHECK_CONSTRAINT = new PlSqlElementType("COLUMN_CHECK_CONSTRAINT", PLSqlTokenTypes.COLUMN_CHECK_CONSTRAINT);
	PlSqlElementType CREATE_TEMP_TABLE = new PlSqlElementType("CREATE_TEMP_TABLE", PLSqlTokenTypes.CREATE_TEMP_TABLE);
	PlSqlElementType FIELD_NAME = new PlSqlElementType("FIELD_NAME", PLSqlTokenTypes.FIELD_NAME);
	PlSqlElementType RECORD_ITEM = new PlSqlElementType("RECORD_ITEM", PLSqlTokenTypes.RECORD_ITEM);
	PlSqlElementType OWNER_COLUMN_NAME_LIST = new PlSqlElementType("OWNER_COLUMN_NAME_LIST", PLSqlTokenTypes.OWNER_COLUMN_NAME_LIST);
	PlSqlElementType TABLE_TYPE_REF = new PlSqlElementType("TABLE_TYPE_REF", PLSqlTokenTypes.TABLE_TYPE_REF);
	PlSqlElementType DELETE_COMMAND = new PlSqlElementType("DELETE_COMMAND", PLSqlTokenTypes.DELETE_COMMAND);
	PlSqlElementType COLLECTION_METHOD_NAME = new PlSqlElementType("COLLECTION_METHOD_NAME", PLSqlTokenTypes.COLLECTION_METHOD_NAME);
	PlSqlElementType TIMESTAMPG_PRAGMA = new PlSqlElementType("TIMESTAMPG_PRAGMA", PLSqlTokenTypes.TIMESTAMPG_PRAGMA);
	PlSqlElementType COLUMN_FK_SPEC = new PlSqlElementType("COLUMN_FK_SPEC", PLSqlTokenTypes.COLUMN_FK_SPEC);
	PlSqlElementType INTERVAL_DAY_TO_SEC_EXPR = new PlSqlElementType("INTERVAL_DAY_TO_SEC_EXPR", PLSqlTokenTypes.INTERVAL_DAY_TO_SEC_EXPR);
	PlSqlElementType TRIGGER_FOR_EACH = new PlSqlElementType("TRIGGER_FOR_EACH", PLSqlTokenTypes.TRIGGER_FOR_EACH);
	PlSqlElementType COMPLEX_NAME = new PlSqlElementType("COMPLEX_NAME", PLSqlTokenTypes.COMPLEX_NAME);
	PlSqlElementType TRIGGER_COLUMN_REF = new PlSqlElementType("TRIGGER_COLUMN_REF", PLSqlTokenTypes.TRIGGER_COLUMN_REF);
	PlSqlElementType TABLE_ALIAS = new PlSqlElementType("TABLE_ALIAS", PLSqlTokenTypes.TABLE_ALIAS);
	PlSqlElementType PACKAGE_SPEC = new PlSqlElementType("PACKAGE_SPEC", PLSqlTokenTypes.PACKAGE_SPEC);
	PlSqlElementType PLSQL_BLOCK = new PlSqlElementType("PLSQL_BLOCK", PLSqlTokenTypes.PLSQL_BLOCK);
	PlSqlElementType CASE_STATEMENT = new PlSqlElementType("CASE_STATEMENT", PLSqlTokenTypes.CASE_STATEMENT);
	PlSqlElementType LIKE_CONDITION = new PlSqlElementType("LIKE_CONDITION", PLSqlTokenTypes.LIKE_CONDITION);
	PlSqlElementType SYSDATE_CONST = new PlSqlElementType("SYSDATE_CONST", PLSqlTokenTypes.SYSDATE_CONST);
	PlSqlElementType SQLERRM_SYSVAR = new PlSqlElementType("SQLERRM_SYSVAR", PLSqlTokenTypes.SQLERRM_SYSVAR);
	PlSqlElementType VIEW_NAME_DDL = new PlSqlElementType("VIEW_NAME_DDL", PLSqlTokenTypes.VIEW_NAME_DDL);
	PlSqlElementType MERGE_WHEN_COMMAND = new PlSqlElementType("MERGE_WHEN_COMMAND", PLSqlTokenTypes.MERGE_WHEN_COMMAND);
	PlSqlElementType TABLE_REFERENCE_LIST_FROM = new PlSqlElementType("TABLE_REFERENCE_LIST_FROM", PLSqlTokenTypes.TABLE_REFERENCE_LIST_FROM);
	PlSqlElementType ALTER_TRIGGER = new PlSqlElementType("ALTER_TRIGGER", PLSqlTokenTypes.ALTER_TRIGGER);
	PlSqlElementType SQLPLUS_SET = new PlSqlElementType("SQLPLUS_SET", PLSqlTokenTypes.SQLPLUS_SET);
	PlSqlElementType ALTER_TABLE = new PlSqlElementType("ALTER_TABLE", PLSqlTokenTypes.ALTER_TABLE);
	PlSqlElementType COLUMN_DEF = new PlSqlElementType("COLUMN_DEF", PLSqlTokenTypes.COLUMN_DEF);
	PlSqlElementType COLUMN_NAME_LIST = new PlSqlElementType("COLUMN_NAME_LIST", PLSqlTokenTypes.COLUMN_NAME_LIST);
	PlSqlElementType ALIAS_IDENT = new PlSqlElementType("ALIAS_IDENT", PLSqlTokenTypes.ALIAS_IDENT);
	PlSqlElementType COLUMN_NAME_DDL = new PlSqlElementType("COLUMN_NAME_DDL", PLSqlTokenTypes.COLUMN_NAME_DDL);
	PlSqlElementType COLUMN_NAME_REF = new PlSqlElementType("COLUMN_NAME_REF", PLSqlTokenTypes.COLUMN_NAME_REF);
	PlSqlElementType TRIGGER_NAME = new PlSqlElementType("TRIGGER_NAME", PLSqlTokenTypes.TRIGGER_NAME);
	PlSqlElementType ALTER_GENERIC = new PlSqlElementType("ALTER_GENERIC", PLSqlTokenTypes.ALTER_GENERIC);
	PlSqlElementType EXIT_STATEMENT = new PlSqlElementType("EXIT_STATEMENT", PLSqlTokenTypes.EXIT_STATEMENT);
	PlSqlElementType TYPE_SPEC = new PlSqlElementType("TYPE_SPEC", PLSqlTokenTypes.TYPE_SPEC);
	PlSqlElementType DROP_OPERATOR = new PlSqlElementType("DROP_OPERATOR", PLSqlTokenTypes.DROP_OPERATOR);
	PlSqlElementType PRAGMA = new PlSqlElementType("PRAGMA", PLSqlTokenTypes.PRAGMA);
	PlSqlElementType INTO_CLAUSE = new PlSqlElementType("INTO_CLAUSE", PLSqlTokenTypes.INTO_CLAUSE);
	PlSqlElementType ROLLBACK_STATEMENT = new PlSqlElementType("ROLLBACK_STATEMENT", PLSqlTokenTypes.ROLLBACK_STATEMENT);
	PlSqlElementType INTERVAL_CONST = new PlSqlElementType("INTERVAL_CONST", PLSqlTokenTypes.INTERVAL_CONST);
	PlSqlElementType RELATION_OP = new PlSqlElementType("RELATION_OP", PLSqlTokenTypes.RELATION_OP);
	PlSqlElementType CURSOR_NAME = new PlSqlElementType("CURSOR_NAME", PLSqlTokenTypes.CURSOR_NAME);
	PlSqlElementType CALL_ARGUMENT_LIST = new PlSqlElementType("CALL_ARGUMENT_LIST", PLSqlTokenTypes.CALL_ARGUMENT_LIST);
	PlSqlElementType CHARACTER_SET = new PlSqlElementType("CHARACTER_SET", PLSqlTokenTypes.CHARACTER_SET);
	PlSqlElementType RETURNING_CLAUSE = new PlSqlElementType("RETURNING_CLAUSE", PLSqlTokenTypes.RETURNING_CLAUSE);
	PlSqlElementType INSERT_INTO_SUBQUERY_COMMAND = new PlSqlElementType("INSERT_INTO_SUBQUERY_COMMAND", PLSqlTokenTypes.INSERT_INTO_SUBQUERY_COMMAND);
	PlSqlElementType UNIQUE_CONSTRAINT = new PlSqlElementType("UNIQUE_CONSTRAINT", PLSqlTokenTypes.UNIQUE_CONSTRAINT);
	PlSqlElementType EXPR_LIST = new PlSqlElementType("EXPR_LIST", PLSqlTokenTypes.EXPR_LIST);
	PlSqlElementType DROP_TABLESPACE = new PlSqlElementType("DROP_TABLESPACE", PLSqlTokenTypes.DROP_TABLESPACE);
	PlSqlElementType VARIABLE_NAME = new PlSqlElementType("VARIABLE_NAME", PLSqlTokenTypes.VARIABLE_NAME);
	PlSqlElementType CREATE_SEQUENCE = new PlSqlElementType("CREATE_SEQUENCE", PLSqlTokenTypes.CREATE_SEQUENCE);
	PlSqlElementType RETURN_STATEMENT = new PlSqlElementType("RETURN_STATEMENT", PLSqlTokenTypes.RETURN_STATEMENT);
	PlSqlElementType DROP_TYPE = new PlSqlElementType("DROP_TYPE", PLSqlTokenTypes.DROP_TYPE);
	PlSqlElementType SQLPLUS_REPHEADER = new PlSqlElementType("SQLPLUS_REPHEADER", PLSqlTokenTypes.SQLPLUS_REPHEADER);
	PlSqlElementType DB_EVNT_TRIGGER_CLAUSE = new PlSqlElementType("DB_EVNT_TRIGGER_CLAUSE", PLSqlTokenTypes.DB_EVNT_TRIGGER_CLAUSE);
	PlSqlElementType TYPE_NAME = new PlSqlElementType("TYPE_NAME", PLSqlTokenTypes.TYPE_NAME);
	PlSqlElementType FIPSFLAG_PRAGMA = new PlSqlElementType("FIPSFLAG_PRAGMA", PLSqlTokenTypes.FIPSFLAG_PRAGMA);
	PlSqlElementType ARITHMETIC_EXPR = new PlSqlElementType("ARITHMETIC_EXPR", PLSqlTokenTypes.ARITHMETIC_EXPR);
	PlSqlElementType ARGUMENT_LIST = new PlSqlElementType("ARGUMENT_LIST", PLSqlTokenTypes.ARGUMENT_LIST);
	PlSqlElementType DROP_SYNONYM = new PlSqlElementType("DROP_SYNONYM", PLSqlTokenTypes.DROP_SYNONYM);
	PlSqlElementType NAME_FRAGMENT = new PlSqlElementType("NAME_FRAGMENT", PLSqlTokenTypes.NAME_FRAGMENT);
	PlSqlElementType PROCEDURE_BODY = new PlSqlElementType("PROCEDURE_BODY", PLSqlTokenTypes.PROCEDURE_BODY);
	PlSqlElementType RESTRICT_REF_PRAGMA = new PlSqlElementType("RESTRICT_REF_PRAGMA", PLSqlTokenTypes.RESTRICT_REF_PRAGMA);
	PlSqlElementType CASE_EXPRESSION_SRCH = new PlSqlElementType("CASE_EXPRESSION_SRCH", PLSqlTokenTypes.CASE_EXPRESSION_SRCH);
	PlSqlElementType CASE_EXPRESSION_SMPL = new PlSqlElementType("CASE_EXPRESSION_SMPL", PLSqlTokenTypes.CASE_EXPRESSION_SMPL);
	PlSqlElementType CREATE_VIEW = new PlSqlElementType("CREATE_VIEW", PLSqlTokenTypes.CREATE_VIEW);
	PlSqlElementType DECLARE_LIST = new PlSqlElementType("DECLARE_LIST", PLSqlTokenTypes.DECLARE_LIST);
	PlSqlElementType DDL_TRIGGER_CLAUSE = new PlSqlElementType("DDL_TRIGGER_CLAUSE", PLSqlTokenTypes.DDL_TRIGGER_CLAUSE);
	PlSqlElementType COUNT_FUNC = new PlSqlElementType("COUNT_FUNC", PLSqlTokenTypes.COUNT_FUNC);
	PlSqlElementType TABLE_DEF = new PlSqlElementType("TABLE_DEF", PLSqlTokenTypes.TABLE_DEF);
	PlSqlElementType RECORD_TYPE_DECL = new PlSqlElementType("RECORD_TYPE_DECL", PLSqlTokenTypes.RECORD_TYPE_DECL);
	PlSqlElementType GROUP_CLAUSE = new PlSqlElementType("GROUP_CLAUSE", PLSqlTokenTypes.GROUP_CLAUSE);
	PlSqlElementType EXISTS_EXPR = new PlSqlElementType("EXISTS_EXPR", PLSqlTokenTypes.EXISTS_EXPR);
	PlSqlElementType COND_COMP_SEQ2 = new PlSqlElementType("COND_COMP_SEQ2", PLSqlTokenTypes.COND_COMP_SEQ2);
	PlSqlElementType DEFAULT = new PlSqlElementType("DEFAULT", PLSqlTokenTypes.DEFAULT);
	PlSqlElementType NULL_STATEMENT = new PlSqlElementType("NULL_STATEMENT", PLSqlTokenTypes.NULL_STATEMENT);
	PlSqlElementType STATEMENT_LIST = new PlSqlElementType("STATEMENT_LIST", PLSqlTokenTypes.STATEMENT_LIST);
	PlSqlElementType BUILTIN_PRAGMA = new PlSqlElementType("BUILTIN_PRAGMA", PLSqlTokenTypes.BUILTIN_PRAGMA);
	PlSqlElementType USER_CONST = new PlSqlElementType("USER_CONST", PLSqlTokenTypes.USER_CONST);
	PlSqlElementType PACKAGE_NAME = new PlSqlElementType("PACKAGE_NAME", PLSqlTokenTypes.PACKAGE_NAME);
	PlSqlElementType IOT_TYPE = new PlSqlElementType("IOT_TYPE", PLSqlTokenTypes.IOT_TYPE);
	PlSqlElementType CURRENT_TIMESTAMP_CONST = new PlSqlElementType("CURRENT_TIMESTAMP_CONST", PLSqlTokenTypes.CURRENT_TIMESTAMP_CONST);
	PlSqlElementType CREATE_INDEX = new PlSqlElementType("CREATE_INDEX", PLSqlTokenTypes.CREATE_INDEX);
	PlSqlElementType RECORD_ITEM_NAME = new PlSqlElementType("RECORD_ITEM_NAME", PLSqlTokenTypes.RECORD_ITEM_NAME);
	PlSqlElementType IMMEDIATE_COMMAND = new PlSqlElementType("IMMEDIATE_COMMAND", PLSqlTokenTypes.IMMEDIATE_COMMAND);
	PlSqlElementType CONNECT_CLAUSE = new PlSqlElementType("CONNECT_CLAUSE", PLSqlTokenTypes.CONNECT_CLAUSE);
	PlSqlElementType TABLESPACE_NAME = new PlSqlElementType("TABLESPACE_NAME", PLSqlTokenTypes.TABLESPACE_NAME);
	PlSqlElementType CURSOR_NAME_REF = new PlSqlElementType("CURSOR_NAME_REF", PLSqlTokenTypes.CURSOR_NAME_REF);
	PlSqlElementType CREATE_DIRECTORY = new PlSqlElementType("CREATE_DIRECTORY", PLSqlTokenTypes.CREATE_DIRECTORY);
	PlSqlElementType DROP_TABLE = new PlSqlElementType("DROP_TABLE", PLSqlTokenTypes.DROP_TABLE);
	PlSqlElementType COMMENT_STR = new PlSqlElementType("COMMENT_STR", PLSqlTokenTypes.COMMENT_STR);
	PlSqlElementType SQLPLUS_SERVEROUTPUT = new PlSqlElementType("SQLPLUS_SERVEROUTPUT", PLSqlTokenTypes.SQLPLUS_SERVEROUTPUT);
	PlSqlElementType CREATE_DB_LINK = new PlSqlElementType("CREATE_DB_LINK", PLSqlTokenTypes.CREATE_DB_LINK);
}
