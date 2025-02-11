package ge.guka.SpringApi.naruto.model;

import java.util.ArrayList;
import java.util.List;

public class Mission {

    private int id;
    private String name;
    private String rank;
    private List<Character> assignedNinjas;
    private boolean isDone;

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setAssignedNinjas(List<Character> assignedNinjas) {
        this.assignedNinjas = assignedNinjas;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Mission(String name, String rank, boolean isDone) {
        this.id = id;
        this.name = name;
        this.rank = rank;
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

    public boolean getDone() {
        return isDone;
    }

    public int getId() {
        return id;
    }

    public void addNinjaToMission(Character ninja) {
        if (ninja != null) {
            assignedNinjas.add(ninja);
        }

    }
}
