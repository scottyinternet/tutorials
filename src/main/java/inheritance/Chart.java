package inheritance;

class Chart {
	private SheetMusic bassSheetMusic;
	private SheetMusic guitarSheetMusic;
	private SheetMusic drumsSheetMusic;
	private SheetMusic acousticSheetMusic;


	public Chart(SheetMusic bassSheetMusic, SheetMusic guitarSheetMusic, SheetMusic drumsSheetMusic, SheetMusic acousticSheetMusic) {
		this.bassSheetMusic = bassSheetMusic;
		this.guitarSheetMusic = guitarSheetMusic;
		this.drumsSheetMusic = drumsSheetMusic;
		this.acousticSheetMusic = acousticSheetMusic;
	}

	public SheetMusic getBassSheetMusic() {
		return bassSheetMusic;
	}

	public SheetMusic getGuitarSheetMusic() {
		return guitarSheetMusic;
	}

	public SheetMusic getDrumsSheetMusic() {
		return drumsSheetMusic;
	}

	public SheetMusic getAcousticSheetMusic() {
		return acousticSheetMusic;
	}
}
