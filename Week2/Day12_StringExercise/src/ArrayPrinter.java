public class ArrayPrinter {
    public static void main(String[] args) {
        System.out.println(arrToStr(new int[]{1,2,3,4,5}));
    }
    public static String arrToStr(int[] arr){
        StringBuilder sb = new StringBuilder("[").append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            sb.append(",").append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
