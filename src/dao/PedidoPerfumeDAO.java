/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PedidoPerfume;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Duduzada
 */
public class PedidoPerfumeDAO {
   Connection conexao;
   public PedidoPerfumeDAO() throws SQLException, ClassNotFoundException
   {
      this.conexao = Conexao.getConexao();
   }
   
      public void adicionarPedidoPerfume(PedidoPerfume pedidoP)
   {
      PreparedStatement ps_estado;
      String msgSql = "insert into pedido(id_pedido_perfume,fk_id_pedido,fk_id_perfume,quantidade) values(?,?,?,?)";
      try{
        ps_estado =  this.conexao.prepareStatement(msgSql);
        ps_estado.setInt(1, pedidoP.getId_pedido_perfume());
        ps_estado.setInt(2, pedidoP.getFk_id_pedido());
        ps_estado.setInt(3, pedidoP.getFk_id_perfume());
        ps_estado.setInt(4, pedidoP.getQuantidade());
        ps_estado.execute();
        ps_estado.close();
        System.out.print("\n Informação adicionada com sucesso.");
      }catch(SQLException e){
          System.out.print("\n Erro ao adicionar no banco: "+e.toString());
      }
   }
   
      
      public ArrayList<PedidoPerfume> buscarListaCompleta_pedidoPerfume()
   {
       PreparedStatement ps_estado;
       ResultSet res;
       ArrayList<PedidoPerfume> minhaLista=null;
       String msgSql = "select * from pedido_perfume";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            res = ps_estado.executeQuery();
            minhaLista = new ArrayList<>();
            while(res.next())
            {
                PedidoPerfume p = new PedidoPerfume();
                p.setId_pedido_perfume(res.getInt("id_pedido_perfume"));
                p.setFk_id_pedido(res.getInt("fk_id_pedido"));
                p.setFk_id_perfume(res.getInt("fk_id_perfume"));
                p.setQuantidade(res.getInt("quantidade"));
                
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
      
   public void removerPedidoPerfume(int id_pedido_perfume)
   {
       PreparedStatement ps_estado;
       String msgSql = "delete from pedido_perfume where id_pedido_perfume = ?";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            ps_estado.setInt(1, id_pedido_perfume);
            ps_estado.execute();
            ps_estado.close();
            System.out.println("\n Informação removida com sucesso.");
       }catch(SQLException e){
          System.out.print("\n Erro ao remover do banco: "+e.toString());
       }
   }
   public void alterarPedidoPerfume(PedidoPerfume pedidoc)
   {
       PreparedStatement estado;
       String msgSql = "update pedido_perfume set fk_id_pedido=?, fk_id_perfume=?, quantidade=? where id_pedido_perfume=?";
       try{
            estado = this.conexao.prepareStatement(msgSql);
            estado.setInt(1, pedidoc.getFk_id_pedido());
            estado.setInt(2, pedidoc.getFk_id_perfume());
            estado.setInt(3, pedidoc.getQuantidade());
            estado.setInt(4, pedidoc.getId_pedido_perfume());
            
            System.out.println("\n Informação alterada com sucesso.");
            estado.execute();
            estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
       }
   }
}
