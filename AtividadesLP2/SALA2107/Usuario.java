package AtividadesLP2.SALA2107;

public class Usuario implements IPersistencia {
    
    @Override
    public void incluir() {
        System.out.println("Usuário incluído com sucesso.");
    }

    @Override
    public void excluir() {
        System.out.println("Usuário excluído com sucesso.");
    }

    @Override
    public void alterar() {
        System.out.println("Usuário alterado com sucesso.");
    }

    @Override
    public void consultar() {
        System.out.println("Consulta realizada com sucesso.");
    }

    
}
