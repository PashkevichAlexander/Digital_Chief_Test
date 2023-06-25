package by.pashkevich.service.impl;

import by.pashkevich.entity.City;
import by.pashkevich.repository.CityRepository;
import by.pashkevich.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;


    @Override
    public City get(Long id) {
        return cityRepository.findById(id).orElseThrow(() -> new RuntimeException("Cant find City by id"));
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void delete(Long id) {
        cityRepository.deleteById(id);
    }
}
