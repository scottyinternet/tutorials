package inheritance;

import java.util.ArrayList;
import java.util.List;

public class inheritance {
	public static void main(String[] args) {
//
		Chart chart = new Chart(
				new SheetMusic("B A S S  N O T E S - C G C G C G CGAB"),
				new SheetMusic("G U I T A R  N O T E S - bowowww!"),
				new SheetMusic("D R U M   N O T E S  :  BOOM CHKA BABOOM BOOM CHKA"),
				new SheetMusic("A C O U S T I C  N O T E S : strrrummmmmmmmm")
		);

//
//
//		System.out.println(" I N T S T R U M E N T   I N T E R F A C E ");
//		Instrument acousticInterface = new AcousticGuitar();
//		acousticInterface.playTune(chart);
//		System.out.println("");
//
//		System.out.println(" G U I T A R   S U P E R C L A S S ");
//		Guitar acousticSuper = new AcousticGuitar();
//		acousticSuper.playTune(chart);
//		acousticSuper.changeStrings();
//		acousticSuper.playSolo();
//		System.out.println("");
//
//		System.out.println(" A C O U S T I C    C L A S S  ");
//		AcousticGuitar acousticGuitar = new AcousticGuitar();
//		acousticGuitar.playTune(chart);
//		acousticGuitar.changeStrings();
//		acousticGuitar.playSolo();
//		acousticGuitar.losePickInSoundHole();
//		System.out.println("");

//		Instrument instrument = new AcousticGuitar();
//		instrument.playTune(chart);
//
//
		List<Instrument> band = new ArrayList<>();

		band.add(new Drums());
		band.add(new Bass());
		band.add(new AcousticGuitar());
		band.add(new Guitar());

		for (Instrument inst :  band) {
			inst.playTune(chart);
		}

		for (Instrument inst :  band) {
			inst.maintain();
		}

	}
}


