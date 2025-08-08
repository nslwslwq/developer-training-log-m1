import java.util.Random;
import java.util.Scanner;
public class CharShuffler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("任意の内容を入力してください");
        String str = sc.next();
        char[] arr = str.toCharArray();
        char[] arrResult = arrRandom(arr);
        StringBuilder result = new StringBuilder();
        for (char c: arrResult) {
            result.append(c);
        }
        System.out.println(result);
    }
    public static char[] arrRandom(char[] arr){
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int b = r.nextInt(arr.length);
            char a = arr[i];
            arr[i] = arr[b];
            arr[b] = a;
        }
        return arr;
    }
}
