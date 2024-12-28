//Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

public class P1_7 {
    private static void rotateimg(int arr[][]) {

        int rn = arr.length;

        // transpose the matrix
        for (int i = 0; i < rn; i++) {
            for (int j = 0; j < rn; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse each row

        for (int i = 0; i < rn; i++) {
            for (int j = 0; j < rn / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][rn - 1 - j];
                arr[i][rn - 1 - j] = temp;
            }
        }

    

    }

    private static void printmat(int[][] matrix){
          // print matrix

          for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 3, 4 },
                { 4, 5, 8 },
                { 4, 6, 9 }

        };

        System.out.println("original matrix");
        printmat(arr);

        System.out.println("rotated matrix");
        
        rotateimg(arr);
        printmat(arr);

    }
}
