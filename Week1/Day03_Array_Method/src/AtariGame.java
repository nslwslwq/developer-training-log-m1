public class AtariGame {
    public static void main(String[] args){
        int[] numbers = {3,4,9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int value:numbers){
            if(value==input){
                System.out.println("アタリ！");
                break;
            }
        }
    }
}
