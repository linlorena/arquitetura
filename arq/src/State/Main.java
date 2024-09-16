package State;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        // Mudança de estados
        semaforo.mudarEstado(); // Estado verde
        semaforo.mudarEstado(); // Estado amarelo
        semaforo.mudarEstado(); // Estado vermelho
    }
}
