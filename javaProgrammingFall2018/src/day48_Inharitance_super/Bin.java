package day48_Inharitance_super;

public class Bin {

	private String contents;
    private String type;
    
    public void setType(String type) {
    	this.type=type;
    }
  

public Bin() {
	  this("general");
   }
	public Bin(String type ) {
	contents="";
	this.type=type;
	
	}//add things
	public void add(String thing) {
		if(contents.isEmpty()) {         //if(contents.equals("")  or if(contents.length()==0)
			contents=thing;
		}else {
			contents=contents+","+thing;  //contents=contents.concat(","+thing);
		}
	}
	//remove from the contents  (toys,book,mouse)
	public boolean remove(String thing) {
		String temp=contents.toLowerCase().trim();
		if (temp.contains(thing)){
			if(temp.startsWith(thing)) {
			temp.replace(thing, "");
			temp=temp.isEmpty()? temp:temp.substring(1);
		}else {
			temp.replace(","+thing, "");
		}
               contents=temp;
               return true;
	}else {
		return false;
		
	}
		
	}

public void empty() {
	
	contents="";
}

public String toString() {
	return "Bin ("+type+") contains["+contents+"]";
}

	
}
