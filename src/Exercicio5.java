import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner lerNum = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero para saber o dia da semana: ");
        num = lerNum.nextInt();

       ReceberNum(num);
    }
    public static int ReceberNum(int num) {
        switch (num) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");

                break;
            case 5:
                System.out.println("Sexta-feira");

                break;
            case 6:
                System.out.println("Sábado");

                break;
            case 7:
                System.out.println("Domingo");

                break;
        }
        return num;
    }
}

