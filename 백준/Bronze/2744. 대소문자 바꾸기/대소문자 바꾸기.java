
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = new char[input.length()];

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i)>='a'){
                arr[i] = (char)(input.charAt(i)-32);
            } else{
                arr[i] = (char)(input.charAt(i)+32);
            }
            System.out.print(arr[i]);
        }
    }
}
