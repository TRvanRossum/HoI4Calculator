package landequipment;

public class ArtilleryEquipment extends Equipment {
	public ArtilleryEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0: 
				super.name = "Artillery";
				super.att_stats = new AttackStats(25, 2, 0);
				super.gen_stats = new GeneralStats(0, 10.0, 6.0, 0, 5, 0.0, 0.0, 0.8);
				super.res_cost = new ResourceCost(3.5, 2, 1, 0, 0, 0);
				break;
			case 1:
				super.name = "Improved Artillery";
				super.att_stats = new AttackStats(30, 2, 0);
				super.gen_stats = new GeneralStats(0, 15.0, 7.0, 0, 5, 0.0, 0.0, 0.8);
				super.res_cost = new ResourceCost(4.0, 2, 1, 0, 0, 0);
				break;
			case 2:
				super.name = "Advanced Artillery";
				super.att_stats = new AttackStats(34, 2, 0);
				super.gen_stats = new GeneralStats(0, 18.0, 8.0, 0, 5, 0.0, 0.0, 0.8);
				super.res_cost = new ResourceCost(4.5, 3, 1, 0, 0, 0);
				break;
			default:
				throw new InvalidLevelException("Invalid level; artillery has levels 0 to 2.");
		}
	}
}
