import java.time.LocalDate;
import java.time.Period;

// Classe abstrata para representar um exame
abstract class Exame {
    protected String nomePaciente;
    protected String tipoSanguineo;
    protected int anoNascimento;
    protected int quantidadeMgDL;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento, int quantidadeMgDL) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
        this.quantidadeMgDL = quantidadeMgDL;
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = Period.between(LocalDate.of(anoNascimento, 1, 1), dataAtual).getYears();
        return idade;
    }

    public abstract void classificarResultado();

    public abstract void mostrarResultado();
}