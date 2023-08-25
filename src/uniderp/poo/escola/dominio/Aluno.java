package uniderp.poo.escola.dominio;
import java.time.LocalDate;

public class Aluno extends BasePessoa{

    public Aluno(){
        
    }
    
        private String matricula;
        private LocalDate dataMatricula;
    

    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg, String cpf, LocalDate dataInsercao, String matricula, LocalDate dataMatricula){
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
}