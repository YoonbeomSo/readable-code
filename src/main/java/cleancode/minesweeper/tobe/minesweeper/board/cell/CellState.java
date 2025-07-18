package cleancode.minesweeper.tobe.minesweeper.board.cell;

public class CellState {

    private boolean isFlagged;
    private boolean isOpened;

    public CellState(boolean isFlagged, boolean isOpened) {
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static CellState initialize() {
        return new CellState(false, false);
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public void flag() {
        isFlagged = true;
    }

    public void open() {
        isOpened = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

}
