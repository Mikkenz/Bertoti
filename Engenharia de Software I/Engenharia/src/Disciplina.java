public class Disciplina {

    private String nome;
    private String docente;

    public Disciplina(String nome, String docente) {
        this.nome = nome;
        this.docente = docente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}


