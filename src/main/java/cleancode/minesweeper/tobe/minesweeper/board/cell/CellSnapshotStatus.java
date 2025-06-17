package cleancode.minesweeper.tobe.minesweeper.board.cell;

public enum CellSnapshotStatus {

    EMPTY("빈 셀", "■"),
    FLAG("깃발", "⚑"),
    LAND_MINE("지뢰", "X"),
    NUMBER("숫자", "1"),
    UNCHECKED("확인 전", "□");

    private final String description;
    private final String target;

    CellSnapshotStatus(String description, String target) {
        this.description = description;
        this.target = target;
    }
}
