import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String input = str.toUpperCase();

        int[] alphaCnt = new int[26];

        for (int i=0; i<input.length();i++){
            alphaCnt[input.charAt(i)-'A']++;
        }

        int max = alphaCnt[0];
        int max_index = 0;
        for (int i=1; i< alphaCnt.length; i++){
            if(alphaCnt[i]>max){
                max = alphaCnt[i];
                max_index = i;
            }
        }

        int max_cnt = 0;

        // 최댓값 max 값이 몇개 있는지 check
        for (int i=0; i< alphaCnt.length;i++){
            if(alphaCnt[i]==max){
                max_cnt++;
            }
        }

        //만약 최댓값 max가 2개 이상이면 "?"출력
        if(max_cnt>1){
            System.out.println("?");
        }else { // max가 1개이면 최댓값 문자 출력
            System.out.println((char)('A'+max_index));
        }


    }
}
