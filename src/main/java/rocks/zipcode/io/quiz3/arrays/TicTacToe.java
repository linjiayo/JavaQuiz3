package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        for (int i = 1; i < row.length; i++) {
            if (row[i] != row[0]) {
                return false;
            }
        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);
        for (int i = 1; i < col.length; i++) {
            if (col[i] != col[0]) {
                return false;
            }
        }
        return true;
    }

    public Boolean isAntiDiagonalHomogenous() {
        String antiDiagonal = "a";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (row + col == board.length -1) {
                    if (antiDiagonal == "a") {
                        antiDiagonal = board[row][col];
                    } else if (board[row][col] != antiDiagonal) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public Boolean isDiagonalHomogenous() {
        String diagonal = "a";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (row == col) {
                    if (diagonal == "a") {
                        diagonal = board[row][col];
                    } else if (board[row][col] != diagonal) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }
        if (isDiagonalHomogenous()) {
            return board[0][0];
        }

        if (isAntiDiagonalHomogenous()) {
            return board[0][board.length - 1];
        }
        return "";
    }

    public String[][] getBoard() {
        return null;
    }
}
