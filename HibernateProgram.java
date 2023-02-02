import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
public class HibernateProgram {
    public static void main(String[] args) {
    final String URL="jdbc:mysql://localhost:3306?user=root&&password=root";
    String query="insert into myprogram values(1,'abi','30000','ECE')";
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(URL);
        System.out.println("Connection established");
        Statement st=con.createStatement();
        st.execute(query);
        System.out.println("Data inserted");
        st.close();
        con.close();
    }
    catch(SQLException | ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    }
}