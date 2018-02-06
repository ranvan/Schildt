import java.io.IOException;

public class WhileNotPoint {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaceCount = 0;
        do{
            ch = (char) System.in.read();
            if (ch == ' ') spaceCount++;
        }while (ch != '.');
        System.out.println("Количество пробелов " + spaceCount);
    }
}
