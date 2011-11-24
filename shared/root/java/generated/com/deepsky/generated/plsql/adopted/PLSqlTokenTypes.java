// $ANTLR 2.7.5 (20050128): "/git_app/sqlassistant_super/github/shared/root/grammars/plsql_parser_ex.g" -> "PLSqlParserAdopted.java"$

package com.deepsky.generated.plsql.adopted;

public interface PLSqlTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int BAD_ML_COMMENT = 4;
	int BAD_CHARACTER = 5;
	int BAD_CHAR_LITERAL = 6;
	int BAD_NUMBER_LITERAL = 7;
	int STORAGE_SIZE = 8;
	int LT = 9;
	int LE = 10;
	int GE = 11;
	int NOT_EQ = 12;
	int CUSTOM_TOKEN = 13;
	int COLON_NEW = 14;
	int COLON_OLD = 15;
	int TABLE_NAME_SPEC = 16;
	int PLSQL_ENV_VAR = 17;
	int ANY_CHARACTER = 18;
	int IDENTIFIER = 19;
	int QUOTED_STR = 20;
	int DOUBLE_QUOTED_STRING = 21;
	int AT_PREFIXED = 22;
	int SEMI = 23;
	int COLON = 24;
	int DOT = 25;
	int COMMA = 26;
	int ASTERISK = 27;
	int OPEN_PAREN = 28;
	int CLOSE_PAREN = 29;
	int PLUS = 30;
	int MINUS = 31;
	int DIVIDE = 32;
	int BACKSLASH = 33;
	int EQ = 34;
	int PERCENTAGE = 35;
	int DOUBLEDOT = 36;
	int CONCAT = 37;
	int START_LABEL = 38;
	int DOLLAR = 39;
	int END_LABEL = 40;
	int ASSIGNMENT_EQ = 41;
	int PASS_BY_NAME = 42;
	int VERTBAR = 43;
	int GT = 44;
	int NUMBER = 45;
	int N = 46;
	int WS = 47;
	int LF = 48;
	int SL_COMMENT = 49;
	int ML_COMMENT = 50;
	int IF_COND_CMPL = 51;
	int THEN_COND_CMPL = 52;
	int ELSE_COND_CMPL = 53;
	int END_COND_CMPL = 54;
	int ERROR_COND_CMPL = 55;
	int START_RULE = 56;
	int ERROR_TOKEN_A = 57;
	int PACKAGE_SPEC = 58;
	int PACKAGE_BODY = 59;
	int PACKAGE_NAME = 60;
	int PACKAGE_OBJ_BODY = 61;
	int RECORD_TYPE_DECL = 62;
	int SELECT_EXPRESSION = 63;
	int SELECT_EXPRESSION_UNION = 64;
	int PLSQL_BLOCK = 65;
	int CURSOR_DECLARATION = 66;
	int VARIABLE_DECLARATION = 67;
	int PROCEDURE_BODY = 68;
	int FUNCTION_BODY = 69;
	int PARAMETER_SPEC = 70;
	int SQL_STATEMENT = 71;
	int IF_STATEMENT = 72;
	int LOOP_STATEMENT = 73;
	int STATEMENT = 74;
	int TABLE_REFERENCE_LIST = 75;
	int TABLE_REFERENCE_LIST_FROM = 76;
	int WHERE_CONDITION = 77;
	int SUBQUERY = 78;
	int SQL_IDENTIFIER = 79;
	int FUNCTION = 80;
	int GROUP_FUNCTION = 81;
	int USER_FUNCTION = 82;
	int MULTIPLY = 83;
	int ARGUMENT = 84;
	int ARGUMENT_LIST = 85;
	int FIELD_NAME = 86;
	int PLSQL_EXPR_LIST_USING = 87;
	int EXPR_LIST = 88;
	int DECLARE_LIST = 89;
	int FUNCTION_CALL = 90;
	int PACKAGE_INIT_SECTION = 91;
	int CALL_ARGUMENT_LIST = 92;
	int SPEC_CALL_ARGUMENT_LIST = 93;
	int CALL_ARGUMENT = 94;
	int BASE_EXRESSION = 95;
	int COLUMN_SPEC = 96;
	int LOGICAL_AND = 97;
	int LOGICAL_OR = 98;
	int CASE_EXPRESSION_SMPL = 99;
	int CASE_EXPRESSION_SRCH = 100;
	int CASE_STATEMENT = 101;
	int COUNT_FUNC = 102;
	int RANK_FUNCTION = 103;
	int LEAD_FUNCTION = 104;
	int LAG_FUNCTION = 105;
	int TRIM_FUNC = 106;
	int COLUMN_SPEC_LIST = 107;
	int INSERT_COMMAND = 108;
	int UPDATE_COMMAND = 109;
	int DELETE_COMMAND = 110;
	int MERGE_COMMAND = 111;
	int MERGE_WHEN_COMMAND = 112;
	int STRING_LITERAL = 113;
	int NUMERIC_LITERAL = 114;
	int BOOLEAN_LITERAL = 115;
	int RETURN_TYPE = 116;
	int TYPE_SPEC = 117;
	int VARIABLE_NAME = 118;
	int COLUMN_OUTER_JOIN = 119;
	int LOGICAL_FACTOR = 120;
	int TABLE_ALIAS = 121;
	int CAST_FUNC = 122;
	int VAR_REF = 123;
	int PLSQL_VAR_REF = 124;
	int PARAMETER_REF = 125;
	int EXCEPTION_SECTION = 126;
	int FETCH_STATEMENT = 127;
	int SELECTED_TABLE = 128;
	int CREATE_PROCEDURE = 129;
	int CREATE_FUNCTION = 130;
	int COMMIT_STATEMENT = 131;
	int ROLLBACK_STATEMENT = 132;
	int NULL_STATEMENT = 133;
	int ASSIGNMENT_STATEMENT = 134;
	int PROCEDURE_CALL = 135;
	int RETURN_STATEMENT = 136;
	int OBJECT_NAME = 137;
	int PARAMETER_NAME = 138;
	int DEFAULT = 139;
	int THEN_STATEMENT = 140;
	int ELSIF_STATEMENT = 141;
	int ELSE_STATEMENT = 142;
	int STATEMENT_LIST = 143;
	int RELATION_CONDITION = 144;
	int ISNULL_CONDITION = 145;
	int LIKE_CONDITION = 146;
	int BETWEEN_CONDITION = 147;
	int IN_CONDITION = 148;
	int PARENTHESIZED_EXPR = 149;
	int ORDER_CLAUSE = 150;
	int CONNECT_CLAUSE = 151;
	int GROUP_CLAUSE = 152;
	int INTO_CLAUSE = 153;
	int FOR_UPDATE_CLAUSE = 154;
	int ASTERISK1 = 155;
	int ROWCOUNT_EXRESSION = 156;
	int MULTIPLICATION_OP = 157;
	int DIVIDE_OP = 158;
	int PLUS_OP = 159;
	int MINUS_OP = 160;
	int CONCAT_OP = 161;
	int CURSOR_NAME = 162;
	int CURSOR_NAME_REF = 163;
	int DATATYPE = 164;
	int EXTRACT_DATE_FUNC = 165;
	int ANSI_JOIN_TAB_SPEC = 166;
	int INTERVAL_DAY_TO_SEC_EXPR = 167;
	int INTERVAL_YEAR_TO_MONTH_EXPR = 168;
	int INTERVAL_CONST = 169;
	int USER_CONST = 170;
	int SYSDATE_CONST = 171;
	int SYSTIMESTAMP_CONST = 172;
	int CURRENT_TIMESTAMP_CONST = 173;
	int ALIAS_NAME = 174;
	int EXISTS_EXPR = 175;
	int SUBQUERY_EXPR = 176;
	int TYPE_NAME_REF = 177;
	int TYPE_NAME = 178;
	int SORTED_DEF = 179;
	int RAISE_STATEMENT = 180;
	int PACKAGE_OBJ_SPEC = 181;
	int PROCEDURE_SPEC = 182;
	int SIMPLE_UPDATE_COMMAND = 183;
	int SUBQUERY_UPDATE_COMMAND = 184;
	int IMMEDIATE_COMMAND = 185;
	int FUNCTION_SPEC = 186;
	int NEGATE_FACTOR = 187;
	int PRAGMA = 188;
	int TABLE_TYPE_REF = 189;
	int COLUMN_TYPE_REF = 190;
	int STATEMENT_ANNOT = 191;
	int ASTERISK_COLUMN = 192;
	int IDENT_ASTERISK_COLUMN = 193;
	int EXPR_COLUMN = 194;
	int TABLE_REF = 195;
	int TABLE_REF_WITH_LINK = 196;
	int FROM_SUBQUERY = 197;
	int FROM_PLAIN_TABLE = 198;
	int SCHEMA_NAME = 199;
	int COLUMN_NAME_REF = 200;
	int ARITHMETIC_EXPR = 201;
	int ASSIGNMENT_OP = 202;
	int DBTIMEZONE = 203;
	int SUBQUERY_CONDITION = 204;
	int RECORD_ITEM = 205;
	int EXCEPTION_DECL = 206;
	int EXCEPTION_PRAGMA = 207;
	int COMPLEX_NAME = 208;
	int RESTRICT_REF_PRAGMA = 209;
	int CHARACTER_SET = 210;
	int AUTHID = 211;
	int FIPSFLAG_PRAGMA = 212;
	int BUILTIN_PRAGMA = 213;
	int INTERFACE_PRAGMA = 214;
	int TIMESTAMPG_PRAGMA = 215;
	int TIMESTAMP_CONST = 216;
	int SUBTYPE_DECL = 217;
	int MEMBER_OF = 218;
	int SQLPLUS_SET = 219;
	int SQLPLUS_COMMAND = 220;
	int SQLPLUS_RUNSCRIPT = 221;
	int SQLPLUS_SHOW = 222;
	int SQLPLUS_DEFINE = 223;
	int SQLPLUS_VARIABLE = 224;
	int SQLPLUS_EXEC = 225;
	int SQLPLUS_WHENEVER = 226;
	int SQLPLUS_PROMPT = 227;
	int SQLPLUS_COLUMN = 228;
	int SQLPLUS_START = 229;
	int SQLPLUS_SERVEROUTPUT = 230;
	int SQLPLUS_REPFOOTER = 231;
	int SQLPLUS_REPHEADER = 232;
	int SQLPLUS_EXIT = 233;
	int SQLPLUS_QUIT = 234;
	int SQLPLUS_SPOOL = 235;
	int OR_LOGICAL = 236;
	int AND_LOGICAL = 237;
	int NOT_LOGICAL = 238;
	int LOGICAL_EXPR = 239;
	int RELATION_OP = 240;
	int SEQUENCE_EXPR = 241;
	int SEQUENCE_REF = 242;
	int ALIAS_IDENT = 243;
	int COLUMN_NAME_DDL = 244;
	int COLUMN_DEF = 245;
	int TABLE_DEF = 246;
	int TABLE_COLLECTION = 247;
	int VARRAY_COLLECTION = 248;
	int REF_CURSOR = 249;
	int OBJECT_TYPE_DEF = 250;
	int AT_TIME_ZONE_EXPR = 251;
	int TIMEZONE_SPEC = 252;
	int ALTER_TABLE = 253;
	int ALTER_GENERIC = 254;
	int CREATE_TEMP_TABLE = 255;
	int COMMENT = 256;
	int COMMENT_STR = 257;
	int CREATE_INDEX = 258;
	int INSERT_INTO_SUBQUERY_COMMAND = 259;
	int CONDITIONAL_COMPILATION = 260;
	int COND_COMP_SEQ = 261;
	int COND_COMP_SEQ2 = 262;
	int COND_COMP_ERROR = 263;
	int COLUMN_NAME_LIST = 264;
	int OWNER_COLUMN_NAME_LIST = 265;
	int SERIALLY_REUSABLE_PRAGMA = 266;
	int CREATE_VIEW = 267;
	int DATATYPE_PARAM_INFO = 268;
	int CREATE_VIEW_COLUMN_DEF = 269;
	int TABLE_FUNCTION = 270;
	int ROWNUM = 271;
	int ROWID = 272;
	int CUSTOM_AGGR_FUNCTION = 273;
	int LAST_STMT_RESULT_NUM = 274;
	int LAST_STMT_RESULT_BOOL = 275;
	int CURRENT_OF_CLAUSE = 276;
	int CURSOR_STATE = 277;
	int SQLCODE_SYSVAR = 278;
	int SQLERRM_SYSVAR = 279;
	int COLLECTION_METHOD_CALL = 280;
	int COLLECTION_METHOD_CALL2 = 281;
	int C_RECORD_ITEM_REF = 282;
	int CALLABLE_NAME_REF = 283;
	int TRUNCATE_TABLE = 284;
	int DROP_VIEW = 285;
	int DROP_TABLE = 286;
	int DROP_FUNCTION = 287;
	int DROP_PROCEDURE = 288;
	int DROP_PACKAGE = 289;
	int DROP_INDEX = 290;
	int DROP_SEQUENCE = 291;
	int DROP_TYPE = 292;
	int DROP_OPERATOR = 293;
	int DROP_SYNONYM = 294;
	int DROP_USER = 295;
	int DROP_ROLE = 296;
	int DROP_LIBRARY = 297;
	int DROP_DB_LINK = 298;
	int DROP_DIRECTORY = 299;
	int DROP_TRIGGER = 300;
	int CREATE_SYNONYM = 301;
	int SYNONYM_NAME = 302;
	int SYNONYM_OBJ = 303;
	int SYNONYM_OBJ_WITH_LINK = 304;
	int COLUMN_PK_SPEC = 305;
	int COLUMN_FK_SPEC = 306;
	int NOT_NULL_STMT = 307;
	int COLUMN_CHECK_CONSTRAINT = 308;
	int CONSTRAINT = 309;
	int PK_SPEC = 310;
	int FK_SPEC = 311;
	int UNIQUE_CONSTRAINT = 312;
	int CONSTRAINT_NAME = 313;
	int ADD_CONSTRAINT = 314;
	int ADD_PRIMARY_KEY = 315;
	int IOT_TYPE = 316;
	int HEAP_ORGINIZED = 317;
	int EXTERNAL_TYPE = 318;
	int NAME_FRAGMENT = 319;
	int EXEC_NAME_REF = 320;
	int COLLECTION_METHOD_NAME = 321;
	int V_COLUMN_DEF = 322;
	int TABLE_NAME_DDL = 323;
	int VIEW_NAME = 324;
	int INDEX_NAME = 325;
	int VIEW_NAME_DDL = 326;
	int CREATE_TRIGGER = 327;
	int CREATE_DIRECTORY = 328;
	int CREATE_DB_LINK = 329;
	int CREATE_SEQUENCE = 330;
	int TRIGGER_FOR_EACH = 331;
	int TRIGGER_NAME = 332;
	int ALTER_TRIGGER = 333;
	int DB_EVNT_TRIGGER_CLAUSE = 334;
	int DDL_TRIGGER_CLAUSE = 335;
	int DML_TRIGGER_CLAUSE = 336;
	int TRIGGER_COLUMN_REF = 337;
	int INSTEADOF_TRIGGER = 338;
	int TRIGGER_TARGET = 339;
	int FORALL_LOOP_SPEC = 340;
	int CURSOR_REF_LOOP_SPEC = 341;
	int CURSOR_LOOP_SPEC = 342;
	int CURSOR_LOOP_INDEX = 343;
	int NUM_LOOP_INDEX = 344;
	int NUMERIC_LOOP_SPEC = 345;
	int RECORD_ITEM_NAME = 346;
	int GOTO_STATEMENT = 347;
	int EXIT_STATEMENT = 348;
	int LABEL_NAME = 349;
	int PARTITION_SPEC = 350;
	int RANGE_PARTITION = 351;
	int HASH_PARTITION = 352;
	int CREATE_TABLESPACE = 353;
	int DROP_TABLESPACE = 354;
	int TABLESPACE_NAME = 355;
	int ALTER_TABLESPACE = 356;
	int CREATE_TYPE = 357;
	int BIND_VAR = 358;
	int RETURNING_CLAUSE = 359;
	int LITERAL_package = 360;
	int LITERAL_body = 361;
	int LITERAL_alter = 362;
	int LITERAL_drop = 363;
	int LITERAL_table = 364;
	int LITERAL_purge = 365;
	int LITERAL_view = 366;
	int LITERAL_cascade = 367;
	int LITERAL_constraints = 368;
	int LITERAL_function = 369;
	int LITERAL_procedure = 370;
	int LITERAL_index = 371;
	int LITERAL_force = 372;
	int LITERAL_sequence = 373;
	int LITERAL_type = 374;
	int LITERAL_validate = 375;
	int LITERAL_public = 376;
	int LITERAL_synonym = 377;
	int LITERAL_operator = 378;
	int LITERAL_user = 379;
	int LITERAL_role = 380;
	int LITERAL_directory = 381;
	int LITERAL_library = 382;
	int LITERAL_database = 383;
	int LITERAL_link = 384;
	int LITERAL_trigger = 385;
	int LITERAL_associate = 386;
	int LITERAL_statistics = 387;
	int LITERAL_with = 388;
	int LITERAL_column = 389;
	int LITERAL_functions = 390;
	int LITERAL_packages = 391;
	int LITERAL_types = 392;
	int LITERAL_indexes = 393;
	int LITERAL_indextypes = 394;
	int LITERAL_system = 395;
	int LITERAL_managed = 396;
	int LITERAL_storage = 397;
	int LITERAL_default = 398;
	int LITERAL_cost = 399;
	int LITERAL_selectivity = 400;
	int LITERAL_using = 401;
	int LITERAL_null = 402;
	int LITERAL_truncate = 403;
	int LITERAL_comment = 404;
	int LITERAL_on = 405;
	int LITERAL_is = 406;
	int LITERAL_sysdate = 407;
	int LITERAL_systimestamp = 408;
	int LITERAL_not = 409;
	int LITERAL_disable = 410;
	int LITERAL_enable = 411;
	int LITERAL_row = 412;
	int LITERAL_movement = 413;
	int LITERAL_primary = 414;
	int LITERAL_key = 415;
	int LITERAL_references = 416;
	int LITERAL_rely = 417;
	int LITERAL_constraint = 418;
	int LITERAL_check = 419;
	int LITERAL_set = 420;
	int LITERAL_long = 421;
	int LITERAL_show = 422;
	int LITERAL_var = 423;
	int LITERAL_variable = 424;
	int LITERAL_col = 425;
	int LITERAL_exec = 426;
	int LITERAL_execute = 427;
	int LITERAL_whenever = 428;
	int LITERAL_sqlerror = 429;
	int LITERAL_oserror = 430;
	int LITERAL_exit = 431;
	int LITERAL_continue = 432;
	int LITERAL_commit = 433;
	int LITERAL_rollback = 434;
	int LITERAL_none = 435;
	int LITERAL_def = 436;
	int LITERAL_define = 437;
	int LITERAL_prompt = 438;
	int LITERAL_rem = 439;
	int LITERAL_host = 440;
	int LITERAL_quit = 441;
	int LITERAL_spool = 442;
	int LITERAL_off = 443;
	int LITERAL_sta = 444;
	int LITERAL_start = 445;
	int LITERAL_repfooter = 446;
	int LITERAL_repheader = 447;
	int LITERAL_serveroutput = 448;
	int LITERAL_begin = 449;
	int LITERAL_declare = 450;
	int DOUBLE_DOT = 451;
	int LITERAL_create = 452;
	int LITERAL_or = 453;
	int LITERAL_replace = 454;
	int LITERAL_global = 455;
	int LITERAL_temporary = 456;
	int LITERAL_bigfile = 457;
	int LITERAL_smallfile = 458;
	int LITERAL_tablespace = 459;
	int LITERAL_tempfile = 460;
	int LITERAL_undo = 461;
	int LITERAL_datafile = 462;
	int LITERAL_next = 463;
	int LITERAL_maxsize = 464;
	int LITERAL_size = 465;
	int LITERAL_reuse = 466;
	int LITERAL_extent = 467;
	int LITERAL_management = 468;
	int LITERAL_local = 469;
	int LITERAL_uniform = 470;
	int LITERAL_dictionary = 471;
	int LITERAL_retention = 472;
	int LITERAL_guarantee = 473;
	int LITERAL_noguarantee = 474;
	int LITERAL_autoextend = 475;
	int LITERAL_group = 476;
	int LITERAL_logging = 477;
	int LITERAL_nologging = 478;
	int LITERAL_no = 479;
	int LITERAL_online = 480;
	int LITERAL_offline = 481;
	int LITERAL_normal = 482;
	int LITERAL_immediate = 483;
	int LITERAL_read = 484;
	int LITERAL_only = 485;
	int LITERAL_write = 486;
	int LITERAL_permanent = 487;
	int LITERAL_including = 488;
	int LITERAL_contents = 489;
	int LITERAL_and = 490;
	int LITERAL_datafiles = 491;
	int LITERAL_add = 492;
	int LITERAL_rename = 493;
	int LITERAL_to = 494;
	int LITERAL_end = 495;
	int LITERAL_backup = 496;
	int LITERAL_coalesce = 497;
	int LITERAL_minimum = 498;
	int LITERAL_maxvalue = 499;
	int LITERAL_minvalue = 500;
	int LITERAL_cycle = 501;
	int LITERAL_nocycle = 502;
	int LITERAL_cache = 503;
	int LITERAL_nocache = 504;
	int LITERAL_increment = 505;
	int LITERAL_by = 506;
	int LITERAL_order = 507;
	int LITERAL_noorder = 508;
	int LITERAL_for = 509;
	int LITERAL_connect = 510;
	int LITERAL_identified = 511;
	int LITERAL_after = 512;
	int LITERAL_before = 513;
	int LITERAL_startup = 514;
	int LITERAL_shutdown = 515;
	int LITERAL_servererror = 516;
	int LITERAL_logon = 517;
	int LITERAL_logoff = 518;
	int LITERAL_analyze = 519;
	int LITERAL_audit = 520;
	int LITERAL_noaudit = 521;
	int LITERAL_ddl = 522;
	int LITERAL_diassociate = 523;
	int LITERAL_grant = 524;
	int LITERAL_revoke = 525;
	int LITERAL_schema = 526;
	int LITERAL_instead = 527;
	int LITERAL_of = 528;
	int LITERAL_delete = 529;
	int LITERAL_insert = 530;
	int LITERAL_update = 531;
	int LITERAL_each = 532;
	int LITERAL_referencing = 533;
	int LITERAL_old = 534;
	int LITERAL_as = 535;
	int LITERAL_new = 536;
	int LITERAL_when = 537;
	int LITERAL_unique = 538;
	int LITERAL_bitmap = 539;
	int LITERAL_asc = 540;
	int LITERAL_desc = 541;
	int LITERAL_preserve = 542;
	int LITERAL_rows = 543;
	int LITERAL_compute = 544;
	int LITERAL_parallel = 545;
	int LITERAL_noparallel = 546;
	int LITERAL_filesystem_like_logging = 547;
	int LITERAL_compress = 548;
	int LITERAL_all = 549;
	int LITERAL_direct_load = 550;
	int LITERAL_operations = 551;
	int LITERAL_nocompress = 552;
	int LITERAL_pctfree = 553;
	int LITERAL_pctused = 554;
	int LITERAL_initrans = 555;
	int LITERAL_maxtrans = 556;
	int LITERAL_monitoring = 557;
	int LITERAL_nomonitoring = 558;
	int LITERAL_partition = 559;
	int LITERAL_range = 560;
	int LITERAL_interval = 561;
	int LITERAL_store = 562;
	int LITERAL_in = 563;
	int LITERAL_values = 564;
	int LITERAL_less = 565;
	int LITERAL_than = 566;
	int LITERAL_overflow = 567;
	int LITERAL_hash = 568;
	int LITERAL_partitions = 569;
	int LITERAL_novalidate = 570;
	int LITERAL_organization = 571;
	int LITERAL_pctthreshold = 572;
	int LITERAL_heap = 573;
	int LITERAL_external = 574;
	int LITERAL_degree = 575;
	int LITERAL_instances = 576;
	int LITERAL_reject = 577;
	int LITERAL_limit = 578;
	int LITERAL_unlimited = 579;
	int LITERAL_initial = 580;
	int LITERAL_minextents = 581;
	int LITERAL_maxextents = 582;
	int LITERAL_pctincrease = 583;
	int LITERAL_freelists = 584;
	int LITERAL_freelist = 585;
	int LITERAL_groups = 586;
	int LITERAL_optimal = 587;
	int LITERAL_buffer_pool = 588;
	int LITERAL_keep = 589;
	int LITERAL_recycle = 590;
	int LITERAL_encrypt = 591;
	int LITERAL_foreign = 592;
	int LITERAL_restrict = 593;
	int LITERAL_action = 594;
	int LITERAL_modify = 595;
	int LITERAL_sort = 596;
	int LITERAL_nosort = 597;
	int LITERAL_reverse = 598;
	int LITERAL_visible = 599;
	int LITERAL_novisible = 600;
	int LITERAL_under = 601;
	int LITERAL_final = 602;
	int LITERAL_object = 603;
	int LITERAL_record = 604;
	int LITERAL_ref = 605;
	int LITERAL_cursor = 606;
	int LITERAL_return = 607;
	int LITERAL_rowtype = 608;
	int LITERAL_varray = 609;
	int LITERAL_option = 610;
	// "view_column_def_$internal$" = 611
	int LITERAL_timestamp = 612;
	int LITERAL_authid = 613;
	int LITERAL_wrapped = 614;
	int LITERAL_pragma = 615;
	int LITERAL_restrict_references = 616;
	int LITERAL_interface = 617;
	int LITERAL_builtin = 618;
	int LITERAL_fipsflag = 619;
	int LITERAL_exception_init = 620;
	int LITERAL_constant = 621;
	int LITERAL_subtype = 622;
	int LITERAL_loop = 623;
	int LITERAL_while = 624;
	int LITERAL_forall = 625;
	int LITERAL_if = 626;
	int LITERAL_goto = 627;
	int LITERAL_raise = 628;
	int LITERAL_case = 629;
	int LITERAL_select = 630;
	int LITERAL_merge = 631;
	int LITERAL_lock = 632;
	int LITERAL_open = 633;
	int LITERAL_close = 634;
	int LITERAL_fetch = 635;
	int LITERAL_sql = 636;
	int LITERAL_found = 637;
	int LITERAL_notfound = 638;
	int LITERAL_rowcount = 639;
	int LITERAL_isopen = 640;
	int LITERAL_bulk_rowcount = 641;
	int LITERAL_bulk_exceptions = 642;
	int LITERAL_error_index = 643;
	int LITERAL_error_code = 644;
	int LITERAL_count = 645;
	int LITERAL_then = 646;
	int LITERAL_else = 647;
	int LITERAL_autonomous_transaction = 648;
	int LITERAL_prior = 649;
	int LITERAL_number = 650;
	int LITERAL_binary_integer = 651;
	int LITERAL_natural = 652;
	int LITERAL_positive = 653;
	int LITERAL_char = 654;
	int LITERAL_byte = 655;
	int LITERAL_raw = 656;
	int LITERAL_boolean = 657;
	int LITERAL_date = 658;
	int LITERAL_time = 659;
	int LITERAL_zone = 660;
	int LITERAL_year = 661;
	int LITERAL_month = 662;
	int LITERAL_day = 663;
	int LITERAL_second = 664;
	int LITERAL_smallint = 665;
	int LITERAL_real = 666;
	int LITERAL_numeric = 667;
	int CLOSE_PAREPlSqlPlllN = 668;
	int LITERAL_int = 669;
	int LITERAL_integer = 670;
	int LITERAL_pls_integer = 671;
	int LITERAL_double = 672;
	int LITERAL_precision = 673;
	int LITERAL_float = 674;
	int LITERAL_decimal = 675;
	int LITERAL_varchar = 676;
	// "varchar2" = 677
	int LITERAL_nvarchar = 678;
	// "nvarchar2" = 679
	int LITERAL_character = 680;
	int LITERAL_rowid = 681;
	int LITERAL_blob = 682;
	int LITERAL_clob = 683;
	int LITERAL_nclob = 684;
	int LITERAL_bfile = 685;
	int LITERAL_out = 686;
	int LITERAL_nocopy = 687;
	int LITERAL_any_cs = 688;
	int LITERAL_charset = 689;
	int LITERAL_exception = 690;
	int LITERAL_serially_reusable = 691;
	int LITERAL_language = 692;
	int LITERAL_java = 693;
	int LITERAL_name = 694;
	int LITERAL_pipelined = 695;
	int LITERAL_parallel_enable = 696;
	int LITERAL_deterministic = 697;
	int LITERAL_save = 698;
	int LITERAL_exceptions = 699;
	int LITERAL_indices = 700;
	int LITERAL_true = 701;
	int LITERAL_false = 702;
	// "**" = 703
	int LITERAL_at = 704;
	int LITERAL_current = 705;
	int LITERAL_exists = 706;
	int LITERAL_like = 707;
	int LITERAL_escape = 708;
	int LITERAL_between = 709;
	int LITERAL_member = 710;
	int LITERAL_sqlcode = 711;
	int LITERAL_sqlerrm = 712;
	int LITERAL_cast = 713;
	int LITERAL_trim = 714;
	int LITERAL_multiset = 715;
	int LITERAL_lag = 716;
	int LITERAL_lead = 717;
	int LITERAL_rank = 718;
	int LITERAL_dense_rank = 719;
	int LITERAL_extract = 720;
	int LITERAL_minute = 721;
	int LITERAL_hour = 722;
	int LITERAL_any = 723;
	int LITERAL_nextval = 724;
	int LITERAL_currval = 725;
	int LITERAL_over = 726;
	int LITERAL_sessiontimezone = 727;
	int LITERAL_dbtimezone = 728;
	int LITERAL_distinct = 729;
	int LITERAL_from = 730;
	int LITERAL_timezone_hour = 731;
	int LITERAL_timezone_minute = 732;
	int LITERAL_timezone_region = 733;
	int LITERAL_timezone_abbr = 734;
	int LITERAL_work = 735;
	int LITERAL_elsif = 736;
	int LITERAL_union = 737;
	int LITERAL_intersect = 738;
	int LITERAL_minus = 739;
	int LITERAL_bulk = 740;
	int LITERAL_collect = 741;
	int LITERAL_into = 742;
	int LITERAL_session = 743;
	int LITERAL_flush = 744;
	int LITERAL_shared_pool = 745;
	int LITERAL_reset = 746;
	int LITERAL_sid = 747;
	int LITERAL_left = 748;
	int LITERAL_right = 749;
	int LITERAL_inner = 750;
	int LITERAL_outer = 751;
	int LITERAL_join = 752;
	int LITERAL_full = 753;
	int LITERAL_where = 754;
	int LITERAL_leading = 755;
	int LITERAL_trailing = 756;
	int LITERAL_both = 757;
	int LITERAL_current_timestamp = 758;
	int LITERAL_rownum = 759;
	int LITERAL_the = 760;
	int LITERAL_having = 761;
	int LITERAL_nulls = 762;
	int LITERAL_first = 763;
	int LITERAL_last = 764;
	int LITERAL_nowait = 765;
	int LITERAL_wait = 766;
	int LITERAL_matched = 767;
	int LITERAL_returning = 768;
	int LITERAL_transaction = 769;
	int LITERAL_mode = 770;
	int LITERAL_share = 771;
	int LITERAL_exclusive = 772;
	int LITERAL_savepoint = 773;
	int LITERAL_aggregate = 774;
	int LITERAL_records = 775;
	int LITERAL_parameters = 776;
	int LITERAL_access = 777;
	int LITERAL_newline = 778;
	int LITERAL_delimited = 779;
	int LITERAL_fixed = 780;
	int LITERAL_characterset = 781;
	int LITERAL_big = 782;
	int LITERAL_little = 783;
	int LITERAL_endian = 784;
	int LITERAL_mark = 785;
	int LITERAL_nocheck = 786;
	int LITERAL_string = 787;
	int LITERAL_sizes = 788;
	int LITERAL_bytes = 789;
	int LITERAL_load = 790;
	int LITERAL_nobadfile = 791;
	int LITERAL_badfile = 792;
	int LITERAL_nodiscardfile = 793;
	int LITERAL_discardfile = 794;
	int LITERAL_nologfile = 795;
	int LITERAL_logfile = 796;
	int LITERAL_readsize = 797;
	int LITERAL_skip = 798;
	int LITERAL_data_cache = 799;
	int LITERAL_fields = 800;
	int LITERAL_missing = 801;
	int LITERAL_field = 802;
	int LITERAL_lrtrim = 803;
	int LITERAL_notrim = 804;
	int LITERAL_ltrim = 805;
	int LITERAL_rtrim = 806;
	int LITERAL_ldtrim = 807;
	int LITERAL_position = 808;
	int LITERAL_enclosed = 809;
	int LITERAL_date_format = 810;
	int LITERAL_varraw = 811;
	int LITERAL_varcharc = 812;
	int LITERAL_varrawc = 813;
	int LITERAL_oracle_number = 814;
	int LITERAL_oracle_date = 815;
	int LITERAL_counted = 816;
	int LITERAL_zoned = 817;
	int LITERAL_unsigned = 818;
	int LITERAL_location = 819;
	int LITERAL_concat = 820;
	int LITERAL_lobfile = 821;
	int LITERAL_preprocessor = 822;
	int LITERAL_compression = 823;
	int LITERAL_enabled = 824;
	int LITERAL_disabled = 825;
	int LITERAL_encryption = 826;
	int LITERAL_version = 827;
	int LITERAL_compatible = 828;
	int LITERAL_data = 829;
	int LITERAL_mask = 830;
	int LITERAL_terminated = 831;
	int LITERAL_whitespace = 832;
	int LITERAL_optionally = 833;
	int LITERAL_timezone = 834;
	int LITERAL_transforms = 835;
	int LITERAL_oracle_loader = 836;
	int LITERAL_oracle_datapump = 837;
	int LITERAL_latest = 838;
	int LITERAL_characters = 839;
	int LITERAL_are = 840;
	int LITERAL_ldrtrim = 841;
}
