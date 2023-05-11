package Ex2;
import java.util.Scanner;

//
public class Principal {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        VerifVogal();

    }

    public static void VerifVogal() {
        System.out.println("Digite qualquer palavra: ");
        String palavra = entrada.next();
        System.out.println(palavra);
        String[] palavraVer = palavra.split("");
        for (int i = 0; i <palavraVer.length ; i++) {
            System.out.println(palavraVer[i]);
            switch (palavraVer[i]){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println("A letra "+ palavraVer[i] + " é uma vogal.");
                    break;

                default:
                    System.out.println("A letra "+ palavraVer[i] + " é uma consoante.");
            }

        }
    }

}
