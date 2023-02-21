package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*    System.out.println("Hello World! ");*/
        Gato gato = new Gato("Lili", "Frajola", "13 anos");
        System.out.println(gato);
        Livro livro = new Livro("Começe pelo porque", 300);
        System.out.println(livro);
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
// refactor shift + f6
// Identity =  crtl + alt + l
// Duplicar linha   =  Crtl + d
// Excluir linha   =  Crtl + Y

// Mover linha cima   =  Crtl + shift + Seta cima
// Mover linha baixo  =  Crtl + shift + Seta baixo

