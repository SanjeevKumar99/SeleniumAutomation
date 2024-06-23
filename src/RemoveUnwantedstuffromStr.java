
public class RemoveUnwantedstuffromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "$$ selenium & Java + courses";
		
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);

	}

}
