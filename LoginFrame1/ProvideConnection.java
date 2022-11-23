/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoginFrame1;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author hp
 */
public class ProvideConnection {
     static Connection con;
     static Connection conn;
     
    static Connection conn(){
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/canteendata", "root","767286");
    }
catch(Exception e){

}
return con;
}
     static Connection con(){
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CanteenData", "root","767286");
    }
catch(Exception e){

}
return conn;
}
     public static void main(String[] args) {
         try{
        Connection con = ProvideConnection.conn();
        Statement stmt = con.createStatement();
        String q = "select * from employees";
        ResultSet rs = stmt.executeQuery(q);
        
        while(rs.next()){
        System.out.print("ID: " + rs.getInt("employee_id"));
            System.out.print(", first: " + rs.getString("first_name"));
            System.out.print(", last: " + rs.getString("last_name"));
            System.out.println(", manager: " + rs.getInt("manager_id"));
        }
         }
         catch(Exception e){
             System.out.println(e);
         }
    }
//     public static void main(String[] args) {
//         try{
//        PreparedStatement st0 = ProvideConnection.con().prepareStatement("show tables");
//        ResultSet rs0 = st0.executeQuery();
//        while(rs0.next()){
//            
//        System.out.println(rs0.getString(1));
////            if(LoginScreen.Name.getText().equals(rs0.getString(1))){
////                
////            }
////           
//        }
//        
//    }
//         catch(Exception e){
//             System.out.println(e);
//         }
//}
}
