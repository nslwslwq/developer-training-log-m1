import java.util.Scanner;
public class RotationChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("任意の内容を入力してください(1)");
        String str1 = sc.next();
        System.out.println("任意の内容を入力してください(2)");
        String str2 = sc.next();
        int a = str2.length();
        if(a == str1.length()){
            String str11 = str1+str1;
            boolean flag = false;
            for (int i = 0; i < a; i++) {
                String result = str11.substring(i,i+a);
                if(result.equalsIgnoreCase(str2)){
                    System.out.println("true"+i+"回かかりました");
                    flag = true;
                    break;
                }
            }if(!flag){
                System.out.println("false");
            }
        }
    }
}
