package com.annotations;

class LegacyAPI {
    
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature - should not be used anymore");
    }
    
    public void newFeature() {
        System.out.println("This is the new improved feature - use this instead");
    }
}

public class DeprecatedDemo {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        
        System.out.println("Calling deprecated method:");
        api.oldFeature();
        
        System.out.println("\nCalling new method:");
        api.newFeature();
    }
}
