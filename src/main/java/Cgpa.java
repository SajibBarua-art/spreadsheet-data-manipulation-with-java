public class Cgpa {
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

    // All-args constructor
    public Cgpa(String attendanceMark, String hasTakenAnyCourse, String attendedInTwoClassTests,
                String averageObtainedClass, String housingType, String studyHour,
                String attitudeStudy, String involvementInTuition, String accessToLaptop, Float cgpa) {
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
    }

    // Getter methods
    public String getAttendanceMark() {
        return attendanceMark;
    }

    public String getHasTakenAnyCourse() {
        return hasTakenAnyCourse;
    }

    public String getAttendedInTwoClassTests() {
        return attendedInTwoClassTests;
    }

    public String getAverageObtainedClass() {
        return averageObtainedClass;
    }

    public String getHousingType() {
        return housingType;
    }

    public String getStudyHour() {
        return studyHour;
    }

    public String getAttitudeStudy() {
        return attitudeStudy;
    }

    public String getInvolvementInTuition() {
        return involvementInTuition;
    }

    public String getAccessToLaptop() {
        return accessToLaptop;
    }

    public Float getCgpa() {
        return cgpa;
    }
}
