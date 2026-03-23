package lambda;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import genericsTypebounds.Rectangle;

public class LambdaAufgabe1 {

	public static void main(String[] args) {
		//Aufgabe 1
		//Runnable runnable = () -> {};
        ActionListener listener = event -> {};
        Supplier<String> supplier = () -> "";
        Consumer<Point> consumer = point -> {};
        Comparator<Rectangle> comparator = (a, b) -> 0;
        
        //Aufgabe 2
        DoubleSupplier ds = () -> {return 0;};
        LongToDoubleFunction ltdf = Long -> {return 0;};
        UnaryOperator<String> up = String -> {return String;};
	}

}
