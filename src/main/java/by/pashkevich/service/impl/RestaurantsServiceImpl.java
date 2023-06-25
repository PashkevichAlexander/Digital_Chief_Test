package by.pashkevich.service.impl;

import by.pashkevich.entity.Restaurants;
import by.pashkevich.repository.RestaurantsRepository;
import by.pashkevich.service.RestaurantsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurantsServiceImpl implements RestaurantsService {

    private final RestaurantsRepository restaurantsRepository;

    @Override
    public Restaurants get(Long id) {
        return restaurantsRepository.findById(id).orElseThrow(() -> new RuntimeException("Cant find Restaurants by id"));
    }

    @Override
    public List<Restaurants> getAll() {
        return restaurantsRepository.findAll();
    }

    @Override
    public Restaurants save(Restaurants restaurants) {
        return restaurantsRepository.save(restaurants);
    }

    @Override
    public void delete(Long id) {
        restaurantsRepository.deleteById(id);
    }
}
