package state.basic;

public class Context {
    private IState state;

    public Context(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }

}
