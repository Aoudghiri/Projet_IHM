package partie_applicative;

/**
 * @author oudghiri & Ronan
 *
 */

public class Vol
{

	private String idVol;
	private String codeCompanie;
	private String modelAvion;
	private String departCodeIATA;
	private String arriveeCodeIATA;

	public Vol(String idVol,String departCodeIATA, String arriveeCodeIATA, String codeCompanie,String modelAvion)
	{
		this.idVol = idVol;
		this.codeCompanie = codeCompanie;
		this.modelAvion = modelAvion;
		this.departCodeIATA = departCodeIATA;
		this.arriveeCodeIATA = arriveeCodeIATA;
	}
	
	public String getArriveeCodeIATA() {
		return arriveeCodeIATA;
	}
	
	public String getCodeCompanie() {
		return codeCompanie;
	}
	
	public String getDepartCodeIATA() {
		return departCodeIATA;
	}
	
	public String getIdVol() {
		return idVol;
	}
	
	public String getModelAvion() {
		return modelAvion;
	}
	
	
	
	
	
	
	
}


