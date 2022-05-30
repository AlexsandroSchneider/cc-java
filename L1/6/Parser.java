public class Parser {
    static int analize(String[] stringArray){
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("token") || stringArray[i].startsWith("h")) {
                count++;
            }
        }
        return count;
    }
}