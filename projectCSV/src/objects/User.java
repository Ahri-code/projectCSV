package objects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String nome;
    private String cognome;
    private Boolean sesso;
    private Date dataDiNascita;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public User() {
    }

    public User(String nome, String cognome, String sesso, String dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso == "female" ? true : false;
        try {
            this.dataDiNascita = dateFormat.parse(dataDiNascita);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Boolean getSesso() {
        return sesso;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    @Override
    public String toString() {
        return cognome + "," + nome + "," + (sesso ? "femmina" : "maschio") + ";" + dateFormat.format(dataDiNascita);
    }
}
