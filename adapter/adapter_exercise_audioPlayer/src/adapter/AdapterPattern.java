package adapter;

import Services.Service;

public class AdapterPattern implements Adapter {

    private Service service;

    public AdapterPattern(Service service) {
        this.service = service;
    }

    @Override
    public void play(String fileName) {
        service.play(fileName);
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }  
}
