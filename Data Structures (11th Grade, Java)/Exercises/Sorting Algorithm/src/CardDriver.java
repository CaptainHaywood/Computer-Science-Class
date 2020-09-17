import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

public class CardDriver {
    public static void main(String[] args) {
        ArrayList<Card> cardList = new ArrayList<Card>();
        ArrayList<String> suitList = new ArrayList<String>();
        suitList.add("C");
        suitList.add("D");
        suitList.add("H");
        suitList.add("S");
        for(int o = 0; o<4; o++){
            for(int i = 2; i<15; i++){
                Card toAdd = new Card(i, suitList.get(o));
                cardList.add(toAdd);
                }
            }
        Collections.shuffle(cardList);
        System.out.println(cardList);
        sort(cardList);
        System.out.println(cardList);
        }

        public static void sort(ArrayList<? extends Comparable> theList){
            for(int i = 0; i < theList.size(); i++){
                Comparable smallest = theList.get(i);
                int place = i;
                for(int j = i; j < theList.size(); j++){
                    if(theList.get(j).compareTo(smallest) < 0){
                        smallest = theList.get(j);
                        place  = j;
                    }
                }
                Collections.swap(theList, place, i);
            }
        }
    }
