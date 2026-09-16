import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> itens;
    private double valorTotalFatura;

    public Fatura() {
        this.itens = new ArrayList<>();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotalFatura;
    }

    public void setValorTotal(double valorTotal) {

        this.valorTotalFatura = valorTotal;
    }

    public double calcularValorTotalFatura(){
        double total = 0.0;
        for (Item item : itens) {
            total += item.calcularValorTotal();
        }
        return total;
    }

    public void adicionarItem(Produto produto, int quantidade){
        for (Item item : itens){
            if (item.getProduto().getCodigo() == produto.getCodigo()){
                item.setQuantidadeComprada(item.getQuantidadeComprada() + quantidade);
                return;
            }
        }
        itens.add(new Item(produto, quantidade));
    }

    public void removerItem(int indice){
        if (indice > 0 && indice < itens.size()){
            itens.remove(indice);
        }
    }

    public void alterarQuantidade(int indice, int novaQuantidade){
        if (indice > 0 && indice < itens.size()){
            if (novaQuantidade <= 0){
                itens.remove(indice);
            } else {
                itens.get(indice).setQuantidadeComprada(novaQuantidade);
            }
        }
    }

    public void exibirFatura(){
       if (itens.isEmpty()){
           System.out.println("A fatura está vazia!");
       } else {
           System.out.println("====== ITENS ======");
           for (int i = 0; i < itens.size(); i++){
               Item item = itens.get(i);
               System.out.println((i+1)+" | "+item.getProduto().getNome()+" | "+item.getQuantidadeComprada()+" | "+item.getProduto().getPreco()+" | "+item.calcularValorTotal());
           }
           System.out.println("Valor total da fatura: "+calcularValorTotalFatura());
       }
    }
}
