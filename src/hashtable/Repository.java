package hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Repository {
    HashMap<String, Integer> myHashMap = new HashMap<>();

    public void getFrequency(String string) {
        String[] word = string.toLowerCase().split(" ");
        for (int i = 0; i < word.length; i++) {
            if (myHashMap.containsKey(word[i])){
                myHashMap.put(word[i], myHashMap.get(word[i])+1 );
            }else {
                myHashMap.put(word[i],1 );
            }
        }
    }

    public void getRemovingWords() {
        for (int i = 0; i < myHashMap.size(); i++) {
            if (myHashMap.containsKey("avoidable")){
                myHashMap.remove("avoidable");
            }
        }
    }
}
