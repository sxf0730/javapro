package Dao;

import Pojo.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IsstudentDao {
        String url="jdbc:mysql://localhost:3306/no1?useUnicode=true&characterEncoding=utf8";
        String username="root";
        String password="123456";
    @Override
    public List<Student> query() {
        List<Student> list=new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("select sno,name,ssex,sage,sdept from student");
            ResultSet rs=pstmt.executeQuery();//游标
            rs.next();
            while (rs.next()){
                Student student=new Student();
                student.setSno(rs.getInt("sno"));
                student.setName(rs.getString("name"));
                student.setSsex(rs.getString("ssex"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));
                list.add(student);
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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    @Override
    public int add(Student student) {
        int i=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("insert into student(name,ssex,sage,sdept) values(?,?,?,?)");
            pstmt.setString(1,student.getName());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());
            i=pstmt.executeUpdate();

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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }
    @Override
    public int update(Student student) {
        int h=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("update student set name=?,ssex=?,sage=?,sdept=? where sno=?");
            pstmt.setString(1,student.getName());
            pstmt.setString(2,student.getSsex());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());
            pstmt.setInt(5,student.getSno());
            h=pstmt.executeUpdate();

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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return h;
    }
    @Override
    public int delete(int sno) {
        int a=0;
        Connection con=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("delete from student where sno=? ");
            pstmt.setInt(1,sno);
            a=pstmt.executeUpdate();

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
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return a;

    }
    @Override
    public Student queryOne(int id) {
        return null;
    }
}
