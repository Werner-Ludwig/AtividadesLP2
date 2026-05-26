package AtividadesLP2.ATIVIDADEPRATICA2;

public class Produtos {
    
    private String nome;
    private float preco;
    private int estoque;
    private static int qntProdutos = 0;

    public Produtos(String nome, float preco, int estoque) {
        this.nome = nome;
        if(preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
        if(estoque < 0) {
            this.estoque = 0;
        } else {
            this.estoque = estoque;
        }
        qntProdutos++;
        
    }

    public double calcularValorEstoque() {
        return preco * estoque;
    }

    //GETTERS PARA PODER ACESSAR OS ATRIBUTOS PRIVADOS

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }   

    public int getEstoque() {
        return estoque;
    }

    public static int getQntProdutos() {
        return qntProdutos;
    }
   
    
    //SETTERS PARA PODER ALTERAR OS ATRIBUTOS PRIVADOS
    //SEGUINDO AS REGRAS DE NEGOCIO PARA PREÇO E ESTOQUE

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        if(preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void setEstoque(int estoque) {
        if(estoque < 0) {
            this.estoque = 0;
        } else {
            this.estoque = estoque;
        }
    }
}
