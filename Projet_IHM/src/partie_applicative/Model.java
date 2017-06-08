/**
 * 
 */
package partie_applicative;

import java.util.HashMap;

/**
 * @author oudghiri & Ronan
 *
 */

public class Model 
{
	private HashMap<String, Vol> vols;
	private HashMap<String, Aeroport> aeroport;
	private ControlManager controlManager;
	
	public Model(ControlManager controlManager) 
	{
		this.controlManager = controlManager;
		this.vols = RessourceManager.loadFlight();
		this.aeroport = RessourceManager.loadAeroport();
	}
	
	
	
	
	
}
