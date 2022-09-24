package uz.mxz.java_api_rest.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.mxz.java_api_rest.Model.Student;

/**
 * @project: spring-demo-start
 * @Date: 20.09.2022
 * @author: H_Urunov
 **/

@RestController
public class StudentController {
    //
    @GetMapping("/testagain")
    public String test(){
        return "Hello Test";
    }

    /*
    * This method:
    * @RequestParam(required = false) String firstName - is not mandatory
    * Default value: required = true.
    * */
    @GetMapping("/student")
    public Student studentMethod(@RequestParam(required = false) String firstName, @RequestParam String lastName){

        Student student = new Student(firstName, lastName);
        return student;
    }

    @GetMapping("/studentname")
    public ResponseEntity<?> studentByName(@RequestParam String firstName){
        Student student = new Student(firstName);
        student.setFirstName("Sitora");

       // step-1. Just return firstName (String)
       // return ResponseEntity.ok(student);
       // step-2. Ignore Annatation.
        return ResponseEntity.ok(student.getFirstName());
    }

}
//http://localhost:8080/test

/*
*  1. PPT organish
*  2. Method GETMAPPING
*    - firstName
* */