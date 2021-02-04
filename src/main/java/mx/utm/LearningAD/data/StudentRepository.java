package mx.utm.LearningAD.data;
import java.util.Collection;
import mx.utm.LearningAD.model.Student;

public interface StudentRepository
{
    Student findId(long id);
    Collection<Student> findAll();
    void saveUpdate(Student student);
}
