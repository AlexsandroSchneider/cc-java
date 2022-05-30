public class Main{
    public static void main(String[] args){
        String[] nova = {"nada", "algo", "token", "hello", "somebody", "help me", "smallville", "token", "how are you", "portal"};
        System.out.println("Strings que são iguais a 'token' ou iniciam com 'h': " + Parser.analize(nova));
    }
}