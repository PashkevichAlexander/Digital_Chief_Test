package by.pashkevich.controllers;

import by.pashkevich.entity.Attractions;
import by.pashkevich.service.AttractionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
