package AtividadesLP2.DOJO2807;

public class IplMedico implements IPersistenciaDojo {

    @Override
    public void Incluir() {
        System.out.println("Medico incluido com sucesso!");
    }

    @Override
    public void Alterar() {
        System.out.println("Medico alterado com sucesso!");
    }

    @Override
    public void Excluir() {
        System.out.println("Medico excluido com sucesso!");
    }

    @Override
    public void Consultar() {
        System.out.println("Medico consultado com sucesso!");
    }

    @Override
    public void Listar() {
        System.out.println("Listando medicos...");
    }
}
