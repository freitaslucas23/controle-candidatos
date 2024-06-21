package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidatos(1900.0);
        analisarCandidatos(2200.0);
        analisarCandidatos(2000.0);
    }
    static void analisarCandidatos(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("contraproposta ");
        } else {
            System.out.println("aguardar");
        }
    }
}