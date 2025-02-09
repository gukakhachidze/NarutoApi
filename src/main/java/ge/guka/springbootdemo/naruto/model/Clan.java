package ge.guka.springbootdemo.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Clan {

    private String name;
    private List<String> specialAbilities;
    private List<Character> members;

    public Clan(String name){
        this.name = name;
        specialAbilities = new ArrayList<>();
        members = new ArrayList<>();
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
