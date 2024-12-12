package Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Constants {

    public static String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
    // variable
    final public static Integer implicitlyWaitTime = 30;
    final public static String configPropFilePath = "src/test/resources/propertiesFolder/configuration.properties";
    final public static String sqlQuery = "Select * employeeID from Employer;";
    final public static String excelFilePath = "";
    final public static String  oracleEmployeeExcelFile = "";
    final public static String  oracleExecutiveExcelFile = "";
    final public static String excelNewFilePath = ""+timestamp+".xlsx";
    final public static String expectedDescriptionParag = "";
    final public static String shopString = "";
}
