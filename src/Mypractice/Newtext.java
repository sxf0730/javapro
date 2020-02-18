package Mypractice;

import Pojo.Student;
import Web.StudentWeb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Newtext {
    public static void main(String[] args) {
//        String url="jdbc:mysql://localhost:3306/no1?useUnicode=true&characterEncoding=utf8";
//        String username="root";
//        String password="123456";
//        Connection con=null;
//        PreparedStatement pstmt=null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            //创建连接
//             con = DriverManager.getConnection(url,username,password);
//            //创建一个可以写sql语句的地方
//            pstmt = con.prepareStatement("insert into student(name,ssex,sage,sdept) values ('张虎','男',22,'计算机系')");
//            int i =pstmt.executeUpdate();
//            System.out.println(i);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                if(pstmt!=null)
//                    pstmt.close();
//                if(con!=null)
//                    con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    StudentWeb studentWeb= new StudentWeb();
    studentWeb.showmain();
    studentWeb.input();
    }

}
