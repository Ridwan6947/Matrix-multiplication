import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int m1 = scan.nextInt();
        int[][] arr = new int[n1][m1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }


        }
        int n2 = scan.nextInt();
        int m2 = scan.nextInt();
        int[][] arr1 = new int[n2][m2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }
        if (m1!=n2){
            System.out.println("Invalid input");
            return;
        }
        int[][]prd = new int[n1][m2];
        for (int i = 0 ; i < prd.length ; i++){
            for (int j = 0 ; j < prd[0].length ; j++){
                for (int k = 0 ; k < n1; k++){
                    prd[i][j] += arr[i][k] * arr1[k][j];

                }

            }
        }
        for (int i = 0 ; i < prd.length ; i++){
            for (int j = 0 ; j < prd[0].length ; j++){
                System.out.print(prd[i][j]+ " ");

            }
            System.out.println();
        }
    }
}