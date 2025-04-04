public class Education {
    private String educationLevel;
    private String familyEconomicCondition;
    private String familyType;
    private String relationshipStatus;

    // All-args constructor
    public Education(String educationLevel, String familyEconomicCondition,
                     String familyType, String relationshipStatus) {
        this.educationLevel = educationLevel;
        this.familyEconomicCondition = familyEconomicCondition;
        this.familyType = familyType;
        this.relationshipStatus = relationshipStatus;
    }

    // Getter methods
    public String getEducationLevel() {
        return educationLevel;
    }

    public String getFamilyEconomicCondition() {
        return familyEconomicCondition;
    }

    public String getFamilyType() {
        return familyType;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }
}
