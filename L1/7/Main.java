public class Main{
    public static void main(String[] args){
        Dicionario.tabela = new Var[4];
        Dicionario.tabela[0] = new Var();
        Dicionario.tabela[0].nome = "João";
        Dicionario.tabela[0].valor = 25;
        Dicionario.tabela[1] = new Var();
        Dicionario.tabela[1].nome = "Paulo";
        Dicionario.tabela[1].valor = 42;
        Dicionario.tabela[2] = new Var();
        Dicionario.tabela[2].nome = "Daniel";
        Dicionario.tabela[2].valor = 53;
        Dicionario.tabela[3] = new Var();
        Dicionario.tabela[3].nome = "Eren";
        Dicionario.tabela[3].valor = 31;

        Var exemplo = Dicionario.getVariavelByNome("Daniel");

        System.out.println("Nome: " + exemplo.nome + ", Valor: " + exemplo.valor);
    }
}