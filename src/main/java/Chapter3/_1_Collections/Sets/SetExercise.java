package Chapter3._1_Collections.Sets;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Sets are unordered collections of elements. Sets do not allow duplicates.
 *
 * Sets are very efficient for storing items that should be unique.
 */
public class SetExercise {
    /**
     * Like List, Set is an interface. However, the Set interface is different: for instance, it doesn't make sense
     * for Sets to have a get method to retrieve an item at a particular index from a set, because Sets are unordered.
     *
     * Some common implementations of Set are HashSet and TreeSet. Look into how to instantiate them.
     * @return a Set object.
     */
    public Set<Integer> createSet(){
        Set<Integer> newSet = new HashSet<>();


        return newSet;
    }

    /**
     * @param set the set that we will be manipulating.
     * @return the size of set. (number of values)
     */
    public int getSize(Set<Integer> set){
        int size = set.size();

        return size;
    }

    /**
     * @param set the set that we will be manipulating.
     * @param item item which we will be adding to set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public Set<Integer> addUniqueItem(Set<Integer> set, int item){
//add item to set before returning
        set.add(item);
        return set;
    }

    /**
     * @param set the set that we will be manipulating.
     * @param item item which we will be removing from set.
     * @return nothing, pass by reference will cause changes to the list object to be reflected across the program.
     */
    public Set<Integer> removeItem(Set<Integer> set, int item){
//        remove item before returning
        set.remove(item);
        return set;
    }
}
