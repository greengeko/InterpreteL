package progetto2021_gruppo14.parser.ast;

import progetto2021_gruppo14.visitors.Visitor;

public class Add extends BinaryOp {
	public Add(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitAdd(left, right);
	}
}
