package by.pashkevich.service.impl;

import by.pashkevich.entity.Attractions;
import by.pashkevich.repository.AttractionsRepository;
import by.pashkevich.service.AttractionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AttractionsServiceImpl implements AttractionsService {

    private final AttractionsRepository attractionsRepository;

    @Override
    public Attractions get(Long id) {
        return attractionsRepository.findById(id).orElseThrow(() -> new RuntimeException("Cant find object by id"));
    }

    @Override
    public List<Attractions> getAll() {
        return attractionsRepository.findAll();
    }

    @Override
    public Attractions save(Attractions attractions) {
        return attractionsRepository.save(attractions);
    }

    @Override
    public void delete(Long id) {
        attractionsRepository.deleteById(id);
    }
}
