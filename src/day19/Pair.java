package day19;

public class Pair<K, V> {

    private K key;
    private V value;

    public void set(K key, V value){
        this.key = key;
        this.value = value;
    }

    public V get(){
        return this.value;
    }
}
