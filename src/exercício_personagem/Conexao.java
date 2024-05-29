
package exercício_personagem;
import java.sql.Connection; //fazer conexão

import java.sql.DriverManager; //biblioteca 

import java.sql.SQLException; //informar erros


 // @author aluno
 
public class Conexao {
    private static final String url = "jdbc:mysql://localhost3306/jogo";
    
    private static final String user = "root";
    private static final String password = "senacrs";
    
    private static Connection conn;
    
    public static Connection getConexao() throws SQLException{
        try{
            if(conn == null){
                conn = DriverManager.getConnection(url,user,password);
                return conn;
            }else{
                return conn;
            }
            }catch(SQLException e){
        e.printStackTrace();
        return null;
    }
    }
}
