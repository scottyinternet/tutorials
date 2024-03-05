package inheritance;

class Bass implements Instrument {
	@Override
	public void playTune(Chart chart) {
		System.out.println("Bass.playTune() - " + chart.getBassSheetMusic().getNotes());
	}

	@Override
	public void maintain() {
		System.out.println("Change 4 strings");
	}
}
