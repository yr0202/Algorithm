import java.util.Scanner;

//문서 검색
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String docs = sc.nextLine();
        String word = sc.nextLine();

        int cnt = 0;

        for(int i=0; i<=docs.length()- word.length();i++){
            boolean isMatch = true;
            for(int j=0;j< word.length();j++){
                if(docs.charAt(i+j) != word.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch==true){
                cnt++;
                i += word.length()-1;
                
                
            }
        }
        System.out.println(cnt);
    }
}
