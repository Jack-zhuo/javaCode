package y22.m06.d01;

import java.sql.Connection;

public class connQuestion {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            Connection conn = JDBCUtils.getConnection();
            conn.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
