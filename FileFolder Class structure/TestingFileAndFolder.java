
/*
 * Main Class for testing File and Folders
 * 
 */
public class TestingFileAndFolder {

	public static void main(String[] args) {
		//Code copy and pasted from Testing code snippet
		Folder Grandparent = new Folder("Grandparent");
		Folder Parent = new Folder("Parent");
		File ChildA = new File("Child A");
		ChildA.content = "This is the content for Child A";
		File ChildB = new File("Child B");
		Folder ChildC = new Folder("Child C");
		File GrandChild = new File("GrandChild");
		ChildC.add(GrandChild);
		Parent.add(ChildA);
		Parent.add(ChildB);
		Parent.add(ChildC);
		Grandparent.add(Parent);
		Grandparent.display();
		ChildA.display();
	}

}
