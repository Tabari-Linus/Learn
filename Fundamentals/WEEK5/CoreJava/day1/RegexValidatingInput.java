
public class RegexValidatingInput {

    public class RegexLearning {

        public static void main(String[] args) {
            String email = "user@example.com";
            String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

            if (email.matches(regex)) {
                System.out.println("Valid email address.");
            } else {
                System.out.println("Invalid email address.");
            }
        }
    }
}
