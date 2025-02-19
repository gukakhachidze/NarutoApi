package ge.guka.SpringApi.naruto.model;

import java.util.List;

public class CharacterDTO {
    private int id;
    private String name;

    public CharacterDTO(String name, String village, int age, String rank, List<Jutsu> jutsus, Chakra chakra) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.rank = rank;
        this.jutsus = jutsus;
        this.chakra = chakra;
    }

    private String village;
    private int age;
    private String rank;
    public List<Jutsu> jutsus;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public List<Jutsu> getJutsus() {
        return jutsus;
    }

    public void setJutsus(List<Jutsu> jutsus) {
        this.jutsus = jutsus;
    }

    public Chakra getChakra() {
        return chakra;
    }

    public void setChakra(Chakra chakra) {
        this.chakra = chakra;
    }

    private Chakra chakra;
}
