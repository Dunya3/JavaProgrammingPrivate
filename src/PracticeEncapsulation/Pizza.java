package PracticeEncapsulation;

public class Pizza {
    private char size;
    private int numberOfCheeseTopping;
    private int  numberOfPepperoniTopping;

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(char size) {
        if(!(size == 'S' || size == 'M' || size == 'L' )){
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if((size == 'S') && (numberOfCheeseTopping <0 || numberOfCheeseTopping >3)) {
            return;
        }else  if((size == 'M') && (numberOfCheeseTopping <0 || numberOfCheeseTopping >4)){
            return;
        }
        else if((size == 'L') && (numberOfCheeseTopping <0 || numberOfCheeseTopping >5)) {
            return;

        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if((size == 'S') && (numberOfPepperoniTopping <0 || numberOfPepperoniTopping >4)) {
            return;
        }else  if((size == 'M') && (numberOfPepperoniTopping <0 || numberOfPepperoniTopping >5)){
            return;
        }
        else if((size == 'L') && (numberOfPepperoniTopping <0 || numberOfPepperoniTopping>6)) {
            return;

        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public double calcCost() {
        double cost = (size == 'S')? 10 : (size == 'M')? 12 : 14;
        cost += numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total Amount=" + calcCost() +
                '}';
    }
}



/*
5. Pizza Task:
		5.1 Create class named Pizza:
				private variables:
					size, numberOfCheeseTopping, numberOfPepperoniTopping

				Encapsulate all the fields
						Conditions:
							size of the pizza can only be small, medium, large. case insensitive

							Number of cheese topping can not be negative, the maximum number of cheese topping is:
										small: 3
										medium: 4
										large: 5

							Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

										small: 4
										medium: 5
										large: 6

				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)


				Methods:
					calcCost(): returns the totalCost of the pizza
					toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */