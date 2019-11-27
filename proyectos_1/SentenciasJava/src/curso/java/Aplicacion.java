package curso.java;

public class Aplicacion {

	public static void main(String[] args) {
		// Ejemplos de sentencias if
		SentenciaIf sentenciaIf = new SentenciaIf();
		sentenciaIf.sentenciaIf();
		sentenciaIf.sentenciaIfElse();
		sentenciaIf.sentenciaIfAnidada();
		sentenciaIf.sentenciaIfMultiple();

		// Ejemplos de sentencias switch		
		SentenciaSwitch sentenciaSwitch = new SentenciaSwitch();
		sentenciaSwitch.sentenciaSwitch();
		sentenciaSwitch.sentenciaSwitch2();
		sentenciaSwitch.sentenciaSwitch3();
		sentenciaSwitch.sentenciaSwitch4();
		
		// Ejemplos de bucles for
		BucleFor bucleFor = new BucleFor();
		bucleFor.bucleFor();
		bucleFor.numeroImpares();
		bucleFor.bucleAnidado();
		bucleFor.bucleConBreak();
		bucleFor.bucleConContinue();
		
		// Ejemplos de bucles while
		BucleWhile bucleWhile = new BucleWhile();
		bucleWhile.bucleWhile();
		bucleWhile.bucleWhileAnidado();
		bucleWhile.bucleWhileConBreak();
		bucleWhile.bucleWhileConContinue();
		bucleWhile.bucleWhileInfinito();
		bucleWhile.bucleWhileInfinito2();
		
		// Ejemplos de bucles do ... while
		BucleDoWhile bucleDoWhile = new BucleDoWhile();
		bucleDoWhile.bucleDoWhile();
		bucleDoWhile.bucleDoWhileConBreak();
		bucleDoWhile.bucleDoWhileConContinue();
	}

}
