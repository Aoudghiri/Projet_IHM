/**
 * 
 */
package partie_applicative;

/**
 * @author oudghiri & Ronan
 *
 */
public class Aeroport 
{
	private Ville ville;
	private String codeIAIA;
	private float latitude;
	private float longitude;
	
	public Aeroport(String nomVille, String nomPays, String codeIATA, float latitude, float longitude) 
	{
		this.ville = new Ville(nomVille, new Pays(nomPays, "Anonyme"));
		this.codeIAIA = codeIATA;
		this.latitude = latitude;
		this.longitude = longitude;
	}

}
