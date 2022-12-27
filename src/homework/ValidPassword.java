package homework;

public class ValidPassword {
    /*
    2.Valid Password

    Given a String password find out if it is a valid password

    Requirements:

        Must have at least 8 characters
        Must have at least 1 uppercase letter
        Must have at least 1 lowercase letter

     */
    public static String password(String str) {
        int count = 0;
        int count2 = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            if (Character.isUpperCase(letter)) {
                count++;
            }
            if (Character.isLowerCase(letter)) {
                count2++;
            }
            if (str.length() >= 8 && count >= 1 && count2 >= 1) {
                result = "Password is valid";
            } else {
                result = "Password is not valid";
            }

        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(password("FRTy"));
    }
}

