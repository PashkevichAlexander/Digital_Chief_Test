package by.pashkevich.controllers;

import by.pashkevich.entity.City;
import by.pashkevich.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/city")
public class CityController {
    private final CityService cityService;

    @GetMapping("/all")
    public List<City> getAll() {
        return cityService.getAll();
    }

    @GetMapping("/{id}")
    public City get(@PathVariable Long id) {
        return cityService.get(id);
    }

    @PostMapping
    public City save(@RequestBody City city) {
        return cityService.save(city);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cityService.delete(id);
    }
}
