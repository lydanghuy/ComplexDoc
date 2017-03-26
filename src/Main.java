import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ComplexDocument doc0 = new ComplexDocument();
		TextDocument doc2 = new TextDocument("The final exam takes place soon!!", TextDocument.Encoding.UTF8);
		ComplexDocument doc3 = new ComplexDocument();
		TextDocument doc5 = new TextDocument("Software Engineering Design is a lecture at the VGU!",TextDocument.Encoding.UTF32);
		GraphicDocument doc4 = new GraphicDocument("localhost:8080");
		
		doc2.setDocID("A002");
		doc5.setDocID("E005");
		doc4.setDocID("9999");
		doc3.storeDocument(doc4);
		doc3.storeDocument(doc5);
        doc0.storeDocument(doc3);
        doc0.storeDocument(doc2);
        doc0.show();
        //doc0.sizeOfObject(doc2);
        //doc0.sizeOfObject(doc5);
	}

}
