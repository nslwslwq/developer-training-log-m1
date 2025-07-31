import java.util.Scanner;
public class TicketPriceCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("航空券の定価を入力してください");
        double price = sc.nextDouble();
        System.out.println("ご購入予定の航空券の搭乗月を入力してください");
        int month = sc.nextInt();
        if(month>=1 && month<=12){
            System.out.println("ご希望の座席クラスを選択してください（1、ファーストクラス　2、エコノミークラス）");
            int seat = sc.nextInt();
            if(month>=5 && month<=10){
                price = discount(seat,price,0.9,0.85);
            }else{
                price = discount(seat,price,0.7,0.65);
            }
        }else{
            System.out.println("エラー：搭乗月は1から12までの数字を入力してください");
            return;
        }
        if (price!=-1) {
            System.out.println(price);
        }
    }
    public static double discount(int seat,double price,double firstClassRate,double ecoRate ){
        return switch(seat){
            case 1 -> price * firstClassRate;
            case 2 -> price * ecoRate;
            default -> {
                System.out.println("エラー：座席は「1」または「2」を選択してください");
                yield -1;
            }
        };
    }
}
