package y22.m05.d30;

import utils.JDBCUtils;

import java.sql.ResultSet;

public class Login {
    public static void main(String[] args) throws Exception {
        ResultSet rs = JDBCUtils.runQuery("select * from students");
        while (rs.next()){
            System.out.println(rs.getString("sName"));
        }
    }
}
