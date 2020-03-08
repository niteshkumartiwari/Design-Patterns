package StatePattern;

class ProcessingGateState implements GateState {
    private Gate gate;

    public ProcessingGateState(Gate g) {
        this.gate = g;
    }

    @Override
    public void enter() {
        System.out.println("ProcessingGateState::enter()");
    }

    @Override
    public void pay() {
        System.out.println("ProcessingGateState::pay");
    }

    @Override
    public void payOk() {
        System.out.println("ProcessingGateState::payOk");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("ProcessingGateState::payFailed");
        this.gate.changeState(new ClosedGateState(gate));
    }

}