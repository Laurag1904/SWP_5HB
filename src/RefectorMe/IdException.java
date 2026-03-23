package RefectorMe;

/** Exception für ungültige ID-Operationen (z.B. negative IDs). */
class IdException extends Exception {
    public IdException(String message) { super(message); }
}

/** Exception für Zugriffsfehler in der Collection. */
class InvalidAccessException extends Exception {
    public InvalidAccessException(String message) { super(message); }
}