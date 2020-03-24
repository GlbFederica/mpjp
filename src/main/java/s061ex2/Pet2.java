package s061ex2;

public abstract class Pet2 { // questo metodo rimane più compatto rispetto a Pet normale, si possono fare
								// entrambi o anche una combinazione delle due cose in base a quello che si
								// vuole fare. in questo modo scrivo una sola volta housing che tanto fa la
								// stessa cosa per entrambe le classi che estendono Pet. se oltre a questa ci
								// fossero stati altri metodi specifici e diversi sostanzialmente per ogni
								// subclass posso scrivere housing in Pet e il metodo specifico come metodo
								// abstract su cui poi faccio l'override in ogni subclass.
								// per passare una costante specifica per ogni subclass, ma che è comunque
								// presente in tutte, si fa come è fatto qui. ovvero io la definisco in ogni
								// subclass e poi la mando come parametro al costruttore super
	private int days;
	private String name;
	private int daily;

	public Pet2(int days, String name, int daily) {
		this.days = days;
		this.name = name;
		this.daily = daily;
	}

	public int housing() {
		int housingTot = days * daily;
		System.out.println(name + " Total housing: " + housingTot);
		return housingTot;
	}

}
