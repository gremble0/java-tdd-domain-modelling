## Domain model Product class
| Variables      | Methods             | Scenario           | Outputs                         |
|----------------|---------------------|--------------------|---------------------------------|
| int fullPrice  |                     |                    |                                 | 
| float discount |                     |                    |                                 |
| String name    |                     |                    |                                 |
|                | `int getCost()`     | Method gets called | positive integer or 0           |
|                | `String toString()` | Method gets called | Detailed information about item | 

## Domain model CheckoutMachine class:
| Methods                                                    | Scenario           | Output                     |
|------------------------------------------------------------|--------------------|----------------------------|
| `static boolean processPayment(List<StoreItem> basket)`    | Payment failed     | false                      |
|                                                            | Payment succeeded  | true                       |
| `private static void printReceipt(List<StoreItem> basket)` | Method gets called | Prints receipt to customer |
