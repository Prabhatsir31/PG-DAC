package connection_pool;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Demofile {
	public static void main(String[] args) {
		  // Pool 1: testdb
        HikariConfig config1 = new HikariConfig();
        config1.setPoolName("TestDBPool");
        config1.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
        config1.setUsername("root");
        config1.setPassword("prabhu");

        HikariDataSource testDbPool = new HikariDataSource(config1);

        // Use first pool
        runQuery(testDbPool, "SELECT * FROM student");
    }

    private static void runQuery(DataSource dataSource, String query) {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("Results from pool: " + ((HikariDataSource) dataSource).getPoolName());
            int colCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= colCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}