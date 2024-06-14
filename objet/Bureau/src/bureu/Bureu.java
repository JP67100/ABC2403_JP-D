package bureu;

public class Bureu {

	private float hauteurMaxEnM;
	private float hauteurMinEnM;
	private float hauteurEnM;
	private boolean priseBranche;
	
	
	public Bureau() {
		hauteurMaxEnM = 2;
		hauteurMinEnM = 1;
		hauteurEnM = 1.5f;
		priseBranche = true;
	}
	
	public Bureau(float _hauteurMax, float _hauteurMinEnM, float _hauteur, boolean _priseBranche) {
		this.hauteurMaxEnM = _hauteurMax;
		this.hauteurMinEnM = _hauteurMinEnM;
		this.hauteurEnM = _hauteur;
		this.priseBranche = _priseBranche;
	}
	
	public boolean monterLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnM + hauteur <= hauteurMaxEnM && priseBranche == true) {
			hauteurEnM += hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean Niveau1() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnM = (hauteurMaxEnM - hauteurMinEnM) / 2.5f; 
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean Niveau2() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnM = (hauteurMaxEnM - hauteurMinEnM) / 2; 
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
	
	public boolean Niveau3() {
		
		boolean result;
		if(priseBranche == true) {
			hauteurEnM = (hauteurMaxEnM - hauteurMinEnM) / 1.5f; 
			result = true;
		}
		else {
			result = false;
		}
		return result;
		
	}
	
	public boolean descendreLeBureau(float hauteur) {
		
		boolean result;
		if(hauteurEnM - hauteur >= hauteurMinEnM && priseBranche == true) {
			hauteurEnM -= hauteur;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean brancheLaPrise() {
		
		boolean result;
		if(priseBranche == false) {
			priseBranche = true;
			result = true;
		}
		else {
			result = false;
		}
		
		return result;
	}
	
	public boolean debrancheLaPrise() {
		
		boolean result;
		if(priseBranche = true) {
			priseBranche = false;
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}

}

