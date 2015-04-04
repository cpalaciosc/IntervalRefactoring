package intervals;

public class ClosePoint extends Point {

	public ClosePoint(double value) {
		super(value);
	}

	@Override
	public boolean compareWhenMax(double value) {
		return value<=this.getValue();
	}

	@Override
	public boolean compareWhenMin(double value) {
		return value>=this.getValue();
	}

	@Override
	public boolean equalsValue(double value) {
		return false;
	}
}
