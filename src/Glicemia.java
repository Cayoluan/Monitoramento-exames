import java.time.LocalDate;
import java.time.Period;

// Classe para representar o exame de Glicemia
class Glicemia extends Exame {
    private int quantidadeGlicose;

    public Glicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento, quantidadeGlicose);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public void classificarResultado() {
        System.out.println("Resultado do exame de Glicemia para " + nomePaciente + ":");
        if (quantidadeGlicose < 100) {
            System.out.println("Normoglicemia");
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            System.out.println("Pré-diabetes");
        } else {
            System.out.println("Diabetes estabelecido");
        }
    }

    @Override
    public void mostrarResultado() {
        System.out.println("Glicemia: " + quantidadeGlicose + " mg/dL");
        classificarResultado();
        System.out.println("Idade do paciente: " + calcularIdade() + " anos");
        System.out.println("Tipo sanguíneo: " + tipoSanguineo);
    }
}