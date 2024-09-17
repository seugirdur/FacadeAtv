public class Burguer extends Produto{
    private int gramas;

    public Burguer(int gramas, String descricao, double preco) {
        this.gramas = gramas;
        this.descricao = descricao;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Burguer{" +
                "gramas=" + gramas +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
