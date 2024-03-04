package fantasia;

import modelo.AbstractFactory;
import modelo.Desenlace;
import modelo.Inicio;
import modelo.Nudo;

public class FantasyFactory extends AbstractFactory{
	@Override
	public Inicio getInicio() {
		// TODO Auto-generated method stub
		return new Fantasia_inicio();
	}
	
	@Override
	public Nudo getNudo() {
		// TODO Auto-generated method stub
		return new Fantasy_nudo();
	}
	
	@Override
	public Desenlace getDesenlace() {
		// TODO Auto-generated method stub
		return new Fantasy_desenlace();
	}
}
