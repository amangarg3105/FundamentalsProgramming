package doubts;

/**
 * @author amgarg
 */
public class Car {


     Tyre tyre;

     Car(Tyre tyre) { //Tyre trye = new Tyre();
         this.tyre = tyre;
     }


     public void printTyreNameOfCar() {
         System.out.println(tyre.tyreName);
     }




}
