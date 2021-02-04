package mx.utm.LearningAD.model;

import java.util.Objects;
import mx.utm.LearningAD.util.StringUtils;
import static org.junit.Assert.assertEquals;

public class Student {

    private Integer id;
    private String name;
    private String surname;
    private String gender;
    private String birthday;
    private String city;
    private Career career;
    private String email;
    private String user;
    private String pass;
    private int rol;
    private float score;


    public Student(String name, String surname, String gender, String birthday,String city, Career career, String email, String user, String pass, int rol, float score) {
        this(null, name, surname, gender, birthday, city, career, email, user, pass, rol, score);
    }

    public Student(Integer id, String name, String surname, String gender, String birthday, String city, Career career, String email, String user, String pass, int rol, float score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.career = career;
        this.email = email;
        this.user = StringUtils.capitalLetter(user)?StringUtils.rigthSize(user)?user:null:null;
        this.pass = StringUtils.capitalLetter(pass)?StringUtils.rigthSize(pass)?user:null:null;
        this.rol = rol;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Career getCareer() {
        return career;
    }

    public float getScore() {
        return score;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public int getRol() {
        return rol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Float.compare(student.score, score) == 0 &&
                Integer.compare(student.rol,rol)== 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(birthday, student.birthday) &&
                Objects.equals(email, student.email) &&
                Objects.equals(user, student.user) &&
                Objects.equals(pass, student.pass) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(city, student.city) &&
                career == student.career;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, gender, birthday, career, city, email, user, pass, rol, score);
    }
}
