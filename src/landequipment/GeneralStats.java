package landequipment;

public class GeneralStats {
	private int speed;
	private double defense;
	private double breakthrough;
	private int armour;
	private int piercing;
	private double hardness;
	private double fuelUsage;
	private double reliability;
	
	public GeneralStats(int _speed, double _def, double _break, int _arm, int _pierce, double _hness, double _fuel, double _reliability) {
		speed = _speed;
		defense = _def;
		breakthrough = _break;
		armour = _arm;
		piercing = _pierce;
		hardness = _hness;
		fuelUsage = _fuel;
		reliability = _reliability;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public double getBreakthrough() {
		return breakthrough;
	}

	public void setBreakthrough(double breakthrough) {
		this.breakthrough = breakthrough;
	}

	public int getArmour() {
		return armour;
	}

	public void setArmour(int armour) {
		this.armour = armour;
	}

	public int getPiercing() {
		return piercing;
	}

	public void setPiercing(int piercing) {
		this.piercing = piercing;
	}

	public double getHardness() {
		return hardness;
	}

	public void setHardness(double hardness) {
		this.hardness = hardness;
	}

	public double getFuelUsage() {
		return fuelUsage;
	}

	public void setFuelUsage(double fuelUsage) {
		this.fuelUsage = fuelUsage;
	}

	public double getReliability() {
		return reliability;
	}

	public void setReliability(double reliability) {
		this.reliability = reliability;
	}
}
