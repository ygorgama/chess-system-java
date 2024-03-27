package boardgame;

public class Board {
	private int rows;
	private int collumns;
	private Piece[][] pieces;
	
	public Board(int rows, int collumns) {
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	
}
