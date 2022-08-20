import java.util.HashMap;

public class Pastel {

  public static HashMap<String, Pastel> cidades = new HashMap<String, Pastel>();

  public String nome;

  public int preco;


  public Pastel(String nm) {
    nome = nm;
    cidades.put(nome, this);
  }

  public static Pastel encontrar(String nm) {
    Pastel p = cidades.get(nm);
    if (p == null) {
      p = new Pastel(nm);
      return p;
    }
    return p;
  }

  public int comparaNome(Pastel p) {
    return this.nome.compareTo(p.nome);
  }

  public String toString() {
    return nome;
  }

  public static int comparaPreco(Pastel c1, Pastel c2) {
    return c1.preco - c2.preco;
  }
}
