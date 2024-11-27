import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {
    public void writeDataToExcel(List<All> data, String filePath) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("All Data");

        // Create header row
        String[] headers = {
                "Timestamp", "Email address", "Gender", "Faculty", "HSC gpa", "Attendance mark", "Has retaken any course ?",
                "Attended in 2 class tests?", "Average of obtained class test's mark( If you have 5 course ,then give the average ct mark of 5 course)",
                "Submitted all the assignments?", "Performed the presentation? (If any presentation is taken in that semester)",
                "Type of housing", "Family condition", "Parental occupation", "Classroom facilities", "Availability of resources",
                "Study hour per week", "Distance from living place to university", "Type of transportation used",
                "Involvement in any club or organization", "Attitude towards study", "Daily sleeping time",
                "Mental health condition (Anxiety or depression)", "Family support", "Involvement in tuition", "Movie or web series addiction", "What do you do in free time?", "Parental level of education", "Access to laptop or computer", "Hometown", "Last completed semester GPA/ Final CGPA"
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
            row.createCell(0).setCellValue(record.getTimestamp());
            row.createCell(1).setCellValue(record.getEmail());
            row.createCell(2).setCellValue(record.getGender());
            row.createCell(3).setCellValue(record.getFaculty());
            row.createCell(4).setCellValue(record.getHscGpa());
            row.createCell(5).setCellValue(record.getAttendanceMark());
            row.createCell(6).setCellValue(record.getHasTakenAnyCourse());
            row.createCell(7).setCellValue(record.getAttendedInTwoClassTests());
            row.createCell(8).setCellValue(record.getAverageObtainedClass());
            row.createCell(9).setCellValue(record.getSubmittedAllAssignment());
            row.createCell(10).setCellValue(record.getPerformedPresentation());
            row.createCell(11).setCellValue(record.getHousingType());
            row.createCell(12).setCellValue(record.getFamilyCondition());
            row.createCell(13).setCellValue(record.getParentalOccupation());
            row.createCell(14).setCellValue(record.getClassroomFacilities());
            row.createCell(15).setCellValue(record.getResourceAvailability());
            row.createCell(16).setCellValue(record.getStudyHour());
            row.createCell(17).setCellValue(record.getDistanceFromLivingPlace());
            row.createCell(18).setCellValue(record.getTransportationType());
            row.createCell(19).setCellValue(record.getInvolvementInClub());
            row.createCell(20).setCellValue(record.getAttitudeStudy());
            row.createCell(21).setCellValue(record.getSleepingTime());
            row.createCell(22).setCellValue(record.getMentalHealth());
            row.createCell(23).setCellValue(record.getFamilySupport());
            row.createCell(24).setCellValue(record.getInvolvementInTuition());
            row.createCell(25).setCellValue(record.getMovieAddiction());
            row.createCell(26).setCellValue(record.getFreeTime());
            row.createCell(27).setCellValue(record.getParentalEducation());
            row.createCell(28).setCellValue(record.getAccessToLaptop());
            row.createCell(29).setCellValue(record.getHometown());
            row.createCell(30).setCellValue(record.getCgpa());
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
}
