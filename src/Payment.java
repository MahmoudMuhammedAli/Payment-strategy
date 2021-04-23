public abstract class Payment {
    private float amount;
    private IauthorizeBehavior authorizeBehavior;
    public IprintBehavior printBehavior;

    public abstract String states();
}
