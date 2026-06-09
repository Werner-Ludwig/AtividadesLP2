package AtividadesLP2.SALA0206.AREASAUDE;

import AtividadesLP2.SALA0206.COLABORADOR.Colaborador;

public class Enfermeiro extends Colaborador {

    private int coren;

    public Enfermeiro(int coren, String nome, int rg, int cpf) {
        super(nome, rg, cpf);
        this.coren = coren;

        //super.nome, mais legivel pois ja remete a classe mae.
        //this.nome, igual ao super mas menos legivel, pois nao remete a classe mae.
    }


    //@Override
    public void participarCirugia() {        
            System.out.println("Enfermeiro realizando da cirurgia");        
    }
}
