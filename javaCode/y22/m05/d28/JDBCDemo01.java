package y22.m05.d28;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///my_db01", "root", "root");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from users");
        while (rs.next()){
            String id = rs.getString("id");
            String username = rs.getString("username");
            String password = rs.getString(3);
            System.out.println(id+", "+username+", "+password);
        }
//        conn.close();
//        stmt.close();
    }
}
