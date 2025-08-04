public class MethodPractice {
    public static void main(String[] args){
        String b = str(new int[] {1,2,3} );
        String c = str2("ndsjdf");
        System.out.println(b);
        System.out.println(c);
    }
    public static String str(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                result += arr[i];
            }else{
                result += arr[i]+",";
            }
        }return result + "]";
    }
    public static String str2(String str0){
        if(str0.length() == 0){
            return "";
        }
        String b = "";
        for(int i=0;i<str0.length();i++){
            char a = str0.charAt(i);
            b = a + b;
        }return b;
    }
}
