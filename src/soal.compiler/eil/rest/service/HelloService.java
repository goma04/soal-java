package eil.rest.service;

import org.springframework.stereotype.Service;

import eil.common.IHello;
import eil.common.CustomName;
import eil.common.When;
import eil.common.CustomGreeting;

import eil.service.HelloServiceFactory;

@Service
public class HelloService implements IHello {
    private IHello _service;

    private synchronized IHello getService() {
        if (_service == null) {
            _service = new HelloServiceFactory().create();
        }
        return _service;
    }

    @Override
    public String sayHello(String name) {
        return getService().sayHello(name);
    }

    @Override
    public CustomGreeting customSayHello(CustomName customName, When when) {
        return getService().customSayHello(customName, when);
    }


}
