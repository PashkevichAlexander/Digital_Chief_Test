package by.pashkevich.repository;


import by.pashkevich.entity.Attractions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionsRepository extends JpaRepository<Attractions, Long> {
}
