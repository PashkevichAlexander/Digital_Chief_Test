package by.pashkevich.service;


import by.pashkevich.entity.Restaurants;

import java.util.List;

public interface RestaurantsService {
    Restaurants get(Long id);

    List<Restaurants> getAll();

    Restaurants save(Restaurants restaurants);

    void delete(Long id);
}
