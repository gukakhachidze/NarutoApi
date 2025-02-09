package ge.guka.springbootdemo.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private String name;
    private String village;
    private int age;
    private String rank;
    public List<Jutsu> jutsus;
    private Chakra chakra;

    public Character(
            String name,
            String village,
            int age,
            String rank,
            Chakra chakra

    ) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.rank = rank;
        this.chakra = chakra;
        this.jutsus = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getVillage(){
        return village;
    }

    public int getAge(){
        return age;
    }

    public String getRank(){
        return rank;
    }

    public Chakra getChakra(){
        return chakra;
    }

    public List<Jutsu> getJutsus(){
        return jutsus;
    }

    public void addJutsu(Jutsu jutsu){
        jutsus.add(jutsu);
    }

}

