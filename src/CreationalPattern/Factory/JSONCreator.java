package CreationalPattern.Factory;

public class JSONCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
