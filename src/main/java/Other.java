public class Other {
    private String employmentStatus;
    private String experiencedCyberBullying;
    private String worryAboutFutureFrequency;
    private String lossOfInterestFrequency;
    private String sleepIssuesFrequency;
    private String unusualMovementOrRestlessness;

    // All-args constructor
    public Other(String employmentStatus, String experiencedCyberBullying, String worryAboutFutureFrequency,
                 String lossOfInterestFrequency, String sleepIssuesFrequency,
                 String unusualMovementOrRestlessness) {
        this.employmentStatus = employmentStatus;
        this.experiencedCyberBullying = experiencedCyberBullying;
        this.worryAboutFutureFrequency = worryAboutFutureFrequency;
        this.lossOfInterestFrequency = lossOfInterestFrequency;
        this.sleepIssuesFrequency = sleepIssuesFrequency;
        this.unusualMovementOrRestlessness = unusualMovementOrRestlessness;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    // Getter methods
    public String getExperiencedCyberBullying() {
        return experiencedCyberBullying;
    }

    public String getWorryAboutFutureFrequency() {
        return worryAboutFutureFrequency;
    }

    public String getLossOfInterestFrequency() {
        return lossOfInterestFrequency;
    }

    public String getSleepIssuesFrequency() {
        return sleepIssuesFrequency;
    }

    public String getUnusualMovementOrRestlessness() {
        return unusualMovementOrRestlessness;
    }
}
