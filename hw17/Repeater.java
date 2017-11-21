 /* 
   Maggie Zhao
   APCS1 pd02
   HW17 -- Do I repeat myself? Very well, then I repeat myself I am possibly unending, I contain potentially multitudes.
   2017-10-16 M
*/

public class Repeater {
    
    public static void main (String [] args) {
	System.out.println(fenceW(10));
	System.out.println(fenceR(12));
    }
    public static String fenceW (int numPosts) {
	String reStr= ""; // start with an empty string, no posts yet!
	while (numPosts > 1){ // if the number of posts is more than 1, follow this loop!
	    reStr += "|--"; // add a post and some beams! 
	    numPosts -= 1; // since you've added one post already, subtract one from the total amount of posts you need, and run this code again. 
	    }
	reStr += "|"; // if you've reached one, add the final post
	return reStr; // return the string of posts
    }
    public static String fenceR (int numPosts) {
	String reStr = ""; // no posts yet
	if (numPosts > 1) { // base case will be 1; but while the number of posts you need is more than 1, add a post and a beam, and run the code again, and subtracting a post from the total you still need 
		reStr += "|--" + fenceR((numPosts - 1));
	    }
	else {
	    reStr += "|"; // final post
	}
	return reStr; // return the string of posts
    }
}
