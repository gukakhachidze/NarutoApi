package ge.guka.springbootdemo.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Mission {

    private String name;
    private String rank;
    private List<Character> assignedNinjas;
    private boolean isDone;

    public Mission(String name, String rank, boolean isDone){
        this.name = name;
        this.rank =rank;
        this.isDone = isDone;
        this.assignedNinjas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public List<Character> getAssignedNinjas() {
        return assignedNinjas;
    }

    public boolean isDone() {
        return isDone;
    }

    public void addNinjaToMission(Character ninja){
        if (ninja != null){
            assignedNinjas.add(ninja);
        }

    }
}
