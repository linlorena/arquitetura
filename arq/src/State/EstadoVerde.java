package State;

class EstadoVerde implements EstadoSemaforo {
    @Override
    public void mudarEstado(Semaforo semaforo) {
        System.out.println("Semáforo está verde. Os carros podem seguir.");
        semaforo.setEstadoAtual(new EstadoAmarelo());
    }
}
