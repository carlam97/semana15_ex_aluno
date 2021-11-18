public class Aluno{
    private String nome;
    private int matriculas;
    private String curso;
    private String disciplina;

    private double nota1;
    private double nota2;
    private double nota3;

    public boolean aprovado(){
        double notaFinal=(nota1 + nota2 + nota3)/3.0;
        if(notaFinal>=7){
            System.out.println("APROVADO!");
            return true;
        }
        else{
            System.out.println("REPROVADO!");
            return false;
        }
    }


    public String getNome() {
        return nome;
    } public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatriculas() {
        return matriculas;
    } public void setMatriculas(int matriculas) {
        this.matriculas = matriculas;
    }
    public String getCurso() {
        return curso;
    } public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getDisciplina() {
        return disciplina;
    } public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getNota1() {
        return nota1;
    } public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    } public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    } public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    
}