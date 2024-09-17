public class Combo {

    private Burguer burguer;
    private Bebida bebida;

    private Sobremesa sobremesa;

    @Override
    public String toString() {
        return "Combo{" +
                "burguer=" + burguer +
                ", bebida=" + bebida +
                ", sobremesa=" + sobremesa +
                '}';
    }

    public void CriarCombo(int tipo) {

        switch (tipo) {
            case 1:
                burguer = new Burguer(100, "Big Tasty", 39.9);
                bebida = new Bebida(300, "Coca", 10);
                sobremesa = new Sobremesa("Grande", "Bombom", 3.99);
                break;
            case 2:
                burguer = new Burguer(200, "Texas Burguer", 15.10);
                bebida = new Bebida(200, "Guarana", 9.50);
                sobremesa = new Sobremesa("Pequena", "Brigadeiro", 8.30);
                break;
            default:
                System.out.println("não existe essa opção");
        }
    }


}
