package landequipment;

public abstract class Equipment {
	protected String name = "";
	protected AttackStats att_stats = null;
	protected GeneralStats gen_stats = null;
	protected ResourceCost res_cost = null;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AttackStats getAttackStats() {
		return att_stats;
	}
	public void setAttackStats(AttackStats att_stats) {
		this.att_stats = att_stats;
	}
	public GeneralStats getGeneralStats() {
		return gen_stats;
	}
	public void setGeneralStats(GeneralStats gen_stats) {
		this.gen_stats = gen_stats;
	}
	public ResourceCost getResourceCost() {
		return res_cost;
	}
	public void setResourceCost(ResourceCost res_cost) {
		this.res_cost = res_cost;
	}
	
	
}
