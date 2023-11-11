package factory;

import domain.Covid19Pacient;
import domain.Factory;
import domain.Medicament;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p1=new Covid19Pacient("aitor", 35, new Factory());
		new PacientSymptomGUI(p1);
		Medicament	m=new Medicament("Ibuprofeno", new Factory());
		MedicalGUI	mgui=new MedicalGUI(m);
	}

}
