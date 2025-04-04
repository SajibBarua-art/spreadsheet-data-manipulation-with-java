import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelReader {
    String filePath = "src/main/resources/aois.xlsx"; // Replace with your file path

    void readExcelFile(ArrayList<All> initAll, ArrayList<Education> initEducation,
                       ArrayList<Family> initFamily, ArrayList<Physical> initPhysical, ArrayList<Mental> initMental, ArrayList<Other> initOther) {


        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet

            for (int r = 1; r < 525; r++) {
                Row row = sheet.getRow(r);

                // Initialize the values for each column
                // Initialize the values for each column in the All class
                String age = null;
                String gender = null;
                String educationLevel = null;
                String employmentStatus = null;
                String familyEconomicCondition = null;
                String familyType = null;
                String relationshipStatus = null;
                String regularPhysicalActivity = null;
                String religiousOrSpiritualPractices = null;
                String sleepHoursPerDay = null;
                String smokingHabit = null;
                String substanceUseToCope = null;
                String comparisonWithOthersFrequency = null;
                String socialMediaTimePerDay = null;
                String chronicHealthConditions = null;
                String conflictImpactOnWellBeing = null;
                String confidenceInDifficultTimes = null;
                String experiencedCyberBullying = null;
                String childhoodTraumaExperience = null;
                String familyHistoryOfMentalDisorders = null;
                String emotionalSupportFromFamily = null;
                String feelingOfLoneliness = null;
                String worryAboutFutureFrequency = null;
                String lossOfInterestFrequency = null;
                String sleepIssuesFrequency = null;
                String tirednessFrequency = null;
                String appetiteIssuesFrequency = null;
                String selfWorthIssuesFrequency = null;
                String concentrationTroubleFrequency = null;
                String unusualMovementOrRestlessness = null;
                String feelingDepressedFrequency = null;
                String suicidalThoughtsFrequency = null;

                // Iterate over cells in the current row
                for (int c = 0; c < 32; c++) {
                    Cell cell = row.getCell(c);
                    int cellIndex = c + 1;

                    switch (cellIndex) {
                        case 1:
                            age = cell.getStringCellValue();
                            break;
                        case 2:
                            gender = cell.getStringCellValue();
                            break;
                        case 3:
                            educationLevel = cell.getStringCellValue();
                            break;
                        case 4:
                            employmentStatus = cell.getStringCellValue();
                            break;
                        case 5:
                            familyEconomicCondition = cell.getStringCellValue();
                            break;
                        case 6:
                            familyType = cell.getStringCellValue();
                            break;
                        case 7:
                            relationshipStatus = cell.getStringCellValue();
                            break;
                        case 8:
                            regularPhysicalActivity = cell.getStringCellValue();
                            break;
                        case 9:
                            religiousOrSpiritualPractices = cell.getStringCellValue();
                            break;
                        case 10:
                            sleepHoursPerDay = cell.getStringCellValue();
                            break;
                        case 11:
                            smokingHabit = cell.getStringCellValue();
                            break;
                        case 12:
                            substanceUseToCope = cell.getStringCellValue();
                            break;
                        case 13:
                            comparisonWithOthersFrequency = cell.getStringCellValue();
                            break;
                        case 14:
                            socialMediaTimePerDay = cell.getStringCellValue();
                            break;
                        case 15:
                            chronicHealthConditions = cell.getStringCellValue();
                            break;
                        case 16:
                            conflictImpactOnWellBeing = cell.getStringCellValue();
                            break;
                        case 17:
                            confidenceInDifficultTimes = cell.getStringCellValue();
                            break;
                        case 18:
                            experiencedCyberBullying = cell.getStringCellValue();
                            break;
                        case 19:
                            childhoodTraumaExperience = cell.getStringCellValue();
                            break;
                        case 20:
                            familyHistoryOfMentalDisorders = cell.getStringCellValue();
                            break;
                        case 21:
                            emotionalSupportFromFamily = cell.getStringCellValue();
                            break;
                        case 22:
                            feelingOfLoneliness = cell.getStringCellValue();
                            break;
                        case 23:
                            worryAboutFutureFrequency = cell.getStringCellValue();
                            break;
                        case 24:
                            lossOfInterestFrequency = cell.getStringCellValue();
                            break;
                        case 25:
                            sleepIssuesFrequency = cell.getStringCellValue();
                            break;
                        case 26:
                            tirednessFrequency = cell.getStringCellValue();
                            break;
                        case 27:
                            appetiteIssuesFrequency = cell.getStringCellValue();
                            break;
                        case 28:
                            selfWorthIssuesFrequency = cell.getStringCellValue();
                            break;
                        case 29:
                            concentrationTroubleFrequency = cell.getStringCellValue();
                            break;
                        case 30:
                            unusualMovementOrRestlessness = cell.getStringCellValue();
                            break;
                        case 31:
                            feelingDepressedFrequency = cell.getStringCellValue();
                            break;
                        case 32:
                            suicidalThoughtsFrequency = cell.getStringCellValue();
                            break;
                        default:
                            break;
                    }
                }

                System.out.println(age + ", " + gender + ", " + educationLevel + ", " + employmentStatus + ", " +
                        familyEconomicCondition + ", " + familyType + ", " + relationshipStatus + ", " +
                        regularPhysicalActivity + ", " + religiousOrSpiritualPractices + ", " + sleepHoursPerDay + ", " +
                        smokingHabit + ", " + substanceUseToCope + ", " + comparisonWithOthersFrequency + ", " +
                        socialMediaTimePerDay + ", " + chronicHealthConditions + ", " + conflictImpactOnWellBeing + ", " +
                        confidenceInDifficultTimes + ", " + experiencedCyberBullying + ", " + childhoodTraumaExperience + ", " +
                        familyHistoryOfMentalDisorders + ", " + emotionalSupportFromFamily + ", " + feelingOfLoneliness + ", " +
                        worryAboutFutureFrequency + ", " + lossOfInterestFrequency + ", " + sleepIssuesFrequency + ", " +
                        tirednessFrequency + ", " + appetiteIssuesFrequency + ", " + selfWorthIssuesFrequency + ", " +
                        concentrationTroubleFrequency + ", " + unusualMovementOrRestlessness + ", " + feelingDepressedFrequency + ", " +
                        suicidalThoughtsFrequency);

                // Create a new All object using the all-args constructor
                All tempAll = new All(
                        age, gender, educationLevel, employmentStatus, familyEconomicCondition, familyType,
                        relationshipStatus, regularPhysicalActivity, religiousOrSpiritualPractices, sleepHoursPerDay,
                        smokingHabit, substanceUseToCope, comparisonWithOthersFrequency, socialMediaTimePerDay,
                        chronicHealthConditions, conflictImpactOnWellBeing, confidenceInDifficultTimes,
                        experiencedCyberBullying, childhoodTraumaExperience, familyHistoryOfMentalDisorders,
                        emotionalSupportFromFamily, feelingOfLoneliness, worryAboutFutureFrequency,
                        lossOfInterestFrequency, sleepIssuesFrequency, tirednessFrequency, appetiteIssuesFrequency,
                        selfWorthIssuesFrequency, concentrationTroubleFrequency, unusualMovementOrRestlessness,
                        feelingDepressedFrequency, suicidalThoughtsFrequency
                );

                // Create a new Family object using the all-args constructor
                Family tempFamily = new Family(
                        conflictImpactOnWellBeing, familyHistoryOfMentalDisorders,
                        emotionalSupportFromFamily, feelingOfLoneliness
                );

                // Create a new Physical object using the all-args constructor
                Physical tempPhysical = new Physical(
                        age, gender, regularPhysicalActivity, sleepHoursPerDay, smokingHabit,
                        socialMediaTimePerDay, chronicHealthConditions, tirednessFrequency,
                        appetiteIssuesFrequency
                );

                // Create a new Mental object using the all-args constructor
                Mental tempMental = new Mental(
                        religiousOrSpiritualPractices, substanceUseToCope, comparisonWithOthersFrequency,
                        confidenceInDifficultTimes, childhoodTraumaExperience, selfWorthIssuesFrequency,
                        concentrationTroubleFrequency, feelingDepressedFrequency, suicidalThoughtsFrequency
                );

                // Create a new Other object using the all-args constructor
                Other tempOther = new Other(
                        employmentStatus,
                        experiencedCyberBullying, worryAboutFutureFrequency, lossOfInterestFrequency,
                        sleepIssuesFrequency, unusualMovementOrRestlessness
                );

                // Create a new Education object using the all-args constructor
                Education tempEducation = new Education(
                        educationLevel, familyEconomicCondition, familyType, relationshipStatus
                );

                initAll.add(tempAll);
                initFamily.add(tempFamily);
                initPhysical.add(tempPhysical);
                initMental.add(tempMental);
                initEducation.add(tempEducation);
                initOther.add(tempOther);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ExcelReader() {}

}
