package bean;

/**
 *
 * @author Duduzada
 */
public class PedidoPerfume {
    private int id_pedido_perfume;
    private int fk_id_pedido;
    private int fk_id_perfume;
    private int quantidade;

    public PedidoPerfume(int id_pedido_perfume, int fk_id_pedido, int fk_id_perfume, int quantidade) {
        this.id_pedido_perfume = id_pedido_perfume;
        this.fk_id_pedido = fk_id_pedido;
        this.fk_id_perfume = fk_id_perfume;
        this.quantidade = quantidade;
    }
    
    public PedidoPerfume() {
        this.id_pedido_perfume = 0;
        this.fk_id_pedido = 0;
        this.fk_id_perfume = 0;
        this.quantidade = 0;
        }

    public int getId_pedido_perfume() {
        return id_pedido_perfume;
    }

    public void setId_pedido_perfume(int id_pedido_perfume) {
        this.id_pedido_perfume = id_pedido_perfume;
    }

    public int getFk_id_pedido() {
        return fk_id_pedido;
    }

    public void setFk_id_pedido(int fk_id_pedido) {
        this.fk_id_pedido = fk_id_pedido;
    }

    public int getFk_id_perfume() {
        return fk_id_perfume;
    }

    public void setFk_id_perfume(int fk_id_perfume) {
        this.fk_id_perfume = fk_id_perfume;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PedidoPerfume{" + "id_pedido_perfume=" + id_pedido_perfume + ", fk_id_pedido=" + fk_id_pedido + ", fk_id_perfume=" + fk_id_perfume + ", quantidade=" + quantidade + '}';
    } 
}

   