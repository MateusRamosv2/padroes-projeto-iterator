# Padrões de Projeto - Iterator

---

## Estrutura do Projeto

- **Entidade Base:** `Produto` → Representa o elemento individual dentro da nossa coleção. Carrega consigo as informações de negócio, como o nome e o status de validade (`vencido`).
- **Interfaces Nativas do Java:** `Iterable` e `Iterator` → Neste projeto, aproveitamos a estrutura nativa da linguagem Java. A interface `Iterable` determina que uma classe pode ser percorrida em laços de repetição, enquanto a interface `Iterator` define a mecânica da travessia (métodos `hasNext()` e `next()`).
- **Coleção Concreta:** `Estoque` → Implementa a interface `Iterable`. O seu papel principal é atuar como uma "caixa preta" que guarda a lista de produtos (neste caso, usando um `List` interno) e fornece ao mundo exterior um objeto iterador capaz de varrer esses itens sem expor a estrutura de dados interna.
- **Cliente / Processador:** `Inventario` → A classe responsável por consumir o iterador. Ela varre a coleção de forma limpa e sequencial — utilizando tanto o *Enhanced For* implícito quanto o `while` explícito — para aplicar regras de negócios, como contar produtos vencidos ou fazer o censo total do estoque.
- **Testes:** `InventarioTest` → Valida utilizando a biblioteca JUnit se a travessia pelo estoque ocorre de ponta a ponta sem falhas e se os filtros da regra de negócios (produtos vencidos x válidos) são aplicados corretamente durante a iteração.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O grande destaque arquitetural é o encapsulamento da lista: note que o cliente (`Inventario`) nunca interage diretamente com a lista privada dentro de `Estoque`. Em vez disso, ele depende da interface `Iterator` para varrer os elementos (`Produto`), garantindo que se no futuro o armazenamento interno do estoque mudar (de uma `List` para uma Árvore ou um Banco de Dados, por exemplo), o código do `Inventario` permanecerá intacto.

<img width="752" height="631" alt="Diagrama - Iterator" src="https://github.com/user-attachments/assets/4d87fe14-87a4-48dc-86d0-ed6797481d6c" />
