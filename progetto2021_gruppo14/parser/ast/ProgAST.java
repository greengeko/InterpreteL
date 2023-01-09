package progetto2021_gruppo14.parser.ast;

import static java.util.Objects.requireNonNull;

import progetto2021_gruppo14.visitors.Visitor;

public class ProgAST implements Prog {
	private final StmtSeq stmtSeq;

	public ProgAST(StmtSeq stmtSeq) {
		this.stmtSeq = requireNonNull(stmtSeq);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + stmtSeq + ")";
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitProg(stmtSeq);
	}

}
