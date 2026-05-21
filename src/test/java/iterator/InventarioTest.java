package iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarProdutosVencidosNoEstoque() {
        Estoque estoque = new Estoque(
                new Produto("Leite Integral", true),
                new Produto("Arroz 5kg", false),
                new Produto("Iogurte Morango", true),
                new Produto("Feijão Preto", false)
        );


        assertEquals(2, Inventario.contarProdutosVencidos(estoque));
    }

    @Test
    void deveContarTotalDeProdutosNoEstoque() {
        Estoque estoque = new Estoque(
                new Produto("Leite Integral", true),
                new Produto("Arroz 5kg", false),
                new Produto("Iogurte Morango", true),
                new Produto("Feijão Preto", false)
        );


        assertEquals(4, Inventario.contarTotalProdutos(estoque));
    }

    @Test
    void deveValidarComportamentoDosGettersESettersDoProduto() {
        Produto produto = new Produto("Café", false);


        produto.setNome("Café Torrado Premium");
        produto.setVencido(true);


        assertEquals("Café Torrado Premium", produto.getNome());
        assertTrue(produto.isVencido());
    }





}