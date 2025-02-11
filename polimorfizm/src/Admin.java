public class Admin extends User {
    @Override
    public String getAccessLevel() {
        return "Pełne uprawnienia";
    }
}