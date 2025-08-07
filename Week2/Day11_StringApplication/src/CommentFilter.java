import java.util.Scanner;
public class CommentFilter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("コメント：");
        String str = sc.next();
        String[] dirty = {"死ね","shine"};
        for (int i = 0; i < dirty.length; i++){
            str = str.replace(dirty[i],"****");
        }System.out.println(str);
    }
}
