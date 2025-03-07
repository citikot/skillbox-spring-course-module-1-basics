package online.agatstudio.spring_basics.spring_context;

import java.text.MessageFormat;

public class LogicClass {

    private String name;

    private int code;

    public LogicClass() {
        System.out.println("LogicClass was initialized");
    }

    public LogicClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void simpleLogic() {
        System.out.println("Simple class logic");
    }

    public void printLogicData() {
        System.out.println(MessageFormat.format("Simple logic data: name {0} code {1}", name, code));
    }
}
