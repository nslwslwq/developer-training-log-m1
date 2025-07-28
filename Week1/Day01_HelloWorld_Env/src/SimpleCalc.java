import java.util.Scanner;
public class SimpleCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("一つ目の整数を入力してください");
        int a = sc.nextInt();
        System.out.print("もう一つ目の整数を入力してください");
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.print("二つの和は" + sum);
        System.out.print("二つの積は" + product);
    }
}
