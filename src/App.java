class App {
  public static void main(String[] args) {
    System.out.println("OK");
    Cor cor1 = new Cor(123, 8, 12);
    // Pasta é dependente de Cor, Cor deve existir antes
    // ACOPLAMENTO
    Arquivista arq1 = new Arquivista("12345678901", "Bruno");

    Pasta pasta1 =
        new Pasta(cor1, "Segredos do Gunther", arq1);
    Pasta pasta2 =
        new Pasta(cor1, "Segredos do Erick", arq1);

    System.out.println(pasta1.getIdentificador());
    System.out.println(pasta1.getDescricao());
    // GRAFO DE OBJETOS: NAVEGAR NO GRAFO
    System.out.println(pasta1.getCor().getGreen());
    System.out.println(pasta1.getResponsavel().getNome());

    System.out.println(pasta2.getResponsavel().getNome());

    pasta2.getResponsavel().setNome("Povoa");

    System.out.println(pasta1.getResponsavel().getNome()); // ?

    Cor vermelho = new Cor(255, 0, 0);
    
    System.out.println(pasta1.getCor()); // ?

    cor1.setRed(255);
    cor1.setBlue(0);
    cor1.setGreen(0);

    System.out.println(pasta1.getCor());
    System.out.println(pasta2.getCor());

    Arquivista annie = new Arquivista("09876543211", "Annie");

    pasta1.transferirResponsabilidade(annie);

  }
}