package megacom.service;

import megacom.service.impl.ElementsServiceImpl;

public interface ElementsService {

    static ElementsService getInstance(){
        return (ElementsService) new ElementsServiceImpl();
    }
}
