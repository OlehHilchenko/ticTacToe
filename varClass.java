package local.learn.mypets.tictactoeNew;

public class varClass {

    private char[][] playField = new char[3][3];
    private int playCount;
    private boolean checkGame;


    public char[][] getPlayField() {
        return playField;
    }

    public int getPlayCount() {
        return playCount;
    }

    public boolean isCheckGame() {
        return checkGame;
    }

    public void setPlayField(char[][] c) {
        this.playField = c;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setCheckGame(boolean f) {
        this.checkGame = f;
    }
}