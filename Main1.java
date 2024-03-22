import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main1 {
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
        HashMap<Object, Object> hm = new HashMap<>();

        hm.put(101,"Sahil");
        hm.put(102,"Vilas");
        hm.put(103,"Mrun");
        hm.put(104,"Prad");
        hm.put(101,"sahil2");

        hm.put(null,"aaa");
        hm.put(null,"bbb");

        hm.put(111,null);
        hm.put(222,null);

        hm.remove(103);



        System.out.println(hm);

        Set set=hm.entrySet();
        System.out.println(set);
        //{101=Sahil, 102=Vilas, 103=Mrun, 104=Prad}
        //[101=Sahil, 102=Vilas, 103=Mrun, 104=Prad]

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //101=Sahil
        //102=Vilas
        //103=Mrun
        //104=Prad

        Iterator itr2 = set.iterator();
        while (itr2.hasNext()){
            Map.Entry entry = (Map.Entry) itr2.next();
            System.out.println(entry.getKey() +"-" +entry.getValue());
        }
            //101-Sahil
            //102-Vilas
            //103-Mrun
            //104-Prad



        for(Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey() + "->" + me.getValue());
        }


        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("Sahil"));

        System.out.println(hm.get(104));
        System.out.println(hm.get(106));

        System.out.println(hm.isEmpty());

        hm.replace(104,"qqq");

        System.out.println(hm.size());
    }
}
