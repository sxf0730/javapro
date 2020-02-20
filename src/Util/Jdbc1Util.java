package Util;

import java.sql.*;

public class Jdbc1Util {
    private static final String URL="jdbc:mysql://localhost:3306/no1?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static  Connection getConnection(){
        Connection con=null;
        try {
         con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return con;
    }
    public static int executeupdate(String sql, Object... params){
        int result=0;
        Connection con=getConnection();
       PreparedStatement pstmt=null;

       try {
            pstmt=con.prepareStatement(sql);
            if(params!=null){
                for(int i=0;i<params.length;i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result=pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
       }
    return result;
    }
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if(con!=null)
                con.close();
            if(pstmt!=null)
                pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con,PreparedStatement pstmt,ResultSet rs){
        try {

            if(rs!=null)
                rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
