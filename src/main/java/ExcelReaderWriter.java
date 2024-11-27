import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExcelReaderWriter {
    private static List<String> buildEmail(List<String> prefixes, List<String> suffixes) {
        ArrayList<String> emails = new ArrayList<>();
        for(int i = 0; i < 250; i++) {
            int prefixesLength = prefixes.size();
            int suffixesLength = suffixes.size();

            Random random = new Random();
            int prefixIndex = random.nextInt(prefixesLength);
            int suffixIndex = random.nextInt(suffixesLength);

            String prefix = prefixes.get(prefixIndex);
//            String suffix = suffixes.get(suffixIndex);
            String suffix = "111" + String.valueOf(random.nextInt(4) + 5);
            emails.add(prefix + suffix + "@student.nstu.edu.bd");
        }

        return emails;
    }

    private static List<All> buildAllData(List<String> emails, List<Occupation> occupations,
                                          List<Other> others, List<Cgpa> cgpas) {

        ArrayList<All> allData = new ArrayList<>();

        int hour = 10, minute = 24, second = 23;
        for(int i = 0; i < 50; i++) {
            String email = emails.get(i);
            Occupation occupation = occupations.get(i);
            Other other = others.get(i);
            Cgpa cgpa = cgpas.get(i);

            String date = "11/27/2024 ";
            String time = String.valueOf(hour) + ":" + String.valueOf(minute) + ":" + String.valueOf(second);
            String dateTime = date + time;

            Random random = new Random();
            int randomSeconds = random.nextInt(10) + 1;
            int randomMinutes = 6;

            second += randomSeconds;
            minute += randomMinutes;

            int extra = second / 60;
            second = second % 60;
            minute += extra;
            extra = minute / 60;
            minute = minute % 60;
            hour += extra;


            All current = new All(
                dateTime, email, "Female", other.getFaculty(), other.getHscGpa(),
                    cgpa.getAttendanceMark(), cgpa.getHasTakenAnyCourse(), cgpa.getAttendedInTwoClassTests(),
                    cgpa.getAverageObtainedClass(), other.getSubmittedAllAssignment(), other.getPerformedPresentation(),
                    cgpa.getHousingType(), occupation.getFamilyCondition(), occupation.getParentalOccupation(), other.getClassroomFacilities(),
                    other.getResourceAvailability(), cgpa.getStudyHour(), other.getDistanceFromLivingPlace(),
                    other.getTransportationType(), other.getInvolvementInClub(), cgpa.getAttitudeStudy(), other.getSleepingTime(), other.getMentalHealth(),
                    occupation.getFamilySupport(), cgpa.getInvolvementInTuition(), other.getMovieAddiction(), other.getFreeTime(),
                    occupation.getParentalEducation(), cgpa.getAccessToLaptop(), other.getHometown(), cgpa.getCgpa()
            );
            allData.add(current);
        }

        return allData;
    }

    public static void main(String[] args) {

        ArrayList<All> initAll = new ArrayList<>();
        ArrayList<Cgpa> initCgpa = new ArrayList<>();
        ArrayList<Email> initEmail = new ArrayList<>();
        ArrayList<Occupation> initOccupation = new ArrayList<>();
        ArrayList<Other> initOther = new ArrayList<>();

        // To read an Excel file
        ExcelReader excelReader = new ExcelReader();
        excelReader.readExcelFile(initAll, initCgpa, initEmail, initOccupation, initOther);

        Collections.shuffle(initEmail);
        Collections.shuffle(initOccupation);
        Collections.shuffle(initOther);
        Collections.shuffle(initCgpa);

        // build prefixes
//        MaleName maleName = new MaleName();
//        List<String> prefixes = maleName.getNames();
        FemaleName femaleName = new FemaleName();
        List<String> prefixes = femaleName.getNames();

        // build suffixes
        Suffix suffix = new Suffix(initEmail);
        List<String> suffixes = suffix.getSuffixes();

        // build emails
        List<String> emails = buildEmail(prefixes, suffixes);

        // build alls
        List<All> allData = buildAllData(emails, initOccupation, initOther, initCgpa);

        new ExcelWriter(allData, "src/main/resources/exampleFemale.xlsx");
    }
}
