package ClienteLukas;

/**
 * AlunoMarcos
 */

public class Pessoajuridica extends TipoDePessoa {
    private Double cnpj;

    private String nome;

    private String cadastro;

    private Long Cpf;

    private Long numeroDeContado;

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(Double cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCadastro() {
        return cadastro;
    }

    @Override
    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public Long getCpf() {
        return Cpf;
    }

    @Override
    public void setCpf(Long cpf) {
        Cpf = cpf;
    }

    @Override
    public Long getNumeroDeContado() {
        return numeroDeContado;
    }

    @Override
    public String toString() {
        return "PessoaJurica{" +
                "cnpj=" + cnpj +
                ", nome='" + nome + '\'' +
                ", cadastro='" + cadastro + '\'' +
                ", Cpf=" + Cpf +
                ", numeroDeContado=" + numeroDeContado +
                '}';
    }

    @Override
    public void setNumeroDeContado(Long numeroDeContado) {
        this.numeroDeContado = numeroDeContado;


    }
}

