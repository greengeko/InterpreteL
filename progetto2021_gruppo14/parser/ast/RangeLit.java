package progetto2021_gruppo14.parser.ast;

import progetto2021_gruppo14.visitors.Visitor;

public class RangeLit extends BinaryOp {
	public RangeLit(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitRangeLit(left, right);
	}
}
