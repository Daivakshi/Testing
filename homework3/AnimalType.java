package Lab3;

public class AnimalType {
	
	/**
	 * This method expects to output type of animal.
	 * @param backbone: boolean value for backbone of an animal
	 * @param adjustTemp: boolean value for adjusting temperature of an animal
	 * @param gill: boolean value for gill of an animal
	 * @param roughSkin: boolean value for rough skin of an animal
	 * @return This method returns the type of animal as String according to the input parameters. 
	 **/
	
	public static String animalType(boolean backbone, boolean adjustTemp, boolean gill, boolean roughSkin, boolean liveInWater) {
		if (!backbone)  
			return "invertebrate";				
		else if(adjustTemp) 
			return "vertebrate warm blooded";
		else if(gill == true) 
			return "vertebrate-cold blodded-fish";
		else if(roughSkin == true) 
			return "vertebrate-cold blodded-reptile";
		else if (liveInWater == true)
			return "vertebrate-cold blodded-amphibians";
		else
			return "Unkown animal";
		
		
	}
}