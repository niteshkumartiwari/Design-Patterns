package StatePattern;

class StatePattern {
    public static void main(String args[]) {
        Gate g = new Gate();
        g.pay();
        g.pay();
        // g.payFailed();
        g.payOk();
        g.enter();
    }
}
