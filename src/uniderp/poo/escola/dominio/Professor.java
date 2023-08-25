package uniderp.poo.escola.dominio;
import java.time.LocalDate;

public class Professor extends BasePessoa{

    public Professor(){
        
    }

        private String registro;
        private LocalDate dataContratacao;

        public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
                String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
            super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
            this.registro = registro;
            this.dataContratacao = dataContratacao;
        }
        
}
