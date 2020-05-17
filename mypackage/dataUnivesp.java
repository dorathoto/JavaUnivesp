package mypackage;

import java.text.SimpleDateFormat;
import java.util.Date;



public class dataUnivesp {
    private int _dia;
    private int _mes;
    private int _ano;

    private Date _dataCompleta; 

    //item A
    public dataUnivesp(int dia, int mes, int ano) {
        this._dia = dia;
        this._mes = mes;
        this._ano = ano;
        MontaDataCompleta();
    }
    public void MontaDataCompleta(){
        //utilizar o Calendar
        this._dataCompleta = new Date(this._dia, this._mes, this._ano);
    }

    //Metodos get - item B
    public int getDia(){
        return this._dia;
    }
    public int getMes(){
        return this._mes;
    }
    public int getAno(){
        return this._ano;
    }

    //Item C   - em teoria igual ao construtor
    public void SetValores(int dia, int mes, int ano) {
        this._dia = dia;
        this._mes = mes;
        this._ano = ano;
        MontaDataCompleta();
    }

    //item D
    //OBS: Esse não é o método mais didático, mas o correto, parse pra date e depois to string
    public String toString(){
        return new SimpleDateFormat("dd/MM/yyyy").format(this._dataCompleta);
    }

    //item E
    public void trocarCom(Date d1)
    {
        this.SetValores(d1.getDate(), d1.getMonth(), d1.getYear());
    }

}