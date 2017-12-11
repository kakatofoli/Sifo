
package modelo;

import com.mysql.jdbc.PreparedStatement;
import control.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
        
        
public class Venda {
    
    private int Quantidade;
    private float ValorTotal;
    private String Cod;
    private float Valor;
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getValorTotal() {
        return (int) ValorTotal;
    }

    public void setValorTotal(int ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getCod() {
        return Cod;
    }

    public void setCod(String Cod) {
        this.Cod = Cod;
    }
    
    

  public List<Produto> listar(){
   
       List<Produto> lista = new ArrayList <>();
        try {
        PreparedStatement pstm = (PreparedStatement) Conexao.getDB().prepareStatement("SELECT nome, id, quantidade, valor, codbarras FROM tbprodutos WHERE codbarras like '?'");
        pstm.setString(1,Cod);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Venda obj = new Venda();
            
            obj.setCod("codbarras");
            obj.setValor("valor");
            obj.setNome("nome");
            /*lista.add(obj);*/
        }
        
        } catch (SQLException ex) {
        }
       return lista;
   } 

    private void setValor(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}





