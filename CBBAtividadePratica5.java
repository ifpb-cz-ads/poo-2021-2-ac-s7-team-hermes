public class NomesDiasdaSemana
{
    public static void main(String[] args){
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        System.out.println("\nPrimeira impressão, utilizando while");
        int i=0;
        while (i<dias.length){
            System.out.println(dias[i]);
            i++;
        }
        
        System.out.println("\n-------------------\nSegunda impressão, utilizando do while\n");
        i=0;
        do {
            System.out.println(dias[i]);
            i++;
        } while (i<dias.length);
        
        System.out.println("\n-------------------\nTerceira impressão, utilizando for\n");
        for (i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }
    }
}
