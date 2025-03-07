package online.agatstudio.spring_basics.scopes_example;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class ObjectFactoryHolder {

    private final ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory;

    private final ObjectFactory<FirstSingleton> firstSingletonObjectFactory;

    // если конструктор один, то спринг его увидит и использует без аннотации @Autowire !!!
    public ObjectFactoryHolder(ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory,
                               ObjectFactory<FirstSingleton> firstSingletonObjectFactory) {
        this.prototypeComponentObjectFactory = prototypeComponentObjectFactory;
        this.firstSingletonObjectFactory = firstSingletonObjectFactory;
    }

    public FirstSingleton getSinglton() {
        return firstSingletonObjectFactory.getObject();
    }

    public PrototypeComponent getPrototype() {
        return prototypeComponentObjectFactory.getObject();
    }
}
