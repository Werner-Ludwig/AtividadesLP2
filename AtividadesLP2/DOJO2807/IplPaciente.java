package AtividadesLP2.DOJO2807;

public class IplPaciente implements IPersistenciaDojo {
    
    @Override
    public void Incluir() {
        System.out.println("Paciente incluido com sucesso!");
    }

    @Override
    public void Alterar() {
        System.out.println("Paciente alterado com sucesso!");
    }

    @Override
    public void Excluir() {
        System.out.println("Paciente excluido com sucesso!");
    }

    @Override
    public void Consultar() {
        System.out.println("Paciente consultado com sucesso!");
    }

    @Override
    public void Listar() {
        System.out.println("Listando pacientes...");
    }
}
