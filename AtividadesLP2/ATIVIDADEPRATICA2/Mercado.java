package AtividadesLP2.ATIVIDADEPRATICA2;

public class Mercado {

    private static String nome;
    private static float preco;
    private static int estoque;
    private static int qntProdutos = 0;
    

    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Arroz", 10.50f, 20);
        produto1.setNome("Arroz");
        produto1.setPreco(10.50f);
        produto1.setEstoque(20);
        

        Produtos produto2 = new Produtos("Feijão", 8.30f, 15);
        produto2.setNome("Feijão");
        produto2.setPreco(8.30f);
        produto2.setEstoque(15);

        Produtos produto3 = new Produtos("Macarrão", -5.00f, -10);
        produto3.setNome("Macarrão");
        produto3.setPreco(-5.00f);
        produto3.setEstoque(-10);

        System.out.println("Produto: " + produto1.getNome() + ", Preço: " + produto1.getPreco() + ", Estoque: " + produto1.getEstoque());
        System.out.println("Valor total do estoque: " + produto1.calcularValorEstoque());

        System.out.println("Produto: " + produto2.getNome() + ", Preço: " + produto2.getPreco() + ", Estoque: " + produto2.getEstoque());
        System.out.println("Valor total do estoque: " + produto2.calcularValorEstoque());

        System.out.println("Produto: " + produto3.getNome() + ", Preço: " + produto3.getPreco() + ", Estoque: " + produto3.getEstoque());
        System.out.println("Valor total do estoque: " + produto3.calcularValorEstoque());

        System.out.println("Quantidade total de produtos: " + Produtos.getQntProdutos());
    }


    
}
