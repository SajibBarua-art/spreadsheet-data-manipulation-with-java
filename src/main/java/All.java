public class All {
    private String timestamp;
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
    private String cgpa;
    private String faculty;
    private String hscGpa;
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

    // No-args constructor
    public All() {
    }

    public All(String timestamp, String email, String gender, String faculty, String hscGpa,
               String attendanceMark, String hasTakenAnyCourse, String attendedInTwoClassTests,
               String averageObtainedClass, String submittedAllAssignment, String performedPresentation,
               String housingType, String familyCondition, String parentalOccupation, String classroomFacilities,
               String resourceAvailability, String studyHour, String distanceFromLivingPlace,
               String transportationType, String involvementInClub, String attitudeStudy,
               String sleepingTime, String mentalHealth, String familySupport,
               String involvementInTuition, String movieAddiction, String freeTime,
               String parentalEducation, String accessToLaptop, String hometown, String cgpa) {

        this.timestamp = timestamp;
        this.email = email;
        this.gender = gender;
        this.faculty = faculty;
        this.hscGpa = hscGpa;
        this.attendanceMark = attendanceMark;
        this.hasTakenAnyCourse = hasTakenAnyCourse;
        this.attendedInTwoClassTests = attendedInTwoClassTests;
        this.averageObtainedClass = averageObtainedClass;
        this.submittedAllAssignment = submittedAllAssignment;
        this.performedPresentation = performedPresentation;
        this.housingType = housingType;
        this.familyCondition = familyCondition;
        this.parentalOccupation = parentalOccupation;
        this.classroomFacilities = classroomFacilities;
        this.resourceAvailability = resourceAvailability;
        this.studyHour = studyHour;
        this.distanceFromLivingPlace = distanceFromLivingPlace;
        this.transportationType = transportationType;
        this.involvementInClub = involvementInClub;
        this.attitudeStudy = attitudeStudy;
        this.sleepingTime = sleepingTime;
        this.mentalHealth = mentalHealth;
        this.familySupport = familySupport;
        this.involvementInTuition = involvementInTuition;
        this.movieAddiction = movieAddiction;
        this.freeTime = freeTime;
        this.parentalEducation = parentalEducation;
        this.accessToLaptop = accessToLaptop;
        this.hometown = hometown;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "All{" +
                "timestamp=" + timestamp +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", faculty='" + faculty + '\'' +
                ", hscGpa=" + hscGpa +
                ", attendanceMark='" + attendanceMark + '\'' +
                ", hasTakenAnyCourse='" + hasTakenAnyCourse + '\'' +
                ", attendedInTwoClassTests='" + attendedInTwoClassTests + '\'' +
                ", averageObtainedClass='" + averageObtainedClass + '\'' +
                ", submittedAllAssignment='" + submittedAllAssignment + '\'' +
                ", performedPresentation='" + performedPresentation + '\'' +
                ", housingType='" + housingType + '\'' +
                ", familyCondition='" + familyCondition + '\'' +
                ", parentalOccupation='" + parentalOccupation + '\'' +
                ", classroomFacilities='" + classroomFacilities + '\'' +
                ", resourceAvailability='" + resourceAvailability + '\'' +
                ", studyHour='" + studyHour + '\'' +
                ", distanceFromLivingPlace='" + distanceFromLivingPlace + '\'' +
                ", transportationType='" + transportationType + '\'' +
                ", involvementInClub='" + involvementInClub + '\'' +
                ", attitudeStudy='" + attitudeStudy + '\'' +
                ", sleepingTime='" + sleepingTime + '\'' +
                ", mentalHealth='" + mentalHealth + '\'' +
                ", familySupport='" + familySupport + '\'' +
                ", involvementInTuition='" + involvementInTuition + '\'' +
                ", movieAddiction='" + movieAddiction + '\'' +
                ", freeTime='" + freeTime + '\'' +
                ", parentalEducation='" + parentalEducation + '\'' +
                ", accessToLaptop='" + accessToLaptop + '\'' +
                ", hometown='" + hometown + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    // Getter methods
    public String getTimestamp() { return timestamp; }
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
    public String getCgpa() { return cgpa; }
    public String getFaculty() { return faculty; }
    public String getHscGpa() { return hscGpa; }
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
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
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
    public void setCgpa(String cgpa) { this.cgpa = cgpa; }
    public void setFaculty(String faculty) { this.faculty = faculty; }
    public void setHscGpa(String hscGpa) { this.hscGpa = hscGpa; }
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
