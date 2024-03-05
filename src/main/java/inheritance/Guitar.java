package inheritance;

class Guitar implements Instrument {
	@Override
	public void playTune(Chart chart) {
		System.out.println("Guitar.playTune() - " + chart.getGuitarSheetMusic().getNotes());
	}
	public void playSolo() {
		System.out.println("Guitar.playSolo() - SHREDSVILLE BABY! CRANK IT UP TA 11!!!!");
	}

	@Override
	public void maintain() {
		System.out.println("Guitar.changeStrings() - Replacing 6 guitar strings");
	}
}

