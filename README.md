# Individual-Assignment-3
This is repository to store starter project for Assignment 3


## Objective

Learn how Inheritance and Polymorphism works in Java 

### Instructions
* In the object oriented General Store we have following Classes
	- Person
	- StoreEmployee
	- SalesAssociate
	- Manager
	- Janitor
	- FloorAssociate(assist customer and stock shelf's)
	- CartStacker
* Person, Manager, FloorAssociate and StoreEmployee classes are already provided in sample code. Build additional classes based on following inheritance hierarchy. 
* Each type of employee in the General Store extends at least a common base class (StoreEmployee). A specialized type of one of the Employee types already existing in the System will extend as appropriate.
* Write a specialized FloorAssoicate class called SalesAssociate to accompany other employees. SalesAssociate are experienced staff, they make 30% more money than a FloorAssociate and they get 1 additional vacation day.
* SalesAssociate have to fill out cash position report at the beginning and end of their daily work: that is they have a specialized method getCashPosition() which should return
```
Store location: Rutgers Campus, New Brunswick, NJ
Employee ID: E0001
Cash position: $$       // any random dollar amount: hardcoded or via an instance variable getter/setter
Time Stamp: <Current time stamp>
```
* Write a StoreEmployee class Janitor to accompany other employees. Janitor work twice as many hours (80 hours/week), they make $10,000 less than general employees i.e. 20K, they get half as much vacation (i.e 5 days), and they have an additional method named clean() that prints "Working for the General Store."
* Write a StoreEmployee class CartStacker to accompany other employees. CartStacker are regular staff, they make 5% more money than a regular employee, they get same vacation days as general employees, and they have to work 5 more hours than a regular employee. They have to fill out 3 vacation slips in order to get a vacation. So their getVacationForm() method should return “YellowYellowYellow”.
Note: If the parent class’s vacation slips color changes, it should also be reflected in this class.
* CartStacker’s  getTheCartsInOrder () method should return "Move-in! Move-in!” 
* Any changes to a base class should get reflected accordingly. (Example: Store employee-wide policy change to update Base Salary or vacation days or Store location for all the employees)
* Create MyStore.java file to test your code and put appropriate testing code for each objects

 
## Total Possible Points: 80

1.	Draw a basic inheritance diagram with Class name, variables and methods that shows the inheritance relationships between the above 7 classes – 10 points (Submit as pdf or jpeg on github)
2. Program runs as submitted - 5 points
3. Design SalesAssociate Class to meet the requirements as described above – 10 points
4. Design Janitor Class to meet the requirements as described above – 10 points
5. Design CartStacker Class to meet the requirements as described above – 10 points
6. Write a MyStore Class to invoke the behavior of the specific Employees using their instances as asked below:

  * Print the salary, hours and vacation form of a SalesAssociate. Also invoke SalesAssociate specific behavior method – 10 points
  * Print the salary, hours and vacation days of a Janitor. Also invoke Janitor specific behavior method – 10 points
  * Print the salary, hours and vacation days of a CartStacker. Also print the vacation form of the CartStacker making sure it satisfies the condition mentioned in the design of the CartStacker class – 10 points
7. Project is submitted on Github - 5 points
