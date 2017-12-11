
package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Produto;

public class ProdutoBanco {
    
    Produto prod = new Produto();
    
    private static ProdutoBanco instance;
    

    
   public static ProdutoBanco getInstance(){
    
        if(instance == null){
        instance = new ProdutoBanco();
        }
        
    return instance;
    
    }
    
    public boolean salvar(Produto prod) throws SQLException{       
    
        try{
            
        Conexao.getDB().setAutoCommit(false);
        
        PreparedStatement pstm = Conexao.getDB().prepareStatement("INSERT INTO tbprodutos (nome, id, quantidade, codbarras, tipo, concentracao, valor) VALUES (?, ?, ?, ?, ?, ?, ?)");
        pstm.setString(1,prod.getNome());
        pstm.setInt(2,prod.getId());
        pstm.setInt(3,prod.getQuantidade());
        pstm.setString(4,prod.getCodBarras());
        pstm.setString(5,prod.getTipo());
        pstm.setString(6,prod.getConcentracao());
        pstm.setFloat(7,prod.getValor());
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
}


