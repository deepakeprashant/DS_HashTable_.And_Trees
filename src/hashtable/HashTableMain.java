package hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        Repository repository = new Repository();
        UserInterface userInterface = new UserInterface();
        repository.getFrequency("To be or not to be");
        userInterface.showMap(repository);
    }
}
