public class Tom extends SnowMan{

    Tom(String name, int snowWeight, int nose, int eyes, int hands) {
        super(name, snowWeight, nose, eyes, hands);
    }

    public static void main(String[] args) {
        Tom tom=new Tom("tom",10,1,2,2);
        System.out.println(tom.getName());
        SnowMan.SnowMelt(tom);//向上转型
    }
}
