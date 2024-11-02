package pushkar.backend.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "patient_data")
public class PatientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientName;
    private long patientRegisteredNumber;
    private int patientAge;
    private String patientGender;
    private String patientAddress;
    private Timestamp patientAdmission;
    private Timestamp patientDischarge;
    private String patientConsultedBy;
    private String Diagnosis;
    private String clinicalSummary;
    private String vision;
    private String k1;
    private String k2;
    private String AXL;
    private String IOL;
    private String fundus;
    private String SAC;
    private String IOP;
    private String HB;
    private String BSL;
    private String urineType;

    @Column(length = 65555)
    private String Rx;

    private String operationNotes;
    private String postOperationNotes;
    private String followUp;





}
