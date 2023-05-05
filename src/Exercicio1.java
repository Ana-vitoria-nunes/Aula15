import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner lernumero = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = lernumero.nextInt();

        System.out.println("O número é par?\n" + "Resposta: " +Recebernumero(numero) );

    }
    public static boolean Recebernumero(int valor) {
        final int resultado = 10;
        if (valor == 0) {
            return true;
        }
        while (valor != 0) {
            if ((valor % resultado) % 2 != 0) {
                return false;
            }
            valor /= 10;
        }
        return true;
    }
}