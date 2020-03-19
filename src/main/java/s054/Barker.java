package s054;

interface Barker {
	String bark(); // nell'interfaccia si possono mettere (fino a java 8, poi è stato un po'
					// implementato) solo metodi astratti, privi di body. il resto, anche se comune
					// a tutte le classi che costruisco su questa interfaccia, va nelle singole
					// classi che estendono l'interfaccia
}