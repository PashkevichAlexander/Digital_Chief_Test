package by.pashkevich.controllers;

import by.pashkevich.entity.City;
import by.pashkevich.repository.CityRepository;
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
    public List<City> getAll(){
        return cityService.getAll();
    }

    @GetMapping("/get")
    @ResponseBody
    public City get(@RequestParam long id){
        return cityService.get(id);
    }

    @PostMapping("/post")
    public City save (@RequestBody City city){
        return cityService.save(city);
    }

    @GetMapping("/delete")
    @ResponseBody
    public void delete(@RequestParam long id){
        cityService.delete(id);
    }
}
