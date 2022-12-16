package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int a=0; a<board.getRows(); a++) {
			for(int b = 0; b<board.getColumns() ; b++) {
				mat[a][b] = (ChessPiece) board.piece(a, b);
			}
		}
		return mat;
	}
}
