package x.y.cache;

public interface ICache<K, V> {

	public V get(K key);
	
	public void put(K key, V value);
	
}
