package boardgame;

public class Board {
	private int rows;
	private int collumns;
	private Piece[][] pieces;
	
	public Board(int rows, int collumns) {
		if (rows < 1 || collumns < 1) {
			throw new BoardException("Error creating board: thre must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.collumns = collumns;
		pieces = new Piece[rows][collumns];
	}

	public int getRows() {
		return rows;
	}

	public int getCollumns() {
		return collumns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getCollumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (threIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getCollumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExist(int row, int column){
		return row >= 0 && row < rows && column >= 0 && column < collumns;		
	}
	
	public boolean positionExist(Position position){
		return positionExist(position.getRow(), position.getCollumn());
	}
	
	public boolean threIsAPiece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExist(position)) {
			throw new BoardException("Position not on the board");
		}
		
		if (piece(position) == null) {
			return null;
		}
		
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getCollumn()] = null;
		return aux;
	}
}
