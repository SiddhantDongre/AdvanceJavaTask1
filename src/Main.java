import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Step 1: Load MySQL JDBC Driver
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    System.out.println("MySQL JDBC Driver Loaded Successfully!");
                } catch (ClassNotFoundException e) {
                    System.out.println("Error: MySQL JDBC Driver not found!");
                    e.printStackTrace();
                    return;
                }

                // Step 2: Establish Connection
                Connection connection = null;
                try {
                    // Replace these details with your MySQL credentials
                    String url = "jdbc:mysql://localhost:3306/student_db"; // database URL
                    String username = "root"; // MySQL username
                    String password = "Siddhant"; // MySQL password

                    connection = DriverManager.getConnection(url, username, password);

                    // Step 3: Check Connection
                    if (connection != null) {
                        System.out.println("Connection Successful!");
                    } else {
                        System.out.println("Failed to make connection!");
                    }

                } catch (SQLException e) {
                    System.out.println("SQL Exception occurred while connecting to database!");
                    e.printStackTrace();
                } finally {
                    // Step 4: Close Connection
                    try {
                        if (connection != null) {
                            connection.close();
                            System.out.println("Connection Closed Successfully!");
                        }
                    } catch (SQLException e) {
                        System.out.println("Error while closing connection!");
                        e.printStackTrace();
                    }
                }
            }
        }
