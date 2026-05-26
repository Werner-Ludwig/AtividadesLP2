package AtividadesLP2.ATIVIDADEPRATICA2;

public class Mercado {

    public String nome;
    public float preco;
    public int estoque;
    public static int qntProdutos = 0;

    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Arroz", 10.50f, 20);
        Produtos produto2 = new Produtos("Feijão", 8.30f, 15);
        Produtos produto3 = new Produtos("Macarrão", -5.00f, -10);

        System.out.println("Produto: " + produto1.nome + ", Preço: " + produto1.preco + ", Estoque: " + produto1.estoque);
        System.out.println("Produto: " + produto2.nome + ", Preço: " + produto2.preco + ", Estoque: " + produto2.estoque);
        System.out.println("Produto: " + produto3.nome + ", Preço: " + produto3.preco + ", Estoque: " + produto3.estoque);
        System.out.println("Quantidade total de produtos: " + Produtos.qntProdutos);
    }


    
}
