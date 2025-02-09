package ge.guka.springbootdemo.naruto;

import ge.guka.springbootdemo.naruto.model.Chakra;
import ge.guka.springbootdemo.naruto.model.Character;
import ge.guka.springbootdemo.naruto.model.Jutsu;
import ge.guka.springbootdemo.naruto.model.Mission;
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
