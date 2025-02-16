package online.agatstudio.context_example;

import java.text.MessageFormat;

public class LogicClass {

    private String name;
    private int code;

    public LogicClass(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("LogicClass was initialized.");
    }

    public LogicClass() {}

    public void simpleLogic() {
        System.out.println("Simple class logic.");
    }

    public void printLogicData() {
        System.out.println(MessageFormat.format("Simple logic data {0}, {1}.", name, code));
    }
}
