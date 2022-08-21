package one.digitalinnovation.diocloudpark.repository;


import one.digitalinnovation.diocloudpark.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
