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
