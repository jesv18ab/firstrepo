public class Main {

    public static void main(String[] args) {
        String myUsername = "Sonne";
        String myPassword = "Semesterstartsfest";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
