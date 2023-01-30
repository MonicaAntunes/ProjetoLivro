package projetoLivro;

public class Pessoa {
  private String nome;
  private int idade;
  private String sexo;

  public void fazerAniver() {
    this.idade++;
  }

  public Pessoa(String nome, int idade, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}
