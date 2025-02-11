package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Mission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mission")
public class MissionController {

    private final MissionService missionService;

    public MissionController(MissionService missionService) {
        this.missionService = missionService;
    }

    @GetMapping
    List<Mission> getMassions(){
        return missionService.getMissions();
    }
}
