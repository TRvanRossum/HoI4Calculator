package landequipment;

public class AttackStats {
	private double softAttack;
	private double hardAttack;
	private double airAttack;
	
	public AttackStats(double s_att, double h_att, double a_att) {
		softAttack = s_att;
		hardAttack = h_att;
		airAttack = a_att;
	}

	public double getSoftAttack() {
		return softAttack;
	}

	public void setSoftAttack(double softAttack) {
		this.softAttack = softAttack;
	}

	public double getHardAttack() {
		return hardAttack;
	}

	public void setHardAttack(double hardAttack) {
		this.hardAttack = hardAttack;
	}

	public double getAirAttack() {
		return airAttack;
	}

	public void setAirAttack(double airAttack) {
		this.airAttack = airAttack;
	}
	
}
