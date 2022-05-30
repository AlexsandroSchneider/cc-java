class Dicionario {
    public static Var tabela[];
    
    public static Var getVariavelByNome(String entrada) {
        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i].nome.equals(entrada)) return tabela[i];
        } return null;
    }
}
    