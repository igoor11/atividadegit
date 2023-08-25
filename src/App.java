import java.time.LocalDate;

import uniderp.poo.escola.dominio.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno();
        a1.setCodigo(1);
        a1.setNome("Igor");
        a1.setEndereco("ruataltal, 10");
        a1.setTelefone("679974325");
        a1.setRg("1234321123");
        a1.setCpf("1234312233");
        a1.setDataNascimento(LocalDate.of(2004, 6, 14));
        a1.setDataInsercao(LocalDate.now());

        Aluno a2 =  new Aluno(2, "Jesus", "Jerusalem", "31928731927", LocalDate.of(1, 1, 12), "1", "1", LocalDate.now(), "1", LocalDate.now());
    }
}
