/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author 182120050
 */
public class Aluno {//Atributos ou caracteristicas
  int matricula;
  String cpf;
  String nome;
  String sexo;
  int idade;
  String telefone;
  boolean status;

    public Aluno() {//construtor
    }
/**
 * Conztrutor com todos os atributos
 * @param matricula
 * @param cpf
 * @param nome
 * @param sexo
 * @param idade
 * @param telefone
 * @param status 
 */
    public Aluno(int matricula, String cpf, String nome, String sexo, int idade, String telefone, boolean status) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.telefone = telefone;
        this.status = status;
    }
/**
 * método que retorna a matricula do aluno
 * @return 
 */
    public int getMatricula() {
        return matricula;
    }
/**
 * atribui matricula do aluno
 * @param matricula 
 */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Aluno{" + "\nmatricula=" + matricula + ", \ncpf=" + cpf + ", \nnome=" + nome + ", \nsexo=" + sexo + ", \nidade=" + idade + ", \ntelefone=" + telefone + ", \nstatus=" + status + '}';
    }

   
    
}
