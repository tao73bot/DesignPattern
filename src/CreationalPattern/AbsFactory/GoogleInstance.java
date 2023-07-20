package CreationalPattern.AbsFactory;

public class GoogleInstance implements Instance{
    public GoogleInstance(Capacity capacity){
        System.out.println("Created Google Engine Instance");
    }

    @Override
    public void start() {
        System.out.println("G Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("G Attached "+ storage+" to compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("G compute instance stopped");
    }
}
