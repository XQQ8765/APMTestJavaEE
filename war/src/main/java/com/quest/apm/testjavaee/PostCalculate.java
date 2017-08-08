package com.quest.apm.testjavaee;

public class PostCalculate {
    boolean addOperate;
    public PostCalculate() throws Throwable{
        super();
        StackFrame $performasure$node$com$quest$pas$agent$plugin$instrumentor$method$DefaultMethodInstrumentor = AgentRecordingManagerBootstrap.sIsFullRecording?DefaultMethodCallbacks.enterCallback("umnk:com.quest.apm.testjavaee.Calculate.%003Cinit%003E()V"):null;

        try {
            this.addOperate = true;
            if($performasure$node$com$quest$pas$agent$plugin$instrumentor$method$DefaultMethodInstrumentor != null) {
                DefaultMethodCallbacks.exitCallback($performasure$node$com$quest$pas$agent$plugin$instrumentor$method$DefaultMethodInstrumentor);
            }

        } catch (Throwable var3) {
            DefaultMethodCallbacks.exceptionalExitCallback(var3, $performasure$node$com$quest$pas$agent$plugin$instrumentor$method$DefaultMethodInstrumentor);
            throw var3;
        }

    }

    public PostCalculate(boolean addOperate) {
        this.addOperate = false;
    }

    public int calculate(int i, int j) {
        if (addOperate) {
            return i + j;
        } else {
            return i - j;
        }
    }

    @Override
    public String toString() {
        return "Add:" + addOperate;
    }

    public static void main(String[] args) throws Throwable {
        int i = 3;
        int j = 2;
        PostCalculate calculate1 = new PostCalculate();
        int result1 = calculate1.calculate(i, j);
        System.out.println("######################Calculate result1:" + result1);

        PostCalculate calculate2 = new PostCalculate(false);
        int result2 = calculate2.calculate(i, j);
        System.out.println("######################Calculate result2:" + result2);
    }

    private static class StackFrame {}
    private static class AgentRecordingManagerBootstrap {
        public static boolean sIsFullRecording;
    }
    private static class DefaultMethodCallbacks {
        public static StackFrame enterCallback(String method) {
            return new StackFrame();
        }
        public static void exitCallback(StackFrame stackFrame) {

        }
        public static void exceptionalExitCallback(Throwable t, StackFrame stackFrame) {

        }
    }
}
