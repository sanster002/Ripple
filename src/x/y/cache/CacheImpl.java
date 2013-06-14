package x.y.cache;

import java.util.HashMap;

public class CacheImpl<K,V> implements ICache<K,V> {
	
	private HashMap map = null;
	
	public CacheImpl(){
		map = new HashMap<K, V>();
	}
	
	// Dummy implementation to get data from EhCache
	public V get(K key){
		return (V)map.get(key);
	}
	
	// Dummmy Implementation to put data in EhCache
	public void put(K key, V value){
		map.put(key, value);
	}
}
