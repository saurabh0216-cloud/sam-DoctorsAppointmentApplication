package controller;

import model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.DoctorRepository;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
     @Autowired
     private DoctorRepository doctorRepository;

    @GetMapping("/all")
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
    @PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }


}
