import java.time.LocalDate;
import java.time.Period;

// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        // Exemplo de cadastro de exame de Glicemia
        Glicemia exameGlicemia = new Glicemia("João", "A+", 1990, 120);
        exameGlicemia.classificarResultado();
        exameGlicemia.mostrarResultado();

        // Exemplo de cadastro de exame de Colesterol
        Colesterol exameColesterol = new Colesterol("Maria", "B+", 1985, 150, 80, "B");
        exameColesterol.classificarResultado();
        exameColesterol.mostrarResultado();

        // Exemplo de cadastro de exame de Triglicerídeos
        Triglicerideos exameTriglicerideos = new Triglicerideos("Pedro", "O-", 2005, 80);
        exameTriglicerideos.classificarResultado();
        exameTriglicerideos.mostrarResultado();
    }
}
