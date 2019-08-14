package local.learn.mypets.tictactoeNew;

import java.util.Random;
import java.util.Scanner;

public class GameHelper {

    static final char THE_X = 'x';
    static final char THE_O = 'o';

    char getChar() {
        Scanner ch = new Scanner(System.in);
        String choiceOrMove = ch.next();
        return choiceOrMove.charAt(0);
    }

    int getRandom() {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }

    private String getCharSt() {
        Scanner st = new Scanner(System.in);
        return st.next();
    }

    int choiceMoveEn() {
        while (true) {
            String c = getCharSt();
            int i = Integer.parseInt(c);
            if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
                return i;
            } else {
                return 0;
            }
        }
    }

}
