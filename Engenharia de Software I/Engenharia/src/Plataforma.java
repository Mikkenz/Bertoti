import java.util.LinkedList;
import java.util.List;

public class Plataforma {

    private List<Pessoa> pessoas = new LinkedList<Pessoa>();
    private List<Disciplina> disciplinas = new LinkedList<Disciplina>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public Pessoa buscarPessoaNome(String nome){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa buscarPessoaMatricula(String matricula){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getMatricula().equals(matricula)){
                return pessoa;
            }
        }
        return null;
    }

    public Pessoa buscarPessoaTipo(String tipo){
        for(Pessoa pessoa:pessoas){
            if(pessoa.getTipo().equals(tipo)){
                return pessoa;
            }
        }
        return null;
    }

    public void cadastrarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplinaNome(String nome){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getNome().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplinaDocente(String docente){
        for(Disciplina disciplina:disciplinas){
            if(disciplina.getDocente().equals(docente)){
                return disciplina;
            }
        }
        return null;
    }

}
