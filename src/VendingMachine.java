/**
 * Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину.
 * Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
 */
public class VendingMachine {
    public static void main(String[] args) {

        Product product1 = new Product("Moba", "LaysIkra", 100, 150);

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Mira", "LaysKrab", 105, 150);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Moka", "LaysSmetana", 110, 150);
        System.out.println(product3.displayInfo());

        Product product4 = new Product("Mar", "LaysLichi", 120, 150);
        System.out.println(product4.displayInfo());
        }
    }
