import java.io.IOException;
/**
 * Application class to test all methods, objects, getters&setters of Building and 
 * all of it's child classes
 * @author Sam Glassco
 * @version 1.0
 * Building Project
 * 2/11/2020
 */


	public class Application {

		public static void main(String[] args) throws IOException {
			
			//testing empty and filled versions of each class
			
			//Empty Building
			Building emptyA = new Building();
			emptyA.draw();
			System.out.println(emptyA.displayData());
			
			//Complete Building
			Building a = new Building("Gaines House", "4586 Dalton Dr, Louisville, Kentucky 40205", 3000, "Residential", "R-1");			
			a.draw();
			System.out.println(a.displayData());
			
			//Empty Business
			Business emptyB = new Business();
			emptyB.draw();
			System.out.println(emptyB.displayData());
					
			//Complete Business
			Business b = new Business("Daddy Dale Daycare", "422 Main Street, Louisville, Kentucky 40201", 5000, "Educational", "E",2);
			b.draw();
			System.out.println(b.displayData());
			
			//Empty Residential
			Residential emptyC = new Residential();
			emptyC.draw();
			System.out.println(emptyC.displayData());

			//Complete Residential
			Residential c = new Residential("Gaines House", "4586 Dalton Dr, Louisville, Kentucky 40205", 3000, "Residential", "R-1", 1, 1, true);
			c.draw();
			System.out.println(c.displayData());
			
			//Empty Mall
			Mall emptyD = new Mall();
			emptyD.draw();
			System.out.println(emptyD.displayData());

			//Complete Mall
			Mall d = new Mall("Might Max's Mall", "1277 Maxamillion Blvd, Louisville, Kentucky 40203", 9000, "Mercantile", "M",20,30, 2450.0, 120);
			d.draw();
			System.out.println(d.displayData());
			
			//Empty Apartment
			Apartment emptyE = new Apartment();
			emptyE.draw();
			System.out.println(emptyE.displayData());

			//Complete Apartment
			Apartment e = new Apartment("Sunshine Suites", "5249 Windy Ct, Mason, Ohio 45040", 2450.0, "Residential", "R-2",8,2450,true,35,3200,true);
			e.draw();
			System.out.println(e.displayData());
			
			//Empty SFH
			SingleFamilyHome emptyF = new SingleFamilyHome();
			emptyF.draw();
			System.out.println(emptyF.displayData());

			//Complete SFH
			SingleFamilyHome f = new SingleFamilyHome("Old Cottage", "4444 Leaf Ln., Louisville, Kentucky 40201", 2750, "Residential", "R-3", 2, 1, true, false);
			f.draw();
			System.out.println(f.displayData());
					

		}//end main

	}//end class
