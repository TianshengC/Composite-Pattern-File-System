public class FileTest {
	public static void main(String[] args) {
		File settings = new File("Settings", 10);
		File ringtone = new File("rubgtone", 120);
		File family = new File("family", 201);
		File portrait = new File("portrait", 134);
		File wallpaper = new File("wallpaper", 421);
		File test = new File("test", 10);
		File familyTest = new File("family", 1);
		File familyTwo = new File("family", 1);
		
		Directory root = new Directory("root");
		Directory music = new Directory("music");
		Directory pictures = new Directory("pictures");
		Directory personal = new Directory("personal");
		Directory misc = new Directory("misc");
		Directory test2 = new Directory("test2");
		
		root.add(settings);
		root.add(music);
		root.add(pictures);
		
		music.add(ringtone);
		pictures.add(personal);
		pictures.add(misc);
		
		personal.add(family);
		personal.add(portrait);
		misc.add(wallpaper);
		misc.add(test);	
		misc.remove(test);
		misc.add(test2);
		test2.add(familyTest);
		misc.remove(test2);
		misc.add(familyTwo);

		
		System.out.println(root.display("+-"));
        
		boolean t = false;
        if(root.search("settings") == null) {
        	t = true;
        }

		boolean p = false;
        if(root.search("misc") == null) {
        	p = true;
        }
        System.out.println(t);
        System.out.println(p);
		System.out.println(root.search("Settings").getName());
        System.out.println(root.search("family").getName());
        System.out.println(root.search("wallpaper").getName());	
        System.out.println(root.search("misc").getName());	
	}
}