import java.util.Random;
import java.util.Scanner;
public class Game_for {
    public static void main (String[] args ){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("【数当てゲーム】");
        int ans = r.nextInt(10);
        for (int i = 0; i < 6; i++ ){
            System.out.println("0~9の数字を入力して下さい");
            int num = sc.nextInt();
            if (ans == num){
                System.out.println("あたり！");
                break;
            }else
                System.out.println("違います");

        }System.out.println("ゲームを終了します");
    }
}
