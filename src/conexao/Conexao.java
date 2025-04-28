package conexao;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Duduzada
 */
public class Conexao {
    public static Connection getConexao() 
   {
       Connection conexao=null;
       try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_perfume?autoReconnect=true&useSSL=false","root","vividudu1");
       }catch(ClassNotFoundException | SQLException e ){
           System.out.print("\n Erro ao conectar: "+e.toString());
       }
       return(conexao);
    }
}
