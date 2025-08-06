import java.util.Scanner;
public class PhoneNumberMasking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("電話番号を入力して下さい");
        String str = sc.next();
        String begin = str.substring(0,3);
        String end = str.substring(7);
        System.out.println(begin+"****"+end);
    }
}
