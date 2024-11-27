public class Email {
    private String email;
    private String gender;

    // All-args constructor
    public Email(String email, String gender) {
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    // Getter methods
    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}
