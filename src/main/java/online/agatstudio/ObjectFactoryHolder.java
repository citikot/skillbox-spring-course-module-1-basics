package online.agatstudio;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Component;

@Component
public class ObjectFactoryHolder {

    private final ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory;

    private final ObjectFactory<FirstSingleton> firstSingletonObjectFactory;

    public ObjectFactoryHolder(ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory,
                               ObjectFactory<FirstSingleton> firstSingletonObjectFactory) {
        this.prototypeComponentObjectFactory = prototypeComponentObjectFactory;
        this.firstSingletonObjectFactory = firstSingletonObjectFactory;
    }

    public PrototypeComponent getPrototype() {
        return  prototypeComponentObjectFactory.getObject();
    }

    public FirstSingleton getSingleton() {
        return  firstSingletonObjectFactory.getObject();
    }

}
