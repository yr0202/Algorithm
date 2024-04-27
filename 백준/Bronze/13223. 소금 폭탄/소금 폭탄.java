import java.util.Scanner;

// 소금 폭탄
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cur = sc.nextLine(); //현재 시간
        String salt = sc.nextLine(); // 투하 시간
        // "투하 시간 - 현재 시간"을 구하자!

        String[] curTime = cur.split(":");
        int curTimeHour = Integer.parseInt(curTime[0]);
        int curTimeMinute = Integer.parseInt(curTime[1]);
        int curTimeSecond = Integer.parseInt(curTime[2]);

        String[] saltTime = salt.split(":");
        int saltTimeHour = Integer.parseInt(saltTime[0]);
        int saltTimeMinute = Integer.parseInt(saltTime[1]);
        int saltTimeSecond = Integer.parseInt(saltTime[2]);

       int curTimeAmount = curTimeHour*3600 + curTimeMinute*60 + curTimeSecond;
       int saltTimeAmount = saltTimeHour*3600 + saltTimeMinute*60 + saltTimeSecond;

       int latencyTime = saltTimeAmount - curTimeAmount;

       if(latencyTime<=0) latencyTime += 24*3600;

       int latencyHour = latencyTime/3600;
       int latencyMinute = (latencyTime%3600) / 60;
       int latencySecond = latencyTime%60;

        System.out.printf("%02d:%02d:%02d",latencyHour,latencyMinute,latencySecond);

    }
}
