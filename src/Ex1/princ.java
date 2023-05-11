package Ex1;
import java.util.ArrayList;
import java.util.Scanner;
///////Escreva um método para verificar se cada dígito de um
////////determinado número inteiro é par. Retorna verdadeiro se todos
//os dígitos forem pares, caso contrário, falso

public class princ {

    public static void main(String[] args) {
        System.out.println("Digite qualquer número: ");
        VerificarNum();
    }
    public static char ch;
    public static char VerificarNum() {
        Scanner sc = new Scanner(System.in);
        String numero = sc.next();
        int caract;

        for (int i = 0; i < numero.length(); i++) {
            char ch = numero.charAt(i);
             caract =  Integer.parseInt(String.valueOf(numero.charAt(i)));
            if(caract % 2 == 0){
                System.out.println( caract + " True ");

            }else {
                System.out.println(caract +" False ");
            }
        }
       return ch;
    }
}





