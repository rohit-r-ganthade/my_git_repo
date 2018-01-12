import java.sql.*;

/**
 * Created by rohit on 25/12/17.
 */
public class DatabaseConnection {

    public static void main(String args[]){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/rohit_db","root",null);
            Statement stmt=con.createStatement();

//            int rs1=stmt.executeUpdate("update rohit_table set name='Sumit Patil' where id=3");

            // ****** Insertion ******* //
//            PreparedStatement stmt1 = con.prepareStatement("insert into rohit_table values(?,?,?)");
//            stmt1.setInt(1,3);
//            stmt1.setString(2,"Ratan");
//            stmt1.setInt(3,101);
//            int i=stmt1.executeUpdate();
//            System.out.println(i+" records inserted");
            // ******* End *************//

            // ****** Updation ******* //
//            PreparedStatement stmt1=con.prepareStatement("update rohit_table set name=? where id=?");
//            stmt1.setString(1,"Rohit Ganthade");//1 specifies the first parameter in the query i.e. name
//            stmt1.setInt(2,1);
//            int i=stmt1.executeUpdate();
//            System.out.println(i+" records updated");
            // ******* End *************//

            // ****** Deletion ******* //
//            PreparedStatement stmt1=con.prepareStatement("delete from rohit_table where id=?");
//            stmt1.setInt(1,3);
//            int i=stmt1.executeUpdate();
//            System.out.println(i+" records updated");
            // ******* End *************//

            // ****** Retrieveing Records ******* //
//            PreparedStatement stmt1=con.prepareStatement("dselect * from rohit_table");
//            ResultSet rs=stmt1.executeQuery();
//            while(rs.next())
//            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            // ******* End *************//


            ResultSet rs=stmt.executeQuery("select * from rohit_table");

             // gets 2nd row

             while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));

//            DatabaseMetaData dbmd=con.getMetaData();
//
//            System.out.println("Driver Name: "+dbmd.getDriverName());
//            System.out.println("Driver Version: "+dbmd.getDriverVersion());
//            System.out.println("UserName: "+dbmd.getUserName());
//            System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
//            System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

//            String table[]={"TABLE"};
//            ResultSet resultSet = dbmd.getTables(null,null,null,table);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1)); // Gives Database name
//                System.out.println(resultSet.getString(3)); // Gives Table name
//
//            }


//            ResultSetMetaData rsmd=rs.getMetaData();
//
//            System.out.println("Total columns: "+rsmd.getColumnCount());
//            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
//            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
//            System.out.println("Table Name: "+rsmd.getTableName(1));

            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}

