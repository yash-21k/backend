package pushkar.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pushkar.backend.entity.PatientData;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientData, Long> {
//    List<PatientData> findByPatientDateOfAdmission(Date date);

}