package StatePattern;

class OpenGateState implements GateState {
    private Gate gate;

    public OpenGateState(Gate g) {
        this.gate = g;
    }

    @Override
    public void enter() {
        System.out.println("OpenGateState:: enter()");
        this.gate.changeState(new ClosedGateState(gate));
    }

    @Override
    public void pay() {
        System.out.println("OpenGateState:: pay()");

    }

    @Override
    public void payOk() {
        System.out.println("OpenGateState:: payOk()");

    }

    @Override
    public void payFailed() {
        System.out.println("OpenGateState:: payFailed()");

    }

}