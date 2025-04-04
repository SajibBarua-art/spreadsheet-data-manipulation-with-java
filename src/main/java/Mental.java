public class Mental {
    private String religiousOrSpiritualPractices;
    private String substanceUseToCope;
    private String comparisonWithOthersFrequency;
    private String confidenceInDifficultTimes;
    private String childhoodTraumaExperience;
    private String selfWorthIssuesFrequency;
    private String concentrationTroubleFrequency;
    private String feelingDepressedFrequency;
    private String suicidalThoughtsFrequency;

    // All-args constructor
    public Mental(String religiousOrSpiritualPractices, String substanceUseToCope,
                  String comparisonWithOthersFrequency, String confidenceInDifficultTimes,
                  String childhoodTraumaExperience, String selfWorthIssuesFrequency,
                  String concentrationTroubleFrequency, String feelingDepressedFrequency,
                  String suicidalThoughtsFrequency) {
        this.religiousOrSpiritualPractices = religiousOrSpiritualPractices;
        this.substanceUseToCope = substanceUseToCope;
        this.comparisonWithOthersFrequency = comparisonWithOthersFrequency;
        this.confidenceInDifficultTimes = confidenceInDifficultTimes;
        this.childhoodTraumaExperience = childhoodTraumaExperience;
        this.selfWorthIssuesFrequency = selfWorthIssuesFrequency;
        this.concentrationTroubleFrequency = concentrationTroubleFrequency;
        this.feelingDepressedFrequency = feelingDepressedFrequency;
        this.suicidalThoughtsFrequency = suicidalThoughtsFrequency;
    }

    // Getter methods
    public String getReligiousOrSpiritualPractices() {
        return religiousOrSpiritualPractices;
    }

    public String getSubstanceUseToCope() {
        return substanceUseToCope;
    }

    public String getComparisonWithOthersFrequency() {
        return comparisonWithOthersFrequency;
    }

    public String getConfidenceInDifficultTimes() {
        return confidenceInDifficultTimes;
    }

    public String getChildhoodTraumaExperience() {
        return childhoodTraumaExperience;
    }

    public String getSelfWorthIssuesFrequency() {
        return selfWorthIssuesFrequency;
    }

    public String getConcentrationTroubleFrequency() {
        return concentrationTroubleFrequency;
    }

    public String getFeelingDepressedFrequency() {
        return feelingDepressedFrequency;
    }

    public String getSuicidalThoughtsFrequency() {
        return suicidalThoughtsFrequency;
    }
}
