package homework.interview;

public class PasswordValidationTask {
    //String -- Password Validation Task
    //Write a return method that can verify if a password is valid or not. requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. Password should at least contain one upper case letter
    //3. Password should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    public static boolean PasswordValid(String password) {


            boolean hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                    hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                    hasDigits = password.matches("(.*[0-9].*)"),
                    hasSpecialChar = password.matches("(.*[ -/, :-@].*)");

            if(password.length() >= 6 && !password.contains(" ")) {
                if (hasLowerCaseChar && hasUpperCaseChar && hasDigits && hasSpecialChar) {
                    return true;
                }
            }

            return false;
        }

    public static void main(String[] args) {
        System.out.println(PasswordValid("df5h@J"));
        System.out.println(PasswordValid("jhgFF$%7kjk"));
        System.out.println(PasswordValid("kjjhjhg7865"));
    }
}
