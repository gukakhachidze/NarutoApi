package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Chakra;
import ge.guka.SpringApi.naruto.model.Character;
import ge.guka.SpringApi.naruto.model.Clan;
import ge.guka.SpringApi.naruto.model.Jutsu;
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
                1,
                "Sasuke Uchiha",
                "Hidden Leaf",
                16,
                "Genin",
                new Chakra("Fire", 10, true)
        );

        sasuke.addJutsu(chidori);
        sasuke.addJutsu(shadowClone);

        Clan uchiha = new Clan(1,"Uchihas");
        uchiha.addSpecialAbilities("Sharingan");
        uchiha.addCharacter(sasuke);

        listOfClans.add(uchiha);
    }

    public Clan getClanById(int id){
        for (Clan clan : listOfClans){
            if (clan.getId() == id){
                return clan;
            }
        }
        return null;
    }

    public boolean addClan(Clan clan){
        Clan ifExitsClan = getClanById(clan.getId());

        if (ifExitsClan != null && clan.getName() == null){
            return false;
        }

        listOfClans.add(clan);
        return true;
    }

    public boolean deleteClan(int id){
        Clan clanToRemove = getClanById(id);

        if (clanToRemove == null){
            return false;
        }
        listOfClans.remove(clanToRemove);
        return true;
    }

    public boolean updateClan(Clan clan){
        Clan clanToUpdate = getClanById(clan.getId());
        if (clanToUpdate != null){
            clanToUpdate.setName(clan.getName());
            clanToUpdate.setMembers(clan.getMembers());
            clanToUpdate.setSpecialAbilities(clan.getSpecialAbilities());
            return true;
        }
        return false;
    }

    List<Clan> getClans(){
        return listOfClans;
    }
}
