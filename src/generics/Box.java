package generics;

public class Box<T>{
   private  T content ;
	public T getContent() {
	return content;
}
public void setContent(T content) {
	this.content = content;
}
	public static void main(String[] args) {
		Box<String>  stringContent=new Box<>();
		stringContent.setContent("surya");
		 String msg=stringContent.getContent();
		 System.out.println(msg);

	}

}
