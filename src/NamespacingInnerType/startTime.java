package NamespacingInnerType;

public class startTime { // aufgabe 3

    public void startTimer(int sekunden) {

        // Lokale Klasse
        class Timer {
            public void start() {
                for (int i = sekunden; i > 0; i--) {
                    System.out.println("Noch " + i + " Sekunden...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Timer wurde unterbrochen!");
                    }
                }
                System.out.println("Zeit abgelaufen!");
            }
        }

        Timer timer = new Timer();
        timer.start();
    }

    
    public static void main(String[] args) {
        startTime t = new startTime();
        t.startTimer(50);  // Beispiel: Countdown von 5 Sekunden
    }
}