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

    List<Mission> getMissions(){
        return listOfMissions;
    }
}
