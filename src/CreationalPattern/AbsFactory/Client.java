package CreationalPattern.AbsFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory=factory;
    }

    public Instance createServer(Instance.Capacity cap,int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);

        instance.attachStorage(storage);

        return instance;
    }
    public static void main(String[] args) {
        Client aws = new Client(new AWSResourceFactory());
        Instance i = aws.createServer(Instance.Capacity.micro,20340);
        i.start();
        i.stop();

        System.out.println("**********************************");

        Client gcp = new Client(new GoogleResourceFactory());

        Instance i1 = gcp.createServer(Instance.Capacity.micro,10000);
        i1.start();
        i1.stop();
    }
}
