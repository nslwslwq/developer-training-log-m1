import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args){
        String id = "nslwslwq";
        String password = "nslnslnsl";

        for (int i=0; i<3 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("IDを入力してください");
            String a = sc.next();
            System.out.println("パスワードを入力してください");
            String b = sc.next();
            if (a.equals(id)){
                if(b.equals(password)){
                    System.out.println("ログイン成功");
                    break;
                }else{
                    System.out.println("IDまたはパスワードが間違っています(残り"+(2-i)+"回)");
                    if(i==2){
                        System.out.println("3回のチャンスがおわりました");
                    }
                }
            }else{
                System.out.println("このIDはまだ登録されていません(残り"+(2-i)+"回)");
            }
        }
    }
}
