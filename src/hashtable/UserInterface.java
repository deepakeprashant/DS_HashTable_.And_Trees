package hashtable;

import java.util.Map;

public class UserInterface {

    public void showMap(Repository repository) {
        System.out.println("Words ::  Frequency");
        System.out.println("---------------------");
        for (Map.Entry<String, Integer> entery : repository.myHashMap.entrySet()) {
            System.out.println(entery.getKey().toUpperCase()+ " :- " + entery.getValue());
        }
    }
}
