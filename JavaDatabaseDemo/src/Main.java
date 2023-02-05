import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/kit_college","root","");
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery("SELECT * FROM department");
            System.out.println("Dept ID Dept Name");
            while(res.next()){
                System.out.println(res.getString(1) + " " + res.getString(2));
            }
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}