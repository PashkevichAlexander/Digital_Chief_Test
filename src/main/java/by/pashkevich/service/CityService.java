package by.pashkevich.service;

import by.pashkevich.entity.City;

import java.util.List;

public interface CityService {
    City get(Long id);

    List<City> getAll();

    City save(City city);

    void delete(Long id);
}
