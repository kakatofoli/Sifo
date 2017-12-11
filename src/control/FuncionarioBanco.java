/**
*Todos os Direitos Reservados ©
*/
package control;

import viewer.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Funcionario;
import viewer.CadastroFuncionario;

/**
 *
 * @author Kaique Spagnol Tofoli
 */


public class FuncionarioBanco {
    Funcionario func = new Funcionario();
    CadastroFuncionario cad = new CadastroFuncionario();
    Login login = new Login();
    
    private static FuncionarioBanco instance;
    

    
   public static FuncionarioBanco getInstance(){
    
        if(instance == null){
        instance = new FuncionarioBanco();
        
        }
        
    return instance;
    
    }
    
    public boolean salvar(Funcionario func) throws SQLException{
        
        
    
    try{
        Conexao.getDB().setAutoCommit(false);
        
        PreparedStatement pstm = Conexao.getDB().prepareStatement("INSERT INTO tbfuncionarios (nome, cpf, acesso) VALUES (?, ?, ?)");
        pstm.setString(1,func.getNome());
        pstm.setString(2,func.getCpf());
        pstm.setString(3,func.getPermissao());
        pstm.execute();
        
        
    
        pstm = Conexao.getDB().prepareStatement("INSERT INTO tblogin (usuario, senha, id) VALUES (?, ?, (SELECT max(id) FROM tbfuncionarios LIMIT 1)) ");
        pstm.setString(1,func.getNomeUsuario());
        pstm.setString(2,func.getSenha());
        pstm.execute();
        
        
        
        pstm = Conexao.getDB().prepareStatement("INSERT INTO tbfarmaceutico (crf, id) VALUES (?,(SELECT max(id) FROM tbfuncionarios LIMIT 1)) ");
        pstm.setString(1,func.getcrf());
        pstm.execute();
        
        Conexao.getDB().commit();
       
        
        Conexao.getDB().setAutoCommit(true);
    return false;
    }
    
    catch(SQLException ex){
        ex.printStackTrace();
        Conexao.getDB().rollback();
            }
 
        
    return false;
    }
    
    public boolean remover (Funcionario func) throws SQLException{
        
    Conexao.getDB().setAutoCommit(false);
    
    PreparedStatement pstm = Conexao.getDB().prepareStatement("DELETE FROM tblogin WHERE usuario = (?);");
    pstm.setString(1,func.getNomeUsuario());
    pstm.execute();
    
    pstm = Conexao.getDB().prepareStatement("DELETE FROM tbfarmaceutico WHERE crf = (?);");
    pstm.setString(1,func.getcrf());
    pstm.execute();
    
    
    pstm = Conexao.getDB().prepareStatement("DELETE FROM tbfuncionarios WHERE nome = (?);");
    pstm.setString(1,func.getNome());
    pstm.execute();
    
    Conexao.getDB().commit();
    Conexao.getDB().setAutoCommit(true);
    
    return false;
    
    }
    
}
    

