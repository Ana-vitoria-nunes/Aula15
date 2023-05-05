import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner lerString = new Scanner(System.in);
        String  palavra;
        System.out.println("Digite uma frase: ");
        palavra = lerString.next();

        System.out.println("Todas as letras são vogais?\n"+"resposta: "+ReceberPalavra(palavra));

    }
    public static boolean ReceberPalavra(String frase) {

        String palavra_vowels ="aeiou";
        String phrase = frase.toLowerCase();
        for (int i=0; i< phrase.length(); i++){
            if (palavra_vowels.indexOf(phrase.charAt(i))==-1)

                return false;
            }
        return true;
    }

}
