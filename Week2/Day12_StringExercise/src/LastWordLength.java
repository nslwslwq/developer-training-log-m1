public class LastWordLength {
    public static void main(String[] args) {

        String str = "I want to go to sleep";
        char[] c = str.toCharArray();
        int a = 0;
        for (int i = c.length-1; i >=0 ; i--) {
            if(c[i]==' '){
                break;
            }a++;
        }System.out.println(a);
    }
}
