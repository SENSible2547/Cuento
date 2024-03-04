package infantil;

import modelo.AbstractFactory;
import modelo.Desenlace;
import modelo.Inicio;
import modelo.Nudo;

public class InfantilFactory extends AbstractFactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new Infantil_inicio();
	}@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new Infantil_nudo();
	}@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new Infantil_desenlace();
	}
}
