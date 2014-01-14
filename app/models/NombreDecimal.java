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
		switch(valeur)
		{
			case 1: 
				return "I";
			case 2: 
				return "II";
			case 3: 
				return "III";
			default: 
				return "";
		}
	
    }
}
