public class Main {
    public static void main(String[] args) {
        Tempo um = new Tempo(2,2,25,42);
        Tempo dois = new Tempo();
        dois.setDia(3);
        dois.setHora(15);
        dois.setMinuto(27);
        dois.setSegundo(30);
        Tempo tres = um.somaTempo(um, dois);
        Tempo quatro = dois.decrementaTempo(tres, dois);
        Tempo cinco = dois.avancaTempo(tres, 2.5);
        System.out.println(um.getDia() + " dias " + um.getHora() + ":" + um.getMinuto() + ":" + um.getSegundo());
        System.out.println(dois.getDia() + " dias " + dois.getHora() + ":" + dois.getMinuto() + ":" + dois.getSegundo());
        System.out.println(tres.getDia() + " dias " + tres.getHora() + ":" + tres.getMinuto() + ":" + tres.getSegundo());
        System.out.println(quatro.getDia() + " dias " + quatro.getHora() + ":" + quatro.getMinuto() + ":" + quatro.getSegundo());
        System.out.println(cinco.getDia() + " dias " + cinco.getHora() + ":" + cinco.getMinuto() + ":" + cinco.getSegundo());
    }
}
