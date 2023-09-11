

public class File implements Component{
	private String name;
	private int size;
	public File(String n, int s) {
		setName(n);
		setSize(s);
	}
	
	//setter and getter
	public int getSize() {
		return size;
	}
	public void setSize(int s) {
		this.size = s;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}
	
	//Count the file
	public int getCount() {
		return 1;
	}
	
	//Display the file a required format
	public String display(String prefix) {
		String s;
		s = getName() + " (" + getSize() +")\n";
		return s;
	}

	//As searching function is mainly accomplished by the directory, so here return null.
	public Component search(String name) {
			return null;
		}
	}
	

