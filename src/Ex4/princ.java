package Ex4;
import java.util.Scanner;
//Escreva um programa que leia um número em polegadas e o
//converta em metros. Nota: Uma polegada é 0,0254 metros.
public class princ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as polegadas: ");
        conversor(sc.nextInt());


    }

    public static float conversor(int num) {
        float metros;
        int polegadas = num;

        metros = (polegadas * 0.0254f);
        System.out.println("A conversão deu: ");
        System.out.println(metros);

        return metros;
    }
}