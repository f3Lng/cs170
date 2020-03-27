public class Arrays2D {

    public static void main(String[] args) {
        // constant array
        int[] a = {10, 7, 5, 2, 13};
        System.out.println(arrayToString(a, 5));


        //2D arrays
        int[][] x = new int[2][3]; //matrix with 2 rows and 3 columns
        x[0][0] = 100;

        double[][] y = new double[2][3];
        y[0][0] = 10;
        y[0][1] = 20;
        y[0][2] = 30;
        y[1][0] = 40;
        y[1][1] = 50;
        y[1][2] = 60;


        //test matrixToString
        System.out.println(matrixToString(y, 2, 3));


        double[][] w = {{15, 25, 35}, {45, 55, 65}};
        System.out.println(matrixToString(w, 2, 3));

        //test transpose
        double[][] yt = transpose(y, 2, 3);
        System.out.println(matrixToString(yt, 3, 2));

        //test isTriangular
        double[][] z = new double[3][3];
        z[0][0] = 1;
        z[0][1] = 0;
        z[0][2] = 0;
        z[1][0] = 2;
        z[1][1] = 3;
        z[1][2] = 0;
        z[2][0] = 4;
        z[2][1] = 5;
        z[2][2] = 6;
        System.out.println(isTriangular(z, 3));

    }

    /**
     * Returns a string representation of an array of integers in the following
     * format: [a0, a1, a2, ..., an-1]
     * 
     * @param a an array of integers
     * @param n the number of elements in a (n <= a.length)
     * @return a String representation of a
     */
    public static String arrayToString(int[] a, int n) {
        String result = "[";
        for (int i = 0; i < n - 1; i++) {
            result = result + a[i] + ", ";
        }
        if (n > 0) {
            result = result + a[n - 1];
        }
        result += "]";
        return result;
    }


    /**
     * Returns a string representation of a 2D array of doubles in the format:
     * [
     *  [x[0][0], x[0][1], x[0][m-1]]
     *  [x[1][0], x[1][1], x[1][m-1]]
     *  [...        ...        ...      ]
     *  [x[n-1][0], x[n-1][1], x[n-1][m-1]]
     * ]
     * 
     * @param x a matrix (2D array) of doubles
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return a String representation of x[][]
     */
    public static String matrixToString(double[][] x, int n, int m) {
        String result = "[\n"; //new line is \n
        for (int row = 0; row < n; row++) {
            result += " [";
            for (int col = 0; col < m - 1; col++) {
                result += x[row][col] + ", ";
             }
             result += x[row][m - 1] + "]\n";
        }
        result += "]";
        return result;
    }



    
    /**
     * Returns a new matrix that contains the transpose of a given
     * matrix with n rows and m columns.
     *
     * @param x a matrix (array of arrays) of doubles
     * @param n number of rows of x[][]
     * @param m number of columns of x[][]
     * @return the transpose of x[][]
     */
    //  1 2 3
    //  4 5 6
    //  BECOMES
    //  1 4
    //  2 5
    //  3 6
    public static double[][] transpose(double[][] x, int n, int m) {
        double[][] result = new double[m][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
            result[col][row] = x[row][col];
            }
        }
        return result;
    }




   /**
     * Checks whether a given square matrix is triangular.
     * A triangular matrix is a special kind of square matrix where
     * either all the entries below or all the entries above
     * the main diagonal are zero.
     * 
     * @param x a matrix of doubles
     * @param n number of rows and columns of x[][]
     * @return true if x[][] is triangular, false otherwise
     */
   //triangular if all elements below or above diag are all zeroes
   //if numbers are upper, upper diag
   //1 2 3
   //0 4 5
   //0 0 6
   //
   //1 0 0
   //2 3 0
   //4 5 6
    public static boolean isTriangular(double[][] x, int n) {
        boolean result1 = true;
        boolean result2 = true;
        //upper
        for (int row = 1; row < n; row++) { //1, n USE THESE
            for (int col = 0; col < n-1; col++) { //0, row
                if (x[row][col] != 0) {
                    result1 = false;
                } else {
                    result1 = true;
                }
            }
        }
        //lower
        for (int row = 0; row < n-1; row++) { //0, n
            for (int col = 1; col < n; col++) { //row + 1, n
                if (x[row][col] != 0) {
                    result2 = false;
                } else {
                    result2 = true;
                }
            }
        }
        return (result1 || result2);
    }

}

