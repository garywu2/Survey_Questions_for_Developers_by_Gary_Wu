
/*
 * Interface for the FileFolders
 * Interface was needed because user could add either a 
 * file or a folder to a folder
 *
 */
public interface FileFolder {
	
	//Common methods for both files and folders
	public void display();
	public String getName();
	public void setName(String name);
}
