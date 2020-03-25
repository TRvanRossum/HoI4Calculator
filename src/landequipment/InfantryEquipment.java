package landequipment;

public class InfantryEquipment extends Equipment {
	
	public InfantryEquipment(int level) throws InvalidLevelException {
		switch(level) {
			case 0: 
				super.name = "Basic Equipment";
				super.att_stats = new AttackStats(3, 0.5, 0);
				super.gen_stats = new GeneralStats(4, 20.0, 2.0, 0, 1, 0.0, 0.0, 0.9);
				super.res_cost = new ResourceCost(0.4, 2, 0, 0, 0, 0);
				break;
			case 1:
				super.name = "Weapons I";
				super.att_stats = new AttackStats(6, 1.0, 0);
				super.gen_stats = new GeneralStats(4, 22.0, 3.0, 0, 4, 0.0, 0.0, 0.9);
				super.res_cost = new ResourceCost(0.5, 2, 0, 0, 0, 0);
				break;
			case 2:
				super.name = "Weapons II";
				super.att_stats = new AttackStats(9, 1.5, 0);
				super.gen_stats = new GeneralStats(4, 28.0, 4.0, 0, 5, 0.0, 0.0, 0.9);
				super.res_cost = new ResourceCost(0.6, 3, 0, 0, 0, 0);
				break;
			case 3:
				super.name = "Weapons III";
				super.att_stats = new AttackStats(12, 2.0, 0);
				super.gen_stats = new GeneralStats(4, 34.0, 5.0, 0, 10, 0.0, 0.0, 0.8);
				super.res_cost = new ResourceCost(0.7, 4, 0, 0, 0, 0);
				break;
			default:
				throw new InvalidLevelException("Invalid level; infantry equipment has levels 0 to 3.");
		}
	}
}
