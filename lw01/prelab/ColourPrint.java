public class ColourPrint extends PrintJob {
	
	public ColourPrint(String id, int pages) {
		// TODO - implement ColourPrint.ColourPrint
		super(id, pages);
	}

	@Override
	public int calculateCharge() {
        int p = getPages();
        int cost;
        if (p <= 10) {
            cost = p * 1500;
        } else {
            cost = (10 * 1500) + ((p - 10) * 1000);
        }
        return cost + 2000; // Biaya setup IDR 2.000
    }

	public String label() {
		// TODO - implement ColourPrint.label
		return "Colour";
	}

}