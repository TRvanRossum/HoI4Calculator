package landequipment;

public class EquipmentBuilder {
	public EquipmentBuilder() {
		
	}
	
	public static Equipment getInfantryEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0:
				return new Equipment("Basic equipment", 4, 3, 0.5, 0, 20, 2, 0, 1, 0, 0, 0.9, 0.4, 2, 0, 0, 0, 0);
			case 1:
				return new Equipment("Weapons I", 4, 6, 1, 0, 22, 3, 0, 4, 0, 0, 0.9, 0.5, 2, 0, 0, 0, 0);
			case 2:
				return new Equipment("Weapons II", 4, 9, 1.5, 0, 28, 4, 0, 5, 0, 0, 0.9, 0.6, 3, 0, 0, 0, 0);
			case 3:
				return new Equipment("Weapons III", 4, 12, 2, 0, 34, 5, 0, 10, 0, 0, 0.8, 0.7, 4, 0, 0, 0, 0);
			default:
				throw new InvalidLevelException("Invalid level: infantry equipment can only have levels from 0 to 3.");
		}
	}
	
	public static Equipment getMotorizedEquipment() {
		return new Equipment("Motorized", 12, 0, 0, 0, 0, 0, 0, 0, 0.1, 1.2, 0.8, 2.5, 1, 0, 0, 0, 1);
	}
}
