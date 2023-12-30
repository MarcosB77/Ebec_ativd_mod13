package ClienteLukas;

/**
 * AlunoMarcos
 */

public class programaClient {

    public static void main(String args[]){

        System.out.println(" Dados Do Cliente ");

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome(" Lukas Silva ");
        pessoaFisica.setCpf(5243L);
        pessoaFisica.setCadastro(" App ");
        pessoaFisica.setNumeroDeContado(23564L);
        pessoaFisica.setRg(234D);
        System.out.println(pessoaFisica);

        //Pessoa jurídica

        Pessoajuridica pessoajuridica = new Pessoajuridica();
        pessoajuridica.setNome(" CK SILVA  ");
        pessoajuridica.setCpf(5243L);
        pessoajuridica.setCadastro(" Precencial Na Junta Comercial Estadual ");
        pessoajuridica.setNumeroDeContado(23564L);
        pessoajuridica.setCnpj(344D);
        System.out.println(pessoajuridica);

        System.out.println(" EXIT ");

    }
}
