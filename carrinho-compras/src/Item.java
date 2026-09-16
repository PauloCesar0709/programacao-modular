import java.util.ArrayList;

public class Item {
    private Produto produto;
    private int quantidadeComprada;

    public Item(Produto produto, int quantidadeComprada) {
        this.produto = produto;
        this.quantidadeComprada = quantidadeComprada;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double calcularValorTotal(){

        return produto.getPreco() * quantidadeComprada;
    }
}
