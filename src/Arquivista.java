// Entidade
class Arquivista {

    private final String cpf;
    private String nome;

    Arquivista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    String getCpf() { return cpf; }

    String getNome() { return nome; }

    void setNome(String nome) { this.nome = nome; }

}
