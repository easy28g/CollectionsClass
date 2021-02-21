package megacom.service.impl;

import megacom.service.*;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.max;

public class ElementsServiceImpl implements FindMaxService, FindMinService,
                                            FindNumbersService, ListSortService,
                                            OftenRepeatedService, InputElementsService,
                                            ElementsService, OutputElementsService
{

    ArrayList<Integer> arrayListImpl = new ArrayList<Integer>();

    @Override
    public void inputElements() {

        for(int i=0; i<100; i++){
            int rand = (int)(Math.random()*(100-1))+1;
            arrayListImpl.add(rand);
        }
    }

    @Override
    public void findMaxElement() {
        int max = max(arrayListImpl);
        System.out.println("Max element == "+max);
    }

    @Override
    public void findMinElement() {
        int min = Collections.min(arrayListImpl);
        System.out.println("Min element == "+min);
    }


    @Override
    public void oftenRepeatedElements() {

        ArrayList<Integer> arr = new ArrayList<>();

        Collections.sort(arrayListImpl);

        for(int item: arrayListImpl){
            arr.add(Collections.frequency(arrayListImpl,item));
        }

        int maxe = arr.get(0);
        for(int item: arr){
            if(maxe<item){
                maxe = item;
            }
        }

        System.out.println("Amount Often Reapeted Elements == "+maxe);

        for(int i=0; i<arrayListImpl.size(); i++){
            if(Collections.frequency(arrayListImpl, arrayListImpl.get(i))==maxe && arrayListImpl.get(i)!=arrayListImpl.get(i+1)){
                System.out.println("Often Reapeted Elements: "+arrayListImpl.get(i));
            }
        }
    }

    @Override
    public void sortList() {
        Collections.sort(arrayListImpl);
        outputElements();
    }

    @Override
    public void outputElements() {
        for(int i=0; i<100; i++){

            if(i%20 == 0 && i>0){
                System.out.println();
            }

            if(i==99){
                System.out.print(arrayListImpl.get(i)+".");
                break;
            }

            System.out.print(arrayListImpl.get(i)+", ");
        }
        System.out.println();
    }

    @Override
    public void findNubers() {
        System.out.println("Numbers 5 repeated: "+Collections.frequency(arrayListImpl, 5));
        System.out.println("Numbers 7 repeated: "+Collections.frequency(arrayListImpl, 7));
    }
}






















































