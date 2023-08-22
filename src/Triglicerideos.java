import java.time.LocalDate;
import java.time.Period;
// Classe para representar o exame de Triglicerídeos
class Triglicerideos extends Exame {
    public Triglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeMgDL) {
        super(nomePaciente, tipoSanguineo, anoNascimento, quantidadeMgDL);
    }

    @Override
    public void classificarResultado() {
        System.out.println("Resultado do exame de Triglicerídeos para " + nomePaciente + ":");
        if (calcularIdade() >= 20) {
            if (quantidadeMgDL < 150) {
                System.out.println("Normal");
            } else {
                System.out.println("Elevado");
            }
        } else if (calcularIdade() >= 10) {
            if (quantidadeMgDL < 90) {
                System.out.println("Normal");
            } else {
                System.out.println("Elevado");
            }
        } else {
            if (quantidadeMgDL < 75) {
                System.out.println("Normal");
            } else {
                System.out.println("Elevado");
            }
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Triglicerídeos: " + quantidadeMgDL + " mg/dL");
        classificarResultado();
        System.out.println("Idade do paciente: " + calcularIdade() + " anos");
        System.out.println("Tipo sanguíneo: " + tipoSanguineo);
    }
}