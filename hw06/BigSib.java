/*
Maggie Zhao
APCS1 pd2
HW06 -- On BigSib Individuality and the Elimination of Radio Fuzz
2017-09-25
*/

public class BigSib{

    private String helloMsg;
    

    public void setHelloMsg(String newMsg){
	
	helloMsg= newMsg;
    }
    public String greet(String name) {
	String result;
	result = helloMsg;
	result += " ";
	result += name;
	return result; 
    }

}
