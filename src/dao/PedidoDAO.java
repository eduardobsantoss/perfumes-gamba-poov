/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pedido;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Duduzada
 */
public class PedidoDAO {
   Connection conexao;
   public PedidoDAO() throws SQLException, ClassNotFoundException
   {
      this.conexao = Conexao.getConexao();
   }
   
      public void adicionarPedido(Pedido pedido)
   {
      PreparedStatement ps_estado;
      String msgSql = "insert into pedido(id_pedido,fk_cpf,data_pedido,prazoEntrega) values(?,?,?,?)";
      try{
        ps_estado =  this.conexao.prepareStatement(msgSql);
        ps_estado.setInt(1, pedido.getId_pedido());
        ps_estado.setString(2, pedido.getFk_cpf());
        ps_estado.setTimestamp(3,Timestamp.valueOf(pedido.getDataPedido()));
        ps_estado.setInt(4, pedido.getPrazoEntrega());
        ps_estado.execute();
        ps_estado.close();
        System.out.print("\n Informação adicionada com sucesso.");
      }catch(SQLException e){
          System.out.print("\n Erro ao adicionar no banco: "+e.toString());
      }
   }
      
      
   public ArrayList<Pedido> buscarListaCompleta_pedido()
   {
       PreparedStatement ps_estado;
       ResultSet res;
       ArrayList<Pedido> minhaLista=null;
       String msgSql = "select * from pedido";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            res = ps_estado.executeQuery();
            minhaLista = new ArrayList<>();
            while(res.next())
            {
                Pedido p = new Pedido();
                p.setId_pedido(res.getInt("id_pedido"));
                p.setFk_cpf(res.getString("fk_cpf"));
                Timestamp dt=res.getTimestamp("datadopedido");
                p.setDataPedido(dt.toLocalDateTime());
                p.setPrazoEntrega(res.getInt("prazoEntrega"));
                
                
                minhaLista.add(p);
            }
            System.out.println("\n Informação buscada com sucesso.");
            res.close();
            ps_estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao buscar todos no banco: "+e.toString());
       }
       return minhaLista;
   }
   
   
      public void removerPedido(int id_pedido)
   {
       PreparedStatement ps_estado;
       String msgSql = "delete from pedido where id_pedido = ?";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            ps_estado.setInt(1, id_pedido);
            ps_estado.execute();
            ps_estado.close();
            System.out.println("\n Informação removida com sucesso.");
       }catch(SQLException e){
          System.out.print("\n Erro ao remover do banco: "+e.toString());
       }
   }
   public void alterarPedido(Pedido pedido)
   {
       PreparedStatement estado;
       String msgSql = "update pedido set fk_cpf=?, dataPedido=?, prazoEntrega=? where id_pedido=?";
       try{
            estado = this.conexao.prepareStatement(msgSql);
            estado.setString(1, pedido.getFk_cpf());
            estado.setTimestamp(2, Timestamp.valueOf(pedido.getDataPedido()));
            estado.setInt(3, pedido.getPrazoEntrega());
            estado.setInt(4, pedido.getId_pedido());
            
            System.out.println("\n Informação alterada com sucesso.");
            estado.execute();
            estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
       }
   }
   
}
