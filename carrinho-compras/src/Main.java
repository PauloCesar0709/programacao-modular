import java.util.ArrayList;
import java.util.Scanner;

void main() {
    Scanner entrada = new Scanner(System.in);

    ArrayList<Produto> produtos = new ArrayList<>();

    produtos.add( new Produto("Arroz", 20, 14.75));
    produtos.add(new Produto("Feijão", 46, 8.50));
    produtos.add(new Produto("Macarrão", 500, 7.00));
    produtos.add(new Produto("Requeijão",999, 4.35));

    Fatura fatura = new Fatura();
    int escolha = 0;

    while (escolha != 5) {
        System.out.println("1 - COMPRAR");
        System.out.println("2 - VER FATURA");
        System.out.println("3 - EXCLUIR ITEM");
        System.out.println("4 - EDITAR ITEM");
        System.out.println("5 - FINALIZAR");
        escolha = entrada.nextInt();

        if (escolha == 1) {
            for (Produto produto : produtos) {
                produto.mostrarInformacoesProduto();
            }

            System.out.println("Digite 0 para voltar");

            System.out.println("Digite o código do produto desejado: ");
            int codigo = entrada.nextInt();
            entrada.nextLine();

            if (codigo == 0) continue;

            Produto produtoSelecionado = null;
            for (Produto p : produtos){
                if (p.getCodigo() == codigo){
                    produtoSelecionado = p;
                    break;
                }
            }

            if (produtoSelecionado != null){
                System.out.println("Digite a quantidade do produto desejado: ");
                int quantidade = entrada.nextInt();

                if (quantidade > 0){
                    fatura.adicionarItem(produtoSelecionado, quantidade);
                    System.out.println("Item adicionado com sucesso!");
                } else {
                    System.out.println("Quantidade inválida!");
                }
            } else {
                System.out.println("Produto não encontrado!");
            }
        }

        if (escolha == 2){
            fatura.exibirFatura();
        }

        if (escolha == 3){
            if (!fatura.getItens().isEmpty()) {
                fatura.exibirFatura();
                System.out.println("Digite o número do produto que deseja excluir(Digite 0 para voltar): ");
                int indice = entrada.nextInt();

                if (indice == 0) continue;

                while (indice < 0 || indice > fatura.getItens().size()){
                    System.out.println("Por favor, digite um número válido: ");
                    indice = entrada.nextInt();
                }

                fatura.removerItem(indice-1);

                System.out.println("Item "+indice+" excluído com sucesso!");
            } else {
                System.out.println("A fatura etsá vazia.");
            }

        }

        if (escolha == 4){
            if (!fatura.getItens().isEmpty()){
                fatura.exibirFatura();
                System.out.println("Digite o número do produto que deseja alterar (Digite 0 para voltar): ");
                int indice = entrada.nextInt();

                if (indice == 0) continue;

                while (indice < 0 || indice > fatura.getItens().size()){
                    System.out.println("Por favor, digite um número válido: ");
                    indice = entrada.nextInt();
                }

                System.out.println("Agora digite a nova quantidade: ");
                int novaQuantidade = entrada.nextInt();

                fatura.alterarQuantidade(indice - 1, novaQuantidade);

                System.out.println("Quantidade do item "+indice+" alterado com sucesso");

            }
        }

        if (escolha == 5){
            System.out.println("=========== COMPRA FINALIZADA ===========");
            fatura.exibirFatura();
        }
    }
}
