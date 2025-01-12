package online.agatstudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    @Autowired
    @Qualifier("simpleLogicClass")
    private LogicClass simpleLogic;

    @Autowired
    @Qualifier("logicClassData")
    private LogicClass dataSampleLogic;

    private DataComponent dataComponent;

    @Autowired
    public void setDataComponent(DataComponent dataComponent) {
        this.dataComponent = dataComponent;
    }

    public void call() {
        simpleLogic.simpleLogic();
        dataSampleLogic.printLogicData();
        dataComponent.someWork();
    }
}
