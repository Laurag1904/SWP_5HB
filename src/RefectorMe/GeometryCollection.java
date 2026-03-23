package RefectorMe;

import java.util.HashMap;
import java.util.Map;

/**
 * Verwaltet eine Sammlung von Geometry-Objekten.
 * 
 * Refactoring:
 * Verwendung einer HashMap statt ArrayList.
 * Dadurch ist der Zugriff per ID effizienter (O(1)).
 * 
 */
public class GeometryCollection<T extends Geometry> {

    private final Map<Integer, T> container = new HashMap<>();

    public void add(T geometry) {
        container.put(geometry.getId(), geometry);
    }

    public void remove(T geometry) {
        container.remove(geometry.getId());
    }

    public boolean contains(T geometry) {
        return container.containsKey(geometry.getId());
    }

    public T getById(int id) throws InvalidAccessException {
        if (!container.containsKey(id)) {
            throw new InvalidAccessException("No such element.");
        }
        return container.get(id);
    }
}