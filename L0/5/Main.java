public class Main {
    public static void main(String args[]) {
        int i;
        String linha = "atrapalham ";
        for (i = 1; i < 101; i++) {
            if (i == 1) {
                System.out.println(i + " Java atrapalha muita gente");
            }
            System.out.println(i + " Java " + linha.repeat(i) + "muita gente");
        }
    }
}
