import java.sql.*;
import java.util.Scanner;
public class Sample {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        Connection con;
                try {
                    System.out.println("Enter username:");
                    String username =s.next();
                    System.out.println("Enter password:");
                    String password =s.next();
                    System.out.println("Enter full name:");
                    String name =s.next();
                    System.out.println("Enter email:");
                    String email = s.nextLine();
                    System.out.println("Enter country:");
                    String country = s.nextLine();
                    System.out.println("Enter age:");
                    String age =s.next();
                    System.out.println("Enter sex:");
                    String sex =s.next();
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
                    PreparedStatement pst = con.prepareStatement("insert into mytable(username,password,name,email,country,age,sex) values(?,?,?,?,?,?,?)");


                    pst.setString(1,username);
                    pst.setString(2, password);
                    pst.setString(3, name);
                    pst.setString(4, email);
                    pst.setString(5, country);
                    pst.setString(6, age);
                    pst.setString(7, sex);
                    int i = pst.executeUpdate();
                    if(i!=0){
                        System.out.println("added");
                    }
                    else{
                        System.out.println("failed to add");
                    }
                }
                catch (ClassNotFoundException | SQLException e){
                    System.out.println(e);
                }
            }
        }