package intervals;

public class Point {
	private double value;
	private OpeningPointType type;
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public OpeningPointType getType() {
		return type;
	}
	
	public boolean compareWhenMax(double value){
		switch(this.type){
			case OPEN:
				return value<this.value;
			case CLOSED:
				return value<=this.value;
			default:
				return false;
		}
	}
	
	public boolean compareWhenMin(double value){
		switch(this.type){
			case OPEN:
				return value>this.value;
			case CLOSED:
				return value>=this.value;
			default:
				return false;
		}
	}
	
	public boolean equalsValue(double value){
		switch(this.type){
			case OPEN:
				return this.value==value;
			case CLOSED:
				return false;
			default:
				return false;
		}
	}
}
