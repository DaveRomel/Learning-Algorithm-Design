package mx.utm.LearningAD.service;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import mx.utm.LearningAD.model.Career;
import mx.utm.LearningAD.model.Student;
import org.hamcrest.CoreMatchers;
import mx.utm.LearningAD.data.StudentRepository;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class StudentServiceTest {

    private StudentService studentService;

    @Before
    public void setUp() throws Exception {
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        Mockito.when(studentRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Student(123,"Jose","López", "Male", "29/01/90", "Victoria", Career.Diseño, "joselo@utm.mx", "Joselo2","Lopez23",2,9.5F),
                        new Student(456,"Carmen","García", "Female", "30/01/90", "Merida", Career.Computación, "carga@utm.mx", "Carmen2", "Garcia23", 2,8.0F),
                        new Student(789,"Karina","Beltrán", "Female", "31/01/90", "Nuevo Leon", Career.Fisica, "karbe@utm.mx", "Karina2", "Beltran23",2, 9.4F)
                        //new Student(145,"Ángel","López", "Irapuato", Career.Computación, 9.6F),
                        //new Student(732,"Jose Roberto","Guzmán", "Cerdan", Career.Diseño,9.3F),
                        //new Student(733,"Juan Jose","Molina", "Matamoros", Career.Automotriz,9.6F),
                        //new Student(734,"Juana","Martínez", "Minatitlan", Career.Matematicas,9.8F),
                        //new Student(735,"Juan Pablo","Mendiola", "Poza Rica", Career.Fisica,9.7F),
                        //new Student(736,"Ana","Mendiola", "Leon", Career.Computación,9.6F),
                        //new Student(737,"Anabel","Mendiola", "Leon", Career.Diseño,9.7F),
                        //new Student(738,"Susana","Mendiola", "Leon", Career.Matematicas,9.8F),
                        //new Student(739,"Mariana","Medina", "Huajuapan de Leon", Career.Fisica,9.9F)
                )
        );
        studentService = new StudentService(studentRepository);
    }

    @Test
    public void return_students_by_carrer()
    {
        Collection<Student> students = studentService.findStudentByCareer(Career.Computación);
        List<Integer> studentsId = getIntegers(students);
        //assertThat(studentsId, CoreMatchers.is(Arrays.asList(456,145,736)));
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(456)));
    }

    @Test
    public void return_students_by_score()
    {
        Collection<Student> students = studentService.findStudentByScore(9.5F);
        List<Integer> studentsId = getIntegers(students);
        //assertThat(studentsId, CoreMatchers.is(Arrays.asList(123,145,733,734,735,736,737,738,739)));
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(123)));
    }

    //Name
    @Test
    public void return_students_by_name_0()
    {
        Collection<Student> students = studentService.findStudentByName("Jose");
        List<Integer> studentsId = getIntegers(students);
        //assertThat(studentsId, CoreMatchers.is(Arrays.asList(123,732,733)));
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(123)));
    }

    /*
    @Test
    public void return_students_by_name_1()
    {
        Collection<Student> students = studentService.findStudentByName("Juan");
        List<Integer> studentsId = getIntegers(students);
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(733,734,735)));
    }

    @Test
    public void return_students_by_name_2()
    {
        Collection<Student> students = studentService.findStudentByName("ana");
        List<Integer> studentsId = getIntegers(students);
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(734,738,739)));
    }

    @Test
    public void return_students_by_name_3()
    {
        Collection<Student> students = studentService.findStudentByName("Ana");
        List<Integer> studentsId = getIntegers(students);
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(736,737)));
    }*/

    //City
    @Test
    public void return_students_by_city_0()
    {
        Collection<Student> students = studentService.findStudentByCity("Victoria");
        List<Integer> studentsId = getIntegers(students);
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(123)));
    }

    @Test
    public void return_students_by_city_1()
    {
        Collection<Student> students = studentService.findStudentByCity("Leon");
        List<Integer> studentsId = getIntegers(students);
        //assertThat(studentsId, CoreMatchers.is(Arrays.asList(789,736,737,738,739)));
        assertThat(studentsId, CoreMatchers.is(Arrays.asList(789)));
    }

    private List<Integer> getIntegers(Collection<Student> students) {
        return students.stream().map(student -> student.getId()).collect(Collectors.toList());
    }
}