package State;

class EstadoVermelho implements EstadoSemaforo {
    @Override
    public void mudarEstado(Semaforo semaforo) {
        System.out.println("Semáforo está vermelho. Os carros devem parar.");
        semaforo.setEstadoAtual(new EstadoVerde());
    }
}
