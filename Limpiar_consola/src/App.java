import java.io.IOException;
public class App {
    public static void main(String... arg) throws IOException, InterruptedException {
        System.out.println("Hello, World!");
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}