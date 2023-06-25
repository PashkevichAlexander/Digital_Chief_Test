package by.pashkevich.controllers;

import by.pashkevich.entity.Attractions;
import by.pashkevich.entity.City;
import by.pashkevich.service.AttractionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/attractions")
public class AttractionController {

    private final AttractionsService attractionsService;

    @GetMapping("/all")
    public List<Attractions> getAll(){
        return attractionsService.getAll();
    }

    @GetMapping("/get")
    @ResponseBody
    public Attractions get(@RequestParam long id){
        return attractionsService.get(id);
    }

    @PostMapping("/post")
    public Attractions add(@RequestBody Attractions attractions){
        return attractionsService.save(attractions);
    }

    @GetMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam long id){
        attractionsService.delete(id);
    }
}
