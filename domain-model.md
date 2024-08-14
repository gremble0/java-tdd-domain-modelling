## Domain model Product class
| Variables      | Methods             | Scenario           | Outputs                         |
|----------------|---------------------|--------------------|---------------------------------|
| int fullPrice  |                     |                    |                                 | 
| float discount |                     |                    |                                 |
| String name    |                     |                    |                                 |
|                | `int getCost()`     | Method gets called | positive integer or 0           |
|                | `String toString()` | Method gets called | Detailed information about item | 

## Domain model CheckoutMachine class:
| Variables              | Methods                                       | Scenario            | Output                                        |
|------------------------|-----------------------------------------------|---------------------|-----------------------------------------------|
| `List<Product> basket` |                                               |                     |                                               |
|                        | `void addProduct(Product product)`            | User adds product   | Adds a single product to the basket           |
|                        | `void addProduct(Product product, int count)` | User adds products  | Adds how ever many products specified in call |
|                        | `boolean processPayment()`                    | Payment failed      | false                                         |
|                        |                                               | Payment succeeded   | true                                          |
|                        | `private void printReceipt()`                 | Method gets called  | Prints receipt to customer                    |
