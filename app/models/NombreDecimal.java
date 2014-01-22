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
		
    	return en_romain_unites(valeur);
    	

	
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
    	"IX" };

    String en_romain_unites(int n)
    {
    	return table_unites[n];
    }


}
