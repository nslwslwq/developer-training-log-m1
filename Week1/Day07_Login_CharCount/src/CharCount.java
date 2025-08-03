import java.util.Scanner;
public class CharCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("任意の内容を入力しください");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i=0; i < str.length() ; i++){
            char b = str.charAt(i);
            if(b>='a' && b<='z'){
                smallCount++;
            }
            if (b>='A' && b<='Z'){
                bigCount++;
            }
            if (b>='0' && b<= '9'){
                numberCount++;
            }
        }
        System.out.println("大文字数は"+bigCount+"個");
        System.out.println("小文字数は"+smallCount+"個");
        System.out.println("数字は"+numberCount+"個");
    }
}
