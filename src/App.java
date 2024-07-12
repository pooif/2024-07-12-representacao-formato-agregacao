class App {
  public static void main(String[] args) {
    System.out.println("OK");
    Cor cor1 = new Cor(123, 8, 12);
    // Pasta é dependente de Cor, Cor deve existir antes
    // ACOPLAMENTO
    Arquivista arq1 = new Arquivista("12345678901", "Bruno");

    Pasta pasta1 =
        new Pasta(cor1, "Segredos do Gunther", arq1);

    System.out.println(pasta1.getIdentificador());
    System.out.println(pasta1.getDescricao());
    // GRAFO DE OBJETOS: NAVEGAR NO GRAFO
    System.out.println(pasta1.getCor().getGreen());
    System.out.println(pasta1.getResponsavel().getNome());
  }
}