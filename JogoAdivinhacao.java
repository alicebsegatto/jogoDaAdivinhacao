import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativasMaximas = 12;
        int tentativas = 0;
        boolean acertou = false;
        int chute = -1;

        System.out.println("Bem-vindo ao Jogo de Adivinhação do Número Secreto!");
        System.out.println("Você terá 12 tentativas para acertar o número secreto, que será entre 1 e 100");

        while (chute != numeroSecreto && tentativas < tentativasMaximas) {
            System.out.print("Escolha um número de 1 e 100: ");
            chute = lerTeclado.nextInt();
            tentativas++;

            if (chute == numeroSecreto) {
                acertou = true;
                System.out.println("Parabéns você acertou o número secreto que é " + numeroSecreto + ", em " + tentativas + " tentativas.");
                break;
            } else if (chute > numeroSecreto) {
                System.out.println("Seu chute foi muito alto, tente um número mais baixo que " + chute + ".");
            } else {
                System.out.println("Seu número foi muito baixo, tente um número mais alto que " + chute + ".");
            }

        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram e você não conseguiu acertar o número secreto que era " + numeroSecreto + ".");
        }

        lerTeclado.close();       

    }
}
