public class Main {
    public static void main(String args[]) {
        int i, j, nDiv = 0;
        for(i = 100; i<200; i++){
            for(j = 1; j <= i; j++){
                if (i%j == 0){
                    nDiv++;
                }
            }
            if(nDiv == 2){
                System.out.println((i));
            }
            nDiv = 0;
        }
    }
}
