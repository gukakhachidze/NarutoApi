package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Chakra;
import ge.guka.SpringApi.naruto.model.Character;
import ge.guka.SpringApi.naruto.model.Jutsu;
import ge.guka.SpringApi.naruto.model.Mission;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MissionService {
    private final List<Mission> listOfMissions = new ArrayList<>();

    @PostConstruct
    void setup(){
        Jutsu rasengan = new Jutsu("Rasengan", "Ninjutsu", 50, "A");
        Jutsu shadowClone = new Jutsu("Shadow Clone", "Ninjutsu", 30, "B");
        Character naruto = new Character(
                1,
                "Naruto",
                "Hidden Leaf",
                15,
                "Genin",
                new Chakra("Fire", 5, true)
        );

        naruto.addJutsu(rasengan);
        naruto.addJutsu(shadowClone);

        Mission killOrochimaru = new Mission(
                "Kill Orochimaru",
                "S",
                false
        );

        killOrochimaru.addNinjaToMission(naruto);
        listOfMissions.add(killOrochimaru);
    }

    public List<Mission> getMissions(){
        return listOfMissions;
    }

    public Mission getMissionById(int id){
        for (Mission mission : listOfMissions){
            if (mission.getId() == id){
                return mission;
            }
        }
        return null;
    }

    public Mission addMission(Mission mission){
        if (mission == null || mission.getName() == null){
            return null;
        }

        listOfMissions.add(mission);
        return mission;
    }

    public Mission updateMission(Mission requestMission){
        if (requestMission == null || requestMission.getName() == null){
            return null;
        }

        Mission missionToUpdate = getMissionById(requestMission.getId());
        missionToUpdate.setName(requestMission.getName());
        missionToUpdate.setRank(requestMission.getRank());
        missionToUpdate.setDone(requestMission.getDone());
        missionToUpdate.setAssignedNinjas(requestMission.getAssignedNinjas());
        return missionToUpdate;
    }

    public boolean removeMission(int id){
        if (id < 0){
            return false;
        }

        Mission missionToDelete = getMissionById(id);
        if (missionToDelete == null){
            return false;
        }

        listOfMissions.remove(missionToDelete);
        return true;
    }



}
