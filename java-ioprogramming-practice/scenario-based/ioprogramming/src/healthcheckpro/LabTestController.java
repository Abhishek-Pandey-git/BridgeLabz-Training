package healthcheckpro;

public class LabTestController {
    
    @PublicAPI(description = "Get blood test results")
    public void getBloodTestResults() {
        System.out.println("Fetching blood test results...");
    }
    
    @RequiresAuth(role = "DOCTOR")
    public void updateTestResults() {
        System.out.println("Updating test results...");
    }
    
    @PublicAPI(description = "View available tests")
    @RequiresAuth(role = "USER")
    public void viewAvailableTests() {
        System.out.println("Viewing available tests...");
    }
    
    public void internalMethod() {
        System.out.println("Internal method - no annotations");
    }
}
