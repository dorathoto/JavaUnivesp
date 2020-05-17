package mypackage;

import java.util.Date;

public class Aluno extends Pessoa {
    public Aluno(final String _nome, final String _cpf, final Date date) {
        super(_nome, _cpf, date);
    }

    public String matricula;

    @Override
    public final double tirarCopias(final int qtd) { // Retorna o preço para tirar copias
        return 0.07 * (double) qtd;
    }
}