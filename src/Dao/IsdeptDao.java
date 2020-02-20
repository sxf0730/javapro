package Dao;

import Pojo.Dept;

import java.util.List;

public interface IsdeptDao {
    List<Dept> query();
    int add(Dept dept);
    int update(Dept dept);
    int delete(int deptno);
    Dept query(int deptno);
}
