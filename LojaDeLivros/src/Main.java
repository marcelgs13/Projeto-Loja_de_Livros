import apresentacao.TelaPrincipal;
import negocio.ServicoLivro;
import negocio.ServicoCliente;
import negocio.ServicoVenda;
import apresentacao.TelaInicial;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Inicialização dos serviços (camada de negócio)
        ServicoLivro servicoLivro = new ServicoLivro();
        ServicoCliente servicoCliente = new ServicoCliente();
        ServicoVenda servicoVenda = new ServicoVenda(servicoLivro);

        // Inicialização da interface gráfica na thread de eventos do Swing
        SwingUtilities.invokeLater(() -> {
            new TelaInicial(servicoLivro, servicoCliente, servicoVenda).setVisible(true);
        });
    }
}
