class ErroInterpretador extends Exception {}
class ErroSintaxe extends ErroInterpretador {}
class ErroExecucao extends ErroInterpretador {}
class TokenDesconhecido extends ErroSintaxe {}
class ComandoMalFormado extends ErroSintaxe {}
class ValorInvalido extends ErroExecucao {}

public class Main {
    public static void main(String[] args) {
        try {
            Gerenciador g = new Gerenciador();
            String s = new String("Hello");
            g.analisa(s);
        } catch(ErroSintaxe a) {
            System.out.println("Erro Sintaxe!");
        } catch(TokenDesconhecido b) {
            System.out.println("Token Desconhecido!");
        } catch(ComandoMalFormado c) {
            System.out.println("Comando Mal Formado!");
        } catch(ValorInvalido d) {
            System.out.println("Valor Invalido!");
        } catch(ErroExecucao e) {
            System.out.println("Erro Execucao!"); 
        }
    }
}
