package CreationalPattern.Factory;

public class TextCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
