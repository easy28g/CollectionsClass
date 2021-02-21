package megacom.models;

import java.util.ArrayList;
import java.util.Collections;

public class Task8 {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    public boolean getList1() {
        for(int i=0; i<10; i++){
            list1.add((int)(Math.random()*(100-1))+1);
        }

        for(int i=0; i<10; i++){
            list2.add(list1.get(i));
        }

        int count = 0;
        do {
            Collections.shuffle(list2);
            count++;
        }while (!(list1.equals(list2)));

        for(int i=0; i<10; i++){
            System.out.print(list1.get(i)+", ");
        }

        System.out.println();

        for(int i=0; i<10; i++){
            System.out.print(list2.get(i)+", ");
        }

        System.out.println();

        System.out.println("Amount shuffle for return equals == "+count);

        return true;
    }

    public void setList1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }
}
