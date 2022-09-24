package uz.mxz.java_api_rest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.mxz.java_api_rest.Model.Student;
import uz.mxz.java_api_rest.Model.University;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversityController {

    @GetMapping("/hello")
    public ResponseEntity<?> studentByName(@RequestParam String ism){
        University university = new University(ism);
        university.setIsm(ism);
        return ResponseEntity.ok("Hello "+university.getIsm(ism));
    }

    @GetMapping("/university")
    public ResponseEntity getName(){
        University university = new University();
        university.setuName("Andijon Davlat Universiteti");
        return ResponseEntity.ok(university.getuName());
    }

    @GetMapping("/students")
    public ResponseEntity getAll(){
        University university1 = new University(1L,"ADU", "4-kurs","100-guruh", "Matyaqubov", "Xusnidin");
        University university2 = new University(2L,"BI", "4-kurs","200-guruh", "Ergashev", "Sarvar");

        List<University> universityList = new ArrayList<>();
        universityList.add(university1);
        universityList.add(university2);

        return ResponseEntity.ok(universityList);
    }
}
