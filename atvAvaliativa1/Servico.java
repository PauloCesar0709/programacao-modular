import java.util.TimeZone;

public class Servico {
    private String nome;
    private TimeZone tempoEstimado;
    private double valor;
    private String categoria;

    public Servico(String nome, double valor, String categoria) {
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TimeZone getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(TimeZone tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
