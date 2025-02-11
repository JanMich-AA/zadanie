public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();


        loginService.login("user1", "password123");
        loginService.login("user2@example.com", "kutas", "password456");
        loginService.login("user3", 123456);
        loginService.login("123456789", "password789", 123456);


        User admin = new Admin();
        User programmer = new Programmer();
        User tester = new Tester();
        User manager = new Manager();

        System.out.println("Admin: " + admin.getAccessLevel());
        System.out.println("Programmer: " + programmer.getAccessLevel());
        System.out.println("Tester: " + tester.getAccessLevel());
        System.out.println("Manager: " + manager.getAccessLevel());
    }
}