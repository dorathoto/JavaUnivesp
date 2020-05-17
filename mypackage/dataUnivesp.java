package mypackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dataUnivesp {
    private int _dia;
    private int _mes;
    private int _ano;

    private GregorianCalendar _dataCompleta;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    // item A
    public dataUnivesp(int dia, int mes, int ano) {
        this._dia = dia;
        this._mes = mes;
        this._ano = ano;
        MontaDataCompleta();
    }

    public void MontaDataCompleta() {
        try {
            this._dataCompleta = new GregorianCalendar();
            String dataTxt = this._dia + "/" + this._mes + "/" + this._ano;
            this._dataCompleta.setTime(formatter.parse(dataTxt));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Metodos get - item B
    public int getDia() {
        return this._dia;
    }

    public int getMes() {
        return this._mes;
    }

    public int getAno() {
        return this._ano;
    }

    // Item C - em teoria igual ao construtor
    public void SetValores(int dia, int mes, int ano) {
        this._dia = dia;
        this._mes = mes;
        this._ano = ano;
        MontaDataCompleta();
    }

    // item D
    // OBS: Esse não é o método mais didático, mas o correto, parse pra date e
    // depois to string
    public String toString() {
        return formatter.format(this._dataCompleta.getTime());
    }

    // item E
    public void trocarCom(Date d1) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);

        this.SetValores(cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH), cal.get(Calendar.YEAR));
    }
}