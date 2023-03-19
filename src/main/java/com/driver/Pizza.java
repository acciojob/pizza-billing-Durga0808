package com.driver;

public class Pizza {

    /*the price here will be printed on bill*/
    private int price;
    //all variable prices
    public int baseprice;
    public int ExtraCheeseprice;
    public int ExtraToppingsprice;
    public int papaerbagprice;

    private Boolean isVeg;

    private String bill;
    boolean ischeeseadded;
    boolean istoppingdadded;
    boolean istakeawayadded;
    boolean isgetbill;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.ExtraCheeseprice=80;
        this.papaerbagprice=20;
        if(this.isVeg==true){
            this.baseprice=300;
            this.ExtraToppingsprice=70;
        }else{
            this.baseprice=400;
            this.ExtraToppingsprice=120;
        }
        this.price=baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseadded==false){
            this.price=this.price+ExtraCheeseprice;
            ischeeseadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(istoppingdadded==false){
            this.price=this.price+ExtraToppingsprice;
            istoppingdadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(istakeawayadded==false){
            this.price=this.price+papaerbagprice;
            istakeawayadded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isgetbill==false){
            this.bill="Base Price Of The Pizza: "+this.baseprice+"\n";
            if(ischeeseadded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.ExtraCheeseprice+"\n";
            }
            if(istoppingdadded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.ExtraToppingsprice+"\n";
            }
            if(istakeawayadded==true){
                this.bill=this.bill+"Paperbag Added: "+this.papaerbagprice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price;
            isgetbill=true;
        }
        return this.bill;
    }
}
