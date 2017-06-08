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
	private String nomVille;
	private String nomPays;
	private String codeIAIA;
	private float latitude;
	private float longitude;
	
	public Aeroport(String nomVille, String nomPays, String codeIATA, float latitude, float longitude) 
	{
		this.nomVille = nomVille;
		this.nomPays = nomPays;
		this.codeIAIA = codeIATA;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getCodeIAIA() {
		return codeIAIA;
	}
	
	public String getNomPays() {
		return nomPays;
	}
	
	public String getNomVille() {
		return nomVille;
	}
	
	public float getLatitude() {
		return latitude;
	}
	
	public float getLongitude() {
		return longitude;
	}
	
	
	

}
