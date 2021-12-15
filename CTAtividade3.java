import java.util.Scanner;

public class CTAtividade3
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] nota = new double[10];
        double media=0;
        int i, acima=0, abaixo=0;
        for (i=0; i<10; i++){
            nota[i]  = scan.nextDouble();
            media = media+nota[i];
        }
        media = media/10;
        for (i=0; i<10; i++){
            if (nota[i]>media){
                acima = acima+1;
            } else {
                abaixo = abaixo+1;
            }
        }
        System.out.println("A média de notas é: " +media);
        System.out.println("O numero de notas acima da média é: " +acima);
        System.out.println("e o número de notas abaixo da média é: " +abaixo);
    }
}
