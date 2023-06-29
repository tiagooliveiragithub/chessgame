package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    //Template method
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    //Outra implementação concreta que depende de um metodo abstrato
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length;j++) {
                if(mat[i][j]) return true;
            }
        }
        return false;
    }
}
