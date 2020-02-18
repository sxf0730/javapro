package Service;

import Dao.IsstudentDao;
import Dao.StudentDao;
import Pojo.Student;

import java.util.List;

public class StudentService implements IsstudentService {
    IsstudentDao studentDao=new StudentDao();
    @Override
    public List<Student> query() {

        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int delete(int sno) {
        return studentDao.delete(sno);
    }

    @Override
    public Student queryOne(int sno) {
        return null;
    }
}
