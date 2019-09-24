public class Main {

    public static void main(String[] args) {
        String myUsername = "Nyt";
        String myPassword = "password";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
