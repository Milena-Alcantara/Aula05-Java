package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Senha {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        senha();
    }

    public static void senha() {
        System.out.println("Digite sua senha: ");
        String senhaUser = entrada.next();
        String[] senhaVer = senhaUser.split("");
        List<Integer> numeros = new ArrayList<>();
        List<String> caracteres = new ArrayList<>();
        List<String>   carEspeciais = new ArrayList<>();
        for (int i = 0; i <senhaVer.length ; i++) {

            switch (senhaVer[i]){
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                  numeros.add(Integer.valueOf(senhaVer[i]));
                  break;
                case "@":
                case "#":
                case "!":
                case "$":
                case "&":
                case "%":
                case "*":
                case "?":
                case "/":
                case "=":
                    carEspeciais.add(senhaVer[i]);
                    break;

                default:
                    caracteres.add(senhaVer[i]);

            }
        }
        System.out.print(numeros);
        System.out.println();
        System.out.print(caracteres);
        System.out.println();
        System.out.print(carEspeciais);
        System.out.println();

        if(senhaUser.length() >=10 && numeros.size()>=2 && carEspeciais.size() == 0 ){
            System.out.println("Senha validada");
        }else {
            System.out.println("Senha Inválida");
        }
    }
}
