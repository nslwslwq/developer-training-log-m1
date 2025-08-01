public class PrimeNumberFinder2 {
    public static void main(String[] args){
        System.out.println(findPrimesInRange(101,200));
    }

    public static String findPrimesInRange(int min,int max){
        boolean[] list = new boolean[max+1];
        int count = 0;
        StringBuilder sosuuBuilder = new StringBuilder();
        for (int i = 2; i<max+1; i++){
            if (! list[i]){
                if(i>=min && i<=max){
                    count++;
                    sosuuBuilder.append(i).append(" ");
                }
                for(int j=i*i ; j<max+1 ; j++){
                    if(j % i==0){
                        list[j] = true;
                    }
                }
            }
        }
        return String.format("全部%d個素数：%s",count,sosuuBuilder);
    }
}
