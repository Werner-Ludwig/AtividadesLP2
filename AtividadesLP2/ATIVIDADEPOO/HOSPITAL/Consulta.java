package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class Consulta {

    private String data;
    Medico medico;
    Paciente paciente;

    public Consulta(Medico medico, Paciente paciente, String data) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
    }

    //public Consulta(String data) {
    //    this.data=data;  
    //}


    //public Consulta(){    
    //    this("09/06/2026"); 
    //}
    
}
