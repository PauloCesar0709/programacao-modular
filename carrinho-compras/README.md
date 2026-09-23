# Exercício Carrinho de Compras

> <strong>Exercício para criar uma loja de suprimentos, utilizando os conceitos de Programação Orientada a Objetos.</strong>

---

## Descrição do Exercício

### 1. Crie uma classe Produto contento pelo menos as informações:

- Nome
- Código
- Preço

### 2. Crie uma classe Item para representar uma fatura de um item vendido na loja.

Um Item de venda é composto pelo produto que foi comprado, a quantidade comprada deste produto e o valor total do item, que é valor do produto vezes a quantidade comprada.

### 3. Crie uma classe Fatura, que deve possuir as seguintes informações como atributo:

- Um conjunto de Itens
- O valor total da fatura, que corresponde à soma de todos os itens comprados.

### 4. Na classe principal (método main):

#### (a) Crie pelo menos 3 produtos
#### (b) Apresente ao usu´ario um menu com as opções:

- 1 - Comprar: devem ser exibidas as informações dos produtos cadastrados. O usuário deve
informar o código do produto desejado e a quantidade comprada.
- 2 - Ver Fatura: o programa deve exibir a fatura gerada até o momento: Itens comprados com
suas informações, valor final.
- 3 - Excluir item: o usuário pode escolher um item a ser excluído da fatura.
- 4 - Alterar item: o usuário pode alterar a quantidade comprada de algum item.
- 5 - Finalizar: Finaliza o programa e exibe o valor final da compra.
- Obs: Ao entrar em um dos menus, sempre dê ao usuário a opção de voltar sem realizar nenhuma
  ação.

---

## Solução

### Estrutura de pastas

```
├── /carrinho-compras      # 📁 Aplicação java
    ├── /src         
        ├── Fatura         # 💰 Classe Fatura e seus métodos
        ├── Item           # 🧾 Classe Item e seus métodos.
        ├── Main.java      # 📌 Classe principal (main) do projeto.
        ├── Produto        # 🍚 Classe Produto e seus métodos
```

---

### Atributos

| Nome | Tipo | Classe |
| :--- | :--- | :--- |
| `nome` | `String` | Produto |
| `codigo` | `int` | Produto |
| `preco` | `double` | Produto |
| `produto` | `Produto` | Item |
| `quantidadeComprada` | `int` | Item |
| `itens` | `ArrayList<Item>` | Fatura |
| `valorTotalFatura` | `double` | Fatura |

> Todos os atributos são do tipo private (privado) respeitando um dos pilares da Programação Orientada a Objetos, o Encapsulamento.

---

### Métodos

| Método | Classe | Retorno |
| :--- | :--- | :--- |
| `mostrarInformacoesProduto()` | Produto | Método sem retorno (void) |
| `calcularValorTotal()` | Item | `return produto.getPreco() * quantidadeComprada` |
| `calcularValorTotalFatura()` | Fatura | `return total` |
| `adicionarItem(Produto produto, int quantidade)` | Fatura | Método sem retorno (void) |
| `removerItem(int indice)` | Fatura | Método sem retorno (void) |
| `alterarQuantidade(int indice, int novaQuantidade)` | Fatura | Método sem retorno (void) |
| `exibirFatura()` | Fatura | Método sem retorno (void) |

---

### Classe Main

```
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
```

---
