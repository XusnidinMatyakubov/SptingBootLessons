package uz.mxz.java_api_rest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @project: spring-demo-start
 * @Date: 20.09.2022
 * @author: H_Urunov
 **/
public class Student {
    private String firstName;
   // step-2. For ignore entity data value
   // @JsonIgnore
    private String lastName;

    public Student(String firstName){
        this.firstName = firstName;
    }
    public Student(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
