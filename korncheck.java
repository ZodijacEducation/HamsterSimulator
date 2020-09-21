import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class korncheck extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram { public int koernerimmaul = 0;

public void main() {
    kornda();
    action();
}

void kornda(){
	while(kornDa()){
		nimm();
		koernerimmaul += 1;
	}
	
}

void action(){
	if(koernerimmaul == 0){
			
	
	}	
								
	if(koernerimmaul == 1){
		gib();
		linksUm();
	}

	if(koernerimmaul == 2){
		gib();
		gib();
		rechtsUm();
	
	}
}

void rechtsUm(){
	linksUm();
	linksUm();
	linksUm();

}
}