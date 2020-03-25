package landequipment;

public class MotorizedRocketArtilleryEquipment extends Equipment {
	public MotorizedRocketArtilleryEquipment() {
		super.name = "Motorized Rocket Artillery";
		super.att_stats = new AttackStats(36, 1, 0);
		super.gen_stats = new GeneralStats(0, 15.0, 12.0, 0, 2, 0.0, 0.1, 0.8);
		super.res_cost = new ResourceCost(12.0, 1, 0, 0, 0, 1);
	}
}
