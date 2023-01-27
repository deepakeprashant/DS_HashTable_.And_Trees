package hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Repository {
    HashMap<String, Integer> myHashMap = new HashMap<>();

    public void getFrequency(String string) {
        String[] word = string.toLowerCase().split(" ");
        for (int i = 0; i < word.length; i++) {
            int count = 0;
            for (int j = i; j < word.length; j++) {
                if (word[j].equals(word[i])) {
                    count++;
                } else {
                    continue;
                }
            }
            boolean dublicate = (search(word[i]) != true) ? addData(word[i], count) : true;
            if (dublicate == true) {
                break;
            }
        }
    }

    private boolean addData(String key, int value) {
        myHashMap.put(key, value);
        return false;
    }

    private boolean search(String s) {
        return myHashMap.containsKey(s);
    }
}
