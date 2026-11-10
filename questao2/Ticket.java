package questao2;

public class Ticket {
    private String placa;
    private int tempoMinutos;
    private TarifaStrategy tarifa; 

    public Ticket(String placa, int tempoMinutos) {
        this.placa = placa;
        this.tempoMinutos = tempoMinutos;
    }

    public void setTarifa(TarifaStrategy tarifa) {
        this.tarifa = tarifa;
    }

    public void imprimirValor() {
        double valor = tarifa.calcular(this.tempoMinutos);
        System.out.println("Placa: " + placa + " | Tempo: " + tempoMinutos + " min | Valor: R$ " + valor);
    }
}