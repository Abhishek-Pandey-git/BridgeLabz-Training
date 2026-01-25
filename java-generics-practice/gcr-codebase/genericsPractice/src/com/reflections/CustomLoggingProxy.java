package com.reflections;

import java.lang.reflect.*;

interface Greeting {
    void sayHello(String name);
    void sayGoodbye(String name);
}

class GreetingImpl implements Greeting {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    public void sayGoodbye(String name) {
        System.out.println("Goodbye, " + name + "!");
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;
    
    public LoggingHandler(Object target) {
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling method: " + method.getName());
        
        Object result = method.invoke(target, args);
        
        System.out.println("Method finished: " + method.getName());
        
        return result;
    }
}

public class CustomLoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
            Greeting.class.getClassLoader(),
            new Class[]{Greeting.class},
            new LoggingHandler(greeting)
        );
        
        proxy.sayHello("John");
        System.out.println();
        proxy.sayGoodbye("John");
    }
}
