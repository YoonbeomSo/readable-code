package cleancode.minesweeper.tobe;

public class Cell {

    private static final String FLAG_SIGN = "⚑";
    private static final String LAND_MINE_SIGN = "☼";
    private static final String UNCHECKED_SIGN = "□";
    private static final String EMPTY_SIGN = "■";

    private int nearbyLandMineCount;
    private boolean isLandMine;
    private boolean isFlagged;
    private boolean isOpened;

    // Cell 이 가진 속성 : 근처 지뢰 숫자, 지뢰 여부
    // Cell 의 상태 : 깃발 유무, 열렸다/닫혔다, 사용자가 확인 함

    /**
     * 도메인 지식을 얻었다!
     * - '열렸다/닫혔다' 는 개념과, '사용자가 체크했다' 는 개념은 다르다,
     * - ex)깃발 : 닫혀있지만 체크했으므로 게임 종료 조건의 일부가 된다.
     * - sign(String) 기반의 BOARD가 있고,
     * 이를 상황에 따라 표시할 sign 을 갈아끼우는 형태에서
     * BOARD는 Cell을 갈아끼우는 곳이 아니라,
     * 사용자 행위에 따라 Cell의 상태를 변화시키는 방향으로 가야한다.
     */

    public Cell(int nearbyLandMineCount, boolean isLandMine, boolean isFlagged, boolean isOpened) {
        this.nearbyLandMineCount = nearbyLandMineCount;
        this.isLandMine = isLandMine;
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static Cell of(int nearbyLandMineCount, boolean isLandMine, boolean isFlagged, boolean isOpened) {
        return new Cell(nearbyLandMineCount, isLandMine, isFlagged, isOpened);
    }

    public static Cell create() {
        return of(0, false, false, false);
    }

    public void turnOnLandMine() {
        isLandMine = true;
    }

    public void updateNearbyLandMineCount(int count) {
        nearbyLandMineCount = count;
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

    public boolean isLandMine() {
        return isLandMine;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean hasLandMineCount() {
        return nearbyLandMineCount != 0;
    }

    public String getSign() {
        if(isOpened) {
            if (isLandMine) {
                return LAND_MINE_SIGN;
            }
            if (hasLandMineCount()) {
                return String.valueOf(nearbyLandMineCount);
            }
            return EMPTY_SIGN;
        }

        if (isFlagged) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }

}
