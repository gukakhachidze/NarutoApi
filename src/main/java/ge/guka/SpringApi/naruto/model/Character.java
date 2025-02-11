package ge.guka.SpringApi.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Character {

    private int id;
    private String name;
    private String village;
    private int age;
    private String rank;
    public List<Jutsu> jutsus;
    private Chakra chakra;

    public Character(
            int id,
            String name,
            String village,
            int age,
            String rank,
            Chakra chakra

    ) {
        this.id = id;
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

    public int getId(){ return id; }


    public void setName(String name) {
        this.name = name;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setChakra(Chakra chakra) {
        this.chakra = chakra;
    }

    public void setJutsus(List<Jutsu> jutsus){
        this.jutsus = jutsus;
    }
}

