public abstract class Payment {
    private float amount;
    private IauthorizeBehavior authorizeBehavior;
    public IprintBehavior printBehavior;

    public abstract String states();

    public void setAuthorizeBehavior(IauthorizeBehavior authorizeBehavior) {
        this.authorizeBehavior = authorizeBehavior;
    }

    public void setPrintBehavior(IprintBehavior printBehavior) {
        this.printBehavior = printBehavior;
    }
}
