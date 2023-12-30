package ClienteLukas;

/**
 * AlunoMarcos
 */

public class PessoaFisica extends TipoDePessoa{

    private Double rg;

    private String nome;

    private String cadastro;

    private Long Cpf;

    private Long numeroDeContado;

    public Double getRg() {
        return rg;
    }

    public void setRg(Double rg) {
        this.rg = rg;
    }

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
        Cpf = cpf;
    }

    public Long getNumeroDeContado() {
        return numeroDeContado;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "rg=" + rg +
                ", nome='" + nome + '\'' +
                ", cadastro='" + cadastro + '\'' +
                ", Cpf=" + Cpf +
                ", numeroDeContado=" + numeroDeContado +
                '}';
    }

    public void setNumeroDeContado(Long numeroDeContado) {
        this.numeroDeContado = numeroDeContado;


    }
}

