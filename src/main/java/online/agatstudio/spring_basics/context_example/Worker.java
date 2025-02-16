package online.agatstudio.spring_basics.context_example;

import org.springframework.stereotype.Component;

@Component
public class Worker {

//    @Autowired // (1)
//    @Qualifier("simpleLogicClass")
    private final LogicClass simpleLogic;

//    @Autowired // (1)
//    @Qualifier("logicClassData")
    private final LogicClass dataSimpleLogic;

//    @Autowired // (1)
    private final DataComponent dataComponent;

//    @Autowired // (2)
//    public void setDataComponent(DataComponent dataComponent) {
//        this.dataComponent = dataComponent;
//    }

    //  имена параметров совпадают с бинами из AppConfig, Autowired не обязателен, если конструктор один // (3)
    public Worker(LogicClass simpleLogicClass, LogicClass logicClassData, DataComponent dataComponent) {
        this.simpleLogic = simpleLogicClass;
        this.dataSimpleLogic = logicClassData;
        this.dataComponent = dataComponent;
    }

    public void call() {
        simpleLogic.simpleLogic();
        simpleLogic.printLogicData();
        dataSimpleLogic.simpleLogic();
        dataSimpleLogic.printLogicData();
        dataComponent.someWork();
    }
}
