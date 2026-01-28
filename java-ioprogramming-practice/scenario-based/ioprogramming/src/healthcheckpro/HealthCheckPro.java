package healthcheckpro;

import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.IOException;

public class HealthCheckPro {
    
    public static void main(String[] args) {
        HealthCheckPro checker = new HealthCheckPro();
        checker.scanController(LabTestController.class);
    }
    
    public void scanController(Class<?> controllerClass) {
        System.out.println("=== HealthCheckPro API Scanner ===\n");
        System.out.println("Scanning: " + controllerClass.getSimpleName() + "\n");
        
        Method[] methods = controllerClass.getDeclaredMethods();
        StringBuilder docBuilder = new StringBuilder();
        
        docBuilder.append("API Documentation\n");
        docBuilder.append("=================\n\n");
        docBuilder.append("Controller: ").append(controllerClass.getSimpleName()).append("\n\n");
        
        int publicAPIs = 0;
        int authRequired = 0;
        int missingAnnotations = 0;
        
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            
            boolean hasPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean hasAuth = method.isAnnotationPresent(RequiresAuth.class);
            
            docBuilder.append("Method: ").append(method.getName()).append("\n");
            
            if (hasPublicAPI) {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println("  [@PublicAPI] " + api.description());
                docBuilder.append("  Type: Public API\n");
                docBuilder.append("  Description: ").append(api.description()).append("\n");
                publicAPIs++;
            }
            
            if (hasAuth) {
                RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
                System.out.println("  [@RequiresAuth] Role: " + auth.role());
                docBuilder.append("  Auth Required: Yes (Role: ").append(auth.role()).append(")\n");
                authRequired++;
            } else {
                docBuilder.append("  Auth Required: No\n");
            }
            
            if (!hasPublicAPI && !hasAuth) {
                System.out.println("  [WARNING] Missing annotations!");
                docBuilder.append("  WARNING: Missing annotations\n");
                missingAnnotations++;
            }
            
            System.out.println();
            docBuilder.append("\n");
        }
        
        System.out.println("\n=== Summary ===");
        System.out.println("Total Methods: " + methods.length);
        System.out.println("Public APIs: " + publicAPIs);
        System.out.println("Auth Required: " + authRequired);
        System.out.println("Missing Annotations: " + missingAnnotations);
        
        docBuilder.append("\nSummary\n");
        docBuilder.append("-------\n");
        docBuilder.append("Total Methods: ").append(methods.length).append("\n");
        docBuilder.append("Public APIs: ").append(publicAPIs).append("\n");
        docBuilder.append("Auth Required: ").append(authRequired).append("\n");
        docBuilder.append("Missing Annotations: ").append(missingAnnotations).append("\n");
        
        generateDocumentation(docBuilder.toString());
    }
    
    private void generateDocumentation(String content) {
        try (FileWriter writer = new FileWriter("API_Documentation.txt")) {
            writer.write(content);
            System.out.println("\nDocumentation generated: API_Documentation.txt");
        } catch (IOException e) {
            System.out.println("Error writing documentation: " + e.getMessage());
        }
    }
}
