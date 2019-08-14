package local.learn.mypets.tictactoeNew;

public class TicTacToe extends GameHelper {

    private static final char[][] P_F = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    private static final String GAME_OVER = "GAME OVER MAN !!!";
    private static final String YOU_WANT_PLAY_P_OR_M = "You want play with player or machine ? p/m";
    private static final String CHOICE_X_OR_O = "Choice x or o !";
    private static final String FIRST_PLAYER_X = "firs player is x, second player is o !";
    private static final String FIRST_PLAYER_O = "firs player is o, second player is x !";
    private static final String YOU_MUST_CHOICE_X_OR_O = "you must choice x or o !!!";
    private static final String P = "p";
    private static final String M = "m";
    private static final String SMILE = ":-)";
    private static final String DRAW = "Draw!!!";

    private GameState initVar = new GameState(P_F, 0, false);

    void playWithPlayerOrMachine() {
        System.out.println(YOU_WANT_PLAY_P_OR_M);
        while (true) {
            char ch = getChar();
            String s = ("" + ch).toLowerCase();
            if (s.equals(P)) {
                playWithPlayer();
                return;
            } else if (s.equals(M)) {
                playWithMachine();
                return;
            }
        }
    }
    private void playWithMachine() {
        choiceXorO();
        while (!initVar.getIsGameOver()) {
            initVar.displayGameField();
            initVar.isTheCellUnderTheDigit(choiceMoveEn());
            initVar.checkWinner();
            checkDraw();
            initVar.nextTurn();
            if (initVar.getIsGameOver()) {
                return;
            } else {
                initVar.machineStrokeSelection(getRandom());
                initVar.checkWinner();
                checkDraw();
                initVar.nextTurn();
            }
        }
    }

    private void playWithPlayer() {
        choiceXorO();
        while (!initVar.getIsGameOver()) {
            initVar.displayGameField();
            initVar.isTheCellUnderTheDigit(choiceMoveEn());
            initVar.checkWinner();
            checkDraw();
            initVar.nextTurn();
        }
    }

    private void choiceXorO() {
        System.out.println(CHOICE_X_OR_O);
        boolean check = false;
        while (!check) {
            switch (getChar()) {
                case THE_X:
                    System.out.println(FIRST_PLAYER_X);
                    initVar.setTurnCounter(1);
                    check = true;
                    break;
                case THE_O:
                    System.out.println(FIRST_PLAYER_O);
                    initVar.setTurnCounter(2);
                    check = true;
                    break;
                default:
                    System.out.println(YOU_MUST_CHOICE_X_OR_O);
            }
        }
    }

    private void checkDraw() {
        int checkGameField = 0;
        char[][] gameField = initVar.getPlayField();
        boolean check = initVar.getIsGameOver();
        if (check) {
            System.out.println(SMILE);
            initVar.displayGameField();
        } else {
            for (int row = 0; row < gameField.length; row++) {
                for (int colum = 0; colum < gameField[row].length; colum++) {
                    if (THE_X == gameField[row][colum] || THE_O == gameField[row][colum]) {
                        checkGameField++;
                    }
                    if (9 == checkGameField) {
                        initVar.displayGameField();
                        System.out.println(DRAW + gameOver());
                        initVar.setGameOver(true);
                    }
                }
            }
        }
    }

    private String gameOver() {
        return GAME_OVER;
    }
}
