package AtividadesLP2.Prova1.Questao3;

public class Loja {
    private String nome, ramo;
    private int anoFundacao;
    private Vendedor vendedor;

    public void admitirVendedor(String nome, int idade) {
        this.vendedor = new Vendedor("thiago", 20);

    }
    public void demitirVendedor(Vendedor v) {
        this.vendedor = null;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRamo() {
        return ramo;
    }
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }
    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

}
