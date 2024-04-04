package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCollumns()];
		
		Position p = new Position(0, 0);
		
		if (getColor() == Color.WHITE) {
			p.setValues(position.getRow() - 1, position.getCollumn());
			if (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() - 2, position.getCollumn());
			Position p2 = new Position(position.getRow() - 1, position.getCollumn());
			if (getBoard().positionExist(p) && !getBoard().threIsAPiece(p) && getMoveCount() == 0
				&& getBoard().positionExist(p2) && !getBoard().threIsAPiece(p2)
				) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getCollumn() -1);
			if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() - 1, position.getCollumn() + 1);
			if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
		}else {
			p.setValues(position.getRow() + 1, position.getCollumn());
			if (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() + 2, position.getCollumn());
			Position p2 = new Position(position.getRow() + 1, position.getCollumn());
			if (getBoard().positionExist(p) && !getBoard().threIsAPiece(p) && getMoveCount() == 0
				&& getBoard().positionExist(p2) && !getBoard().threIsAPiece(p2)
				) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getCollumn() - 1);
			if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
			
			p.setValues(position.getRow() + 1, position.getCollumn() + 1);
			if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getCollumn()] = true;
			}
		}
		
		
		return mat;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "P";
	}
	
}
