package provacrud;

public class Product {

    static void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Product get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void remove(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nome;
    private Double custoUnidade;
    private int quantidade;
    private int qReservado;

    public Product(String nome, Double custoUnidade, int quantidade, int qReservado) {
        this.nome = nome;
        this.custoUnidade = custoUnidade;
        this.quantidade = quantidade;
        this.qReservado = qReservado;
    }

    public void entradaDeProduto(int qEntrada) {
        this.quantidade += qEntrada;
    }

    public void saidaDeProduto(int qSaida) {
        if (this.qReservado > 0) {
            this.qReservado -= qSaida;
        }

        if (this.qReservado < 0) {
            this.quantidade += this.qReservado;
        }

        if (this.qReservado == 0) {
            this.quantidade -= qSaida;
        }
    }

    public String toString() {
        return this.nome
                + " - R$ " + this.custoUnidade
                + " - Qtd: " + this.quantidade
                + " - Res: " + this.qReservado;
    }

    Object nome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}