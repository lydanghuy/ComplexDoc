public class CoreDocument extends AbstractDocument{
	
	private String core_document;
	
	public void setCoreDocument(String core_document)
	{
		this.core_document = core_document;
	}
	public String getCoreDocument()
	{
		return core_document;
	}
	
	@Override
	public void show(){
        System.out.println("Document ID: "+ this.getDocID()+ " : " + core_document);
    }
}
