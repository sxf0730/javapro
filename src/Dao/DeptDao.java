package Dao;

import Pojo.Dept;
import Util.Jdbc1Util;
import Util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDao implements IsdeptDao {
    String url="jdbc:mysql://localhost:3306/no1?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123456";
    @Override
    public List<Dept> query() {
        List<Dept> list=new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("select deptno,dname,loc from dept");
            rs=pstmt.executeQuery();
            while(rs.next()){
                Dept dept=new Dept();
                dept.setDeptno(rs.getInt("deptno"));
                dept.setDname(rs.getString("dname"));
                dept.setLoc(rs.getString("loc"));
                list.add(dept);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int add(Dept dept) {
        String sql="insert into Dept(dname,loc) values(?,?)";
        Object[] params={dept.getDname(),dept.getLoc()};
        int i=JdbcUtil.excuteupdate(sql,params);
        return i;
    }

    @Override
    public int update(Dept dept) {
        int b=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("update dept set dname=?,loc=? where deptno=?");
            pstmt.setString(1,dept.getDname());
            pstmt.setString(2,dept.getLoc());
            pstmt.setInt(3,dept.getDeptno());
            b=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return b;
    }

    @Override
    public int delete(int deptno) {
        int c=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("delete from dept where deptno=?");
            pstmt.setInt(1,deptno);
            c=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return c;
    }

    @Override
    public Dept query(int deptno) {
        return null;
    }
}
