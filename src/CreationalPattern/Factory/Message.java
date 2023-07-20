package CreationalPattern.Factory;

public abstract class Message {
    public abstract String getContent();

    public void addDefaultHeader(){
        // adds some default headers
    }

    public void encryt(){
        // encryt code
    }
}
