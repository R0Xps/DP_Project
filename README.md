# T-Shirt Shop System

## Project Requirements

The project requires applying several patterns: **Factory**, **Observer**, **Decorator**, and **Singleton**.

Assume that you were asked to design a software for a shop that produces T-shirts:

1. T-shirts come in different sizes; small, medium, and large.
2. Any T-shirt has a name, description:
   - `getDescription()` method that returns name and description.
   - `formSize()` method that depends on each type; just add print statement indicating the type.
3. These sizes differ based on the people from different regions; assume that the shop business is for Middle East, China, and Asia.
4. The T-shirt design depends on the size and the region.
5. The customer can order only one T-shirt.
6. After the customer orders a T-shirt, he/she can add one or multiple features to it such as:
   - Logo (assume that the shop has one logo type which is a bird).
   - Text (assume that the shop has one statement to print “nice day!”).
   - Red color, blue color.
7. The shop owner wants to be up to date when there is a change in the amount of sold products; number of sold items of small, medium, and large.
8. Test drive showing how a customer can order the following:
   - A person from China orders a blue medium T-shirt with bird logo.
   - A person from Middle East orders a red large T-shirt with Text.
9. Write a test code to show the shop owner can track sold items.
