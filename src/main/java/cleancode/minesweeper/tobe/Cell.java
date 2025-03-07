package cleancode.minesweeper.tobe;

public class Cell {

    private final String sign;

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String CLOSED_CELL_SIGN = "□";
    private static final String OPENED_CELL_SIGN = "■";

    public Cell(String sign) {
        this.sign = sign;
    }

    public static Cell of(String sign) {
        return new Cell(sign);
    }

    public static Cell ofFlag() {
        return of(FLAG_SIGN);
    }

    public static Cell ofLandMine() {
        return of(LAND_MINE_SIGN);
    }

    public static Cell ofClosed() {
        return of(CLOSED_CELL_SIGN);
    }

    public static Cell ofOpend() {
        return of(OPENED_CELL_SIGN);
    }

    public static Cell ofNearbyLandMineCount(Integer count) {
        return of(String.valueOf(count));
    }

    public String getSign() {
        return sign;
    }

    public boolean isClosed() {
        return CLOSED_CELL_SIGN.equals(this.sign);
    }

    public boolean doesNotClosed() {
        return !isClosed();
    }
}
