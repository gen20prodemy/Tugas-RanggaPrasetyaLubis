class CategoryProduct {
    private String nameProduct;

    CategoryProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void displayProduct(){
        System.out.println("Kategori : " + getNameProduct());
    }

}
