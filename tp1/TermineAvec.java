public class TermineAvec {

	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Ex : testeur eur");
			System.exit(-1);
		}

		if(args[0].endsWith(args[1])) {
			System.out.println(args[0] + " se termine bien par " + args[1]);
		}
		else {
			System.out.println(args[0] + " NE se termine PAS par " + args[1]);
		}
	}

}
