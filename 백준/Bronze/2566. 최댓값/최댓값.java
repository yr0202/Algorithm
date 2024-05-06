import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];

        int max = -1; // 최댓값
        int col = 0; // 행
        int raw = 0; // 열
        for (int i=0; i<9; i++){
            for (int j=0; j<9;j++){
                matrix[i][j]=sc.nextInt();
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    col = i;
                    raw = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((col+1)+" "+(raw+1));
    }
}
