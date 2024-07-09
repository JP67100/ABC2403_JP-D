package bouteille2;

class Bouteille2 {
	
	private float contenanceEnCl ;
	private float contenuEnCl ; 
	private boolean ouvertOn ; 
	private String matiere ;

	public Bouteille2 () {
	
	contenanceEnCl =  1.0f ;
	contenuEnCl = 0.5f ;
	ouvertOn = true ;
	matiere = "plastique" ; }
	
	public Bouteille2 (float_contenanceEnCl, float_contenuEnCl, boolean_ouvert, String_matiere) {
		this.contenanceEnCl = _contenanceEnL;
		this.contenuEnCl = _contenuEnL;
		this.ouvertOn = ouvertOn;
		this.matiere = _typeDeContenu;

		public float donneContenanceEnCL() {

			float result;
			result = this.contenanceEnCl * 100;
			return result;
		}

		public float donneContenueEnCL() {

			float result = this.contenuEnCl * 100;

			return result;
		}

		public boolean estPleine() {

			boolean result;
			if (this.contenuEnCl == this.contenanceEnCl) {
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
}
}