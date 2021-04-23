public class AuthorizeCheck implements IauthorizeBehavior {
    @Override
    public String authorized() {
        return "the check is Authorized";
    }
}
