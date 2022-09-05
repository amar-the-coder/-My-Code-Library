package Strings;

public class stringsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        // charAt index 0
        
        System.out.println(sb.charAt(0));
        
        // set charAt index 0
        // always use single inverted comma for this;
        
       sb.setCharAt(0, 'p');
        System.out.println(sb);
        
        
        // insert 
        sb.insert(0, 's');
        System.out.println(sb);
        
        //delete("beg index" , "end index");---- ending index is exclusive
        sb.delete(2, 3); 
        System.out.println(sb);
        
        //append
        StringBuilder sb1 = new StringBuilder("h");
        sb1.append('e');
        System.out.println(sb1);
        
	}

}
