package partie_applicative;

/**
 * @author oudghiri & Ronan
 *
 */

public class Vol
{

	private String idVol;
	private String codeCompanie;
	private Avion avion;
	
	private Aeroport depart;
	private Aeroport arrivee;

	public Vol(String idVol,String departCodeIATA, String arriveeCodeIATA, String codeCompanie,String modelAvion)
	{
		this.idVol = idVol;
		this.codeCompanie = codeCompanie;
		
	}
	
}


