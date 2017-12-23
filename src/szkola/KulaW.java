package szkola;

public class KulaW {
	
	Kwadrat k;
	Walec w;
	
	public KulaW(Kwadrat kwa){
		k = kwa;
	}
	
	
	public KulaW(Walec wal) {
		w = wal;
	}
	
	public KulaW() {}


	@Override
	public String toString() {
		return "KulaW [k=" + k + ", w=" + w + "]";
	};
	
	public void set(Kwadrat k) {
		this.k = k;
	}
	
}
