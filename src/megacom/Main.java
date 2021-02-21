package megacom;

import megacom.models.MyLists;
import megacom.models.Task8;
import megacom.models.Task9;
import megacom.service.impl.ElementsServiceImpl;

public class Main {

    public static void main(String[] args) {

        //ElementsService elementsService = ElementsService.getInstance();

        ElementsServiceImpl elements = new ElementsServiceImpl();

        elements.inputElements();
        elements.outputElements();
        elements.findMaxElement();
        elements.findMinElement();
        elements.oftenRepeatedElements();
        elements.sortList();
        elements.findNubers();

        System.out.println("****************************************");
        MyLists myLists = new MyLists();
        myLists.getList();

        System.out.println("****************************************");
        Task8 task8 = new Task8();
        task8.getList1();


        System.out.println("****************************************");
        Task9 task9 = new Task9();
        task9.getList1();


    }
}
