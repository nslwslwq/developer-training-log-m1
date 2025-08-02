import java.util.Scanner;
public class CarTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];

        for(int i =0; i<arr.length; i++){
            System.out.println("クルマのブランド名を入力してください");
            String brand = sc.next();
            System.out.println("クルマの値段を入力してください（万円）");
            int price = sc.nextInt();
            System.out.println("クルマの色を入力したください");
            String color = sc.next();
            Car c0 = new Car(brand,price,color);
            arr[i] = c0;
        }
        for (int j=0; j<arr.length; j++){
            Car cars = arr[j];
            System.out.println(cars.getBrand()+","+cars.getPrice()+","+cars.getColor());
        }
    }
}
