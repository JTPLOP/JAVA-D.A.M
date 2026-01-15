package ejemploInterfaces;

public class Rana extends Anfibio implements IDepredador{

	public void cazar (boolean enGrupo) {
		if (enGrupo) {
			System.out.println("Todos juntos a la caza");
		}else {
			System.out.println("Me voy solito de caza");
		}
		
	}
	
	public void perseguir () {
		System.out.println("Persigo a mi presa");
	}
}
