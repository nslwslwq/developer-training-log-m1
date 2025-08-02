public class CarTest1 {
    public static void main(String[] args){
        Car[] arr = new Car[3];

        Car c1 = new Car("トヨタ",300,"白");
        Car c2 = new Car("マズダ",500,"黒");
        Car c3 = new Car("ホンダ",350,"グレー");

        arr[0] = c1;
        arr[1] = c2;
        arr[2] = c3;
        int sum = 0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i].getPrice();
        }
        double avg = (double)sum/arr.length;
        System.out.println(avg);
        for (int j=0; j<arr.length;j++){
            Car c0 = arr[j];
            if (c0.getPrice() < avg){
                System.out.println(c0.getBrand()+","+c0.getPrice()+","+c0.getColor());
            }
        }
    }
}
