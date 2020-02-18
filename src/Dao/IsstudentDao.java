package Dao;

import Pojo.Student;

import java.util.List;

public interface IsstudentDao  {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int delete(int sno);
    Student queryOne(int id);
}
