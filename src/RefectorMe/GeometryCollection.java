package RefectorMe;

import java.util.HashMap;
import java.util.Map;

/**
 * Generische Sammlung zur Verwaltung von Geometrie-Objekten.
 * * Refactoring:
 * Wechsel von Liste auf HashMap<Integer, T>. 
 * Begründung: getById(id) hat bei einer Liste O(n) Zeitaufwand, 
 * bei einer HashMap nur O(1) (direkter Zugriff).
 */
public class GeometryCollection<T extends Geometry> {
    private final Map<Integer, T> container = new HashMap<>();

    public void add(T geometry) {
        if (geometry != null) {
            container.put(geometry.getId(), geometry);
        }
    }

    public void remove(T geometry) {
        if (geometry != null) {
            container.remove(geometry.getId());
        }
    }

    public boolean contains(T geometry) {
        return geometry != null && container.containsKey(geometry.getId());
    }

    /**
     * Sucht ein Objekt per ID.
     * @throws InvalidAccessException wenn die ID nicht existiert.
     */
    public T getById(int id) throws InvalidAccessException {
        T found = container.get(id);
        if (found == null) {
            throw new InvalidAccessException("Kein Element mit ID " + id + " gefunden.");
        }
        return found;
    }
}