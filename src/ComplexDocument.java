import java.util.*;

public class ComplexDocument extends AbstractDocument {
	
	private ArrayList<Document> list = new ArrayList<Document>();
	
	public void storeDocument(Document doc) {
		list.add(doc);
	}
	

	public void deleteDocument(Document doc) {
		list.remove(doc);
	}
	
	public void deleteAllCurrentlyDocument(Document doc) {
		while( !list.isEmpty() ) {
			list.remove(0);
		}
	}


	@Override
    public void show() {
        for (int i = 0; i < list.size(); i++) list.get(i).show();
    }
	
}
