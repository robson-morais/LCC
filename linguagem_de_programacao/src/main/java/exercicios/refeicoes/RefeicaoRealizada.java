package exercicios.refeicoes;

public class RefeicaoRealizada { 

    private String matriculaAluno; 
    private String tipoRefeicao; 
    private double precoRefeicao;

    public RefeicaoRealizada(String matriculaAluno, String tipoRefeicao, double precoRefeicao) {
        this.matriculaAluno = matriculaAluno; 
        this.tipoRefeicao = tipoRefeicao; 
        this.precoRefeicao = precoRefeicao;
    } 
    public double getPrecoRefeicao() {
        return precoRefeicao;
    }
    public void setPrecoRefeicao(double precoRefeicao) {
        this.precoRefeicao = precoRefeicao;
    }
    public String getMatriculaAluno() { 
    return matriculaAluno; 
    } 
    public void setMatriculaAluno(String matriculaAluno) { 
    this.matriculaAluno = matriculaAluno; 
    } 
    public String getTipoRefeicao() { 
    return tipoRefeicao; 
    }
    public void setTipoRefeicao(String tipoRefeicao) { 
    this.tipoRefeicao = tipoRefeicao; 
    } 
    public String toString() { 
        return "Refeicao Realizada pelo aluno de matrícula " + this.matriculaAluno +
        ", tipo da refeição:" + this.tipoRefeicao+", preço da refeição: R$ "+this.precoRefeicao; 
    } 
} 