package com.annotations;

import java.lang.reflect.Method;

class UserService {
    
    @BugReport(description = "User login fails when username contains special characters")
    @BugReport(description = "Session timeout not working properly")
    public void login(String username, String password) {
        System.out.println("Login method implementation");
    }
    
    @BugReport(description = "Password reset email not sent")
    @BugReport(description = "Reset link expires too early")
    @BugReport(description = "Multiple reset requests cause server overload")
    public void resetPassword(String email) {
        System.out.println("Reset password implementation");
    }
}

public class BugReportDemo {
    
    public static void main(String[] args) {
        displayBugReports();
    }
    
    public static void displayBugReports() {
        Class<UserService> clazz = UserService.class;
        
        System.out.println("Bug Reports for UserService Methods:");
        System.out.println("=====================================\n");
        
        for (Method method : clazz.getDeclaredMethods()) {
            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
            
            if (bugReports.length > 0) {
                System.out.println("Method: " + method.getName());
                System.out.println("Number of Bug Reports: " + bugReports.length);
                
                for (int i = 0; i < bugReports.length; i++) {
                    System.out.println("  Bug " + (i + 1) + ": " + bugReports[i].description());
                }
                System.out.println();
            }
        }
    }
}
