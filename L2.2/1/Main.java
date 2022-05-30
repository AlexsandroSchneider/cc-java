public class Main {
    public static void main(String[] args) {
        Tempo um = new Tempo(2,25,42);
        Tempo dois = new Tempo();
        dois.setHora(15);
        dois.setMinuto(27);
        dois.setSegundo(30);
        Tempo tres = um.somaTempo(um, dois);
        Tempo quatro = dois.decrementaTempo(tres, dois);
        Tempo cinco = dois.somaTempo(tres, tres);
        cinco = dois.somaTempo(cinco, cinco);
        System.out.println(um.getHora() + ":" + um.getMinuto() + ":" + um.getSegundo());
        System.out.println(dois.getHora() + ":" + dois.getMinuto() + ":" + dois.getSegundo());
        System.out.println(tres.getHora() + ":" + tres.getMinuto() + ":" + tres.getSegundo());
        System.out.println(quatro.getHora() + ":" + quatro.getMinuto() + ":" + quatro.getSegundo());
        System.out.println(cinco.getHora() + ":" + cinco.getMinuto() + ":" + cinco.getSegundo());
        System.out.println(um.quantosDias(cinco));
    }
}
