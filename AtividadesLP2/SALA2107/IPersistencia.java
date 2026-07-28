package AtividadesLP2.SALA2107;

public interface IPersistencia {

    public abstract void incluir();

    public abstract void excluir();

    public abstract void alterar();

    public abstract void consultar();

    default void limpeza() {
        
    }
    
}
