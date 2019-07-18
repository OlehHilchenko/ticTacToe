import java.util.Scanner;
import java.util.Arrays;

public class SquareRootP18 {
    private int testCases;
    private int[][] arrayTestCases;
    private double[] resultArray;

    void getTestCases() {
        // This method scan length case.
        System.out.println("Enter the quantity test cases: ");
        Scanner s = new Scanner(System.in);
        testCases = s.nextInt();
    }

    void getArrayTestCases() {
        // This method scan array case.
        System.out.println("Enter the  test cases array: ");
        Scanner sa = new Scanner(System.in);
        arrayTestCases = new int[testCases][2];
        for (int row = 0; row < arrayTestCases.length; row++) {
            for (int colum = 0; colum < arrayTestCases[row].length; colum++) {
                arrayTestCases[row][colum] = sa.nextInt();
            }
        }
    }

    void display() {
        //This method used when writing program, for control.
        for (int row = 0; row < arrayTestCases.length; row++) {
            System.out.println(" ");
            for (int colum = 0; colum < arrayTestCases[row].length; colum++) {
                System.out.print(arrayTestCases[row][colum] + " ");
            }
        }
        System.out.println(" ");
    }

    void sqrt() {
        //Another square root counting method.
        resultArray = new double[testCases];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (double) Math.sqrt(arrayTestCases[i][0]);
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public void sqrtManual() {
        //This method fills result array.
        resultArray = new double[testCases];
        SquareRootP18 objR = new SquareRootP18();
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = objR.codebiSqrt(arrayTestCases[i][0], arrayTestCases[i][1]);
        }
        System.out.println();
        System.out.println(Arrays.toString(resultArray));
    }


    static void Sqrt(long a) {
        //Another square root counting method.
        double b = a;
        int i = 0;
        while ((b * b > a) && (i < 200)) {
            b = (b + a / b) / 2;
            i++;
        }
        System.out.println(b);

    }

    static double codebiSqrt(int a, int b) {
        // In this method work suitable square root counting method.
        int x = a;
        double r = 1d;
        int i = 0;
        while (i < b) {
            r = (r + x / r) / 2;
            i++;
        }
        System.out.print(r + " ");
        return r;
    }

    public static void main(String[] args) {
        SquareRootP18 objIn = new SquareRootP18();
        objIn.getTestCases();
        objIn.getArrayTestCases();
        objIn.sqrtManual();
    }
}

/*
test-case:
13
85182 10
2058 11
693 11
71 10
36 12
66056 12
7476 2
95 2
45540 8
91268 8
6812 6
295 9
63 5
answer:
292.3832824281676 45.365184888855026 26.324893162176366 8.426149773176359 6.0 257.0136183162359 1870.24986625652 24.989583333333332 256.01739588147734 438.0236126350227 126.95757971422941 17.17556403731767 7.94204357569185
*/
