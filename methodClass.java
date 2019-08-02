package local.learn.mypets.tictactoeNew;

import java.util.Random;
import java.util.Scanner;

public class methodClass {

    private varClass initVar = new varClass();

    public void playWithPlayerOrMachine() {
        System.out.println("You want play with player or machine ? p/m");
        boolean n = false;
        while (!n) {
            char ch = getChar();
            String s = "" + ch;
            if (s.equalsIgnoreCase("p")) {
                playWithPlayer();
                n = true;
            } else if (s.equalsIgnoreCase("m")) {
                playWithMachine();
                n = true;
            } else {
                n = false;
            }
        }
    }

    private void playWithPlayer() {
        initializationVar();
        choiceXorO();
        while (!initVar.isCheckGame()) {
            dispGameField();
            choiceMove();
            checkWinner();
            checkDraw();
            int w = initVar.getPlayCount();
            initVar.setPlayCount(w + 1);
        }
    }

    private void playWithMachine() {
        initializationVar();
        choiceXorO();
        while (!initVar.isCheckGame()) {
            dispGameField();
            choiceMove();
            checkWinner();
            checkDraw();
            int w = initVar.getPlayCount();
            initVar.setPlayCount(w + 1);
            if (initVar.isCheckGame()) {
                return;
            } else {
                choiceMachineMove();
                checkWinner();
                checkDraw();
                int s = initVar.getPlayCount();
                initVar.setPlayCount(s + 1);
            }
        }
    }

    private void initializationVar() {
        initVar.setCheckGame(false);
        initVar.setPlayCount(0);
        char[][] pF = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        initVar.setPlayField(pF);
    }

    private void dispGameField() {
        char[][] t = initVar.getPlayField();
        System.out.println();
        System.out.println(t[0][0] + " | " + t[0][1] + " | " + t[0][2]);
        System.out.println("---------");
        System.out.println(t[1][0] + " | " + t[1][1] + " | " + t[1][2]);
        System.out.println("---------");
        System.out.println(t[2][0] + " | " + t[2][1] + " | " + t[2][2]);
    }

    private void choiceXorO() {
        System.out.println("Choice x or o !");
        switch (getChar()) {
            case 'x':
                System.out.println("firs player is x, second player is o !");
                initVar.setPlayCount(1);
                break;
            case 'o':
                System.out.println("firs player is o, second player is x !");
                initVar.setPlayCount(2);
                break;
            default:
                System.out.println("you must choice x or o !!!");
                choiceXorO();
        }
    }

    private char getChar() {
        Scanner ch = new Scanner(System.in);
        String choiceOrMove = ch.next();
        return choiceOrMove.charAt(0);
    }

    private char whoPlay() {
        int countStep = initVar.getPlayCount();
        if (1 == countStep % 2) {
            return 'x';
        } else {
            return 'o';
        }
    }

    private void choiceMove() {
        char[][] gameField = initVar.getPlayField();
        System.out.println(whoPlay() + " player:");
        switch (getChar()) {
            case '1':
                gameField[0][0] = whoPlay();
                break;
            case '2':
                gameField[0][1] = whoPlay();
                break;
            case '3':
                gameField[0][2] = whoPlay();
                break;
            case '4':
                gameField[1][0] = whoPlay();
                break;
            case '5':
                gameField[1][1] = whoPlay();
                break;
            case '6':
                gameField[1][2] = whoPlay();
                break;
            case '7':
                gameField[2][0] = whoPlay();
                break;
            case '8':
                gameField[2][1] = whoPlay();
                break;
            case '9':
                gameField[2][2] = whoPlay();
                break;
            default:
                System.out.println("select empty field");
                choiceMove();
        }
        initVar.setPlayField(gameField);
    }

    int getRandom() {
        Random random = new Random();
        int temp = random.nextInt(8) + 1;
        return temp;
    }

    private void choiceMachineMove() {
        char[][] gameField = initVar.getPlayField();
        boolean b = false;
        while (!b) {
            switch (getRandom()) {
                case 1:
                    if (gameField[0][0] == 'x' || gameField[0][0] == 'o') {
                        b = false;
                    } else {
                        gameField[0][0] = whoPlay();
                        b = true;
                    }
                    break;
                case 2:
                    if (gameField[0][1] == 'x' || gameField[0][1] == 'o') {
                        b = false;
                    } else {
                        gameField[0][1] = whoPlay();
                        b = true;
                    }
                    break;
                case 3:
                    if (gameField[0][2] == 'x' || gameField[0][2] == 'o') {
                        b = false;
                    } else {
                        gameField[0][2] = whoPlay();
                        b = true;
                    }
                    break;
                case 4:
                    if (gameField[1][0] == 'x' || gameField[1][0] == 'o') {
                        b = false;
                    } else {
                        gameField[1][0] = whoPlay();
                        b = true;
                    }
                    break;
                case 5:
                    if (gameField[1][1] == 'x' || gameField[1][1] == 'o') {
                        b = false;
                    } else {
                        gameField[1][1] = whoPlay();
                        b = true;
                    }
                    break;
                case 6:
                    if (gameField[1][2] == 'x' || gameField[1][2] == 'o') {
                        b = false;
                    } else {
                        gameField[1][2] = whoPlay();
                        b = true;
                    }
                    break;
                case 7:
                    if (gameField[2][0] == 'x' || gameField[2][0] == 'o') {
                        b = false;
                    } else {
                        gameField[2][0] = whoPlay();
                        b = true;
                    }
                    break;
                case 8:
                    if (gameField[2][1] == 'x' || gameField[2][1] == 'o') {
                        b = false;
                    } else {
                        gameField[2][1] = whoPlay();
                        b = true;
                    }
                    break;
                case 9:
                    if (gameField[2][2] == 'x' || gameField[2][2] == 'o') {
                        b = false;
                    } else {
                        gameField[2][2] = whoPlay();
                        b = true;
                    }
                    break;
                default:
            }
        }
        initVar.setPlayField(gameField);
    }

    private String gameOver() {
        return "GAME OVER MAN !!!";
    }

    private void checkWinner() {
        char[][] gameField = initVar.getPlayField();
        //Check winner row and colum
        for (int row = 0; row < gameField.length; row++) {
            int countCheckRow = 0;
            int countCheckColum = 0;
            for (int colum = 0; colum < gameField[row].length; colum++) {
                if (gameField[row][colum] == whoPlay()) {
                    countCheckColum++;
                }
                if (gameField[colum][row] == whoPlay()) {
                    countCheckRow++;
                }
                if (3 == countCheckColum) {
                    initVar.setCheckGame(true);
                    System.out.println(whoPlay() + " player wins!");
                }
                if (3 == countCheckRow) {
                    initVar.setCheckGame(true);
                    System.out.println(whoPlay() + " player wins!");
                }
            }
        }
        //Check winner diagonals
        if (gameField[0][0] == whoPlay() && gameField[1][1] == whoPlay() && gameField[2][2] == whoPlay()) {
            initVar.setCheckGame(true);
            System.out.println(whoPlay() + " player wins!");
        }
        if (gameField[2][0] == whoPlay() && gameField[1][1] == whoPlay() && gameField[0][2] == whoPlay()) {
            initVar.setCheckGame(true);
            System.out.println(whoPlay() + " player wins!");
        }
    }

    private void checkDraw() {
        int checkGameField = 0;
        char[][] gameField = initVar.getPlayField();
        boolean check = initVar.isCheckGame();
        if (check) {
            System.out.println(": )");
        } else {
            for (int row = 0; row < gameField.length; row++) {
                for (int colum = 0; colum < gameField[row].length; colum++) {
                    if ('x' == gameField[row][colum] || 'o' == gameField[row][colum]) {
                        checkGameField++;
                    }
                    if (9 == checkGameField) {
                        dispGameField();
                        System.out.println("draw!" + gameOver());
                        initVar.setCheckGame(true);
                    }
                }
            }
        }
    }
}
