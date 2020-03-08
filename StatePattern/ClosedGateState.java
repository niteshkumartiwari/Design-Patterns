package StatePattern;

class ClosedGateState implements GateState {
    private Gate gate;

    public ClosedGateState(Gate g) {
        this.gate = g;
    }

    @Override
    public void enter() {
        System.out.println("ClosedGateState:: enter()");
    }

    @Override
    public void pay() {
        System.out.println("ClosedGateState:: pay()");
        this.gate.changeState(new ProcessingGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("ClosedGateState:: payOk()");
        // this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("ClosedGateState:: payFailed()");
    }

}