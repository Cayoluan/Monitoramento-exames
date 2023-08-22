import java.time.LocalDate;
import java.time.Period;

// Classe para representar o exame de Colesterol
class Colesterol extends Exame {
    private int quantidadeLDL;
    private int quantidadeHDL;
    private String risco;

    public Colesterol(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeLDL, int quantidadeHDL, String risco) {
        super(nomePaciente, tipoSanguineo, anoNascimento, quantidadeLDL);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.risco = risco;
    }

    @Override
    public void classificarResultado() {
        System.out.println("Resultado do exame de Colesterol para " + nomePaciente + ":");
        System.out.println("LDL: " + quantidadeLDL + " mg/dL");
        System.out.println("HDL: " + quantidadeHDL + " mg/dL");

        System.out.println("Classificação do LDL:");
        if (risco.equals("B")) {
            if (quantidadeLDL < 100) {
                System.out.println("Baixo risco");
            } else if (quantidadeLDL < 70) {
                System.out.println("Médio risco");
            } else {
                System.out.println("Alto risco");
            }
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Colesterol LDL: " + quantidadeLDL + " mg/dL");
        System.out.println("Colesterol HDL: " + quantidadeHDL + " mg/dL");
        classificarResultado();
        System.out.println("Idade do paciente: " + calcularIdade() + " anos");
        System.out.println("Tipo sanguíneo: " + tipoSanguineo);
    }
}