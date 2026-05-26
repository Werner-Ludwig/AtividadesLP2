package AtividadesLP2.DOJOBIBLIOTECA;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    private int anoPublicacao;
    private int qntDisponivel;

    public void Livro(String titulo, String autor, int isbn, int anoPublicacao, int qntDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.qntDisponivel = qntDisponivel;
    }

    public void LivroAutorNome (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestarLivro() {
        if(qntDisponivel > 0) {
            qntDisponivel--;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponível para empréstimo.");
        }
        
    }

    public void devolverLivro() {
        qntDisponivel++;
        System.out.println("Livro devolvido com sucesso!");

    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Quantidade Disponível: " + qntDisponivel);
    }

}
