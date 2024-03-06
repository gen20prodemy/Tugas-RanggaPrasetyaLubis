class Food extends CategoryProduct{
    private String nameFood;
    private Integer priceFood;

    Food(String nameProduct, String nameFood, Integer priceFood){
        super(nameProduct);
        this.nameFood = nameFood;
        this.priceFood = priceFood;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public Integer getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(Integer priceFood) {
        this.priceFood = priceFood;
    }

    @Override
    public void displayProduct(){
        System.out.println("Kategori : " + getNameProduct());
        System.out.println("Nama Produk : " + getNameFood());
        System.out.println("Harga Produk : " + getPriceFood());
        System.out.println();
    }
}
