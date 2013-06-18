import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class JDBCTest {
	@Test
    public void test() { 
        String driver = "com.mysql.jdbc.Driver";
        String dbName = "caipu";
        String passwrod = "dev";
        String userName = "dev";
        String url = "jdbc:mysql://192.168.1.201:3306/" + dbName+"?useUnicode=true&characterEncoding=utf8"; //?useUnicode=true&characterEncoding=gbk 
        String sql = "select * from step";
 
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, userName,
                    passwrod);
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                System.out.println("stepId : " + rs.getInt(1) + " recipeId : "
//                        + rs.getInt(2) + " description : " + rs.getString(5));
//            }
// 
            // 关闭记录集
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            // 关闭声明
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            // 关闭链接对象
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}