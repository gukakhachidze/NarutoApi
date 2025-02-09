package ge.guka.springbootdemo.naruto;

import ge.guka.springbootdemo.naruto.model.Chakra;
import ge.guka.springbootdemo.naruto.model.Character;
import ge.guka.springbootdemo.naruto.model.Clan;
import ge.guka.springbootdemo.naruto.model.Jutsu;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClanService {

    private final List<Clan> listOfClans = new ArrayList<>();

    @PostConstruct
    void setup(){
        Jutsu chidori = new Jutsu("Chidori", "Ninjutsu", 50, "A");
        Jutsu shadowClone = new Jutsu("Shadow Clone", "Ninjutsu", 30, "B");
        Character sasuke = new Character(
                "Sasuke Uchiha",
                "Hidden Leaf",
                16,
                "Genin",
                new Chakra("Fire", 10, true)
        );

        sasuke.addJutsu(chidori);
        sasuke.addJutsu(shadowClone);

        Clan uchiha = new Clan("Uchihas");
        uchiha.addSpecialAbilities("Sharingan");
        uchiha.addCharacter(sasuke);

        listOfClans.add(uchiha);
    }

    List<Clan> getClans(){
        return listOfClans;
    }
}
