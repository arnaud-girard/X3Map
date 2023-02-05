import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class X3Map<A,B,C> {
    private ArrayList<A> _keyList = new ArrayList<A>();
    private ArrayList<B> _defaultValList = new ArrayList<B>();
    private ArrayList<C> _extendedValList = new ArrayList<C>();

    /**
     * Gets the two values of a set by using its <b>key</b>
     * @param key
     * @return <b>SimpleEntry</b>&lt;{@code defaultValue}, {@code extendedValue}&gt;
     */
    public Entry<B,C> get(A key){
        return new SimpleEntry<>(_defaultValList.get(_keyList.indexOf(key)), _extendedValList.get(_keyList.indexOf(key)));
    }

    /**
     * Gets the two values of a set by using its <b>index</b>
     * @param key
     * @return <b>SimpleEntry</b>&lt;{@code defaultValue}, {@code extendedValue}&gt;
     */
    public Entry<B,C> get(int index){
        return new SimpleEntry<>(_defaultValList.get(index), _extendedValList.get(index));
    }

    /**
     * Creates a set with a key, a defaultValue and a extendedValue
     * @param key
     * @param defaultVal
     * @param extendedVal
     */
    public void set(A key, B defaultVal, C extendedVal){
        if(_keyList.contains(key) == false){
            _keyList.add(key);
            _defaultValList.add(defaultVal);
            _extendedValList.add(extendedVal);
        }
    }

    /**
     * Creates a set with a key and a defaultValue
     * @param key
     * @param defaultVal
     */
    public void set(A key, B defaultVal){
        if(_keyList.contains(key) == false){
            this._keyList.add(key);
            this._defaultValList.add(defaultVal);
            this._extendedValList.add(null);
        }
    }

    /**
     * Removes a set from the map
     * @param key
     */
    public void rem(A key){
        _keyList.remove(_keyList.indexOf(key));
        _defaultValList.remove(_keyList.indexOf(key));
        _extendedValList.remove(_keyList.indexOf(key));
    }

    /**
     * Removes a set from the map
     * @param index
     */
    public void rem(int index){
        _keyList.remove(index);
        _defaultValList.remove(index);
        _extendedValList.remove(index);
    }

    /**
     * Moves a set to another index
     * @param key
     * @param toIndex
     */
    public void mov(A key, int toIndex){
        _defaultValList.set(toIndex, _defaultValList.get(_keyList.indexOf(key)));
        _defaultValList.remove(_keyList.indexOf(key));
        _extendedValList.set(toIndex, _extendedValList.get(_keyList.indexOf(key)));
        _extendedValList.remove(_keyList.indexOf(key));
        _keyList.remove(key);
        _keyList.set(toIndex, key);
    }

    /**
     * Moves a set to another index
     * @param index
     * @param toIndex
     */
    public void mov(int index, int toIndex){
        _defaultValList.set(toIndex, _defaultValList.get(index));
        _defaultValList.remove(index);
        _extendedValList.set(toIndex, _extendedValList.get(index));
        _extendedValList.remove(index);
        _keyList.set(toIndex, _keyList.get(index));
        _keyList.remove(index);
    }

    /**
     * Finds the index of the set the key is in
     * @param key
     * @return <b>index</b>
     */
    public int ind(A key){
        return _keyList.indexOf(key);
    }

    /**
     * Clears every set
     */
    public void cls(){
        _keyList = null;
        _defaultValList = null;
        _extendedValList = null;
    }
}
