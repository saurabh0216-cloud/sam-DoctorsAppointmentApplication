package controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.PatientRepository;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Define methods to handle patient-related requests here
    @GetMapping("/all")
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
}
