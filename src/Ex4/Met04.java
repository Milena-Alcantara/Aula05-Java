package Ex4;

public class Met04 {

    public static float conversor(int num){
        float metros;

        int polegadas = num;

        metros = (polegadas* 0.0254f);
        System.out.println("A conversão deu: ");
        System.out.println(metros);

        return metros;
    }
    }
