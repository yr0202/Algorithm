
import java.util.Scanner;

// 애너그램 만들기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();


        for (int i=0; i<str1.length();i++){
            for (int j=0; j<str2.length();j++){
                if (first[i] == second[j]) {
                    first[i] = '\0';
                    second[j] = '\0';
                    break;
                }
            }
        }

        int first_length = 0;
        int second_length = 0;
        for(int i=0;i< first.length;i++){
            if(first[i]!='\0'){
                first_length++;
            }
        }
        for(int i=0;i< second.length;i++){
            if(second[i]!='\0'){
                second_length++;
            }
        }
        System.out.println(first_length+second_length);
        
    }
}
