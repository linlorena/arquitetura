package State;

class EstadoAmarelo implements EstadoSemaforo {
    @Override
    public void mudarEstado(Semaforo semaforo) {
        System.out.println("Semáforo está amarelo. Os carros devem reduzir a velocidade.");
        semaforo.setEstadoAtual(new EstadoVermelho());
    }
}
