
public interface Fly {
	
//	takeOff with no arguments, and returns nothing    
//	ascend which takes an integer meters as an argument, and returns an integer    
//	descend which takes an integer meters as an argument, and returns an integer    
//	land with no arguments, which returns nothing    
//	glide, with no arguments, which returns nothing and has a default behaviour: 
//		displaying the text "glides into the air."

	public void takeOff();
	public int ascend(int meters);
	public int descend (int meters);
	public void land();
	default public void glide() {
		System.out.println("glides into the air.");
	};
	
}
