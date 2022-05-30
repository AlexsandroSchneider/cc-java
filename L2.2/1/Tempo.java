public class Tempo {
    private int hora, minuto, segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }
    public Tempo() {
        this(0,0,0);
    }
    public int getHora() {
        return this.hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return this.minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public Tempo somaTempo(Tempo a, Tempo b) {
        Tempo c = new Tempo();
        int minutoExtra = 0, horaExtra = 0;
        int segundos = a.getSegundo() + b.getSegundo();
        int minutos = a.getMinuto() + b.getMinuto();
        int horas = a.getHora() + b.getHora();

        if (segundos > 59) {
            c.setSegundo(segundos - 60);
            minutoExtra = 1;
        } else c.setSegundo(segundos);
        if (minutos + minutoExtra > 59) {
            c.setMinuto(minutos + minutoExtra - 60);
            horaExtra = 1;
        } else c.setMinuto(minutos + minutoExtra);
        c.setHora(horas + horaExtra);
        return c;
    }
    public Tempo decrementaTempo(Tempo a, Tempo b) {
        Tempo c = new Tempo();
        int minutoMenos = 0, horaMenos = 0;
        int segundos = a.getSegundo() - b.getSegundo();
        int minutos = a.getMinuto() - b.getMinuto();
        int horas = a.getHora() - b.getHora();

        if (segundos < 0) {
            c.setSegundo(segundos + 60);
            minutoMenos = 1;
        } else c.setSegundo(segundos);
        if (minutos - minutoMenos < 0) {
            c.setMinuto(minutos - minutoMenos + 60);
            horaMenos = 1;
        } else c.setMinuto(minutos - minutoMenos);
        c.setHora(horas - horaMenos);
        return c;
    }
    public int quantosDias(Tempo a) {
        int horas = a.getHora(), conta = 0;
        while (horas > 23) {
            horas = horas -24;
            conta++;
        }
        return conta;
    }
}
