public class Main_method {
    public static void main(String[] args){
        introduceOneself("YUN",22,174,'馬');
        email("ご応募ありがとうございます！","nslwslwq@gamil.com","抽選により、この商品を当選しました！");
        email("nslwslwq@gmail.com","夏休みはどう過ごしましょうか");
        System.out.println("三角形の面積は"+ calcTriangleArea(10,5));
        System.out.println("円の面積は" + calcCirArea(5));
    }

    public static void introduceOneself(String name,int ages,double height,char zodiac){
        System.out.println("私の名前は"+name+"です。歳は"+ages+"歳です。身長は"+height+"です。十二支は" +
                "です。" );
    }
    public static void email(String title,String address,String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
    public static void email(String address,String text){
        System.out.println(address+ "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }
    public static double calcTriangleArea(double bottom,double height){
        return bottom*height/2;
    }
    public static double calcCirArea(double radius){
        return (radius * radius) * 3.14;
    }
}