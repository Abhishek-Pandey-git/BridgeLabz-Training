package eventtracker;

public class UserService {
    
    @AuditTrail(action = "USER_LOGIN", level = "INFO")
    public void login(String username) {
        System.out.println("User " + username + " logged in");
    }
    
    @AuditTrail(action = "FILE_UPLOAD", level = "INFO")
    public void uploadFile(String filename) {
        System.out.println("File uploaded: " + filename);
    }
    
    @AuditTrail(action = "FILE_DELETE", level = "WARNING")
    public void deleteFile(String filename) {
        System.out.println("File deleted: " + filename);
    }
    
    @AuditTrail(action = "USER_LOGOUT", level = "INFO")
    public void logout(String username) {
        System.out.println("User " + username + " logged out");
    }
    
    public void regularMethod() {
        System.out.println("Regular method - no audit trail");
    }
}
