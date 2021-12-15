import java.util.Scanner;

public class CBBAtividadePratica6
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dez números: ");
        int i;
        int[] num = new int[10];
        for (i=0; i<10; i++){
            num[i]  = scan.nextInt();
        }
        
        // Maior numero
        int maior=0;
        for (i=1; i<=9; i++){
            if(num[i]>num[maior]){
                maior=i;
            }
        }
        System.out.println("\nO maior número é: ");
        System.out.println(num[maior]);
    }
}
