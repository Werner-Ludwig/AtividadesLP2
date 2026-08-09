package AtividadesLP2.SALA0206.AREASAUDE;

import AtividadesLP2.SALA0206.COLABORADOR.Colaborador;

public class Medico extends Colaborador {

    private int crm;

    public Medico(int crm, String nome, int rg, int cpf) {
        super(nome, rg, cpf);
        this.crm = crm;        
    }
    //@Override
    public void participarCirugia() {        
            System.out.println("Medico realizando da cirurgia");        
    }
    
    public int getCrm() {
        return crm;
    }
}
