package AtividadesLP2.ATIVIDADEPRATICA2;

public class Produtos {
    
    public String nome;
    public float preco;
    public int estoque;
    public static int qntProdutos = 0;

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
    
}
