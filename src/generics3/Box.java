package generics3;

public class Box<T> {
	
	private final T t;

    public Box(T t) {
        this.t = t;
    }

    public Box set(T box) {
        Box<T> boxNew = new Box(box);
        return boxNew;
    }

    public T getT() {
        return t;
    }

    @Override
    public String toString() {
        return "Box [t=" + t + "]";
    } 

}
