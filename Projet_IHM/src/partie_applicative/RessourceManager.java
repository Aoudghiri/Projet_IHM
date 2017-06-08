/**
 * 
 */
package partie_applicative;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author oudghiri & Ronan
 *
 */

public class RessourceManager
{
//	Le format du fichier airports.dat 
	private static final String airport_file = "airports.dat";
	private static final int nomVille = 0;
	private static final int nomPays = 1;
	private static final int codeIATA = 2;
	private static final int latitude = 3;
	private static final int longitude = 4;
	
//	Le format du fichier flight.dat 
	private static final String flights_file = "flights.dat";
	private static final int idVol = 0;
	private static final int departCodeIATA = 1;
	private static final int arriveeCodeIATA = 2;
	private static final int codeCompanie = 3;
	private static final int modelAvion	 = 4;
	
	public static HashMap<String, Aeroport> loadAeroport()
	{
		
		HashMap<String, Aeroport> returnValue = new HashMap<>();
		
		try(BufferedReader bufRead = new BufferedReader(new FileReader(airport_file)))
		{
			String line;
			String[] array;
			while((line = bufRead.readLine()) != null)
			{
				array = line.split("///");
				returnValue.put(array[codeIATA], new Aeroport(array[nomVille],
															array[nomPays],
															array[codeIATA],
															Float.parseFloat(array[latitude]),
															Float.parseFloat(array[longitude])
															)
								);				
			}
			
			bufRead.close();
		}catch(IOException e){}
		
		
		return returnValue;
	}
	
	
	
	
	
	public static HashMap<String, Vol> loadFlight()
	{
		
		HashMap<String, Vol> returnValue = new HashMap<>();
		
		try(BufferedReader bufRead = new BufferedReader(new FileReader(flights_file)))
		{
			String line;
			String[] array;
			while((line = bufRead.readLine()) != null)
			{
				array = line.split("///");
				returnValue.put(array[idVol], new Vol(array[idVol],
													array[departCodeIATA],
													array[arriveeCodeIATA],
													array[codeCompanie],
													array[modelAvion]
													)
								);				
			}
			
			bufRead.close();
		}catch(IOException e){}
		
		
		return returnValue;
	}
	
	
	
}
