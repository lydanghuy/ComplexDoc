import java.lang.instrument.Instrumentation;
import java.util.*;

public abstract class AbstractDocument implements Document{
	 private  Instrumentation instrumentation;
	private String DocID;

	public AbstractDocument(){}
	
	public void setDocID(String DocID)
	{
		this.DocID = DocID;
	}
	public String getDocID(){
		return DocID;
	}
	
	public void sizeOfObject(Document doc){
		
        System.out.println("Size of Object: "+ instrumentation.getObjectSize(doc));
		}
		
    
}
