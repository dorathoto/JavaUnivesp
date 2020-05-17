/*
Não é a classe do exercício de apoio, apenas uma para se situar nos parametros novos do java */

import java.util.Date;
import mypackage.Aluno;

public class call_semana2 {
    public static void main(String[] args) {
        Aluno i = new Aluno("Jose Francisco", "123.456.789-00", new Date());
        i.matricula = "234234";
        System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + i.nome);
        System.out.println("CPF: " + i.cpf);
        System.out.println("Data de nascimento: " + i.dataNascimento.toString());
        System.out.println("RA: " + i.matricula);

        var valor = i.tirarCopias(10);

        System.out.println("Valor das cópias: " + valor);
    }
}
