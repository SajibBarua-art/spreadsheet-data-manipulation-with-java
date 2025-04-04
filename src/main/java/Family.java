public class Family {
    private String conflictImpactOnWellBeing;
    private String familyHistoryOfMentalDisorders;
    private String emotionalSupportFromFamily;
    private String feelingOfLoneliness;

    // All-args constructor
    public Family(String conflictImpactOnWellBeing, String familyHistoryOfMentalDisorders,
                  String emotionalSupportFromFamily, String feelingOfLoneliness) {
        this.conflictImpactOnWellBeing = conflictImpactOnWellBeing;
        this.familyHistoryOfMentalDisorders = familyHistoryOfMentalDisorders;
        this.emotionalSupportFromFamily = emotionalSupportFromFamily;
        this.feelingOfLoneliness = feelingOfLoneliness;
    }

    // Getter methods
    public String getConflictImpactOnWellBeing() {
        return conflictImpactOnWellBeing;
    }

    public String getFamilyHistoryOfMentalDisorders() {
        return familyHistoryOfMentalDisorders;
    }

    public String getEmotionalSupportFromFamily() {
        return emotionalSupportFromFamily;
    }

    public String getFeelingOfLoneliness() {
        return feelingOfLoneliness;
    }
}
