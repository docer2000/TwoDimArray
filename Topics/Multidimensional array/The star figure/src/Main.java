import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        //Let k = n/2 ( if n -> odd, for an array of n*n elements)

        // Main diagonal condition => i=j
        // Secondary diagonal condition => i=n-j-1
        //  Middle row => (n=k, loop j to n-1)
        //  Middle column => (loop i to n-1, j=k)

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int k = a / 2;

        String[][] array = new String[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = "*";
                } else if (i == a - j - 1) {
                    array[i][j] = "*";
                } else if (i == k) {
                    for (int n = 0; n < a - 1; n++) {
                        array[i][j] = "*";
                    }
                } else if (j == k) {
                    for (int m = 0; m < a - 1; m++) {
                        array[i][j] = "*";
                    }
                } else {
                    array[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}