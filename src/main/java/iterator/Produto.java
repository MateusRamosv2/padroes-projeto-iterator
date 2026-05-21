package iterator;

public class Produto {

    private String nome;
    private boolean vencido;

    public Produto(String nome, boolean vencido) {
        this.nome = nome;
        this.vencido = vencido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }
}