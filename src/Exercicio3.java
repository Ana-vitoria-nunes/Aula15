import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entradaSenha = new Scanner(System.in);
        String senha;

        System.out.println("Digite um senha: ");
        senha = entradaSenha.next();

        boolean resultado=receberSenha(senha);
        System.out.println("A senha digitada é válida!\n"+resultado);

    }
    public static boolean receberSenha(String senha){
        boolean letraNum=true;
        int quantDigitos=0;
        for (int i=0; i < senha.length(); i++){
            if (Character.isLetterOrDigit(senha.charAt(i))==false){
                letraNum=false;
            }
            if (Character.isDigit(senha.charAt(i)) ==true){
                quantDigitos++;
            }
        }
        return (senha.length()>=10)&& (letraNum==true)&&(quantDigitos>=2);
    }

}

