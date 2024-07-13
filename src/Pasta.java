class Pasta { // Entidade no meu sistema

    // estático: pertence à classe Pasta, não ao objeto
    private static int contador = 1;

    // geralmente o id é constante
    private final int identificador;
    private final Cor cor; // Pasta (é de) tem Cor
    
    private String descricao;
    private Arquivista responsavel;

    Pasta(Cor cor,
          String descricao, 
          Arquivista responsavel) {
        // pré-incremento, pós-incremento
        this.identificador = contador++;
        this.cor = cor;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    Arquivista getResponsavel() {
        return responsavel;
    }

    void transferirResponsabilidade(Arquivista novo) {
        this.responsavel = novo;
    }

    Cor getCor() {
        return cor;
    }

    int getIdentificador() {
        return identificador;
    }

    String getDescricao() {
        return descricao;
    }

    void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
