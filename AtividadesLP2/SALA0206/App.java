package AtividadesLP2.SALA0206;

import AtividadesLP2.SALA0206.AREASAUDE.Enfermeiro;
import AtividadesLP2.SALA0206.AREASAUDE.Medico;
import AtividadesLP2.SALA0206.COLABORADOR.Colaborador;

public class App {

        public static void main(String[] args) {
            Colaborador colab1 = new Colaborador();
            Colaborador colab2 = new Medico(11, "Maria", 10, 12);
            Colaborador colab3 = new Enfermeiro(12, "João", 8, 10);
            colab1.participarCirugia();
            colab2.participarCirugia();
            colab3.participarCirugia();
        }
    
}
