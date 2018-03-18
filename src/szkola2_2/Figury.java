package szkola2_2;

public abstract class Figury implements Wymiary {

	protected int pole;
	protected int obwód;
	
	
	
	protected abstract void obwod();
	protected abstract int pole();
	
	
	@Override
	public String toString() {
		return "[pole=" + pole + ", obwód=" + obwód + "]";
	}
	
	
	
}
