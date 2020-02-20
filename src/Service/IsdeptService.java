package Service;

import Pojo.Dept;

import java.util.List;

public interface IsdeptService {
    List<Dept> query();
    int add(Dept dept);
    int update(Dept dept);
    int delete(int deptno);
    Dept queryOne(int deptno);
}
