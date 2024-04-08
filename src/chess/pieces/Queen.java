package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{
	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCollumns()];
		
		Position p = new Position(0, 0);
		
		// above
		p.setValues(position.getRow() - 1, position.getCollumn());
		while(getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		
		if(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}
		
		// left
		p.setValues(position.getRow(), position.getCollumn() - 1);
		while(getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setCollumn(p.getCollumn() - 1);
		}
		
		if(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}
		
		// right 
		
		p.setValues(position.getRow() , position.getCollumn() + 1);
		while(getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setCollumn(p.getCollumn() + 1);
		}
		
		if(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}
		
		// bellow
		p.setValues(position.getRow() + 1, position.getCollumn());
		while(getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		
		if(getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}
		
		// nw
		p.setValues(position.getRow() - 1, position.getCollumn() - 1);
		while (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setValues(p.getRow() - 1, p.getCollumn() - 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}

		// ne
		p.setValues(position.getRow() - 1, position.getCollumn() + 1);
		while (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setValues(p.getRow() - 1, p.getCollumn() + 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}

		// se
		p.setValues(position.getRow() + 1, position.getCollumn() + 1);
		while (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setValues(p.getRow() + 1, p.getCollumn() + 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getCollumn() - 1);
		while (getBoard().positionExist(p) && !getBoard().threIsAPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
			p.setValues(p.getRow() + 1, p.getCollumn() - 1);
		}
		if (getBoard().positionExist(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getCollumn()] = true;
		}

		
		return mat;
	}
}
