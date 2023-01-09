package progetto2021_gruppo14.parser;

public enum TokenType { 
	// symbols
	ASSIGN, MINUS, PLUS, TIMES, NOT, AND, EQ, NOT_EQ, START_PAIR, END_PAIR, START_RANGE, END_RANGE, STMT_SEP, EXP_SEP, RANGE_SEP, OPEN_PAR, CLOSE_PAR, OPEN_BLOCK, CLOSE_BLOCK,
	// keywords
	PRINT, VAR, BOOL, IF, ELSE, FOR, IN, FST, SND, BOUNDS,
	// non singleton categories
	SKIP, IDENT, NUM,   
	// end-of-file
	EOF, 	
}
