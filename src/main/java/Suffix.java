import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Suffix {
    ArrayList<String> suffixes = new ArrayList<>();

    private String findMiddleString(String input) {
        // Regex to find a substring that starts with a digit and ends at '@'
        Pattern pattern = Pattern.compile("\\d.*?@");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            // Return the matched substring, excluding the '@' at the end
            return matcher.group(0).substring(0, matcher.group(0).length() - 1);
        }
        return "no";
    }

    public Suffix(ArrayList<Email> emails) {
        ArrayList<String> suffixes = new ArrayList<>();
        for(Email email : emails) {
            String emailName = email.getEmail();
            String suffix = findMiddleString(emailName);
            if(suffix.equals("no")) {
                continue;
            }
            suffixes.add(suffix);
        }

        this.suffixes = suffixes;
    }

    public ArrayList<String> getSuffixes() {
        return suffixes;
    }
}
