package Dao;

import Pojo.Student;
import Util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IsstudentDao {
    String url="jdbc:mysql://localhost:3306/no1?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="123456";
    @Override
    public List<Student> query() {
        List<Student> list= new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
            pstmt=con.prepareStatement("select sno,name,ssex,sage,sdept from student");
            rs=pstmt.executeQuery();
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
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    @Override
    public int add(Student student) {
        return JdbcUtil.excuteupdate("insert into student(name,ssex,sage,sdept) values(?,?,?,?)",student.getName(),student.getSsex(),student.getSage(),student.getSdept());
    }
    @Override
    public int update(Student student) {
        return JdbcUtil.excuteupdate("update student set name=?,ssex=?,sage=?,sdept=? where sno=?",student.getName(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());
    }
    @Override
    public int delete(int sno) {
        return JdbcUtil.excuteupdate("delete from student where sno=?",sno);
    }
    @Override
    public Student queryOne(int sno) {
        return null;
    }
}
