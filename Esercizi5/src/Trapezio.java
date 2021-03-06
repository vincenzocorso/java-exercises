package geometria.figurepiane;
import geometria.Punto;

/**
* Questa classe permette di creare dei trapezi.
*/
public class Trapezio extends Quadrilatero
{
	/**
	* Costruisce un trapezio usando i vertici passati a parametro. Se la costruzione fallisce viene restituito un messaggio di errore.
	* @param vertici I punti del trapezio elencati in senso orario.
	*/
	public Trapezio(Punto[] vertici)
	{
		super(vertici);

		if(this.direzioneLati[0] != this.direzioneLati[2] && this.direzioneLati[1] != this.direzioneLati[3])
		{
			this.vertici = null;
			this.direzioneLati = this.lunghezzaLati = null; // TODO: eccezioni
			System.out.println("Errore: i quattro punti non individuano un trapezio.");
		}
	}

	/**
	* Test della classe.
	*/
	public static void main(String[] args)
	{
		System.out.println("Test della classe Trapezio");
		Punto[] vertici;
		Trapezio a;

		// Trapezi validi
		vertici = new Punto[]{new Punto(0.0, 3.0), new Punto(3.0, 3.0), new Punto(5.0, 0.0), new Punto()};
		a = new Trapezio(vertici);
		System.out.println("Perimetro: " + a.calcolaPerimetro() + "\nArea: " + a.calcolaArea() + "\n");

		vertici = new Punto[]{new Punto(-1.0, -3.0), new Punto(-2.0, 0.0), new Punto(0.0, 2.0), new Punto(4.0, 2.0)};
		a = new Trapezio(vertici);
		System.out.println("Perimetro: " + a.calcolaPerimetro() + "\nArea: " + a.calcolaArea() + "\n");

		vertici = new Punto[]{new Punto(), new Punto(0.0, 3.0), new Punto(3.0, 5.0), new Punto(3.0, 0.0)};
		a = new Trapezio(vertici);
		System.out.println("Perimetro: " + a.calcolaPerimetro() + "\nArea: " + a.calcolaArea() + "\n");

		// Trapezi non validi (restituiscono un errore)
		/*vertici = new Punto[]{new Punto(-2.0, 0.0), new Punto(0.0, 4.0), new Punto(2.0, 1.0), new Punto(2.0, -1.0)};
		a = new Trapezio(vertici);*/
	}
}