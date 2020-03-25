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
	
	public static Equipment getMotorizedRocketArtilleryEquipment() {
		return new Equipment("Mot. R. Artillery", 0, 36, 1, 0, 15, 12, 0, 2, 0, 0.1, 0.8, 12, 1, 0, 0, 0, 1);
	}
	
	public static Equipment getMechanizedEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 1:
				return new Equipment("Mechanized I", 8, 0, 0, 0, 26, 4, 10, 11, 0.5, 2.4, 0.8, 8, 2, 0, 0, 0, 1);
			case 2:
				return new Equipment("Mechanized II", 10, 0, 0, 0, 30, 5, 15, 16, 0.6, 2.4, 0.8, 10, 3, 0, 0, 0, 1);
			case 3:
				return new Equipment("Mechanized III", 12, 0, 0, 0, 34, 6, 20, 21, 0.7, 2.4, 0.8, 12, 4, 0, 0, 0, 1);
			default:
				throw new InvalidLevelException("Invalid level: mechanized equipment can only have levels from 1 to 3.");
		}
	}
	
	public static Equipment getArtilleryEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0:
				return new Equipment("Artillery", 0, 25, 2, 0, 10, 6, 0, 5, 0, 0, 0.8, 3.5, 2, 1, 0, 0, 0);
			case 1:
				return new Equipment("Improved Artillery", 0, 30, 2, 0, 15, 7, 0, 5, 0, 0, 0.8, 4, 2, 1, 0, 0, 0);
			case 2:
				return new Equipment("Advanced Artillery", 0, 34, 2, 0, 18, 8, 0, 5, 0, 0, 0.8, 4.5, 3, 1, 0, 0, 0);
			default:
				throw new InvalidLevelException("Invalid level: artillery can only have levels from 0 to 2.");
		}
	}
	
	public static Equipment getRocketArtilleryEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0:
				return new Equipment("Rocket Artillery", 0, 30, 1, 0, 12, 9, 0, 2, 0, 0, 0.8, 4, 1, 2, 0, 0, 0);
			case 1:
				return new Equipment("Advanced Rocket Artillery", 0, 38, 1, 0, 15, 12, 0, 2, 0, 0, 0.8, 5, 1, 2, 0, 0, 0);
			default:
				throw new InvalidLevelException("Invalid level: rocket artillery can only have levels from 0 to 1.");
		}
	}
	
	public static Equipment getAntiTankEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0:
				return new Equipment("Anti-Tank", 0, 4, 15, 0, 4, 0, 0, 75, 0, 0, 0.8, 4, 2, 2, 0, 0, 0);
			case 1:
				return new Equipment("Improved Anti-Tank", 0, 4, 22, 0, 4, 0, 0, 88, 0, 0, 0.8, 5, 2, 2, 0, 0, 0);
			case 2:
				return new Equipment("Advanced Anti-Tank", 0, 4, 30, 0, 4, 0, 0, 108, 0, 0, 0.8, 4.5, 6, 3, 2, 0, 0);
			default:
				throw new InvalidLevelException("Invalid level: anti-tank can only have levels from 0 to 2.");
		}
	}
	
	public static Equipment getAntiAirEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0:
				return new Equipment("Anti-Air", 0, 3, 7, 19, 4, 1, 0, 25, 0, 0, 0.8, 4, 2, 0, 0, 0, 0);
			case 1:
				return new Equipment("Improved Anti-Air", 0, 3.5, 11, 25, 4, 1, 0, 60, 0, 0, 0.8, 5, 2, 0, 0, 0, 0);
			case 2:
				return new Equipment("Advanced Anti-Air", 0, 4, 15, 32, 4, 1, 0, 88, 0, 0, 0.8, 6, 3, 0, 0, 0, 0);
			default:
				throw new InvalidLevelException("Invalid level: anti-tank can only have levels from 0 to 2.");
		}
	}
	
	public static Equipment getSupportEquipment() {
		return new Equipment("Support Equipment", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.8, 4, 2, 0, 0, 1, 0);
	}
}
