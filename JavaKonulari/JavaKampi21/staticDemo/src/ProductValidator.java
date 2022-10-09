public class ProductValidator {


    //* validator bir urunu kaydederken, guncellerken kurallara uygun olup olmadigini kontrol etmek icin kullanilir..
    public boolean isValid(Product product) {

        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
