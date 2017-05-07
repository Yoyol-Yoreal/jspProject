package dao;

import javax.xml.transform.Result;
import java.sql.*;

/**
 * Created by 18610 on 2017/5/7.
 */
public class Dao {
    Connection con = null;
    Statement stat = null;
    ResultSet rs = null;

    public Dao() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "lulu76182";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed())
                System.out.println("Succeeded connecting to the Database!");
            stat = con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            rs = stat.executeQuery(sql);
        } catch (Exception e) {
            rs = null;
        }
        return rs;
    }

    public int executeUpdate(String sql) {
        try {
            stat.executeUpdate(sql);
            return 0;
        } catch (Exception e) {
        }
        return -1;
    }

}
