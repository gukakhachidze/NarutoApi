package ge.guka.springbootdemo.naruto.model;

public class Jutsu {

    private String name;
    private String type;
    private int chakraCost;
    private String rank;

    public Jutsu(String name, String type, int chakraCost, String rank){
        this.name = name;
        this.type = type;
        this.chakraCost = chakraCost;
        this.rank = rank;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getChakraCost() {
        return chakraCost;
    }

    public String getRank() {
        return rank;
    }
}
