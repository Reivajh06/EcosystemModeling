package reivajh06;

public class Position {

	protected float x;
	protected float y;

	public float x() {
		return x;
	}

	public Position x(float x) {
		this.x = x;
		return this;
	}

	public float y() {
		return y;
	}

	public Position y(float y) {
		this.y = y;
		return this;
	}
}
