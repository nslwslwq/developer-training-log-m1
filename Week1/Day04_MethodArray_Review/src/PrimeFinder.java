import java.util.ArrayList;
public class PrimeFinder {
    public static void main(String[] args){
        System.out.println(findPrimes(200));
    }

    public static ArrayList<Integer> findPrimes(int limit){
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=2; i<= limit ;i++){
            list.add(i);
        }
        for(int j=0;j<list.size();j++){
            for(int k=j+1;k<list.size();k++){
                if(list.get(k)%list.get(j)==0){
                    list.remove(k);
                    k--;
                }
            }
        }
        return list;
    }
}
