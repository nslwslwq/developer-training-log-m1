import java.util.Random;
public class RandomCharStringGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        int a = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            char d;
            if(i==a){
                sb.append(r.nextInt(10));
            }else{
                if(r.nextInt(2)==0){
                    d = (char)('a'+ r.nextInt(26));
                }else{
                    d = (char)('A'+ r.nextInt(26));
                }sb.append(d);
            }
        }System.out.println("生成されたランダム文字列：" + sb);
    }
}
