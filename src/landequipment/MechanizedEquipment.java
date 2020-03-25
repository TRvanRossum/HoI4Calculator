package landequipment;

public class MechanizedEquipment extends Equipment {
	public MechanizedEquipment(int level) throws InvalidLevelException {
		super.att_stats = new AttackStats(0, 0, 0);
		switch(level) {
			case 1:
				super.name = "Mechanized I";
				super.gen_stats = new GeneralStats(8, 26.0, 4.0, 10, 11, 0.5, 2.4, 0.8);
				super.res_cost = new ResourceCost(8.0, 2, 0, 0, 0, 1);
				break;
			case 2:
				super.name = "Mechanized II";
				super.gen_stats = new GeneralStats(10, 30.0, 5.0, 15, 16, 0.6, 2.4, 0.8);
				super.res_cost = new ResourceCost(10.0, 3, 0, 0, 0, 1);
				break;
			case 3:
				super.name = "Mechanized III";
				super.gen_stats = new GeneralStats(12, 34.0, 6.0, 20, 21, 0.7, 2.4, 0.8);
				super.res_cost = new ResourceCost(12.0, 4, 0, 0, 0, 1);
				break;
			default:
				throw new InvalidLevelException("Invalid equipment level; mechanized equipment has levels 1 to 3.");
		}
	}
}
