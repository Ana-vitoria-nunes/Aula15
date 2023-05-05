import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner lerPolegada = new Scanner(System.in);
        int valor;
        System.out.println("Digite um numero em polegada: ");
        valor = lerPolegada.nextInt();

        double polegada=ReceberValor(valor);
        System.out.println("Seu número em metros é: "+polegada);

    }
    public static double ReceberValor(int valor) {

       double polegada=valor*0.0254;

       return polegada;
    }

}
