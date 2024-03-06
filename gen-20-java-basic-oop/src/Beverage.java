class Beverage extends CategoryProduct{
    private String nameBeverage;
    private Integer priceBeverage;

    Beverage(String nameProduct, String nameBeverage, Integer priceBeverage){
        super(nameProduct);
        this.nameBeverage = nameBeverage;
        this.priceBeverage = priceBeverage;
    }

    public String getNameBeverage() {
        return nameBeverage;
    }

    public void setNameBeverage(String nameBeverage) {
        this.nameBeverage = nameBeverage;
    }

    public Integer getPriceBeverage() {
        return priceBeverage;
    }

    public void setPriceBeverage(Integer priceBeverage) {
        this.priceBeverage = priceBeverage;
    }

    @Override
    public void displayProduct(){
        System.out.println("Kategori : " + getNameProduct());
        System.out.println("Nama Produk : " + getNameBeverage());
        System.out.println("Harga Produk : " + getPriceBeverage());
        System.out.println();
    }
}
