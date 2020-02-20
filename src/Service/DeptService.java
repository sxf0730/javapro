package Service;

import Dao.DeptDao;
import Dao.IsdeptDao;
import Pojo.Dept;

import java.util.List;

public class DeptService implements IsdeptService {
    IsdeptDao deptDao= new DeptDao();
    @Override
    public List<Dept> query() {
        return deptDao.query();
    }

    @Override
    public  int add(Dept dept) {
        return deptDao.add(dept);
    }

    @Override
    public int update(Dept dept) {
        return deptDao.update(dept);
    }

    @Override
    public int delete(int deptno) {
        return deptDao.delete(deptno);
    }

    @Override
    public Dept queryOne(int deptno) {
        return null;
    }
}
