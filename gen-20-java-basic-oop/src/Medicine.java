class Medicine extends CategoryProduct{
    private String nameMedicine;
    private Integer priceMedicine;

    Medicine(String nameProduct, String nameMedicine, Integer priceMedicine){
        super(nameProduct);
        this.nameMedicine = nameMedicine;
        this.priceMedicine = priceMedicine;
    }

    public String getNameMedicine() {
        return nameMedicine;
    }

    public void setNameMedicine(String nameMedicine) {
        this.nameMedicine = nameMedicine;
    }

    public Integer getPriceMedicine() {
        return priceMedicine;
    }

    public void setPriceMedicine(Integer priceMedicine) {
        this.priceMedicine = priceMedicine;
    }

    @Override
    public void displayProduct(){
        System.out.println("Kategori : " + getNameProduct());
        System.out.println("Nama Produk : " + getNameMedicine());
        System.out.println("Harga Produk : " + getPriceMedicine());
        System.out.println();
    }
}
