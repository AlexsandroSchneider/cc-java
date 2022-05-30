public class Tempo {
    private int dia, hora, minuto, segundo;

    public Tempo(int dia, int hora, int minuto, int segundo) {
        this.setDia(dia);
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }
    public Tempo() {
        this(0,0,0,0);
    }
    public int getDia() {
        return this.dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
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
        int minutoMais = 0, horaMais = 0, diaMais = 0;
        int segundos = a.getSegundo() + b.getSegundo();
        int minutos = a.getMinuto() + b.getMinuto();
        int horas = a.getHora() + b.getHora();
        int dias = a.getDia() + b.getDia();

        if (segundos > 59) {
            c.setSegundo(segundos - 60);
            minutoMais = 1;
        } else c.setSegundo(segundos);
        if (minutos + minutoMais > 59) {
            c.setMinuto(minutos + minutoMais - 60);
            horaMais = 1;
        } else c.setMinuto(minutos + minutoMais);
        if (horas + horaMais > 23) {
            c.setHora(horas + horaMais - 24);
            diaMais = 1;
        } else c.setHora(horas + horaMais);
        c.setDia(dias + diaMais);
        return c;
    }
    public Tempo decrementaTempo(Tempo a, Tempo b) {
        Tempo c = new Tempo();
        int minutoMenos = 0, horaMenos = 0, diaMenos = 0;
        int segundos = a.getSegundo() - b.getSegundo();
        int minutos = a.getMinuto() - b.getMinuto();
        int horas = a.getHora() - b.getHora();
        int dias = a.getDia() - b.getDia();

        if (segundos < 0) {
            c.setSegundo(segundos + 60);
            minutoMenos = 1;
        } else c.setSegundo(segundos);
        if (minutos - minutoMenos < 0) {
            c.setMinuto(minutos - minutoMenos + 60);
            horaMenos = 1;
        } else c.setMinuto(minutos - minutoMenos);
        if (horas - horaMenos < 0) {
            c.setHora(horas - horaMenos + 24);
            diaMenos = 1;
        } else c.setHora(horas - horaMenos);
        c.setDia(dias - diaMenos);
        return c;
    }
    public Tempo avancaTempo(Tempo a, double quanto) {
        Tempo avanca = new Tempo((int)quanto, (int)(quanto%1*24), 0, 0);
        return somaTempo(a, avanca);
    }
}
