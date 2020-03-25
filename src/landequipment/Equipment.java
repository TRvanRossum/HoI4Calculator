package landequipment;

public interface Equipment {
	String name = "";
	AttackStats att_stats = null;
	GeneralStats gen_stats = null;
	ResourceCost res_cost = null;
	
	public String getName();
	public void setName(String newName);
	
	public AttackStats getAttackStats();
	public void setAttackStats(AttackStats newStats);
	
	public GeneralStats getGeneralStats();
	public void setGeneralStats(GeneralStats newStats);
	
	public ResourceCost getResourceCost();
	public void setResourceCost(ResourceCost newCost);
}
