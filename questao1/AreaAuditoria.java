package questao1;
public class AreaAuditoria implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int qtdAntiga, int qtdNova) {
        System.out.println("[AUDITORIA] O produto " + nomeProduto + " mudou de " + qtdAntiga + " para " + qtdNova);
    }
}