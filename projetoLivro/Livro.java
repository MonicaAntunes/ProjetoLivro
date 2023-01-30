package projetoLivro;

public class Livro implements Publicacao {
  private String titulo;
  private String autor;
  private int totPaginas;
  private int pagAtual;
  private boolean aberto;
  private Pessoa leitor;

  public String detalhes() {
    return "Livro{" + "titulo=" + titulo + ", autor=" + autor + "\n, totPaginas=" + totPaginas + ", pagAtual="
        + pagAtual
        + ", aberto=" + aberto + "\n, leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo="
        + leitor.getSexo() + '}';
  }

  public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
    this.titulo = titulo;
    this.autor = autor;
    this.totPaginas = totPaginas;
    this.leitor = leitor;
    this.pagAtual = 0;
    this.aberto = false;
  }

  public String getAutor() {
    return autor;
  }

  public Pessoa getLeitor() {
    return leitor;
  }

  public int getPagAtual() {
    return pagAtual;
  }

  public String getTitulo() {
    return titulo;
  }

  public int getTotPaginas() {
    return totPaginas;
  }

  public boolean getAberto() {
    return aberto;
  }

  public void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setLeitor(Pessoa leitor) {
    this.leitor = leitor;
  }

  public void setPagAtual(int pagAtual) {
    this.pagAtual = pagAtual;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setTotPaginas(int totPaginas) {
    this.totPaginas = totPaginas;
  }

  @Override
  public void abrir() {
    this.aberto = true;
  }

  @Override
  public void fechar() {
    this.aberto = false;
  }

  @Override
  public void folhear(int p) {
    if (p > this.totPaginas) {
      this.pagAtual = 0;
    } else {
      this.pagAtual = p;
    }
  }

  @Override
  public void avancarPag() {
    this.pagAtual++;
  }

  @Override
  public void voltarPag() {
    this.pagAtual--;
  }

}
