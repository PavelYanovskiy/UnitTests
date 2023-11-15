package shopping_cart;

import java.util.List;

public class Shop {
     // Список продуктов в магазине
     private final List<Product> productsShop;

     // При создании магазина нужно передать ему список продуктов
     public Shop(List<Product> productsShop) {
         this.productsShop = productsShop;
     }
 
     // Метод для получения текущего списка продуктов
     /**
     * @return
     */
    public List<Product> getProductsShop() {
         return productsShop;
     }

    /**
     * @param storeItems
     */
    public Shop(List<Product> storeItems) {
        productsShop = storeItems;
    }

    public List<Product> getProductsShop() {
        return null;
    }
    
}
