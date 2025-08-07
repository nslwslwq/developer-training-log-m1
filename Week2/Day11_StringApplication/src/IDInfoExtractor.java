import java.util.Scanner;
public class IDInfoExtractor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("身分証番号を入力して下さい");
        String str = sc.next();
        String b = str.substring(6,10);
        String c = str.substring(10,12);
        String d = str.substring(12,14);
        char f = str.charAt(16);
        if ((f-'0')%2==1){
            f='男';
        }else{
            f='女';
        }
        System.out.println("生年月日："+b+"年"+c+"月"+d+"日");
        System.out.println("性別："+f);
    }
}
