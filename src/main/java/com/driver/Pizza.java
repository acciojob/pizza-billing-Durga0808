package com.driver;

public class Pizza {

    private  int ExtraToppings;
    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean PaperBagAdded;
    private boolean billGenerated;
    private int ExtraCheese;
    private int PaperBagPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.basePrice=300;
            this.ExtraToppings=70;

        }else{
            this.basePrice=400;
            this.ExtraToppings=120;
        }
        this.price+=basePrice;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            isExtraCheeseAdded=true;
            this.ExtraCheese=80;
            this.price+=ExtraCheese;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppingsAdded){
            isExtraToppingsAdded=true;
            this.price+=ExtraToppings;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!PaperBagAdded){
            PaperBagAdded=true;
            this.PaperBagPrice=20;
            this.price+=PaperBagPrice;
        }
    }

    public String getBill(){
        // your code goes here

        if(!billGenerated){
            billGenerated=true;
            this.bill="Base Price Of The Pizza: "+this.basePrice+"\n";
            if(isExtraCheeseAdded){
                this.bill=this.bill+"Extra Cheese Added: "+this.ExtraCheese+"\n";
            }
            if(isExtraToppingsAdded){
                this.bill=this.bill+"Extra Toppings Added: "+this.ExtraToppings+"\n";
            }
            if(PaperBagAdded){
                this.bill=this.bill+"Paperbag Added: "+this.PaperBagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+price+"\n";

        }
        return this.bill;
    }
}
