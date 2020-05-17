/*
Classe semana 2
OBjetivo entender conceitos de herança, polimorfismo

classe Pessoa não é publica por limitação do Java, apenas 1 public por file
*/

package mypackage;

import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento;

    public Pessoa(final String _nome, final String _cpf, final Date date) {
        this.nome = _nome;
        this.cpf = _cpf;
        this.dataNascimento = date;
    }

    public double tirarCopias(int qtd) { // Retorna o preço para tirar copias
        return 0.10 * (double) qtd;
    }
}
