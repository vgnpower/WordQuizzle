package server;

/**
 * File di configurazione
 */
public class Settings {
    public static final int RMI_PORT = 50000;
    public static final int TCP_PORT = 50001;
    public static final int UDP_PORT = 50002;
    public static final int UDP_TIMEOUT = 20000;
    public static final int N_THREADS_THREAD_POOL = 100;
    public static final int DURATA_PARTITA_SEC = 60; //Secondi
    public static final String FILE_DIZIONARIO = "dizionario.txt";
    public static final String HOST_NAME = "localhost";
    public static final String API_URL = "https://api.mymemory.translated.net/";
    public static final String JSON_FILENAME = "utenti.json";
    public static final int MAX_PAROLE_DA_GENERARE = 10;
    public static final int MIN_PAROLE_DA_GENERARE = 3;
    public static final int PUNTI_EXTRA = 3; //Z
    public static final boolean AUTO_SAVE_JSON = false;
    public static final int READ_BYTE_BUFFER_SIZE = 1024;
    public static final int AUTO_SAVE_FREQUENCY = 20000; //ms

}
