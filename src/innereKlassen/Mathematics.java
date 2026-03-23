package innereKlassen;

public class Mathematics {
	
	public static class Factorial{
		public int berechne(int n) {
            int ergebnis = 1;

            for (int i = 1; i <= n; i++) {
                ergebnis = i;
            }

            return ergebnis;
        }
	}

}
