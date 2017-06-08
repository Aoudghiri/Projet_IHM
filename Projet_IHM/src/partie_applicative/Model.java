/**
 * 
 */
package partie_applicative;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author oudghiri & Ronan
 *
 */

public class Model 
{
	private HashMap<String, Vol> vols;
	private HashMap<String, Aeroport> aeroports;
	private ControlManager controlManager;
	
	public Model(ControlManager controlManager) 
	{
		this.controlManager = controlManager;
		this.vols = RessourceManager.loadFlight();
		this.aeroports = RessourceManager.loadAeroport();
	}
	
	public String getVilleDepart(String idVol)
	{
		return aeroports.get(vols.get(idVol).getDepartCodeIATA()).getNomVille();
	}
	
	public String getVilleArrivee(String idVol)
	{
		return aeroports.get(vols.get(idVol).getArriveeCodeIATA()).getNomVille();
	}
	
	public String getPaysDepart(String idVol)
	{
		return aeroports.get(vols.get(idVol).getDepartCodeIATA()).getNomPays();
	}
	
	public String getPaysArrivee(String idVol)
	{
		return aeroports.get(vols.get(idVol).getArriveeCodeIATA()).getNomPays();
	}
	
	public ArrayList<String> getVolsByName(String paysDepart, String paysArrivee)
	{
		ArrayList<String> returnValue = new ArrayList<>();
		vols.forEach((k,v)-> {
								if(getPaysDepart(k).equals(paysDepart) && getPaysArrivee(k).equals(paysArrivee))
									returnValue.add(k);
							 }
		);
		return returnValue;
	}
	
	public ArrayList<String> getVolsByCodeIATA(String paysDepart, String paysArrivee)
	{
		ArrayList<String> returnValue = new ArrayList<>();
		vols.forEach((k,v)-> {
								if(v.getDepartCodeIATA().equals(paysDepart) && v.getArriveeCodeIATA().equals(paysArrivee))
										returnValue.add(k);
		 					 }
		);
		return returnValue;
	}
	
	
	
	
	
	
}
