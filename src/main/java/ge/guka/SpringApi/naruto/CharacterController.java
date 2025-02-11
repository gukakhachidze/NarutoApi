package ge.guka.SpringApi.naruto;

import ge.guka.SpringApi.naruto.model.Character;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    List<Character> getCharacters(){
        return characterService.getCharacterList();
    }

    @PostMapping("add")
    ResponseEntity<Character> addCharacter(@RequestBody Character ninja){
        if (characterService.addCharacter(ninja)){
            return ResponseEntity.ok(ninja);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("{id}")
    ResponseEntity<Character> getCharacterById(@PathVariable int id){
        Character ninja = characterService.getNinjaById(id);
        if (ninja != null){
            return ResponseEntity.ok(ninja);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    ResponseEntity<Character> deleteCharacter(@PathVariable int id){
        if (characterService.deleteNinjaFromList(id)){
            Character deletedNinja = characterService.getNinjaById(id);
            return ResponseEntity.ok(deletedNinja);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    ResponseEntity<Character> updateNinja(@PathVariable int id,@RequestBody Character ninja){
        if (characterService.updateNinja(id,ninja)){
            Character updatedNinja = characterService.getNinjaById(id);
            return ResponseEntity.ok(updatedNinja);
        }
        return ResponseEntity.notFound().build();
    }
}
