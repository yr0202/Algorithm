import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                arrA[i][j]=sc.nextInt();
            }
        }
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                arrB[i][j]=sc.nextInt();
            }
        }

        int[][] result = new int[N][M];
        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                result[i][j]=arrA[i][j]+arrB[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
