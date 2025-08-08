import java.util.Scanner;
public class RomanConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1から9までの数字を入力して下さい");
        String str = sc.next();
        if(!checkStr(str)){
            System.out.println("エラー：範囲外の数字を入力しました");
        }else{
            System.out.println(convertToRoman(str));
        }
    }
    public static String convertToRoman(String str){
        String[] arr2 = {"Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            result.append(arr2[a - 1]);
        }return result.toString();
    }
    public static boolean checkStr(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c-'0'<1 || c-'0'>9){
                return false;
            }
        }return true;
    }
}
