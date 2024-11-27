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
            String suffix = suffixes.get(suffixIndex);
            emails.add(prefix + suffix);
        }

        return emails;
    }

    public static double convertToTimestamp(LocalDateTime dateTime) {
        // Reference date: January 1, 1900 (Excel base date)
        LocalDateTime baseDate = LocalDateTime.of(1900, 1, 1, 0, 0, 0, 0);

        // Calculate the number of days between the base date and the given date
        long daysSinceBaseDate = ChronoUnit.DAYS.between(baseDate, dateTime);

        // Calculate the fraction of the day (hours, minutes, seconds)
        double fractionOfDay = (double) dateTime.getHour() / 24.0
                + (double) dateTime.getMinute() / (24.0 * 60.0)
                + (double) dateTime.getSecond() / (24.0 * 60.0 * 60.0);

        // Combine the days and the fractional part
        return daysSinceBaseDate + fractionOfDay;
    }

    private static List<All> buildAllData(List<String> emails, List<Occupation> occupations,
                                          List<Other> others, List<Cgpa> cgpas) {

        ArrayList<All> allData = new ArrayList<>();

        int hour = 9, minute = 17, second = 23;
        for(int i = 0; i < 250; i++) {
            String email = emails.get(i);
            Occupation occupation = occupations.get(i);
            Other other = others.get(i);
            Cgpa cgpa = cgpas.get(i);

            LocalDateTime dateTime = LocalDateTime.of(2024, 11, 27, hour, minute, second);
            double timestamp = convertToTimestamp(dateTime);

            Random random = new Random();
            int randomSeconds = random.nextInt(10) + 1;
            int randomMinutes = random.nextInt(2) + 1;

            second += randomSeconds;
            minute += randomMinutes;

            int extra = second / 60;
            second = second % 60;
            minute += extra;
            extra = minute / 60;
            minute = minute % 60;
            hour += extra;


            All current = new All(
                timestamp, email, "Male", other.getFaculty(), other.getHscGpa(),
                    cgpa.getAttendanceMark(), cgpa.getHasTakenAnyCourse(), cgpa.getAttendedInTwoClassTests(),
                    cgpa.getAverageObtainedClass(), other.getSubmittedAllAssignment(), other.getPerformedPresentation(),
                    cgpa.getHousingType(), occupation.getFamilyCondition(), occupation.getParentalOccupation(), other.getClassroomFacilities(),
                    other.getResourceAvailability(), cgpa.getStudyHour(), other.getDistanceFromLivingPlace(),
                    other.getTransportationType(), other.getInvolvementInClub(), cgpa.getAttitudeStudy(), other.getSleepingTime(), other.getMentalHealth(),
                    occupation.getFamilySupport(), cgpa.getInvolvementInTuition(), other.getMovieAddiction(), other.getFreeTime(),
                    occupation.getParentalEducation(), cgpa.getAccessToLaptop(), other.getHometown(), cgpa.getCgpa()
            );
            allData.add(current);

            if(i % 50 == 0) {
                hour++;
                if(hour > 23) {
                    System.out.println("Hour exceeded!");
                    break;
                }
            }
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
        MaleName maleName = new MaleName();
        List<String> prefixes = maleName.getNames();

        // build suffixes
        Suffix suffix = new Suffix(initEmail);
        List<String> suffixes = suffix.getSuffixes();

        // build emails
        List<String> emails = buildEmail(prefixes, suffixes);

        // build alls
        List<All> allData = buildAllData(emails, initOccupation, initOther, initCgpa);
    }
}
