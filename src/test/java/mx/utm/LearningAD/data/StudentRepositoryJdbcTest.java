package mx.utm.LearningAD.data;

import mx.utm.LearningAD.model.Career;
import mx.utm.LearningAD.model.Student;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import mx.utm.LearningAD.util.StringUtils;
import static org.junit.Assert.assertEquals;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

public class StudentRepositoryJdbcTest
{
    private StudentRepositoryJdbc studentRepositoryJdbc;
    private DataSource dataSource;

    @Before
    public void setUp() throws Exception {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL;DB_CLOSE_DELAY=-1", "sa", "sa");
        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts\\test-data.sql"));
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        studentRepositoryJdbc = new StudentRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void load_all_students() throws SQLException {

        Collection<Student> students = studentRepositoryJdbc.findAll();
        MatcherAssert.assertThat(students, CoreMatchers.is(Arrays.asList(
                new Student(1, "Carlos", "López", "Male", "01/02/90", "Victoria", Career.Computación, "carlo@utm.mx", "Carlos2", "Lopez23", 2,9.2F)
                //new Student(2, "Karina", "Gonzáles", "Merida", Career.Diseño, 8.9F),
                //new Student(3, "Raquel", "Ramírez", "Nuevo Leon", Career.Computación, 9.5F)
        )));
    }

    @Test
    public void load_student_by_id() {
        Student student = studentRepositoryJdbc.findId(1);
        MatcherAssert.assertThat(student, CoreMatchers.is(new Student(1, "Carlos", "López", "Male", "01/02/90", "Victoria", Career.Computación, "carlo@utm.mx", "Carlos2", "Lopez23", 2,9.2F)));
    }

    /*
    @Test
    public void load_student_by_id() {
    Student student = studentRepositoryJdbc.findId(2);
    MatcherAssert.assertThat(student, CoreMatchers.is(new Student(2, "Karina", "Gonzáles", "Merida", Career.Diseño, 8.9F)));
    }

    @Test
    public void insert_a_student() {
        Student student = new Student("Alejandro", "Vallejo", "Male", "02/02/90", "Salamanca", Career.Computación, "Aleva@utm.mx", "Alejandro2", "Vallejo23", 2,8.8F);
        studentRepositoryJdbc.saveUpdate(student);
        Student studentFromDB = studentRepositoryJdbc.findId(2);
        MatcherAssert.assertThat(studentFromDB, CoreMatchers.is(new Student(2, "Alejandro", "Vallejo", "Male", "02/02/90", "Salamanca", Career.Computación, "Aleva@utm.mx", "Alejandro2", "Vallejo23", 2,8.8F)));
    }*/


    @Test
    public void insert_a_student() {
        Student student = new Student("Alejandro", "Vallejo", "Male", "02/02/90", "Salamanca", Career.Computación, "Aleva@utm.mx", "Alejandro2", "Vallejo23", 2,8.8F);
        studentRepositoryJdbc.saveUpdate(student);
        Student studentFromDB = studentRepositoryJdbc.findId(2);
        MatcherAssert.assertThat(studentFromDB, CoreMatchers.is(new Student(2, "Alejandro", "Vallejo", "Male", "02/02/90", "Salamanca", Career.Computación, "Aleva@utm.mx", "Alejandro2", "Vallejo23", 2,8.8F)));
    }

    @After
    public void tearDown() throws Exception {
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}