public class Bebida extends Produto{
    private int ml;

    public Bebida(int ml, String descricao, double preco) {
        this.ml = ml;
        this.descricao = descricao;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Bebida{" +
                "ml=" + ml +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
