package y22.m05.d30;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Process {
    Connection con;
    Statement stmt;
    ResultSet rs;

    Process() {

        try {
            //1
            Class.forName("com.mysql.jdbc.Driver");
            //2
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db01","root","root");
            //3
            stmt = con.createStatement();

            rs = con.getMetaData().getTables(null, null, "company", null);

            if (!rs.next()) {
                stmt.execute("create table company(id varchar(20) primary key not null,name varchar(20),position varchar(20))");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    void insert(String a,String b,String c){            //添加员工信息
        try{
            int i = stmt.executeUpdate("insert into company values('" + a + "','" + b + "','" + c + "')");
            if (i>0){
                System.out.println("添加成功");
            }else {
                System.out.println("添加失败");
            }


        }catch (Exception e){
            System.out.println(e);
        }
}
    String Search(String s) {                           //查找员工信息
        String s1 = new String(); //作为查找信息的结果
        try {
            rs = stmt.executeQuery("select * from company where id='" + s + "'"); //查找某人
            if (rs.next()) {
                s1 += "找到该公司成员" + "员工号" + rs.getString(1) + "姓名为" + rs.getString(2) + "职位是" + rs.getString(3);
            }
            else s1="未查杂到该员工";

        } catch (Exception e) {

            System.out.println("Search"+e);
        }
        return s1;    //返回类型
    }

    String Shift(String s,String newposition ){  //修改员工职位、工号
        String s1=new String();
        try{
            rs = stmt.executeQuery("select * from company where id='" + s + "'"); //查找某人
            if (rs.next()) {
                 stmt.execute("update company set position='"+newposition+"'"+"where id = '"+s+"'");
                rs = stmt.executeQuery("select * from company where id='" + s + "'");
                 rs.next();
                 s1+="成功修改该员工信息！" + "员工号" + rs.getString(1) + "姓名为" + rs.getString(2) + "职位是" + rs.getString(3);
            }
            else s1="未查杂到该员工";
        }catch (Exception e){
            System.out.println("Shift"+e);
        }
        return s1;
    }


    String Delete(String s){
        try{
            stmt.execute("delete from company where id='"+s+"'");

        }catch (Exception e){
            System.out.println("Shift"+e);
        }
        return "删除成功";
    }

}


