public abstract class Payment {
    private float amount;
    private IauthorizeBehavior authorizeBehavior ;
    private IprintBehavior  printBehavior;
    public abstract String  states();
}
