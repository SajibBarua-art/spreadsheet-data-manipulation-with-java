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
    String filePath = "src/main/resources/performance.xlsx"; // Replace with your file path

    void readExcelFile(ArrayList<All> initAll, ArrayList<Cgpa> initCgpa,
                       ArrayList<Email> initEmail, ArrayList<Occupation> initOccupation, ArrayList<Other> initOther) {


        try (FileInputStream fis = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet

//            for(int c = 0; c < sheet.getRow(0).getLastCellNum(); c++) {
//                Cell cell = sheet.getRow(0).getCell(c);
//                System.out.print("\"" + cell.getStringCellValue() + "\", ");
//            }

            for (int r = 1; r < sheet.getLastRowNum(); r++) {
                Row row = sheet.getRow(r);

                // Initialize the values for each column
                String timestamp = null;
                String email = null;
                String gender = null;
                String faculty = null;
                String hscGpa = null;
                String attendanceMark = null;
                String hasTakenAnyCourse = null;
                String attendedInTwoClassTests = null;
                String averageObtainedClass = null;
                String submittedAllAssignment = null;
                String performedPresentation = null;
                String housingType = null;
                String familyCondition = null;
                String parentalOccupation = null;
                String classroomFacilities = null;
                String resourceAvailability = null;
                String studyHour = null;
                String distanceFromLivingPlace = null;
                String transportationType = null;
                String involvementInClub = null;
                String attitudeStudy = null;
                String sleepingTime = null;
                String mentalHealth = null;
                String familySupport = null;
                String involvementInTuition = null;
                String movieAddiction = null;
                String freeTime = null;
                String parentalEducation = null;
                String accessToLaptop = null;
                String hometown = null;
                String cgpa = null;

                // Iterate over cells in the current row
                for (int c = 0; c < row.getLastCellNum(); c++) {
                    Cell cell = row.getCell(c);

                    switch (c) {
                        case 0:
                            break;
                        case 1:
                            email = cell.getStringCellValue();
                            break;
                        case 2:
                            gender = cell.getStringCellValue();
                            break;
                        case 3:
                            faculty = cell.getStringCellValue();
                            break;
                        case 4:
                            hscGpa = String.valueOf(cell.getNumericCellValue());
                            break;
                        case 5:
                            attendanceMark = cell.getStringCellValue();
                            break;
                        case 6:
                            hasTakenAnyCourse = cell.getStringCellValue();
                            break;
                        case 7:
                            attendedInTwoClassTests = cell.getStringCellValue();
                            break;
                        case 8:
                            averageObtainedClass = cell.getStringCellValue();
                            break;
                        case 9:
                            submittedAllAssignment = cell.getStringCellValue();
                            break;
                        case 10:
                            performedPresentation = cell.getStringCellValue();
                            break;
                        case 11:
                            housingType = cell.getStringCellValue();
                            break;
                        case 12:
                            familyCondition = cell.getStringCellValue();
                            break;
                        case 13:
                            parentalOccupation = cell.getStringCellValue();
                            break;
                        case 14:
                            classroomFacilities = cell.getStringCellValue();
                            break;
                        case 15:
                            resourceAvailability = cell.getStringCellValue();
                            break;
                        case 16:
                            studyHour = cell.getStringCellValue();
                            break;
                        case 17:
                            distanceFromLivingPlace = cell.getStringCellValue();
                            break;
                        case 18:
                            transportationType = cell.getStringCellValue();
                            break;
                        case 19:
                            involvementInClub = cell.getStringCellValue();
                            break;
                        case 20:
                            attitudeStudy = cell.getStringCellValue();
                            break;
                        case 21:
                            sleepingTime = cell.getStringCellValue();
                            break;
                        case 22:
                            mentalHealth = cell.getStringCellValue();
                            break;
                        case 23:
                            familySupport = cell.getStringCellValue();
                            break;
                        case 24:
                            involvementInTuition = cell.getStringCellValue();
                            break;
                        case 25:
                            movieAddiction = cell.getStringCellValue();
                            break;
                        case 26:
                            freeTime = cell.getStringCellValue();
                            break;
                        case 27:
                            parentalEducation = cell.getStringCellValue();
                            break;
                        case 28:
                            accessToLaptop = cell.getStringCellValue();
                            break;
                        case 29:
                            hometown = cell.getStringCellValue();
                            break;
                        case 30:
                            cgpa = String.valueOf(cell.getNumericCellValue());
                            break;
                        default:
                            break;
                    }
                }

                // Create a new All object using the all-args constructor
                All tempAll = new All(
                        timestamp, email, gender, faculty, hscGpa, attendanceMark, hasTakenAnyCourse,
                        attendedInTwoClassTests, averageObtainedClass, submittedAllAssignment,
                        performedPresentation, housingType, familyCondition, parentalOccupation,
                        classroomFacilities, resourceAvailability, studyHour, distanceFromLivingPlace,
                        transportationType, involvementInClub, attitudeStudy, sleepingTime,
                        mentalHealth, familySupport, involvementInTuition, movieAddiction,
                        freeTime, parentalEducation, accessToLaptop, hometown, cgpa
                );

                Cgpa tempCgpa = new Cgpa(
                        attendanceMark, hasTakenAnyCourse, attendedInTwoClassTests,
                        averageObtainedClass, housingType, studyHour, attitudeStudy,
                        involvementInTuition, accessToLaptop, cgpa
                );

                Other tempOther = new Other(
                        faculty, hscGpa, submittedAllAssignment, performedPresentation,
                        classroomFacilities, resourceAvailability, distanceFromLivingPlace,
                        transportationType, involvementInClub, sleepingTime, mentalHealth,
                        movieAddiction, freeTime, hometown
                );

                Email tempEmail = new Email(email, gender);

                Occupation tempOccupation = new Occupation(
                        familyCondition, parentalOccupation, familySupport, parentalEducation
                );

                initAll.add(tempAll);
                initEmail.add(tempEmail);
                initCgpa.add(tempCgpa);
                initOccupation.add(tempOccupation);
                initOther.add(tempOther);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ExcelReader() {}

}
