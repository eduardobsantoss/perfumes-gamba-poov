package bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Duduzada
 */
public class Pedido {
    private int id_pedido;
    private String fk_cpf;
    private LocalDateTime dataPedido;
    private int prazoEntrega;
    

    public Pedido(int id_pedido,String fk_cpf, LocalDateTime dataPedido, int prazoEntrega) {
        this.id_pedido = id_pedido;
        this.fk_cpf = fk_cpf;
        this.dataPedido = dataPedido;
        this.prazoEntrega = prazoEntrega;
    }
    
    public Pedido() {
        this.id_pedido = 0;
        this.fk_cpf = "sem cpf";
        this.prazoEntrega = 0;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }
    
    public String getFk_cpf() {
        return fk_cpf;
    }

    public void setFk_cpf(String fk_cpf) {
        this.fk_cpf = fk_cpf;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", fk_cpf=" + fk_cpf + ", dataPedido=" + dataPedido + ", prazoEntrega=" + prazoEntrega + '}';
    }


    
    
}
