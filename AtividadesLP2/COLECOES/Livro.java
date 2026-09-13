package AtividadesLP2.COLECOES;

public class Livro {

    private int isbn;
    private String autor;
    private String editora;
    private String titulo;
    
    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }   

    public void setAutor(String autor) {
        this.autor = autor;
    }   

    public void setEditora(String editora) {
        this.editora = editora;
    }   
    
}
