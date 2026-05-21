package iterator;

import java.util.Iterator;

public class Inventario {


    public static Integer contarProdutosVencidos(Estoque estoque) {
        int quantidade = 0;
        for (Produto produto : estoque) {
            if (produto.isVencido()) {
                quantidade++;
            }
        }
        return quantidade;
    }


    public static Integer contarTotalProdutos(Estoque estoque) {
        int quantidade = 0;
        Iterator<Produto> p = estoque.iterator();

        while (p.hasNext()) {
            quantidade++;
            p.next();
        }
        return quantidade;
    }
}