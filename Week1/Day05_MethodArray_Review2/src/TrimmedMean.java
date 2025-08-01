import java.util.Scanner;
public class TrimmedMean {
    public static void main(String[] args){
        int[] values = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ;i < 6; i++){
            System.out.println("審査員の採点を入力してください");
            int score = sc.nextInt();
            values[i] = score;
        }
        System.out.println(average(values));
    }
    public static double average(int[] scores){
        int max = scores[0];
        int min = scores[0];
        int sum = scores[0];
        for(int i=1; i < scores.length;i++){
            sum += scores[i];
            if (max < scores[i]){
                max = scores[i];
            }
            if(min > scores[i]){
                min = scores[i];
            }
        }sum -= (max+min);
        return (double)sum / (scores.length-2);
    }
}
