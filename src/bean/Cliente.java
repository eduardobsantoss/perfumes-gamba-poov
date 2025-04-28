package bean;

/**
 *
 * @author Duduzada
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String end_insta;
    private String end_face;
    private String cartaoDeCredito;
    private String pix;

    public Cliente(String cpf, String nome, String telefone, String endereco, String end_insta, String end_face, String cartaoDeCredito, String pix) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.end_insta = end_insta;
        this.end_face = end_face;
        this.cartaoDeCredito = cartaoDeCredito;
        this.pix = pix;
    }
    
    public Cliente() {
        this.cpf = "sem cpf";
        this.nome = "sem nome";
        this.telefone = "sem telefone";
        this.endereco = "sem endereco";
        this.end_insta = "sem ed_insta";
        this.end_face = "sem ed_face";
        this.cartaoDeCredito = "sem cartao";
        this.pix = "sem pix";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnd_insta() {
        return end_insta;
    }

    public void setEnd_insta(String end_insta) {
        this.end_insta = end_insta;
    }

    public String getEnd_face() {
        return end_face;
    }

    public void setEnd_face(String end_face) {
        this.end_face = end_face;
    }

    public String getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(String cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", end_insta=" + end_insta + ", end_face=" + end_face + ", cartaoDeCredito=" + cartaoDeCredito + ", pix=" + pix + '}';
    }
    
    
}
