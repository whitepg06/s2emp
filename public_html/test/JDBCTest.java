import java.sql.Connection;
import java.sql.DriverManager;
class JDBCTest {
public static void main(String[] args) {
  try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost","yourdbusername","yourdbuserpassword")){
  System.out.println("Connected");
} catch (Exception e) {
  e.printStackTrace();
}}}
