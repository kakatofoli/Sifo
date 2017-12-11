/**
*Todos os Direitos Reservados ©
*/
package control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Kaique Spagnol Tofoli
 */
public class Conexao {
    
    private static Conexao instance;
    private Connection conexao;
    
    private Conexao(){
    
    
            try {
                conexao = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://localhost/dbfarmacia",
                        "root",
                        "906309"
                        );
            } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"Ocorreu um erro ao tentar conectar no Banco de Dados, "+ "tente novamente mais tarde. :(","Atenção",JOptionPane.ERROR_MESSAGE);
            instance = null;
            }
    }
    
     public static Conexao getInstance() {
        if (instance == null) 
            instance = new Conexao();
        return instance;
    }
    
    public static Connection getDB() {
        return getInstance().conexao;
    }
}
