public class PacoteFactory {
    public static Pacote criarPacote(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pacote 1":
                return new Pacote("Assistir vídeos em vários dispositivos", 19.99);
            case "pacote 2":
                return new Pacote("Frete Grátis em produtos", 9.99);
            case "pacote 3":
                return new Pacote("Caixa surpresa com produtos relacionados a filmes e séries", 29.99);
            case "pacote 4":
                return new Pacote("Cartão de crédito Platinum", 49.99);
            case "pacote 5":
                return new Pacote("Compra com Cash Back", 19.99);
            default:
                throw new IllegalArgumentException("Tipo de pacote inválido");
        }
    }
}
