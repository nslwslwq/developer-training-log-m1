import java.util.Scanner;
public class CarTest3 {
    public static void main(String[] args){
        Car[] arr = new Car[4];

        Car c1 = new Car("トヨタ",300,"白");
        Car c2 = new Car("マズダ",500,"黒");
        Car c3 = new Car("ホンダ",350,"グレー");
        Car c4 = new Car();
        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;

        Scanner sc = new Scanner(System.in);
        System.out.println("クルマのブランドを入力したください");
        String a = sc.next();
        for(int i =0; i < count(arr) ; i++){
            String c0 = arr[i].getBrand();
            if (c0.equals(a)){
                System.out.println("このクルマのブランド名すでに存在しています");
                break;
            }
            if(i==count(arr)-1){
                c4.setBrand(a);
                System.out.println("クルマの値段を入力してください");
                c4.setPrice(sc.nextInt());
                System.out.println("クルマの色を入力してください");
                c4.setColor(sc.next());
                arr[3] = c4;
                break;
            }

        }
        System.out.println("在庫のクルマは：");
        for (int j=0 ; j< count(arr) ; j++){
            Car c0 = arr[j];
            System.out.println(c0.getBrand()+","+c0.getPrice()+","+c0.getColor());
        }
        System.out.println("削除するブランド名を入力してください");
        String b = sc.next();
        for (int k = 0; k < count(arr) ; k++){
            String c0 = arr[k].getBrand();
            if (c0.equals(b)){
                for (int i =k; i<count(arr)-1;i++){
                    arr[i]=arr[i+1];
                }
                arr[count(arr)-1]=null;
                break;
            }
            if(k == count(arr)-1){
                System.out.println("エラー：ブランド名が存在ません");
            }
        }
        System.out.println("検索するブランド名を入力してください");
        String c = sc.next();
        for (int i = 0; i < count(arr); i++){
            String c0 = arr[i].getBrand();
            if(c0.equals(c)){
                arr[i].setPrice(arr[i].getPrice()+10);
            }
            if (i == count(arr)-1){
                System.out.println("エラー：ブランド名が存在ません");
            }
        }
        System.out.println("在庫のクルマは：");
        for (int j=0 ; j< count(arr) ; j++){
            Car c0 = arr[j];
            System.out.println(c0.getBrand()+","+c0.getPrice()+","+c0.getColor());
        }
    }
    public static int count(Car[] arr){
        for(int i= 0; i<arr.length;i++){
            if(arr[i]==null){
                return i;
            }
        }return arr.length;
    }
}
