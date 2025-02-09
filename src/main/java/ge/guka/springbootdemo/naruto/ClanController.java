package ge.guka.springbootdemo.naruto;

import ge.guka.springbootdemo.naruto.model.Clan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

