import java.util.ArrayList;
import java.util.List;

public class Assinatura {
    private AssinaturaBase assinaturaBase;
    private List<Pacote> pacotes;

    public Assinatura() {
        this.assinaturaBase = new AssinaturaBase();
        this.pacotes = new ArrayList<>();
    }

    public void adicionarPacote(Pacote pacote) {
        for (Pacote p : pacotes) {
            if (p.getNome().equalsIgnoreCase(pacote.getNome())) {
                System.out.println("Pacote " + pacote.getNome() + " já adicionado.");
                return;
            }
        }
        pacotes.add(pacote);
    }

    public double calcularPrecoTotal() {
        double precoTotal = assinaturaBase.getPreco();
        for (Pacote pacote : pacotes) {
            precoTotal += pacote.getPreco();
        }
        return precoTotal;
    }

    public void exibirAssinatura() {
        System.out.println(assinaturaBase.getDescricao() + " - R$ " + assinaturaBase.getPreco());
        if (pacotes.size() > 0) {
            System.out.println("Pacotes adicionais:");
            for (Pacote pacote : pacotes) {
                System.out.println("- " + pacote);
            }
        } else {
            System.out.println("Nenhum pacote adicional.");
        }
        System.out.println("Preço total: R$ " + calcularPrecoTotal());
    }
}
