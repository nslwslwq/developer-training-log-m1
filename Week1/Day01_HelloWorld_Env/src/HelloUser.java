import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("お名前は？");
        String name = sc.nextLine();
        System.out.println(name+"か！ようこそ！バックエンドの世界へ！");

    }
}
