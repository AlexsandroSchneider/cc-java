public class Main {
    public static void main(String args[]) {
        int i = 2, j, n = 15, nDiv = 0; // Lembrando que 1 não é considerado número primo
        while(n > 0){
            for(j = 1; j <= i; j++){
                if (i%j == 0){
                    nDiv++;
                }
            }
            if(nDiv == 2){
                System.out.println((i));
                n--;
            }
            nDiv = 0;
            i++;
        }
    }
}
