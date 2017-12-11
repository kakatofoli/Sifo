/**
*Todos os Direitos Reservados ©
*/
package modelo;

import java.sql.PreparedStatement;
import control.Conexao;
import control.Criptografia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaique Spagnol Tofoli
 */
public class Funcionario {
    
    Criptografia cripto = new Criptografia ();
   
    
    private String Nome;
    private String cpf;
    private String NomeUsuario;
    private String Senha;
    private String crf;
    private String Permissao;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    public String getSenha() {
        return Senha;
    }

  public void setSenha(String Senha) {
 
        this.Senha = Senha;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getcrf(){
    return crf;
        
    }
    
    public void setcrf(String crf){
    
    this.crf = crf;
    }
   
   
    public void setpermissao(String Permissao){
    
    this.Permissao = Permissao;
    } 
    
    public String getPermissao(){
    
        return Permissao;
    }

    
    
    
   public List<Funcionario> listar(){
   
       List<Funcionario> lista = new ArrayList <>();
        try {
        PreparedStatement pstm = Conexao.getDB().prepareStatement("SELECT nome, cpf, acesso, usuario FROM tbfuncionarios INNER JOIN tblogin WHERE tblogin.id = tbfuncionarios.id;");
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Funcionario obj = new Funcionario();
            obj.setNome(rs.getString("nome"));
            obj.setCpf(rs.getString("cpf"));
            obj.setpermissao(rs.getString("acesso"));
            obj.setNomeUsuario(rs.getString("usuario"));
            lista.add(obj);
        }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
   
       
       
       return lista;
   }

    private void setId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
