import java.util.Scanner;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
public class Main {
    public static void login(String username, String password)
            throws InvalidUsernameException, InvalidPasswordException {
        String correctUsername = "admin";
        String correctPassword = "Java123";
        if (!username.equals(correctUsername)) {
            throw new InvalidUsernameException("Invalid username");
        }
        if (!password.equals(correctPassword)) {
            throw new InvalidPasswordException("Invalid password");
        }
        System.out.println("Login successful!");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        while (attempts > 0) {
            try {
                System.out.print("Enter username: ");
                String username = sc.nextLine();
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                login(username, password);
                break;
            } catch (InvalidUsernameException e) {
                attempts--;
                System.out.println(e.getMessage());
                if (attempts > 0) {
                    System.out.println("Attempts remaining: " + attempts);
                }
            } catch (InvalidPasswordException e) {
                attempts--;
                System.out.println(e.getMessage());
                if (attempts > 0) {
                    System.out.println("Attempts remaining" + attempts);
                }
            }
            finally{
                System.out.println("...................");
            }
        }
        if(attempts==0){
            System.out.println("Account locked");
        }sc.close();
    }
}
