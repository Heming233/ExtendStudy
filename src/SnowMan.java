public class SnowMan {
    private  String name;
    private int snowWeight;
    private int nose;
    private int eyes;
    private int hands;

    SnowMan(String name,int snowWeight,int nose,int eyes,int hands){
        this.name=name;
        this.snowWeight=snowWeight;
        this.nose=nose;
        this.eyes=eyes;
        this.hands=hands;
    }

    void setSnowWeight(int weight){
        this.snowWeight=weight;
    }

    void setNose(int nose){
        this.nose=nose;
    }

    void setEyes(int eyes){
        this.eyes=eyes;
    }

    void setHands(int hands){
        this.hands=hands;
    }

    String getName(){
        return name;
    }

    public static void SnowMelt(SnowMan man){
        man.setEyes(0);
        man.setHands(0);
        man.setNose(0);
        System.out.println("This man called "+man.getName()+" melts");
    }
}
