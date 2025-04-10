package cleancode.minesweeper.tobe.io;

import cleancode.minesweeper.tobe.GameBoard;
public interface OutputHandler {
    void showGameStartComments();
    void showBoard(GameBoard board);
    void showGameWinningComments();
    void showGameLosingComments();
    void showCommentForSelectingCell();
    void showCommentForUserAction();
    void showExceptionMessage(Exception e);
    void showSimpleMessage(String message);

}
