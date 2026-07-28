package AtividadesLP2.LISTASALA2107.QUESTAO3;

public class App {
    public static void main(String[] args) {
        Funcionario prof = new Professor();
        Funcionario tec = new Tecnico();
        Funcionario coord = new Coordenador();

        prof.calcularSalario();
        tec.calcularSalario();
        coord.calcularSalario();
    }
}
