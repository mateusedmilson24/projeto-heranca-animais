 package br.edu.seuprojeto.modelo;

public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void comer() {
        System.out.println(this.nome + " está comendo.");
    }

    // Este é o método abstrato que as subclasses devem implementar
    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", idade=" + idade + "]";
    }
}
