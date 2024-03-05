package inheritance;

class Drums implements Instrument {
	@Override
	public void playTune(Chart chart) {
		System.out.println("Drums.playTune() - " + chart.getDrumsSheetMusic().getNotes());
	}

	@Override
	public void maintain() {
		System.out.println("change drum heads");
	}
}
