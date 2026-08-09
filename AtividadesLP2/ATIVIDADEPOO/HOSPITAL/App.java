package AtividadesLP2.ATIVIDADEPOO.HOSPITAL;

public class App { 

    public static void main(String[] args) {
        Medico medico1 = new Medico("Dr. João", "010101", 12345);
        Paciente paciente1 = new Paciente("Maria", "020202");
        Consulta consulta1 = new Consulta(medico1, paciente1, "10/06/2026");

        System.out.println("Consulta marcada para: " + consulta1.getData());
        System.out.println("Médico: " + consulta1.getMedico().getNome());
        System.out.println("Paciente: " + consulta1.getPaciente().getNome());
        System.out.println("Prontuario: " + consulta1.getPaciente().getProntuario().getDescricao());
    }
    
}
