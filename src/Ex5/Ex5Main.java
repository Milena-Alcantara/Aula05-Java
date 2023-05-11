package Ex5;

import java.util.Random;
import java.util.Scanner;
//Escreva um programa Java que receba um número do usuário
//e gere um inteiro entre 1 e 7. Ele exibe o nome do dia da
//semana. Nota: usem switch case.
public class Ex5Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numeroUser = sc.nextInt();
        if(numeroUser % 7 == 0){
            Random random = new Random();
            numeroUser = random.nextInt(7)+1;
            System.out.println("O número gerado foi: "+numeroUser+ " ,portanto: ");

            switch (numeroUser){
                case 1:
                    System.out.println("É segunda-feira!");
                    break;
                case 2:
                    System.out.println("É terça-feira!");
                    break;
                case 3:
                    System.out.println("É quarta-feira!");
                    break;
                case 4:
                    System.out.println("É quinta-feira!");
                    break;
                case 5:
                    System.out.println("É sexta-feira!");
                    break;
                case 6:
                    System.out.println("É sábado!");
                    break;
                case 7:
                    System.out.println("É domingo");
                    break;
            }
        }else{
            System.out.println("Número inválido para os dias da semana.");
            System.exit(0);
        }
    }
}