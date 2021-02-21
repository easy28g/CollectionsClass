package megacom.models;

import javafx.print.Collation;

import java.util.ArrayList;

public class MyLists  {

    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    public boolean getList() {

        int count = 0 , repeated = 0; boolean temp=false;


        do {
            for (int i = 0; i < 10; i++) {
                list1.add((int) (Math.random() * 100));
                list2.add((int) (Math.random() * 100));
            }

            count = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (list1.get(i).equals(list2.get(j))) {
                        count++;
                        //System.out.println(count);
                        break;
                    }
                }
            }

            if (count > 0) {
                //System.out.println("Count>0");

                for(int i=0; i<list1.size() && i<list2.size(); i++){
                    list1.remove(i);
                    list2.remove(i);
                }

            } else {
                temp = true;
            }


            repeated++;

        }while(temp == false);

        System.out.println("Repeated = " + repeated);

        for(int i=0; i<10; i++){
            System.out.print(list1.get(i)+", ");
        }
        System.out.println();
        for(int i=0; i<10; i++){
            System.out.print(list2.get(i)+", ");
        }

        System.out.println();

        return true;
    }

    public void setLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }




}
