public class Occupation {
    private String familyCondition;
    private String parentalOccupation;
    private String familySupport;
    private String parentalEducation;

    // All-args constructor
    public Occupation(String familyCondition, String parentalOccupation,
                      String familySupport, String parentalEducation) {
        this.familyCondition = familyCondition;
        this.parentalOccupation = parentalOccupation;
        this.familySupport = familySupport;
        this.parentalEducation = parentalEducation;
    }

    // Getter methods
    public String getFamilyCondition() {
        return familyCondition;
    }

    public String getParentalOccupation() {
        return parentalOccupation;
    }

    public String getFamilySupport() {
        return familySupport;
    }

    public String getParentalEducation() {
        return parentalEducation;
    }
}