public class DataOperations {
    public static <T>void print(DataStructure<T> dataStructure){
        T data = dataStructure.get();
        System.out.println("Bazadan cekilen data: " + data);
    }
}
