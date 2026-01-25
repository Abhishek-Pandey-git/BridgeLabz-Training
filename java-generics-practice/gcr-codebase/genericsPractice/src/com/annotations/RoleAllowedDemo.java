package com.annotations;

import java.lang.reflect.Method;

class AdminService {
    
    @RoleAllowed("ADMIN")
    public void deleteUser(String username) {
        System.out.println("User deleted: " + username);
    }
    
    @RoleAllowed("ADMIN")
    public void viewSystemLogs() {
        System.out.println("System logs displayed");
    }
    
    public void viewProfile() {
        System.out.println("Profile displayed");
    }
}

class CurrentUser {
    private String role;
    
    public CurrentUser(String role) {
        this.role = role;
    }
    
    public String getRole() {
        return role;
    }
}

public class RoleAllowedDemo {
    
    public static void invokeWithRoleCheck(Object obj, String methodName, CurrentUser user) {
        try {
            Method method = obj.getClass().getMethod(methodName);
            
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
                String requiredRole = annotation.value();
                
                if (user.getRole().equals(requiredRole)) {
                    System.out.println("Access granted for " + methodName);
                    method.invoke(obj);
                } else {
                    System.out.println("Access Denied! Required role: " + requiredRole);
                }
            } else {
                method.invoke(obj);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        AdminService service = new AdminService();
        
        CurrentUser admin = new CurrentUser("ADMIN");
        CurrentUser normalUser = new CurrentUser("USER");
        
        System.out.println("Admin trying to delete user:");
        invokeWithRoleCheck(service, "deleteUser", admin);
        
        System.out.println("\nNormal user trying to delete user:");
        invokeWithRoleCheck(service, "deleteUser", normalUser);
        
        System.out.println("\nAdmin trying to view logs:");
        invokeWithRoleCheck(service, "viewSystemLogs", admin);
        
        System.out.println("\nNormal user trying to view logs:");
        invokeWithRoleCheck(service, "viewSystemLogs", normalUser);
        
        System.out.println("\nNormal user viewing profile:");
        invokeWithRoleCheck(service, "viewProfile", normalUser);
    }
}
