public class All {
    private Double timestamp;
    private String email;
    private String gender;
    private String attendanceMark;
    private String hasTakenAnyCourse;
    private String attendedInTwoClassTests;
    private String averageObtainedClass;
    private String housingType;
    private String studyHour;
    private String attitudeStudy;
    private String involvementInTuition;
    private String accessToLaptop;
    private Float cgpa;
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
    private String familyCondition;
    private String parentalOccupation;
    private String familySupport;
    private String parentalEducation;

    // All-args constructor
    public All(Double timestamp, String email, String gender, String attendanceMark, String hasTakenAnyCourse,
               String attendedInTwoClassTests, String averageObtainedClass, String housingType, String studyHour,
               String attitudeStudy, String involvementInTuition, String accessToLaptop, Float cgpa, String faculty,
               Float hscGpa, String submittedAllAssignment, String performedPresentation, String classroomFacilities,
               String resourceAvailability, String distanceFromLivingPlace, String transportationType,
               String involvementInClub, String sleepingTime, String mentalHealth, String movieAddiction,
               String freeTime, String hometown, String familyCondition, String parentalOccupation,
               String familySupport, String parentalEducation) {
        this.timestamp = timestamp;
        this.email = email;
        this.gender = gender;
        this.attendanceMark = attendanceMark;
        this.hasTakenAnyCourse = hasTakenAnyCourse;
        this.attendedInTwoClassTests = attendedInTwoClassTests;
        this.averageObtainedClass = averageObtainedClass;
        this.housingType = housingType;
        this.studyHour = studyHour;
        this.attitudeStudy = attitudeStudy;
        this.involvementInTuition = involvementInTuition;
        this.accessToLaptop = accessToLaptop;
        this.cgpa = cgpa;
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
        this.familyCondition = familyCondition;
        this.parentalOccupation = parentalOccupation;
        this.familySupport = familySupport;
        this.parentalEducation = parentalEducation;
    }

    // Getter methods
    public Double getTimestamp() { return timestamp; }
    public String getEmail() { return email; }
    public String getGender() { return gender; }
    public String getAttendanceMark() { return attendanceMark; }
    public String getHasTakenAnyCourse() { return hasTakenAnyCourse; }
    public String getAttendedInTwoClassTests() { return attendedInTwoClassTests; }
    public String getAverageObtainedClass() { return averageObtainedClass; }
    public String getHousingType() { return housingType; }
    public String getStudyHour() { return studyHour; }
    public String getAttitudeStudy() { return attitudeStudy; }
    public String getInvolvementInTuition() { return involvementInTuition; }
    public String getAccessToLaptop() { return accessToLaptop; }
    public Float getCgpa() { return cgpa; }
    public String getFaculty() { return faculty; }
    public Float getHscGpa() { return hscGpa; }
    public String getSubmittedAllAssignment() { return submittedAllAssignment; }
    public String getPerformedPresentation() { return performedPresentation; }
    public String getClassroomFacilities() { return classroomFacilities; }
    public String getResourceAvailability() { return resourceAvailability; }
    public String getDistanceFromLivingPlace() { return distanceFromLivingPlace; }
    public String getTransportationType() { return transportationType; }
    public String getInvolvementInClub() { return involvementInClub; }
    public String getSleepingTime() { return sleepingTime; }
    public String getMentalHealth() { return mentalHealth; }
    public String getMovieAddiction() { return movieAddiction; }
    public String getFreeTime() { return freeTime; }
    public String getHometown() { return hometown; }
    public String getFamilyCondition() { return familyCondition; }
    public String getParentalOccupation() { return parentalOccupation; }
    public String getFamilySupport() { return familySupport; }
    public String getParentalEducation() { return parentalEducation; }

    // Setter (post) methods
    public void setTimestamp(Double timestamp) { this.timestamp = timestamp; }
    public void setEmail(String email) { this.email = email; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAttendanceMark(String attendanceMark) { this.attendanceMark = attendanceMark; }
    public void setHasTakenAnyCourse(String hasTakenAnyCourse) { this.hasTakenAnyCourse = hasTakenAnyCourse; }
    public void setAttendedInTwoClassTests(String attendedInTwoClassTests) { this.attendedInTwoClassTests = attendedInTwoClassTests; }
    public void setAverageObtainedClass(String averageObtainedClass) { this.averageObtainedClass = averageObtainedClass; }
    public void setHousingType(String housingType) { this.housingType = housingType; }
    public void setStudyHour(String studyHour) { this.studyHour = studyHour; }
    public void setAttitudeStudy(String attitudeStudy) { this.attitudeStudy = attitudeStudy; }
    public void setInvolvementInTuition(String involvementInTuition) { this.involvementInTuition = involvementInTuition; }
    public void setAccessToLaptop(String accessToLaptop) { this.accessToLaptop = accessToLaptop; }
    public void setCgpa(Float cgpa) { this.cgpa = cgpa; }
    public void setFaculty(String faculty) { this.faculty = faculty; }
    public void setHscGpa(Float hscGpa) { this.hscGpa = hscGpa; }
    public void setSubmittedAllAssignment(String submittedAllAssignment) { this.submittedAllAssignment = submittedAllAssignment; }
    public void setPerformedPresentation(String performedPresentation) { this.performedPresentation = performedPresentation; }
    public void setClassroomFacilities(String classroomFacilities) { this.classroomFacilities = classroomFacilities; }
    public void setResourceAvailability(String resourceAvailability) { this.resourceAvailability = resourceAvailability; }
    public void setDistanceFromLivingPlace(String distanceFromLivingPlace) { this.distanceFromLivingPlace = distanceFromLivingPlace; }
    public void setTransportationType(String transportationType) { this.transportationType = transportationType; }
    public void setInvolvementInClub(String involvementInClub) { this.involvementInClub = involvementInClub; }
    public void setSleepingTime(String sleepingTime) { this.sleepingTime = sleepingTime; }
    public void setMentalHealth(String mentalHealth) { this.mentalHealth = mentalHealth; }
    public void setMovieAddiction(String movieAddiction) { this.movieAddiction = movieAddiction; }
    public void setFreeTime(String freeTime) { this.freeTime = freeTime; }
    public void setHometown(String hometown) { this.hometown = hometown; }
    public void setFamilyCondition(String familyCondition) { this.familyCondition = familyCondition; }
    public void setParentalOccupation(String parentalOccupation) { this.parentalOccupation = parentalOccupation; }
    public void setFamilySupport(String familySupport) { this.familySupport = familySupport; }
    public void setParentalEducation(String parentalEducation) { this.parentalEducation = parentalEducation; }
}
