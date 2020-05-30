package odbc_db_test;
import java.sql.*;
public class TestConnection {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded successfully ");
            Connection
            con = DriverManager.getConnection("jdbc:oracle:thin@:localhost:15
                21: XE ","
                new_horizon ", "
                helloworld ");
                System.out.println("Connection established successfully ");
                //step3 create the statement object
                Statement stmt = con.createStatement();
                //step4 execute query
                ResultSet rs = stmt.executeQuery("select * from emp");
                while (rs.next())
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + "
                        "+rs.getString(3));
                        //step5 close the connection object
                        con.close();
                    }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
        }