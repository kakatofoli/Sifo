
package modelo;

import control.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kaique
 */
public class Produto {
    
    private String Nome;
    private String CodBarras;
    private int Quantidade;
    private String Concentracao;
    private String Tipo;
    private int id;
    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

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

    public String getCodBarras() {
        return CodBarras;
    }

    public void setCodBarras(String CodBarras) {
        this.CodBarras = CodBarras;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getConcentracao() {
        return Concentracao;
    }

    public void setConcentracao(String Concentracao) {
        this.Concentracao = Concentracao;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
 
    
     public List<Produto> listar(){
   
       List<Produto> lista = new ArrayList <>();
        try {
        PreparedStatement pstm = Conexao.getDB().prepareStatement("SELECT nome, id, quantidade, codbarras, tipo, concentracao, valor FROM tbprodutos;");
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            Produto obj = new Produto();
            obj.setNome(rs.getString("nome"));
            obj.setCodBarras(rs.getString("codbarras"));
            obj.setQuantidade(rs.getInt("quantidade"));
            obj.setConcentracao(rs.getString("concentracao"));
            obj.setId(rs.getInt("id"));
            obj.setTipo(rs.getString("tipo"));
            obj.setValor(rs.getFloat("valor"));
            lista.add(obj);
        }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
       return lista;
   }
    
    
}
