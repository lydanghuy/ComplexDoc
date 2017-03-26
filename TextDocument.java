import java.io.UnsupportedEncodingException;
public class TextDocument extends CoreDocument {
	
	public enum Encoding { UTF8, UTF16, UTF32;}
	
	private Encoding encoding_type;
	
	public TextDocument(String text, Encoding encoding_type) {
		super();
		setCoreDocument(text);
		this.encoding_type = encoding_type;
		try{
			if(this.encoding_type == Encoding.UTF8){
				text = new String( text.getBytes( "UTF-8"));
				setCoreDocument(text);
			}
			if(encoding_type == Encoding.UTF16){
				text = new String( text.getBytes( "UTF-16"));
				setCoreDocument(text);
			}
			if(encoding_type == Encoding.UTF32){
				text = new String( text.getBytes( "UTF-32"));
				setCoreDocument(text);
			}
			
		}catch(UnsupportedEncodingException e){
			System.out.println("Unsupported character set");
		}
	}
	
}
