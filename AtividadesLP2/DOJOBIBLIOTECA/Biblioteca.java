package AtividadesLP2.DOJOBIBLIOTECA;

public class Biblioteca {
    public String nomeBiblioteca;
    public int quantidadeLivros;
    public static int livrosCadastrados = 0;

    public static void exibirTotalLivros() {
        System.out.println("Total de livros cadastrados: " + livrosCadastrados);
    }


}
