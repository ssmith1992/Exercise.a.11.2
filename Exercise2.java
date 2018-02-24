package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
Write a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating
elements from the two lists, in the following order:
• First element from first list
• First element from second list
• Second element from first list
• Second element from second list
• Third element from first list
• Third element from second list
• . . .
If the lists do not contain the same number of elements, the remaining elements from the longer list should be
placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8,
4, 9, 5, 10, 11, 12].
 */
public class Exercise2 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(11);
        list2.add(12);

        Exercise2 exercise2 = new Exercise2();

        ArrayList<Integer> result = exercise2.set(list, list2);
        System.out.println(result);
    }

    private ArrayList<Integer> set(List<Integer> list1, List<Integer> list2)
    {
        ArrayList<Integer> resultList = new ArrayList<>();

        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();

        while (itr1.hasNext() || itr2.hasNext())
        {
            if (itr1.hasNext()) resultList.add( itr1.next());
            if (itr2.hasNext()) resultList.add( itr2.next());
        }
        return resultList;
    }
}
