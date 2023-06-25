package by.pashkevich.controllers;

import by.pashkevich.entity.Attractions;
import by.pashkevich.service.AttractionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/attractions")
public class AttractionController {

    private final AttractionsService attractionsService;

    @GetMapping("/all")
    public List<Attractions> getAll() {
        return attractionsService.getAll();
    }

    @GetMapping("/{id}")
    public Attractions get(@PathVariable Long id) {
        return attractionsService.get(id);
    }

    @PostMapping
    public Attractions add(@RequestBody Attractions attractions) {
        return attractionsService.save(attractions);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        attractionsService.delete(id);
    }
}
