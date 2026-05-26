package AtividadesLP2.DOJOBIBLIOTECA;

public class App {
    public static void main(String args[]){
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.nomeBiblioteca="Biblioteca IFBA";
        biblioteca.quantidadeLivros=2;
        biblioteca.livrosCadastrados = 2;

        Usuario usuario1= new Usuario();
        usuario1.setNome("jORGE");
        usuario1.setIdUsuario(400);
        usuario1.setCurso("BSI");
        
        Livro livro1 = new Livro();
        livro1.Livro("Java","Cleber Bambam",102,2006,1);
        Livro livro2= new Livro();
        livro2.Livro("Java2","Cleber Bambam",103,2008,1);

        livro1.exibirInformacoes();
        livro1.emprestarLivro();
        livro1.exibirInformacoes();     
        biblioteca.exibirTotalLivros();
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        livro2.exibirInformacoes();
        livro2.emprestarLivro();
        livro2.exibirInformacoes();
        biblioteca.exibirTotalLivros();

        System.out.println("-------------");
        System.out.println("--DEVOLUCAO--");
        System.out.println("-------------");
        livro1.exibirInformacoes();
        livro1.devolverLivro();
        livro1.exibirInformacoes();
        biblioteca.exibirTotalLivros();

        System.out.println("-------------");
        System.out.println("--DEVOLUCAO--");
        System.out.println("-------------");
        livro2.exibirInformacoes();
        livro2.devolverLivro();
        livro2.exibirInformacoes();
        biblioteca.exibirTotalLivros();
    }
}
