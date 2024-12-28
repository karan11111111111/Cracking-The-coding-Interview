//Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.


public class P1_8 {
    private static void zeromat(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // Step 1: Identify rows and columns to zero out
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: Zero out rows
        for (int i = 0; i < n; i++) {
            if (row[i]) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Step 3: Zero out columns
        for (int j = 0; j < m; j++) {
            if (col[j]) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }

   

    private static void printmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
            {1, 2, 3},
            {3, 4, 5},
            {6, 7, 9},
            {4, 5, 0}
        };

        System.out.println("Original Matrix:");
        printmat(mat);

        zeromat(mat);

        System.out.println("Matrix After Zeroing:");
        printmat(mat);
    }
}
