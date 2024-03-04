package terror;

import modelo.AbstractFactory;
import modelo.Desenlace;
import modelo.Inicio;
import modelo.Nudo;

public class TerrorFactory extends AbstractFactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new Terror_inicio();
	}@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new Terror_nudo();
	}@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new Terror_desenlace();
	}
}
