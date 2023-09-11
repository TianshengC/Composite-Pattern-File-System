

import java.util.ArrayList;

public class Directory implements Component{
	private ArrayList<Component> dir;
	private String name;
	public Directory (String n) {
		dir = new ArrayList<Component>();
		name = n;
	}
	
	//setter and getter
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	public ArrayList<Component> getArrayList() {
		return dir;
	}
	public void setArrayList(ArrayList<Component> list) {
		dir = list;
	}
	
	//add and remove file and directory
	public void add(Component a) {
		dir.add(a);
	}
	public void remove(Component a) {
		dir.remove(a);
	}
	
	//get the size of a directory
	public int getSize() {
		int sum = 0;
		for(Component a: dir) {
			sum += a.getSize();
		}
		return sum;
	}
	
	// get the file number of a directory
	public int getCount() {
		int sum = 0;
		for(Component a: dir) {
			sum += a.getCount();
		}
		return sum;
	}
	
	//display the file
	public String display(String prefix) {
		int level =0; //As a record of the level in display format
		String s;
		String p = ""; // represent the indentation
		s = getName() + ": (count=" + getCount() + ", size=" + getSize() + ")\n";
		level++; //add level each time 
		for(int i=0; i<level; i++) { //print the prefix
			p += prefix;
		}
		for(Component a:dir) {
			s += p + a.display(prefix);
		}
		level--;//return to the previous level
		return s;
	}
	
	//search the file
	public Component search(String s) {
		Component result = null;//initialize result
		for(Component a:dir) {
			if(result != null) {//if result is Not null, return result directly and no need to check the rest component.
				return result;
			}
			if((s.equals(a.getName())) && (a instanceof File)) { //check whether it's a file and the file name is same as string s)
			    result = this;
			    break;// result is found and no need to check the rest component.
		    }else{
		    	result = a.search(s); //if result is not found, component should call search method for search the component in the next level(if any).
		    }
		}
		return result;
	}
}
