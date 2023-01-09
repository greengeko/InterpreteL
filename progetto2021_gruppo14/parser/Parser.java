package progetto2021_gruppo14.parser;

import progetto2021_gruppo14.parser.ast.Prog;

public interface Parser extends AutoCloseable {

	Prog parseProg() throws ParserException;

}