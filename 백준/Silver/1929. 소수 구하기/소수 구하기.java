import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
//        int[] arr = new int[N+1];

        for (int i=M; i<=N; i++){
            makePrime(i);
        }
    }
    public static void makePrime(int number){
        // 0 과 1 은 소수가 아니므로 종료
        if(number < 2) {
            return;
        }

        // 2 는 소수다
        if(number == 2) {
            System.out.println(number);
            return;
        }
        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(number); i++) {

            // 소수가 아닐경우 종료
            if(number % i == 0) {
                return;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        System.out.println(number);
        return;
    }
}


