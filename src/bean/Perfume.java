package bean;

/**
 *
 * @author Duduzada
 */
public class Perfume {
    private int id_perfume;
    private float volume;
    private float lote;
    private String tipoDoPerfume;
    private float valorVenda;
    private String corDoLiquido;

    public Perfume(int id_perfume, float volume, float lote, String tipoDoPerfume, float valorVenda, String corDoLiquido) {
        this.id_perfume = id_perfume;
        this.volume = volume;
        this.lote = lote;
        this.tipoDoPerfume = tipoDoPerfume;
        this.valorVenda = valorVenda;
        this.corDoLiquido = corDoLiquido;
    }
    
    public Perfume() {
        this.id_perfume = 0;
        this.volume = 0;
        this.lote = 0;
        this.tipoDoPerfume = "sem tipo";
        this.valorVenda = 0;
        this.corDoLiquido = "incolor";
    }

    public int getId_perfume() {
        return id_perfume;
    }

    public void setId_perfume(int id_perfume) {
        this.id_perfume = id_perfume;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getLote() {
        return lote;
    }

    public void setLote(float lote) {
        this.lote = lote;
    }

    public String getTipoDoPerfume() {
        return tipoDoPerfume;
    }

    public void setTipoDoPerfume(String tipoDoPerfume) {
        this.tipoDoPerfume = tipoDoPerfume;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getCorDoLiquido() {
        return corDoLiquido;
    }

    public void setCorDoLiquido(String corDoLiquido) {
        this.corDoLiquido = corDoLiquido;
    }

    @Override
    public String toString() {
        return "Perfume{" + "id_perfume=" + id_perfume + ", volume=" + volume + ", lote=" + lote + ", tipoDoPerfume=" + tipoDoPerfume + ", valorVenda=" + valorVenda + ", corDoLiquido=" + corDoLiquido + '}';
    }
}

   