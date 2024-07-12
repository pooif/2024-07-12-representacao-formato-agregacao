// design principle -> princípio de projeto
// explícito é melhor que implícito
// principle of least privilege (do menor privilégio)

final class Cor { // ela não pode ser estendida

  // atributos, conjunto de atributos forma o estado
  // é encapsulado (estado protegido)

  // tornar imutável, todos os atributos são final
  private final int red;
  private final int green;
  private final int blue;

  // construtor polimórfico
  // polimorfismo ah-hoc (por sobrecarga)

  // construtor sobrecarregado, sobrecarga, overload
  Cor() { // construtor vazio (sem parâmetros)
    this.red = 0;
    this.green = 0;
    this.blue = 0;
  }

  Cor(int escalaCinza) { // alias
    this(escalaCinza, escalaCinza, escalaCinza);
  }

  // construtor (new)
  Cor(int red, int green, int blue) {
    validar("red", red);
    validar("green", green);
    validar("blue", blue);
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  // método auxiliar (genérico/generalizado)
  private void validar(String nome, int valor) {
    if (valor < 0 || valor > 255) { // DX, UX
      throw new IllegalArgumentException("valor inválido de " + nome + " " + valor + ", deve estar entre 0 e 255");
    }
  }

  // acessores (métodos para ler o objeto)
  // getter
  int getRed() {
    return this.red; // acesso indireto
  }

  int getVermelho() {
    return this.red;
  }

  int getBlue() {
    return this.blue;
  }

  int getGreen() {
    return this.green;
  }

  // mutadores (mutators)
  // setters
  Cor setGreen(int green) {
    return new Cor(this.red, green, this.blue);
  }

  Cor setBlue(int blue) {
    return new Cor(this.red, this.green, blue);
  }

  Cor setRed(int red) {
    return new Cor(red, this.green, this.blue);
  }

  Cor esverdear() { // imutável
    // this.green++;
    return 
      new Cor(this.red, this.green + 1, this.blue);
  }
}
