public class Array100
{
    public static void main(String[] args){
        int[] num = new int[100];
        int i;
        for (i=0; i<100; i++){
            num[i] = i;
        }
        for (i=0; i<100; i++){
            System.out.println(num[i]);
        }
    }
}
