import java.util.Scanner;
public class ChineseNumberFormatter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr1 = {"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
        String[] arr2 = {"", "拾", "佰", "仟"};
        String[] arr3 = {"", "萬", "億"};
        System.out.println("金額を入力してください");
        String str = sc.next();
        String result = "";
        int e = str.length();
        for(int i =0; i<e;i++){
            int c = str.charAt(i) -'0';
            if(i<e-1){
                int d = str.charAt(i+1) -'0';
                if (c==0){
                    if(d!=0){
                        result += "零";
                    }
                }else if(c==1 && (e-i-1)%4==1 && i==0){
                    result += arr2[(e-i-1)%4];
                }else {
                    result += arr1[c] + arr2[(e - i - 1) % 4];
                }
                if((e-i)%4==1){
                        result += arr1[c]+arr2[(e-i-1)%4]+arr3[(e-i-1)/4];
                        continue;
                }
            }if(i==e-1 && c!=0){
                result += arr1[c];
            }
        }System.out.println(result+"円");
    }
}
