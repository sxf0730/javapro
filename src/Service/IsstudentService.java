package Service;

import Pojo.Student;

import java.util.List;

public interface IsstudentService {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int delete(int sno);
    Student queryOne(int sno);
}
