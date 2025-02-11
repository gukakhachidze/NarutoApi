package ge.guka.SpringApi.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Clan {

    private int id;
    private String name;
    private List<String> specialAbilities;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialAbilities(List<String> specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public void setMembers(List<Character> members) {
        this.members = members;
    }

    private List<Character> members;

    public Clan(int id,String name){
        this.id = id;
        this.name = name;
        specialAbilities = new ArrayList<>();
        members = new ArrayList<>();
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public List<String> getSpecialAbilities(){
        return specialAbilities;
    }

    public List<Character> getMembers(){
        return members;
    }

    public void addSpecialAbilities(String ability){
        if (ability != null){
            specialAbilities.add(ability);
        }
    }

    public void addCharacter(Character ninja){
        if (ninja != null){
            members.add(ninja);
        }
    }
}
