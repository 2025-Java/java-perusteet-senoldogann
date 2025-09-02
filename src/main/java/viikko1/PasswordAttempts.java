package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correctPassword = "java123";
        int maxAttempts = Math.min(3, tries.length);
        
        for (int i = 0; i < maxAttempts; i++) {
            if (correctPassword.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        
        return "Liian monta virheellistä yritystä.";
    }
}
