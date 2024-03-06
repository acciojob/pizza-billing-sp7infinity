package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isTakeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price = 300;
        else
            price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded) {
            price += 80;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded) {
            price += isVeg ? 70 : 120;
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeawayAdded) {
            price += 20;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        bill = "Base Price Of The Pizza: " + ((isVeg) ? "300" : "400") + "\n";

        if(isExtraCheeseAdded)
            bill += "Extra Cheese Added: 80\n";

        if(isExtraToppingsAdded)
                bill += "Extra Toppings Added: " + ((isVeg) ? "70" : "120") + "\n";

        if(isTakeawayAdded)
            bill += "Paperbag Added: 20\n";

        String totalPrice = Integer.toString(price);
        bill += "Total Price: " + totalPrice + "\n";

        return this.bill;
    }
}
