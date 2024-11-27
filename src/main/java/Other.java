public class Other {
    private String faculty;
    private Float hscGpa;
    private String submittedAllAssignment;
    private String performedPresentation;
    private String classroomFacilities;
    private String resourceAvailability;
    private String distanceFromLivingPlace;
    private String transportationType;
    private String involvementInClub;
    private String sleepingTime;
    private String mentalHealth;
    private String movieAddiction;
    private String freeTime;
    private String hometown;

    // All-args constructor
    public Other(String faculty, Float hscGpa, String submittedAllAssignment, String performedPresentation,
                 String classroomFacilities, String resourceAvailability, String distanceFromLivingPlace,
                 String transportationType, String involvementInClub, String sleepingTime, String mentalHealth,
                 String movieAddiction, String freeTime, String hometown) {
        this.faculty = faculty;
        this.hscGpa = hscGpa;
        this.submittedAllAssignment = submittedAllAssignment;
        this.performedPresentation = performedPresentation;
        this.classroomFacilities = classroomFacilities;
        this.resourceAvailability = resourceAvailability;
        this.distanceFromLivingPlace = distanceFromLivingPlace;
        this.transportationType = transportationType;
        this.involvementInClub = involvementInClub;
        this.sleepingTime = sleepingTime;
        this.mentalHealth = mentalHealth;
        this.movieAddiction = movieAddiction;
        this.freeTime = freeTime;
        this.hometown = hometown;
    }

    // Getter methods
    public String getFaculty() {
        return faculty;
    }

    public Float getHscGpa() {
        return hscGpa;
    }

    public String getSubmittedAllAssignment() {
        return submittedAllAssignment;
    }

    public String getPerformedPresentation() {
        return performedPresentation;
    }

    public String getClassroomFacilities() {
        return classroomFacilities;
    }

    public String getResourceAvailability() {
        return resourceAvailability;
    }

    public String getDistanceFromLivingPlace() {
        return distanceFromLivingPlace;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public String getInvolvementInClub() {
        return involvementInClub;
    }

    public String getSleepingTime() {
        return sleepingTime;
    }

    public String getMentalHealth() {
        return mentalHealth;
    }

    public String getMovieAddiction() {
        return movieAddiction;
    }

    public String getFreeTime() {
        return freeTime;
    }

    public String getHometown() {
        return hometown;
    }
}
