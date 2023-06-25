package by.pashkevich.service;

import by.pashkevich.entity.Attractions;

import java.util.List;

public interface AttractionsService {
    Attractions get(Long id);

    List<Attractions> getAll();

    Attractions save(Attractions attractions);

    void delete(Long id);
}
