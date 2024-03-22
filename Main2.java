import java.util.HashMap;

public class Main2 {
    //hashmap is map interface

    // hashmap is serialitable and clonebale

    //java.unit package

    // hashmap come in 1.2 jdk version

    //hash table is underlying data structure

    // properties

    //hashmap stores the value in key value pair

    // Entry is an interface which is present in map interface, entry interface is used to retriev single
    // key&Value in hashmap.  Each key$Value pair is called entry

    //In hashmap , keys are unique but value can be same

    //in hashmap, it can have max one null as key

    // HashMap can store heterogenius elements

    //Hashmap doesnot follow sorting and insertion order

    // Hashmap is non-synchronized data structure. Multiple thread can parallely work with one hashmap object. But on the
    // other hand this can cause data inconsistency issue.

    public static void main(String[] args) {
        HashMap hm = new HashMap<>();

        //default capacity = 16
        HashMap hm1 = new HashMap<>(20);

        //default load factor 0.74
        HashMap hm3 = new HashMap<>(16,2);
    }
}

