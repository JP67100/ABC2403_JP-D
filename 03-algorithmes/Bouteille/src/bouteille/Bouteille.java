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
		contenanceEnL = 1.0f;
		contenuEnL = 1.0f;
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

	public float donneContenueEnCL() {

		float result = this.contenuEnL * 100;

		return result;
	}

	public boolean estPleine() {

		boolean result;
		if (this.contenuEnL == this.contenanceEnL) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean ouvrir() {

		boolean result;
		if (this.ouvertOn == false) {
			this.ouvertOn = true;
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean fermer() {

		boolean result;
		if (this.ouvertOn == true) {
			this.ouvertOn = false;
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean laRemplir() {

		boolean result;
		if (this.contenuEnL < this.contenanceEnL && this.ouvertOn == true) {
			this.contenuEnL = this.contenanceEnL;
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean laRemplir(float quantite) {

		boolean result;
		if (this.contenuEnL + quantite <= this.contenanceEnL && this.ouvertOn == true) {
			this.contenuEnL += quantite;
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean laVider() {

		boolean result;
		if (this.contenuEnL > 0 && this.ouvertOn == true) {
			this.contenuEnL = 0;
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean laVider(float quantite) {

		boolean result;
		if (this.contenuEnL - quantite >= 0 && this.ouvertOn == true) {
			this.contenuEnL -= quantite;
			result = true;
		} else {
			result = false;
		}

		return result;

	}
}
