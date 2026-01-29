package com.functionalinterface;

interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    
    // Default method added later
    default void exportToJSON() {
        System.out.println("Exporting data to JSON format");
        System.out.println("JSON export completed");
    }
}

class SalesReport implements DataExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Sales Report: Exported to CSV");
    }
    
    @Override
    public void exportToPDF() {
        System.out.println("Sales Report: Exported to PDF");
    }
}

class InventoryReport implements DataExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Inventory Report: Exported to CSV");
    }
    
    @Override
    public void exportToPDF() {
        System.out.println("Inventory Report: Exported to PDF");
    }
    
    // Override for custom JSON export
    @Override
    public void exportToJSON() {
        System.out.println("Inventory Report: Custom JSON export with metadata");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter salesReport = new SalesReport();
        DataExporter inventoryReport = new InventoryReport();
        
        salesReport.exportToCSV();
        salesReport.exportToPDF();
        salesReport.exportToJSON();
        
        System.out.println();
        
        inventoryReport.exportToCSV();
        inventoryReport.exportToPDF();
        inventoryReport.exportToJSON();
    }
}
