import java.lang.reflect.Method;

abstract class TestA {
    public static void undeployCallback(String appName) {
        System.out.println("TestA.undeployCallback");
    }
}

public class TestB extends TestA {
    public static void undeployCallback(String appName) {
        System.out.println("TestB.undeployCallback");
    }

    public static void main(String[] args) {
        Method[] methods = TestB.class.getMethods();
        if (methods == null) {
            System.out.println("methods is null");
        }
        for (int i =0; i<methods.length; i++) {
            Method m = methods[i];
            System.out.println("methods[" + i + "]: methodName:" + m.getName() + ", declaringClass:" + m.getDeclaringClass());
        }
    }
}