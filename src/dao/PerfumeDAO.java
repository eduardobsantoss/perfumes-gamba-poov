package dao;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import bean.Perfume;
import bean.Cliente;
import bean.Pedido;
import bean.PedidoPerfume;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Duduzada
 */
public class PerfumeDAO {
   Connection conexao;
   public PerfumeDAO() throws SQLException, ClassNotFoundException
   {
      this.conexao = Conexao.getConexao();
   }
   //funções para adicionar os dados
   public void adicionarPerfume(Perfume perfume)
   {
      PreparedStatement ps_estado;
      String msgSql = "insert into perfume(id_perfume, volume, lote, tipoDoPerfume, valorVenda, corDoLiquido) values(?,?,?,?,?,?)";
      try{
        ps_estado =  this.conexao.prepareStatement(msgSql);
        ps_estado.setInt(1, perfume.getId_perfume());
        ps_estado.setFloat(2, perfume.getVolume());
        ps_estado.setFloat(3, perfume.getLote());
        ps_estado.setString(4, perfume.getTipoDoPerfume());
        ps_estado.setFloat(5, perfume.getValorVenda());
        ps_estado.setString(6, perfume.getCorDoLiquido());
        ps_estado.execute();
        ps_estado.close();
        System.out.print("\n Informação adicionada com sucesso.");
      }catch(SQLException e){
          System.out.print("\n Erro ao adicionar no banco: "+e.toString());
      }
   }
   
   //funções para buscar listas de dados completas
   public ArrayList<Perfume> buscarListaCompleta_perfume()
   {
       PreparedStatement ps_estado;
       ResultSet res;
       ArrayList<Perfume> minhaLista=null;
       String msgSql = "select * from perfume";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            res = ps_estado.executeQuery();
            minhaLista = new ArrayList<>();
            while(res.next())
            {
                Perfume c = new Perfume();
                c.setId_perfume(res.getInt("id_perfume"));
                c.setVolume(res.getInt("volume"));
                c.setLote(res.getFloat("lote"));
                c.setTipoDoPerfume(res.getString("tipoDoPerfume"));
                c.setValorVenda(res.getFloat("valorVenda"));
                c.setCorDoLiquido(res.getString("corDoLiquido"));
                
                minhaLista.add(c);
            }
            System.out.println("\n Informação buscada com sucesso.");
            res.close();
            ps_estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao buscar todos no banco: "+e.toString());
       }
       return minhaLista;
   }
   
    public void removerPerfume(int id_perfume)
   {
       PreparedStatement ps_estado;
       String msgSql = "delete from perfume where id_perfume = ?";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            ps_estado.setInt(1, id_perfume);
            ps_estado.execute();
            ps_estado.close();
            System.out.println("\n Informação removida com sucesso.");
       }catch(SQLException e){
          System.out.print("\n Erro ao remover do banco: "+e.toString());
       }
   }
   public void alterarPerfume(Perfume perfume)
   {
       PreparedStatement estado;
       String msgSql = "update perfume set volume=?, lote=?, tipoDoPerfume=?, valorVenda=?, corDoLiquido=? where id_perfume=?";
       try{
            estado = this.conexao.prepareStatement(msgSql);
            
            estado.setFloat(1, perfume.getVolume());
            estado.setFloat(2, perfume.getLote());
            estado.setString(3, perfume.getTipoDoPerfume());
            estado.setFloat(4, perfume.getValorVenda());
            estado.setString(5, perfume.getCorDoLiquido());
            estado.setInt(7, perfume.getId_perfume());
            System.out.println("\n Informação alterada com sucesso.");
            estado.execute();
            estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
       }
   } 
}
