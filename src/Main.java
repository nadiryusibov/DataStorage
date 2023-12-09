public class Main {
    public static void main(String[] args) {
        DataStrorage<String>stringStorage = new DataStrorage<>();
        stringStorage.add("Birthday Year");
        DataOperations.print(stringStorage);

        DataStrorage<Integer>intStrorage = new DataStrorage<>();
        intStrorage.add(1993);
        DataOperations.print(intStrorage);
    }
}