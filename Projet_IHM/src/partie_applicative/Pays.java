/**
 * 
 */
package partie_applicative;

/**
 * @author oudghiri & Ronan
 *
 */
public class Pays 
{
	private String nom;
	private String codeICAO;
	
	public Pays(String nom, String codeICAO) 
	{
		this.nom = nom;
		this.codeICAO = codeICAO;
	}
	
	public String getCodeICAO() 
	{
		return codeICAO;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	
}
