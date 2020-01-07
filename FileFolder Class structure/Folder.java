import java.util.ArrayList;

/*
 * Folder object which has the list of file/Folders
 * User can add and remove/delete files/folders from list
 * User can also display all the files/folders inside of the folder
 */
public class Folder implements FileFolder {
	
	//ArrayList for the list of files or folder
	private ArrayList<FileFolder> listOfFilesAndFolders;
	//Name of folder
	private String folderName;
	
	public Folder() {
		this.folderName = "";
		this.listOfFilesAndFolders = new ArrayList<FileFolder>();
	}
	
	public Folder(String folderName) {
		this.folderName = folderName;
		this.listOfFilesAndFolders = new ArrayList<FileFolder>();
	}
	
	/*
	 * Add the file requested by the user
	 */
	public void add(FileFolder userFile) {
		this.listOfFilesAndFolders.add(userFile);
	}
	
	/*
	 * Deletes the file specified by user
	 */
	public void delete(FileFolder userFile) {
		this.listOfFilesAndFolders.remove(userFile);
	}
	
	/*
	 * Displays all the files and folders that are inside of 
	 * the folder
	 */
	public void display() {
		//Displays the name of folder
		System.out.println(getName());
		//Loops while there is no more folders or files inside of it
		for( FileFolder fileFolder: listOfFilesAndFolders)
		{
			//Checks if it is a folder and if it is then it will run the display method
			if(fileFolder instanceof Folder) {
				fileFolder.display();
				//Else it will just return the name of the file
			} else {
				System.out.println(fileFolder.getName());
			}
		}
	}
	
	//Gets the name of the folder
	public String getName() {
		return this.folderName;
	}
	
	//Sets name of folder
	public void setName(String name) {
		this.folderName = name;
	}

}
