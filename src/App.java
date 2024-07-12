class App {
  public static void main(String[] args) {
    System.out.println("OK");
    // Representação de Cor (espaço, regras)
    Cor c1 = new Cor(); // 0, 0, 0
                   //red  green blue
    Cor c2 = new Cor(100, 123, 255); // 100, 123, 255
    // Sistema -> Conjunto de Constraints (Restrições)
    // Cor c3 = new Cor(200, 250, 300); // rejeitado

    System.out.println(c1.getRed());
    System.out.println(c1.getGreen());
    System.out.println(c1.getBlue());

    Cor c4 = c1.setGreen(100);

    System.out.println(c1.getGreen()); // 0
    System.out.println(c4.getGreen()); // 100
    
    String nome = "Gunther";
    nome = nome.toUpperCase(); // reatribuir
    // gunther, Gunther, GUNTHER
    System.out.println(nome);


    Cor c5 = new Cor(100); // cinza
    c5.esverdear();
  }
}