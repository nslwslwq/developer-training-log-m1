import java.util.Scanner;
public class PasswordEncoder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        int password = sc.nextInt();
        System.out.println(encryptPassword(password));
    }

    public static StringBuilder encryptPassword(int a){
        StringBuilder encrypted = new StringBuilder();
        while(a>0){
            int digit = a % 10;
            a = a / 10;
            int transformedDigit = (digit+5) % 10;
            encrypted.append(transformedDigit);
        }return encrypted;
    }
}
