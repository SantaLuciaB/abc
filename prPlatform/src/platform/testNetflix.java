package platform;

public class testNetflix {

		public static void main(String[] args) {
			Favorites myFavourite=new Favorites();
			
			myFavourite.newProgram(new Program(1,"The Adam Project",106,"Science Fiction"));
			myFavourite.newProgram(new Program(2,"The IT Crowd",625,"Comedy",45));
			myFavourite.newProgram(new Program(3,"Hotel Transylvania",90,"Animation"));
			System.out.println("MY FAVORITE: ");
			System.out.println(myFavourite);
			
			System.out.println();
			System.out.println("CURRENT MINUTE: " + myFavourite.showProgram(1));
			myFavourite.updateProgram(1, 20);
			System.out.println("CURRENT MINUTE UPDATED: " + myFavourite.showProgram(1));
			System.out.println();
			
			
			myFavourite.deleteProgram(2);
			System.out.println("PROGRAM 2 REMOVED FROM MY FAVORITES: ");
			System.out.println(myFavourite);
			System.out.println();

			System.out.println(myFavourite.showProgram(5)); 

		}

}
