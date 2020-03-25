package landequipment;

public class MotorizedEquipment extends Equipment {
	public MotorizedEquipment() {
		super.name = "Motorized";
		super.att_stats = new AttackStats(0.0, 0.0, 0.0);
		super.gen_stats = new GeneralStats(12, 0.0, 0.0, 0, 0, 0.1, 1.2, 0.8);
		super.res_cost = new ResourceCost(2.5, 1, 0, 0, 0, 1);
	}
}
