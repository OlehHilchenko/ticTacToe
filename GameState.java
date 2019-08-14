package local.learn.mypets.tictactoeNew;

public class GameState extends GameHelper{

    private static final String SELECT_EMPTY_FIELD = "select empty field";
    private static final String PLAYER_WINS = " player wins!";
    private char[][] playField;
    private int turnCounter;
    private boolean isGameOver;

    GameState(char[][] playField, int playCount, boolean checkGame) {
        this.playField = playField;
        this.turnCounter = playCount;
        this.isGameOver = checkGame;
    }

    void nextTurn() {
        this.turnCounter = turnCounter + 1;
    }

    char[][] getPlayField() {
        return playField;
    }

    boolean getIsGameOver() {
        return isGameOver;
    }

    void setTurnCounter(int i) {
        this.turnCounter = i;
    }

    void setGameOver(boolean f) {
        this.isGameOver = f;
    }

    void isTheCellUnderTheDigit(int i) {
        int cell = i - 1;
        int count = 0;
        for (int row = 0; row < playField.length; row++) {
            for (int colum = 0; colum < playField[row].length; colum++) {
                if (cell == count && playField[row][colum] != THE_X && playField[row][colum] != THE_O) {
                    playField[row][colum] = whoPlay();
                    return;
                }
                count++;
            }
        }
        System.out.println(SELECT_EMPTY_FIELD);
        isTheCellUnderTheDigit(choiceMoveEn());
    }

    void machineStrokeSelection(int i) {
        boolean f = false;
        int cell = i - 1;
        while (!f) {
            int count = 0;
            for (int row = 0; row < playField.length; row++) {
                for (int colum = 0; colum < playField[row].length; colum++) {
                    if (cell == count && playField[row][colum] != THE_X && playField[row][colum] != THE_O) {
                        playField[row][colum] = whoPlay();
                        f = true;
                        return;
                    }
                    count++;
                }
            }
            cell = getRandom() - 1;
        }
    }

    private char whoPlay() {
        if (1 == turnCounter % 2) {
            return THE_X;
        } else {
            return THE_O;
        }
    }

    void checkWinner() {
        //Check winner row and colum
        for (int row = 0; row < playField.length; row++) {
            int countCheckRow = 0;
            int countCheckColum = 0;
            for (int colum = 0; colum < playField[row].length; colum++) {
                if (playField[row][colum] == whoPlay()) {
                    countCheckColum++;
                }
                if (playField[colum][row] == whoPlay()) {
                    countCheckRow++;
                }
                if (3 == countCheckColum) {
                    this.isGameOver = true;
                    System.out.println(whoPlay() + PLAYER_WINS);
                    return;
                }
                if (3 == countCheckRow) {
                    this.isGameOver = true;
                    System.out.println(whoPlay() + PLAYER_WINS);
                    return;
                }
            }
        }
        //Check winner diagonals
        if ((playField[0][0] == whoPlay() && playField[1][1] == whoPlay() && playField[2][2] == whoPlay())
                || (playField[2][0] == whoPlay() && playField[1][1] == whoPlay() && playField[0][2] == whoPlay())) {
            this.isGameOver = true;
            System.out.println(whoPlay() + PLAYER_WINS);
        }
    }

    void displayGameField(){
        System.out.println();
        for(int row = 0; row<playField.length; row++){
            System.out.println(" -------------");
            for(int colum = 0; colum<playField[row].length; colum++){
                System.out.print(" | "+playField[row][colum]);
            }
            System.out.println(" |");
        }
        System.out.println(" -------------");
    }
}