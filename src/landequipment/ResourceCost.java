package landequipment;

public class ResourceCost {
	private double productionCost;
	private int steel;
	private int tungsten;
	private int chromium;
	private int aluminum;
	private int rubber;
	
	public ResourceCost(double _prod, int _steel, int _tung, int _chrom, int _alu, int _rub) {
		productionCost = _prod;
		steel = _steel;
		tungsten = _tung;
		chromium = _chrom;
		aluminum = _alu;
		rubber = _rub;
	}

	public double getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(double productionCost) {
		this.productionCost = productionCost;
	}

	public int getSteel() {
		return steel;
	}

	public void setSteel(int steel) {
		this.steel = steel;
	}

	public int getTungsten() {
		return tungsten;
	}

	public void setTungsten(int tungsten) {
		this.tungsten = tungsten;
	}

	public int getChromium() {
		return chromium;
	}

	public void setChromium(int chromium) {
		this.chromium = chromium;
	}

	public int getAluminum() {
		return aluminum;
	}

	public void setAluminum(int aluminum) {
		this.aluminum = aluminum;
	}

	public int getRubber() {
		return rubber;
	}

	public void setRubber(int rubber) {
		this.rubber = rubber;
	}
	
}
