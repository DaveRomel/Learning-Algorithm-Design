package mx.utm.LearningAD.data;
import mx.utm.LearningAD.model.Career;
import mx.utm.LearningAD.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

public class StudentRepositoryJdbc implements StudentRepository
{
    private JdbcTemplate jdbcTemplate;

    public StudentRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student findId(long id)
    {   Object[] args = { id };
        return jdbcTemplate.queryForObject("select * from students where id = ?", args, studentMapper);
    }

    @Override
    public Collection<Student> findAll()
    {
        return jdbcTemplate.query("select * from students", studentMapper);
    }

    private static RowMapper<Student> studentMapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("surname"),
                    resultSet.getString("gender"),
                    resultSet.getString("birthday"),
                    resultSet.getString("city"),
                    Career.valueOf(resultSet.getString("career")),
                    resultSet.getString("email"),
                    resultSet.getString("user"),
                    resultSet.getString("pass"),
                    resultSet.getInt("rol"),
                    resultSet.getFloat("score")
            );
        }
    };

    @Override
    public void saveUpdate(Student student)
    {
        jdbcTemplate.update("insert into students (name, surname, gender, birthday, city, career, email, user, pass, rol, score) values (?,?,?,?,?,?,?,?,?,?,?)",
                student.getName(), student.getSurname(), student.getGender(), student.getBirthday(), student.getCity(), student.getCareer().toString(),
                student.getEmail(), student.getUser(), student.getPass(), student.getRol(),student.getScore());

    }
}
