package br.edu.seuprojeto.modelo;
public class Animal {
private String nome;
private int idade;

public Animal(String nome, int idade) {
this.nome = nome;
this.idade = idade;
}
public String getNome() {
return nome;
}
 public void setNome(String nome) {
this.nome = nome;
}
public int getIdade() {
return idade;
}
public void setIdade(int idade) {
this.idade = idade;
}
public String emitirsom() {
return "Som genérico de animal...";
}
@Override
public String toString(){
return"Animal{"+
"nome='" + nome + '\''+
", idade =" + idade +
'} ';
}
}
