package Mypractice;

import Pojo.Student;
import Web.DeptWeb;
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
//    StudentWeb studentWeb= new StudentWeb();
//    studentWeb.showmain();
//    studentWeb.input();
        DeptWeb deptWeb=new DeptWeb();
        deptWeb.showmain();
        deptWeb.input();
//        int[] array={1,15,12,4,64,25,14};
//        for(int i=0;i<array.length-1;i++){
//            for(int j=1;j<array.length-1-i;j++){
//                if(array[j]>array[j+1]){
//                    int a=array[j+1];
//                    array[j+1]=array[j];
//                    array[j]=a;
//
//                }
//            }
//        }2
//        for(int i:array){
//            System.out.println(i);
//        }
    }

}
