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
    public List<Restaurants> getAll(){
        return restaurantsService.getAll();
    }

    @GetMapping("/all")
    public Restaurants get(@RequestParam long id){
        return restaurantsService.get(id);
    }

    @PostMapping ("/post")
    public Restaurants save(@RequestBody Restaurants restaurants){
        return restaurantsService.save(restaurants);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam long id){
        restaurantsService.delete(id);
    }
}
