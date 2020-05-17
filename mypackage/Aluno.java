package mypackage;

import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date date) {
        super(_nome, _cpf, date);
    }

    public String matricula;

    public final double tirarCopias(int qtd) { // Retorna o preço para tirar copias
        return 0.07 * (double) qtd;
    }
}