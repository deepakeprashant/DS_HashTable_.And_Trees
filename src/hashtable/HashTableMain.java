package hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Repository repository = new Repository();
        UserInterface userInterface = new UserInterface();
        String paragraph = "Paranoids are not paranoid because they are paranoid but"+
                           "because they keep putting themselves deliberately into "+
                           "paranoid avoidable situations";
        repository.getFrequency(paragraph);
        System.out.println("Before Remove 'avoidable' word ");
        userInterface.showMap(repository);
        repository.getRemovingWords();
        System.out.println("After Remove 'avoidable' word");
        userInterface.showMap(repository);
    }
}
