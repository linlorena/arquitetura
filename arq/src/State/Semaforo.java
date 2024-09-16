package State;

class Semaforo {
    private EstadoSemaforo estadoAtual;

    public Semaforo() {
        this.estadoAtual = new EstadoVermelho(); // Estado inicial
    }

    public void setEstadoAtual(EstadoSemaforo estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void mudarEstado() {
        estadoAtual.mudarEstado(this);
    }
}
