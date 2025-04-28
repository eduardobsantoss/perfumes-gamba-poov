/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Cliente;
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
public class ClienteDAO {
   Connection conexao;
   public ClienteDAO() throws SQLException, ClassNotFoundException
   {
      this.conexao = Conexao.getConexao();
   }
   
   public void adicionarCliente(Cliente cliente)
   {
      PreparedStatement ps_estado;
      String msgSql = "insert into cliente(cpf,nome,telefone,endereco,ed_insta,ed_face,cartaoDeCredito,pix) values(?,?,?,?,?,?,?,?)";
      try{
        ps_estado =  this.conexao.prepareStatement(msgSql);
        ps_estado.setString(1, cliente.getCpf());
        ps_estado.setString(2, cliente.getNome());
        ps_estado.setString(3, cliente.getTelefone());
        ps_estado.setString(4, cliente.getEndereco());
        ps_estado.setString(5, cliente.getEnd_insta());
        ps_estado.setString(6, cliente.getEnd_face());
        ps_estado.setString(7, cliente.getCartaoDeCredito());
        ps_estado.setString(7, cliente.getPix());
        ps_estado.execute();
        ps_estado.close();
        System.out.print("\n Informação adicionada com sucesso.");
      }catch(SQLException e){
          System.out.print("\n Erro ao adicionar no banco: "+e.toString());
      }
   }
   
      public ArrayList<Cliente> buscarListaCompleta_cliente()
   {
       PreparedStatement ps_estado;
       ResultSet res;
       ArrayList<Cliente> minhaLista=null;
       String msgSql = "select * from cliente";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            res = ps_estado.executeQuery();
            minhaLista = new ArrayList<>();
            while(res.next())
            {
                Cliente c = new Cliente();
                c.setCpf(res.getString("cpf"));
                c.setNome(res.getString("nome"));
                c.setTelefone(res.getString("telefone"));
                c.setEndereco(res.getString("endereco"));
                c.setEnd_insta(res.getString("end_insta"));
                c.setEnd_face(res.getString("end_face"));
                c.setCartaoDeCredito(res.getString("cartaoDeCredito"));
                c.setPix(res.getString("pix"));
                
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
      
   public void removerCliente(String cpf)
   {
       PreparedStatement ps_estado;
       String msgSql = "delete from cliente where cpf = ?";
       try{
            ps_estado = this.conexao.prepareStatement(msgSql);
            ps_estado.setString(1, cpf);
            ps_estado.execute();
            ps_estado.close();
            System.out.println("\n Informação removida com sucesso.");
       }catch(SQLException e){
          System.out.print("\n Erro ao remover do banco: "+e.toString());
       }
   }
   public void alterarCliente(Cliente cliente)
   {
       PreparedStatement estado;
       String msgSql = "update cliente set nome=?, telefone=?, endereco=?, end_insta=?, end_face=?, cartaoDeCredito=?, pix=? where cpf=?";
       try{
            estado = this.conexao.prepareStatement(msgSql);
            estado.setString(1, cliente.getNome());
            estado.setString(2, cliente.getTelefone());
            estado.setString(3, cliente.getEndereco());
            estado.setString(4, cliente.getEnd_insta());
            estado.setString(5, cliente.getEnd_face());
            estado.setString(6, cliente.getCartaoDeCredito());
            estado.setString(7, cliente.getPix());
            estado.setString(8, cliente.getCpf());

            System.out.println("\n Informação alterada com sucesso.");
            estado.execute();
            estado.close();
       }catch(SQLException e){
            System.out.print("\n Erro ao alterar no banco: "+e.toString());
       }
   }
   
}
