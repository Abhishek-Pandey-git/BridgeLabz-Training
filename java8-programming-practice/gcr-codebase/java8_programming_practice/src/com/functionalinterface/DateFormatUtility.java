package com.functionalinterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    // Static methods for date formatting
    static String formatToISO(LocalDate date) {
        return date.format(DateTimeFormatter.ISO_DATE);
    }
    
    static String formatToDDMMYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    static String formatToMMDDYYYY(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    
    static String formatToLongFormat(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
    }
}

public class DateFormatUtility {
    public static void main(String[] args) {
        LocalDate invoiceDate = LocalDate.now();
        
        System.out.println("Invoice Date Formats:");
        System.out.println("ISO Format: " + DateFormatter.formatToISO(invoiceDate));
        System.out.println("DD-MM-YYYY: " + DateFormatter.formatToDDMMYYYY(invoiceDate));
        System.out.println("MM/DD/YYYY: " + DateFormatter.formatToMMDDYYYY(invoiceDate));
        System.out.println("Long Format: " + DateFormatter.formatToLongFormat(invoiceDate));
    }
}
