package progetto2021_gruppo14.parser.ast;

import progetto2021_gruppo14.visitors.Visitor;

public interface AST {
	<T> T accept(Visitor<T> visitor);
}
