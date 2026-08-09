package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Consulta {

    private String data;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Medico medico, Paciente paciente, String data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    public Consulta(String data) {
        this.data=data;  
    }


    public String getData() {
        return data;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
}
