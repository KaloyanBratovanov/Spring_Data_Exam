package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import softuni.exam.models.entitites.Car;

import java.util.List;
import java.util.Set;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer > {


    @Query("SELECT c FROM Car c ORDER BY c.pictures.size desc, c.make")
    Set<Car> exportCars();
}
