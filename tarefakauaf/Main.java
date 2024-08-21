import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nomeUsuario = scanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario);
        Assinatura assinatura = new Assinatura();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha um pacote adicional (ou digite 'sair' para finalizar): ");
            System.out.println("1 - Assistir vídeos em vários dispositivos (R$ 19,99)");
            System.out.println("2 - Frete Grátis em produtos (R$ 9,99)");
            System.out.println("3 - Caixa surpresa com produtos relacionados a filmes e séries (R$ 29,99)");
            System.out.println("4 - Cartão de crédito Platinum (R$ 49,99)");
            System.out.println("5 - Compra com Cash Back (R$ 19,99)");

            String opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("sair")) {
                continuar = false;
            } else {
                try {
                    Pacote pacote = PacoteFactory.criarPacote("pacote " + opcao);
                    assinatura.adicionarPacote(pacote);
                } catch (IllegalArgumentException e) {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }

        System.out.println("\n" + usuario);
        assinatura.exibirAssinatura();
        scanner.close();
    }
}
