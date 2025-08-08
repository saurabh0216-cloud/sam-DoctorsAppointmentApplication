package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<model.Doctor, Long> {
    // Additional query methods can be defined here if needed
}
