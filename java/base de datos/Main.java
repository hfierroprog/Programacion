import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        ResultSet result = null;
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:c:/diccionario.db");
            PreparedStatement st = conexion.prepareStatement("SELECT * FROM Palabras");
            result = st.executeQuery();
            
            while (result.next()){
                System.out.print("ID:");
                System.out.print(result.getInt("id"));
                
                System.out.print("     Palabra:");
                System.out.println(result.getString("palabra"));
            }
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("No se pudo conectar a la base de datos, error:"+ex);
        }
       
        
    }
}
