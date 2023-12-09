public class DataStrorage<T> implements DataStructure<T>{
    private T data;

    @Override
    public void add(T data) {
        this.data = data;
    }

    @Override
    public T get() {
        return data;
    }
}
