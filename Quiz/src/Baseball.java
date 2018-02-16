
public class Baseball {
	
	private double AB;
	private double hits;
	private double doub;
	private double trip;
	private double HR;
	private double runs;
	private double walks;
	private double SF;
	private double HBP;
	
	public Baseball(double aB, double hits, double doub, double trip, double hR, double runs, double walks, double sF,
			double hBP) {
		super();
		AB = aB;
		this.hits = hits;
		this.doub = doub;
		this.trip = trip;
		HR = hR;
		this.runs = runs;
		this.walks = walks;
		SF = sF;
		HBP = hBP;
	}

	public double getAB() {
		return AB;
	}

	public void setAB(double aB) {
		AB = aB;
	}

	public double getHits() {
		return hits;
	}

	public void setHits(double hits) {
		this.hits = hits;
	}

	public double getDoub() {
		return doub;
	}

	public void setDoub(double doub) {
		this.doub = doub;
	}

	public double getTrip() {
		return trip;
	}

	public void setTrip(double trip) {
		this.trip = trip;
	}

	public double getHR() {
		return HR;
	}

	public void setHR(double hR) {
		HR = hR;
	}

	public double getRuns() {
		return runs;
	}

	public void setRuns(double runs) {
		this.runs = runs;
	}

	public double getWalks() {
		return walks;
	}

	public void setWalks(double walks) {
		this.walks = walks;
	}

	public double getSF() {
		return SF;
	}

	public void setSF(double sF) {
		SF = sF;
	}

	public double getHBP() {
		return HBP;
	}

	public void setHBP(double hBP) {
		HBP = hBP;
	}

	public double BA() {
		double BatAvg = (this.hits) / (this.AB);
		return BatAvg;
	}
	
	public double OBP() {
		double OnBaseP = (this.hits + this.walks + this.HBP) / (this.AB + this.walks + this.HBP + this.SF);
		return OnBaseP;
	}
	
	public double SLG() {
		double singles = this.hits - this.doub - this.trip - this.HR;
		double slug = (singles + (2*this.doub)+ (3*this.trip)+(4*this.HR)) / (this.AB);
		return slug;
	}
	
	public double TB() {
		double singles = this.hits - this.doub - this.trip - this.HR;
		double total = singles + (2*this.doub)+ (3*this.trip)+(4*this.HR);
		return total;
	}
	
	public double OPS() {
		double singles = this.hits - this.doub - this.trip - this.HR;
		double OnBaseP = (this.hits + this.walks + this.HBP) / (this.AB + this.walks + this.HBP + this.SF);
		double slug = (singles + (2*this.doub)+ (3*this.trip)+(4*this.HR)) / (this.AB);
		return slug + OnBaseP;
		
	}
}
