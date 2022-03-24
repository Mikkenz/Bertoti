<h4><b>Nome:</b> Icaro Dell Osso Vaz de Carvalho <b>RA:</b> 1460482121031</h4>

<h2>Ciclo de Vida do Desenvolvimento de Software (Plataforma de Ensino)</h2>

<h3>Atividade de Requisitos </h2>

<h3>:mag_right: Coletar os requisitos funcionais e não-funcionais do sistema</h3>

<h4><p>:pushpin: Requisitos funcionais: são tarefas ou ações do sistema.</p> 


![requisitosFuncionais](https://user-images.githubusercontent.com/87658431/158985258-cf82b7ed-b4b3-4679-ba90-abf72fdc41ac.jpg)


<p>:pushpin: Requisitos não-funcionais: são qualidades do sistema.</h4>

![requisitosNaoFuncionais](https://user-images.githubusercontent.com/87658431/158985560-88262570-c6a0-40ca-964a-b7688923490e.png)


• Os requisitos funcionais são de extrema importância no desenvolvimento de software, pois sem eles não há funcionalidades nos sistemas. Seus modelos devem ser construídos em um nível de entendimento claro e objetivo, além de um código fonte totalmente aplicável.<br>
Como um requisito funcional específico, foi desenvolvido um Diagrama de Casos de Uso [:computer_mouse:](https://github.com/Mikkenz/Bertoti/blob/main/Engenharia%20de%20Software%20I/requisitosFuncionais.png)
  
• Uma vez que os requisitos funcionais definem o que o sistema fará, a Engenharia de Software afirma que os requisitos não-funcionais definem <i><b>como</i></b> o sistema fará, embora não seja tão claro assim essa definição. Os requisitos não-funcionais não estão relacionados diretamente às funcionalidades de um sistema.
Dentro dos requisitos não-funcionais, foi desenvolvido uma interface de simples acesso e uso às funções do sistema (Usabilidade) [:computer_mouse:](https://github.com/Mikkenz/Bertoti/blob/main/Engenharia%20de%20Software%20I/requisitosNaoFuncionais.png)

<h4><p><b>:dart: Objetivo da Atividade:</b> Transformar os requisitos (tanto funcionais quanto não-funcionais) em algo que possa ser implementado.</h4>

<p>:pushpin: Projeto Classes:
  
  ![relacao](https://user-images.githubusercontent.com/87658431/158987051-e61e8206-b72f-46ae-b3e8-c36c769dc1a0.jpeg)


<h3>Projeto :construction_worker_woman:</h2>


  ## 💻Desenvolvimento
  
<p>Nessa etapa foi usada a linguagem Java para codificar cada uma das classes criadas na etapa anterior.</p>
  
</div>

<div align="center">
  
  <img src="Classe-Pessoa.png" alt="diagrama da classe Pessoa">
</div>
<br>

    public class Pessoa {

        private String nome;
        private String matricula;
        private String tipo;
    
        public Pessoa(String nome, String matricula, String tipo){
            this.nome = nome;
            this.matricula = matricula;
            this.tipo = tipo;
        }
    
        public String getNome(){
            return nome;
        }
        
        public void setNome(String novoNome){
            this.nome = novoNome;
        }
        
        public String getMatricula(){
            return matricula;
        }
        
        public void setMatricula(String novaMatricula){
            this.matricula = novaMatricula;
        }
        
        public String getTipo(){
            return tipo;
        }
    
        public void setTipo(String novoTipo){
            this.tipo = novoTipo;
        }
    }

<br>
<div align="center">
  
  <img src="Classe-Disciplina.png" alt="diagrama da classe Disciplina">
</div>
<br>

     public class Disciplina {
        private String nomeDisciplina;
        private String docente;
        private String semestre;

        public Disciplina(String nomeDisciplina, String docente, String semestre) {
            this.nomeDisciplina = nomeDisciplina;
            this.docente = docente;
            this.semestre = semestre;
        }

        public String getNomeDisciplina() {
            return nomeDisciplina;
        }
        
        public void setNomeDisciplina(String novoNomeDisciplina) {
            this.nomeDisciplina = novoNomeDisciplina;
        }

        public String getDocente() {
            return docente;
        }
        
        public void setDocente(String novoDocente) {
            this.docente = novoDocente;
        }

        public String getSemestre() {
            return semestre;
        }
        
        public void setSemestre(String novoSemestre) {
            this.semestre = novoSemestre;
        }
    }

<br>
<div align="center">
  
  <img src="Classe-Plataforma.png" alt="diagrama da classe Plataforma de Ensino">
</div>
<br>


    import java.util.LinkedList;
    import java.util.List;

    public class PlataformaDeEnsino {
        private List<Pessoa> pessoas = new LinkedList<Pessoa>();    
        private List<Disciplina> disciplinas = new LinkedList<Disciplina>();
    
        public void cadastrarPessoa(Pessoa pessoa){
            pessoas.add(pessoa);
        }
    
        public Pessoa buscarPessoaPorNome(String nome){
            for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome)){
                    return pessoa;
                }
            }
            return null;
        }
    
        public Pessoa buscarPessoaPorMatricula(String matricula){
            for(Pessoa pessoa:pessoas){
                if(pessoa.getMatricula().equals(matricula)){
                    return pessoa;
                }
            }
            return null;
        }
    
        public Pessoa buscarPessoaPorTipo(String tipo){
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
    
        public Disciplina buscarDisciplinaPorNome(String nome){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getNomeDisciplina().equals(nome)){
                    return disciplina;
                }
            }
            return null;
        }
    
        public Disciplina buscarDisciplinaPorDocente(String docente){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getDocente().equals(docente)){
                   return disciplina;
                }
            }
            return null;
        }
    
        public Disciplina buscarDisciplinaPorSemestre(String semestre){
            for(Disciplina disciplina:disciplinas){
                if(disciplina.getSemestre().equals(semestre)){
                    return disciplina;
                }
            }
            return null;
        }
    
    }
<br>

<div id="#dev">
