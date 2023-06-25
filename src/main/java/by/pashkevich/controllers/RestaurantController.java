package by.pashkevich.controllers;

import by.pashkevich.entity.Restaurants;
import by.pashkevich.service.RestaurantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    private final RestaurantsService restaurantsService;

    @GetMapping("/all")
    public List<Restaurants> getAll() {
        return restaurantsService.getAll();
    }

    @GetMapping("/{id}")
    public Restaurants get(@PathVariable long id) {
        return restaurantsService.get(id);
    }

    @PostMapping
    public Restaurants save(@RequestBody Restaurants restaurants) {
        return restaurantsService.save(restaurants);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        restaurantsService.delete(id);
    }
}
