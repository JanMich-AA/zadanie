public class LoginService {
    public void login(String username, String password) {
        System.out.println("Logowanie za pomocą loginu i hasła.");

    }

    public void login(String email, String username, String password) {
        System.out.println("Logowanie za pomocą e-maila i hasła.");

    }

    public void login(String username, int token) {
        System.out.println("Logowanie za pomocą loginu i tokenu.");

    }

    public void login(String phoneNumber, String password, int token) {
        System.out.println("Logowanie za pomocą numeru telefonu i hasła.");

    }
}