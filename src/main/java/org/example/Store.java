package org.example;
public class Store {
    private String name;
    private String location;
    private int goodsAmount;
    private String goodsType;
    public Store(String name, String location, int goodsAmount, String goodsType) {
        this.name = name;
        this.location = location;
        this.goodsAmount = goodsAmount;
        this.goodsType = goodsType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public int getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(int goodsAmount) {
        if (goodsAmount > 0){
            this.goodsAmount = goodsAmount;
        }else{
            System.out.println("It can't be this bad. Enter more than 0.");
        }
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public void isAvailable(){
        if (goodsAmount > 0) {
            System.out.println("There are still some goods!!");
        }else{
            System.out.println("Sorry, nothing left!!");
        }
    }

    public void sale(int saleAmount){
        if (saleAmount < goodsAmount){
            this.goodsAmount -= saleAmount;
        }else{
            System.out.println("Sorry, our store doesn't have that much.");
        }
    }

    public void orderGoods(int orderAmount){
        if (orderAmount > 0){
            this.goodsAmount += orderAmount;
        }else{
            System.out.println("If you want to order that much you shouldn't do it at all.");
        }
    }
}

