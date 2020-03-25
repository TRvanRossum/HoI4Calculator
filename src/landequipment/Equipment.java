package landequipment;

import java.util.HashMap;

public class Equipment extends HashMap<EquipmentStatsEnum, Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5053818876260343257L;
	private String name;
	
	public Equipment(String _name, double speed, double softatt, double hardatt, double airatt, double def, double breakthrough, double armour, double piercing, 
			double hardness, double fuelusage, double reliability, double prodcost, double steel, double tungsten, double chromium,
			double aluminum, double rubber) {
		name = _name;
		this.put(EquipmentStatsEnum.SPEED, speed);
		this.put(EquipmentStatsEnum.SOFT_ATTACK, softatt);
		this.put(EquipmentStatsEnum.HARD_ATTACK, hardatt);
		this.put(EquipmentStatsEnum.AIR_ATTACK, airatt);
		this.put(EquipmentStatsEnum.DEFENSE, def);
		this.put(EquipmentStatsEnum.BREAKTHROUGH, breakthrough);
		this.put(EquipmentStatsEnum.ARMOUR, armour);
		this.put(EquipmentStatsEnum.PIERCING, piercing);
		this.put(EquipmentStatsEnum.HARDNESS, hardness);
		this.put(EquipmentStatsEnum.FUEL_USAGE, fuelusage);
		this.put(EquipmentStatsEnum.RELIABILITY, reliability);
		this.put(EquipmentStatsEnum.PRODUCTION_COST, prodcost);
		this.put(EquipmentStatsEnum.STEEL_REQ, steel);
		this.put(EquipmentStatsEnum.TUNGSTEN_REQ, tungsten);
		this.put(EquipmentStatsEnum.CHROMIUM_REQ, chromium);
		this.put(EquipmentStatsEnum.ALUMINUM_REQ, aluminum);
		this.put(EquipmentStatsEnum.RUBBER_REQ, rubber);
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpeed() {
		return (int) (double) this.get(EquipmentStatsEnum.SPEED);
	}
	
	public double getSoftAttack() {
		return this.get(EquipmentStatsEnum.SOFT_ATTACK);
	}
	
	public double getHardAttack() {
		return this.get(EquipmentStatsEnum.HARD_ATTACK);
	}
	
	public double getAirAttack() {
		return this.get(EquipmentStatsEnum.AIR_ATTACK);
	}
	
	public double getDefense() {
		return this.get(EquipmentStatsEnum.DEFENSE);
	}
	
	public double getBreakthrough() {
		return this.get(EquipmentStatsEnum.BREAKTHROUGH);
	}
	
	public int getArmour() {
		return (int) (double) this.get(EquipmentStatsEnum.ARMOUR);
	}
	
	public int getPiercing() {
		return (int) (double) this.get(EquipmentStatsEnum.PIERCING);
	}
	
	public double getHardness() {
		return this.get(EquipmentStatsEnum.HARDNESS);
	}
	
	public double getFuelUsage() {
		return this.get(EquipmentStatsEnum.FUEL_USAGE);
	}
	
	public double getReliability() {
		return this.get(EquipmentStatsEnum.RELIABILITY);
	}
	
	public double getProductionCost() {
		return this.get(EquipmentStatsEnum.PRODUCTION_COST);
	}
	
	public int getSteelReq() {
		return (int) (double) this.get(EquipmentStatsEnum.STEEL_REQ);
	}
	
	public int getTungstenReq() {
		return (int) (double) this.get(EquipmentStatsEnum.TUNGSTEN_REQ);
	}
	
	public int getChromiumReq() {
		return (int) (double) this.get(EquipmentStatsEnum.CHROMIUM_REQ);
	}
	
	public int getAluminumReq() {
		return (int) (double) this.get(EquipmentStatsEnum.ALUMINUM_REQ);
	}
	
	public int getRubberReq() {
		return (int) (double) this.get(EquipmentStatsEnum.RUBBER_REQ);
	}
}
