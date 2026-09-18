public class MonoPrint extends PrintJob {

	
	public MonoPrint(String id, int pages) {
		// TODO - implement MonoPrint.MonoPrint
		super(id, pages);
	}

	@Override 
	public int calculateCharge() {
		return getPages() * 500;
	}

	@Override 
	public String label() {
		// TODO - implement MonoPrint.label
		return "Mono";
	}

}