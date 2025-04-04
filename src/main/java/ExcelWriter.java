import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    private void writeDataToExcel(List<All> data, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("All Data");

        // Create header row
        String[] headers = {
                "Age", "Gender", "Education Level", "Employment Status", "Family Economic Condition",
                "Family Type", "Relationship Status", "Do you engage in regular physical activity or exercise?",
                "Do you engage in religious or spiritual practices?", "How many hours do you sleep per day?",
                "Smoking habit", "Have you ever used substances (e.g., drugs, alcohol) to cope with depression?",
                "How often do you compare yourself to others in terms of achievements, appearance, or lifestyle?",
                "How much time do you spend on social media daily?",
                "Do you have any chronic health conditions (e.g., blood pressure, thyroid issues) that affect your mood or daily activities?",
                "How often do conflicts between your parents or family members affect your emotional well-being?",
                "How confident are you in handling difficult times?",
                "Have you ever experienced cyber-bullying or online harassment?",
                "Did you experience any significant trauma during childhood?",
                "Does your family have a history of mental disorders?",
                "How often do you feel emotionally supported by your family?",
                "How often do you feel lonely?",
                "How often have you been unable to stop or control worrying about your future career or personal growth?",
                "How often have you had little interest or pleasure in doing things?",
                "How often have you had trouble sleeping or sleeping too much?",
                "How often have you felt tired or had little energy?",
                "How often have you had poor appetite or overeating?",
                "How often have you been feeling bad about yourself, or that you are a failure, or have let yourself or your family down?",
                "How often have you had trouble concentrating on things, such as reading the newspaper or watching television?",
                "Moving or speaking so slowly that other people could have noticed? Or so fidgety or restless that you have been moving a lot more than usual?",
                "How often have you felt down, depressed, or hopeless?",
                "How often have you had thoughts that you would be better off dead or of hurting yourself?"
        };

        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(createHeaderCellStyle(workbook));
        }

        // Populate data rows
        int rowNum = 1;
        for (All record : data) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(record.getAge());
            row.createCell(1).setCellValue(record.getGender());
            row.createCell(2).setCellValue(record.getEducationLevel());
            row.createCell(3).setCellValue(record.getEmploymentStatus());
            row.createCell(4).setCellValue(record.getFamilyEconomicCondition());
            row.createCell(5).setCellValue(record.getFamilyType());
            row.createCell(6).setCellValue(record.getRelationshipStatus());
            row.createCell(7).setCellValue(record.getRegularPhysicalActivity());
            row.createCell(8).setCellValue(record.getReligiousOrSpiritualPractices());
            row.createCell(9).setCellValue(record.getSleepHoursPerDay());
            row.createCell(10).setCellValue(record.getSmokingHabit());
            row.createCell(11).setCellValue(record.getSubstanceUseToCope());
            row.createCell(12).setCellValue(record.getComparisonWithOthersFrequency());
            row.createCell(13).setCellValue(record.getSocialMediaTimePerDay());
            row.createCell(14).setCellValue(record.getChronicHealthConditions());
            row.createCell(15).setCellValue(record.getConflictImpactOnWellBeing());
            row.createCell(16).setCellValue(record.getConfidenceInDifficultTimes());
            row.createCell(17).setCellValue(record.getExperiencedCyberBullying());
            row.createCell(18).setCellValue(record.getChildhoodTraumaExperience());
            row.createCell(19).setCellValue(record.getFamilyHistoryOfMentalDisorders());
            row.createCell(20).setCellValue(record.getEmotionalSupportFromFamily());
            row.createCell(21).setCellValue(record.getFeelingOfLoneliness());
            row.createCell(22).setCellValue(record.getWorryAboutFutureFrequency());
            row.createCell(23).setCellValue(record.getLossOfInterestFrequency());
            row.createCell(24).setCellValue(record.getSleepIssuesFrequency());
            row.createCell(25).setCellValue(record.getTirednessFrequency());
            row.createCell(26).setCellValue(record.getAppetiteIssuesFrequency());
            row.createCell(27).setCellValue(record.getSelfWorthIssuesFrequency());
            row.createCell(28).setCellValue(record.getConcentrationTroubleFrequency());
            row.createCell(29).setCellValue(record.getUnusualMovementOrRestlessness());
            row.createCell(30).setCellValue(record.getFeelingDepressedFrequency());
            row.createCell(31).setCellValue(record.getSuicidalThoughtsFrequency());
        }

        // Resize columns to fit data
        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the workbook to a file
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to create a styled header
    private CellStyle createHeaderCellStyle(Workbook workbook) {
        CellStyle style = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        style.setFont(font);
        style.setAlignment(HorizontalAlignment.CENTER);
        return style;
    }

    public ExcelWriter(List<All> data, String filePath) {
        writeDataToExcel(data, filePath);
    }
}