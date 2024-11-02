package pushkar.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pushkar.backend.entity.PatientData;
import pushkar.backend.service.PatientService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pushkareye")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public ResponseEntity<PatientData> addPatient(@RequestBody PatientData patientData) {
        return new ResponseEntity<PatientData>(this.patientService.addPatient(patientData), HttpStatus.OK);
    }

    @GetMapping("/viewPatientByID/{id}")
    public ResponseEntity<PatientData> getPatientByID(@PathVariable long id) {
        return new ResponseEntity<PatientData>(this.patientService.getPatientById(id), HttpStatus.OK);
    }

    @GetMapping("/getAllPatients")
    public ResponseEntity<List<PatientData>> getAllPatients() {
        return new ResponseEntity<List<PatientData>>(this.patientService.getAllPatients(),HttpStatus.OK);
    }
}
