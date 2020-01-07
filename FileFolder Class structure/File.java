/*
 * File object which has the contents the user can put in
 * User can add content to the file
 * User can also display content and the name of the file
 */
public class File implements FileFolder {
	
	/*
	 * content visibility is public to adhere to the given Main() code snippet
	 */
	public String content;
	//Name of file
	private String fileName;
	
	public File() {
		this.fileName = "";
	}
	
	public File(String fileName) {
		this.fileName = fileName;
	}
	
	//Shows the contents of the file
	public void display() {
		System.out.println(this.content);
	}
	
	//Gets the file name
	public String getName() {
		return this.fileName;
	}
	
	//Sets the file name
	public void setName(String name) {
		this.fileName = name;
	}
}
