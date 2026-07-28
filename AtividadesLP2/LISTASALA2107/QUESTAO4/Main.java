package AtividadesLP2.LISTASALA2107.QUESTAO4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar();
        contaCorrente.sacar();
        contaCorrente.consultarSaldo();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar();
        contaPoupanca.sacar();
        contaPoupanca.consultarSaldo();
        
        ContaInvestimento contaInvestimento = new ContaInvestimento();
        contaInvestimento.depositar();
        contaInvestimento.sacar();
        contaInvestimento.consultarSaldo();
        contaInvestimento.renderJuros();
    }
}
