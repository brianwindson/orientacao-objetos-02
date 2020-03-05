package exercicios;

public class Correntista {
    private String codigo;
    private String nome;
    private String email;
    private int telefone;

    public Correntista(String codigo, String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
        this.telefone = telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}
