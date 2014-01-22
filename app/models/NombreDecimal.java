package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
		if (valeur>9){
        return en_romain_dizaines(valeur);
    }
    else
    {
        return en_romain_unites(valeur);
    }
}



    static String[] table_unites = {
    	"",
    	"I",
    	"II",
    	"III",
    	"IV",
    	"V",
    	"VI",
    	"VII",
    	"VIII",
    	"IX"
    };

    static String[] table_dizaines = {
        "X",
        "XX",
        "XXX",
        "XL",
        "L",
        "LX",
        "LXX",
        "LXXX",
        "XC"
    };

    String en_romain_unites(int n)
    {
    	return table_unites[n];
    }

    String en_romain_dizaines(int n)
    {
        return table_dizaines[n/10-1];
    }


}
