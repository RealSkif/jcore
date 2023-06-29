public class Main {
    public static void main(String[] args) {
        Buyer[] buyers = {new Buyer("Mike", 20, "+791233211234"),
                new Buyer("John", 39, "+791233213456")};
        Product[] products = {new Product("Something1", 23.33),
                new Product("Something2", 13.33),
                new Product("Something3", 28.53),
                new Product("Something4", 4.03),
                new Product("Something5", 123.33),};
        Order[] orders = new Order[5];
        try {
            orders[0] = makePurchase(buyers[0], products[0], 2);
            orders[1] = makePurchase(buyers[1], products[2], -1);
            orders[2] = makePurchase(buyers[0], products[6], 1);
            orders[3] = makePurchase(buyers[1], products[4], 10);
            orders[4] = makePurchase(buyers[2], products[1], 3);
        } catch (CustomerException | ProductException | AmountException e) {
            System.out.println("Ошибка при совершении покупки: " + e.getMessage());
        } finally {
            int totalPurchases = 0;
            for (Order order : orders) {
                if (order != null) {
                    totalPurchases += order.getQuantity();
                }
            }
            System.out.println("Итоговое количество совершенных покупок: " + totalPurchases);
        }
    }

    public static Order makePurchase(Buyer buyer, Product product, int quantity)
            throws CustomerException, ProductException, AmountException {
        if (buyer == null) {
            throw new CustomerException("Несуществующий покупатель.");
        }

        if (product == null) {
            throw new ProductException("Несуществующий товар.");
        }

        if (quantity <= 0 || quantity > 100) {
            throw new AmountException("Неверное количество товара.");
        }

        return new Order(buyer, product, quantity);
    }
}
