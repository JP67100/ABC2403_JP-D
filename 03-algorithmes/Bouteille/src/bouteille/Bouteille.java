package bouteille;

class Bouteille {

	// attributes

	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvertOn;
	private String typeDeContenu;

	// access/modifier
	// constructor

	public Bouteille() {
		contenanceEnL = 1;
		contenuEnL = 1;
		ouvertOn = false;
		typeDeContenu = "H2O";
	}

	// constructeur classique
	// The user will provide the details

	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvertOn = ouvertOn;
		this.typeDeContenu = _typeDeContenu;

		// _bouteilleARecopier.typeDeContenu="Champagne";

	}
	// Constructeur par ecopie ou clonage

	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvertOn = _bouteilleARecopier.ouvertOn;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;

	}
//methods

	public float donneContenanceEnCL() {

		float result;
		result = this.contenanceEnL * 100;
		return result;
	}

	public boolean ouverture() {
	
		boolean ouvertOn;
		if (this.ouvertOn = false) {
			ouvertOn=true;
		this.ouvertOn = true;
		return this.ouvertOn;			}
	}

	public boolean fermeture() {
		boolean fermerOn;
		if (this.ouvertOn= false) {
			fermerOn = true;
			this.ouvertOn = false; 
								  }
			return this.ouvertOn ;
	
	public boolean estPlein () {
		boolean plein;
		if (this.contenuEnL == this.contenanceEnL) {
			plein = true ;						   }
			else plein = false;
		return plein;
							   }
	
			
			
		
	
	
	
	
	
	
	
	
	
	}
}
