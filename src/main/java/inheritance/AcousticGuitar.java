package inheritance;

class AcousticGuitar extends Guitar {
	public void losePickInSoundHole() {
		System.out.println("AcousticGuitar.losePickInSoundHole() - Pick in soundhole, lose 10 points");
	}

	@Override
	public void playTune(Chart chart) {
		if (chart.getAcousticSheetMusic() != null) {
			System.out.println("AcousticGuitar.playTune() - " + chart.getAcousticSheetMusic().getNotes());
		} else {
			super.playTune(chart);
		}
	}
}
