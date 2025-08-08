public class StringNumberMultiplier {
    public static void main(String[] args) {
        String num1 = "165";
        String num2 = "332";
        int result = num(num1)*num(num2);
        System.out.println("" + result);
    }
    public static int num(String str){
        char[] arr = str.toCharArray();
        int a = 0;
        for(char c : arr){
            a *= 10;
            a += c-'0';
        }return a;
    }
}
