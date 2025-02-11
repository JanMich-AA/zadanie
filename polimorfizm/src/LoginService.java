public class LoginService {
    public void login(String username, String password) {
        System.out.println("Logowanie za pomocą loginu i hasła.");

    }

    public void loginByEmail(String email, String password) {
        System.out.println("Logowanie za pomocą e-maila i hasła.");

    }

    public void login(String username, int token) {
        System.out.println("Logowanie za pomocą loginu i tokenu.");

    }

    public void loginByPhone(String phoneNumber, String password) {
        System.out.println("Logowanie za pomocą numeru telefonu i hasła.");

    }
}