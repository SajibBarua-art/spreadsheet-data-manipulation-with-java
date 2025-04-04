public class Physical {
    private String age;
    private String gender;
    private String regularPhysicalActivity;
    private String sleepHoursPerDay;
    private String smokingHabit;
    private String socialMediaTimePerDay;
    private String chronicHealthConditions;
    private String tirednessFrequency;
    private String appetiteIssuesFrequency;

    // All-args constructor
    public Physical(String age, String gender, String regularPhysicalActivity, String sleepHoursPerDay,
                    String smokingHabit, String socialMediaTimePerDay, String chronicHealthConditions,
                    String tirednessFrequency, String appetiteIssuesFrequency) {
        this.age = age;
        this.gender = gender;
        this.regularPhysicalActivity = regularPhysicalActivity;
        this.sleepHoursPerDay = sleepHoursPerDay;
        this.smokingHabit = smokingHabit;
        this.socialMediaTimePerDay = socialMediaTimePerDay;
        this.chronicHealthConditions = chronicHealthConditions;
        this.tirednessFrequency = tirednessFrequency;
        this.appetiteIssuesFrequency = appetiteIssuesFrequency;
    }

    // Getter methods
    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRegularPhysicalActivity() {
        return regularPhysicalActivity;
    }

    public String getSleepHoursPerDay() {
        return sleepHoursPerDay;
    }

    public String getSmokingHabit() {
        return smokingHabit;
    }

    public String getSocialMediaTimePerDay() {
        return socialMediaTimePerDay;
    }

    public String getChronicHealthConditions() {
        return chronicHealthConditions;
    }

    public String getTirednessFrequency() {
        return tirednessFrequency;
    }

    public String getAppetiteIssuesFrequency() {
        return appetiteIssuesFrequency;
    }
}
