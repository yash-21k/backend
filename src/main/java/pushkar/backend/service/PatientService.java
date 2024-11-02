package pushkar.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pushkar.backend.entity.PatientData;
import pushkar.backend.repository.PatientRepository;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public PatientData addPatient(PatientData patientData) {
        return this.patientRepository.save(patientData);
    }

    public List<PatientData> getAllPatients() {
        return this.patientRepository.findAll();
    }
    public PatientData getPatientById(long id) {
        return this.patientRepository.findById(id).get();
    }
//    public List<PatientData> getPatientsByDate(Date date) {
//        return this.patientRepository.findByPatientDateOfAdmission(date);
//    }

}
