package AtividadesLP2.SALA2107;

public class Veiculo implements IPersistencia {

    @Override
    public void incluir() {
        System.out.println("Inclusão de veículo realizada com sucesso.");
    }

    @Override
    public void excluir() {
        System.out.println("Exclusão de veículo realizada com sucesso.");
    }

    @Override
    public void alterar() {
        System.out.println("Alteração de veículo realizada com sucesso.");
    }

    @Override
    public void consultar() {
        System.out.println("Consulta de veículo realizada com sucesso.");
    }
    
}
