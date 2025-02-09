package ge.guka.springbootdemo.naruto;

import ge.guka.springbootdemo.naruto.model.Chakra;
import ge.guka.springbootdemo.naruto.model.Character;
import ge.guka.springbootdemo.naruto.model.Jutsu;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    private final List<Character> characterList = new ArrayList<>();


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
        characterList.add(naruto);

        Character kakashi = new Character(
                "Kakashi Hatake",
                "Hidden Leaf",
                35,
                "Sanin",
                new Chakra("Water", 99, true)
        );

        kakashi.addJutsu(rasengan);
        kakashi.addJutsu(shadowClone);
        characterList.add(kakashi);
    }

    List<Character> getCharacterList(){
        return characterList;
    }


}
