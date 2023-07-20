package CreationalPattern.Factory;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();

        msg.addDefaultHeader();
        msg.encryt();

        return msg;
    }

    public abstract Message createMessage();
}
