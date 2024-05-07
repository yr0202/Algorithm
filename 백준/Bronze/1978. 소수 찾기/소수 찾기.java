import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] sosu = new int[N];

        for (int i = 0; i<N; i++){
            sosu[i]=sc.nextInt();
        }

        int cnt=0;
        for (int i=0; i<N; i++){
            if (sosu[i]==1) continue;
            int tmp=0;
            for (int j=1; j<=sosu[i];j++){
                if(sosu[i]%j == 0) tmp++;
            }
            if(tmp==2) cnt++;
        }
        System.out.println(cnt);
    }
}
