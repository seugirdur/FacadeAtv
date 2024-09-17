public class Sobremesa extends Produto{
    private String tamanho;


    public Sobremesa(String tamanho, String descricao, double preco) {
        this.tamanho = tamanho;
        this.descricao = descricao;
        this.preco = preco;
    }


    @Override
    public String toString() {
        return "Sobremesa{" +
                "tamanho='" + tamanho + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
