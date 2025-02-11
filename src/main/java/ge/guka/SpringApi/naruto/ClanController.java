package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Clan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.PreparedStatement;
import java.util.List;

@RestController
@RequestMapping("clan")

public class ClanController {

    private final ClanService clanService;

    public ClanController(ClanService clanService) {
        this.clanService = clanService;
    }

    @GetMapping
    List<Clan> getClans(){
        return clanService.getClans();
    }

    @GetMapping("{id}")
    ResponseEntity<Clan> getClan(@PathVariable int id){
        Clan clan = clanService.getClanById(id);
        if (clan != null){
            return ResponseEntity.ok(clan);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    ResponseEntity<Clan> updateClan(@PathVariable int id, @RequestBody Clan clan){
        if (clanService.updateClan(clan)){
            Clan responsClan = clanService.getClanById(clan.getId());
            return ResponseEntity.ok(responsClan);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("add")
    ResponseEntity<Clan> addClan(@RequestBody Clan clan){
        if (clanService.addClan(clan)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    ResponseEntity<Clan> deleteClan(@PathVariable int id){
        if (clanService.deleteClan(id)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}

