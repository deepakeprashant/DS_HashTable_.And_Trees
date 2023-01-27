package hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Repository repository = new Repository();
        UserInterface userInterface = new UserInterface();
        String paragraph = "Paranoids are not paranoid because they are paranoid but"+
                           "because they keep putting themselves deliberately into "+
                           "paranoid avoidable situations";
        repository.getFrequency(paragraph);
        userInterface.showMap(repository);
    }
}
