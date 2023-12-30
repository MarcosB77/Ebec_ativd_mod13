package ClienteLukas;

/**
 * AlunoMarcos
 */

public abstract class TipoDePessoa {

    private String nome;

    private String cadastro;

    private Long Cpf;

    private Long numeroDeContado;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public Long getCpf() {
        return Cpf;
    }

    public void setCpf(Long cpf) {
        this.Cpf = cpf;
    }

    public Long getNumeroDeContado() {
        return numeroDeContado;
    }

    public void setNumeroDeContado(Long numeroDeContado) {
        this.numeroDeContado = numeroDeContado;
    }

    @Override
    public String toString() {
        return "TipoDePessoa{" +
                "nome='" + nome + '\'' +
                ", cadastro='" + cadastro + '\'' +
                ", Cpf=" + Cpf +
                ", numeroDeContado=" + numeroDeContado +
                '}';
    }
}

