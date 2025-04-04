import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExcelReaderWriter {
    private static List<All> buildAllData(List<Education> educations, List<Family> families,
                                          List<Physical> physicals, List<Mental> mentals, List<Other> others) {

        ArrayList<All> allData = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            Education education = educations.get(i);
            Family family = families.get(i);
            Physical physical = physicals.get(i);
            Mental mental = mentals.get(i);
            Other other = others.get(i);

            All current = new All(
                    physical.getAge(),
                    physical.getGender(),
                    education.getEducationLevel(),
                    other.getEmploymentStatus(),
                    education.getFamilyEconomicCondition(),
                    education.getFamilyType(),
                    education.getRelationshipStatus(),
                    physical.getRegularPhysicalActivity(),
                    mental.getReligiousOrSpiritualPractices(),
                    physical.getSleepHoursPerDay(),
                    physical.getSmokingHabit(),
                    mental.getSubstanceUseToCope(),
                    mental.getComparisonWithOthersFrequency(),
                    physical.getSocialMediaTimePerDay(),
                    physical.getChronicHealthConditions(),
                    family.getConflictImpactOnWellBeing(),
                    mental.getConfidenceInDifficultTimes(),
                    other.getExperiencedCyberBullying(),
                    mental.getChildhoodTraumaExperience(),
                    family.getFamilyHistoryOfMentalDisorders(),
                    family.getEmotionalSupportFromFamily(),
                    family.getFeelingOfLoneliness(),
                    other.getWorryAboutFutureFrequency(),
                    other.getLossOfInterestFrequency(),
                    other.getSleepIssuesFrequency(),
                    physical.getTirednessFrequency(),
                    physical.getAppetiteIssuesFrequency(),
                    mental.getSelfWorthIssuesFrequency(),
                    mental.getConcentrationTroubleFrequency(),
                    other.getUnusualMovementOrRestlessness(),
                    mental.getFeelingDepressedFrequency(),
                    mental.getSuicidalThoughtsFrequency()
            );

            allData.add(current);
        }

        return allData;
    }

    public static void main(String[] args) {

        ArrayList<All> initAll = new ArrayList<>();
        ArrayList<Education> initEducation = new ArrayList<>();
        ArrayList<Family> initFamily = new ArrayList<>();
        ArrayList<Physical> initPhysical = new ArrayList<>();
        ArrayList<Mental> initMental = new ArrayList<>();
        ArrayList<Other> initOther = new ArrayList<>();

        // To read an Excel file
        ExcelReader excelReader = new ExcelReader();
        excelReader.readExcelFile(initAll, initEducation, initFamily, initPhysical, initMental, initOther);

        Collections.shuffle(initEducation);
        Collections.shuffle(initFamily);
        Collections.shuffle(initPhysical);
        Collections.shuffle(initMental);
        Collections.shuffle(initOther);


        // build alls
        List<All> allData = buildAllData(initEducation, initFamily, initPhysical, initMental, initOther);

        new ExcelWriter(allData, "src/main/resources/output_v5.xlsx");
    }
}
