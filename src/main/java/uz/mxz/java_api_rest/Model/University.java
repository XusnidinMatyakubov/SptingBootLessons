package uz.mxz.java_api_rest.Model;

/**
 * Created By hamdamboy
 * Project: spring-demo-start
 * Date: 22/09/22
 * Email: hamdamboy.urunov@gmail.com
 */
public class University {
    private Long id;
    private String uName;
    private String kurs;
    private String guruh;
    private String familya;
    private String ism;

    public University() {
    }

    public University(Long id, String uName, String kurs, String guruh, String familya, String ism) {
        this.id = id;
        this.uName = uName;
        this.kurs = kurs;
        this.guruh = guruh;
        this.familya = familya;
        this.ism = ism;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm(String ism) {
        return this.ism;
    }

    public University(String kurs) {
        this.kurs = kurs;
    }

    public University(String familya, String ism) {
        this.familya = familya;
        this.ism = ism;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public String getGuruh() {
        return guruh;
    }

    public void setGuruh(String guruh) {
        this.guruh = guruh;
    }

    public String getFamilya() {
        return familya;
    }

    public void setFamilya(String familya) {
        this.familya = familya;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }
}


// Parameters
// 2 methods (GET) and API Postman test qilasiz.