package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Chakra;
import ge.guka.SpringApi.naruto.model.Character;
import ge.guka.SpringApi.naruto.model.Jutsu;
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
                1,
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
                2,
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

    public boolean addCharacter(Character ninja){
        Character findNinja = getNinjaById(ninja.getId());

        if (ninja != null && ninja.getName() != null && findNinja == null){
            characterList.add(ninja);
            return true;
        }

        return false;
    }

    public Character getNinjaById(int id){

        if (!characterList.isEmpty()){
            for (Character ninja : characterList){
                if (ninja.getId() == id){
                    return ninja;
                }
            }
        }
        return null;
    }

    public boolean deleteNinjaFromList(int id){
        Character isNinjaInList = getNinjaById(id);

        if (isNinjaInList != null){
            characterList.remove(isNinjaInList);
            return true;
        }
        return false;
    }

    public boolean updateNinja(int id, Character ninja){
        Character ninjaForUpdate = getNinjaById(id);
        if (ninja.getName() != null){
            ninjaForUpdate.setName(ninja.getName());
            ninjaForUpdate.setVillage(ninja.getVillage());
            ninjaForUpdate.setAge(ninja.getAge());
            ninjaForUpdate.setRank(ninja.getRank());
            ninjaForUpdate.setChakra(ninja.getChakra());
            ninjaForUpdate.setJutsus(ninja.jutsus);
            return true;
        }
        return false;
    }


}
