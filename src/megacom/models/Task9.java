package megacom.models;

import java.util.ArrayList;
import java.util.Collections;

public class Task9 {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

    public boolean getList1() {

        for(int i=0; i<5; i++){
            list1.add((int)(Math.random()*(100-1))+1);
        }

        for(int i=0; i<5; i++){
            System.out.print(list1.get(i)+", ");
        }
        System.out.println();

        //Copy
        for(int i=0; i<5; i++){
            list2.add(list1.get(i));
            list3.add(list1.get(i));
        }

        Collections.shuffle(list2);
        Collections.sort(list3);

        int count = 0;

        do{
            Collections.shuffle(list2);

            count++;
        }while(!(list2.equals(list3)));

        System.out.println("Amount shuffle for sort == "+count);


        for(int i=0; i<5; i++){
            System.out.print(list2.get(i)+", ");
        }
        System.out.println();

        return true;
    }

    public void setList1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }
}
