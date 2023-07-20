package CreationalPattern.Factory;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
