package mx.utm.LearningAD.service;

import java.util.Collection;
import java.util.stream.Collectors;

import mx.utm.LearningAD.model.Career;
import mx.utm.LearningAD.model.Student;
import mx.utm.LearningAD.data.StudentRepository;

public class StudentService
{

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentRepository getStudentRepository() {
        return studentRepository;
    }

    public Collection<Student> findStudentByCareer(Career career)
    {
        return studentRepository.findAll().stream()
                .filter(student -> student.getCareer() == career).collect(Collectors.toList());
    }

    public Collection<Student> findStudentByScore(float score)
    {
        return studentRepository.findAll().stream()
                .filter(student -> student.getScore() >= score).collect(Collectors.toList());
    }

    public Collection<Student> findStudentByName(String name)
    {
        return studentRepository.findAll().stream()
                .filter(student -> student.getName().contains(name)).collect(Collectors.toList());
    }

    public Collection<Student> findStudentByCity(String city)
    {
        return studentRepository.findAll().stream()
                .filter(student -> student.getCity().contains(city)).collect(Collectors.toList());
    }
}
