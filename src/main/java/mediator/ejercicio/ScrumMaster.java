package mediator.ejercicio;

public class Dev extends Colleague {

    public Dev(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Concrete Colleague2 > msg received  : "+msg);
    }
}
