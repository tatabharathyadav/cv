package in.srkr.dsa1.oops2;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Assi210 {

    public static void main(String[] args) {
        try {
            
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase");
            dataSource.setUsername("username");
            dataSource.setPassword("password");
            JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
            System.out.println("Database operation completed successfully!");

        } catch (DataAccessException e) {
            System.err.println("An error occurred during the database operation:");
            e.printStackTrace();
        }
    }
}



