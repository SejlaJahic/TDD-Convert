package ba.bild.code;

public class Convertor {

	protected double kg;
	protected double pound;
	protected double cm;
	protected double inch;
	protected double celsius;
	protected double farenheit;

	public double kgToPounds(double kg) {
		kg *= 2.205;
		return kg;
	}

	public double poundsToKg(double pounds) {
		pounds *= 0.453592;
		return pounds;
	}

	public double cmToInch(double cm) {
		cm *= 0.393701;
		return cm;
	}

	public double inchToCm(double inch) {
		inch *= 2.54;
		return inch;
	}

	public double celsiusToFarenheit(double celsius) {
		celsius *= 33.8;
		return celsius;
	}

	public double farenheitToCelsius(double farenheit) {
		farenheit = (farenheit - 32) / 1.8;
		return farenheit;
	}

}
