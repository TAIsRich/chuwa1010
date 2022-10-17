1. Writeup Example code to demonstrate the three found mental concepts of OOP. (reference Code Demo repo as example)

   \1. Encapsulation; 2. Polymorphism; 3. Inheritance;

   ***Encapsulation*** in OOP refers to binding the data and the methods to manipulate that data together in a single class.

   ***Example code of Encapsulation:***

   `public class Person {`

   `private int age;`

   `public int getAge() {`

   `return age;`

   `}`

   `public int setAge(int age) {`

   `this.age = age;`

   `}`

   `}`

   ***Ploymorphism*** in OOP refers to the same object exhibiting difference forms and behaviors, including both ***Static Polymorphism*** (compile time) and ***Dynamic Polymorphism*** (run time).

   ```java
   public class Shape {
       public double getArea() {
           return 0;
       }
   }
   
   class Rectangle extends Shape { 
   
       private double width;
       private double height;
   
       public Rectangle(double width, double heigh) {
           this.width = width;
           this.height = heigh;
       }
   
       @Override
       public double getArea() {
           return width * height;
       }
   
   }
   
   
   // A Circle is a Shape with a specific radius
   class Circle extends Shape {
       private double radius;
   
       public Circle(double radius) {
           this.radius = radius;
       }
   
       @Override
       public double getArea() {
           return 3.14 * radius * radius;
       }
   
   }
   ```

   ***Inheritance*** in OOP refers to create a new class from an existing class. The new class is a specialized version of the existing class as it inherits all the ***<u>non-private</u>*** fields and methods of the existing class.

   ```java
   public class Shape {
       public double getArea() {
           return 0;
       }
   }
   
   //class Rectangle inherits from class Shape
   class Rectangle extends Shape { 
   	private double width;
   	private double height;
   
   	public Rectangle(double width, double heigh) {
       this.width = width;
       this.height = heigh;
   	}
   
   	@Override
   	public double getArea() {
       return width * height;
   	}
   }
   ```

   

   

2. What is **wrapper class** in Java and Why we need wrapper class?

   A **Wrapper class** is a class which contains the **primitive data types** (**int, char, short, byte, etc)**. In other words, wrapper classes provide a way to use **primitive data types** **(int, char, short, byte, etc) as objects**. These wrapper classes come under **java.util package**.

   We need it because:

   a. Wrapper Class will **convert primitive data types into objects**. The objects are necessary if we wish to modify the arguments passed into the method (because primitive types are **passed by value**).

   b. The classes in **java.util package** handles only objects and hence **wrapper classes** help in this case also.

   c. **Data** **structures** in the Collection framework such as **ArrayList and Vector** store only the objects (reference types) and not the **primitive types.**

   d. The object is needed to support **synchronization** in **multithreading**.

   

3. What is the difference between **HashMap** and **HashTable**?

   | HashMap                                                      | HashTable                                                    |
   | ------------------------------------------------------------ | ------------------------------------------------------------ |
   | No method is synchronized.                                   | Every method is synchronized.                                |
   | Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. | Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. |
   | Multiple threads can operate simultaneously and hence hashmap’s object is not thread-safe. | It increases the waiting time of the thread and hence performance is low. |
   | Null is allowed for both key and value.                      | Null is not allowed for both key and value. Otherwise, we will get a null pointer exception. |
   | It is introduced in the 1.2 version.                         | It is introduced in the 1.2 version.                         |
   | It is non-legacy.                                            | It is a legacy.                                              |

   

4. What is **String pool** in Java and why we need String pool?

   *String Pool in Java is a special storage space in Heap memory where string literals are stored.* It is also known by the names - **String Constant Pool** or **String Intern Pool**. Whenever a string literal is created, the JVM first checks the String Constant Pool before creating a new String object corresponding to it.

   We need String Pool because it will efficiently save space of heat memory when we create n numbers of String objects with the same values.

   

5. What is Java **garbage collection**?

   Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.

   

6. What are **access modifiers** and their scopes in Java?

   | Default   | declarations are visible only within the package          |
   | --------- | --------------------------------------------------------- |
   | Private   | declarations are visible within the class only            |
   | Protected | declarations are visible within the package or subclasses |
   | Public    | declarations are visible everywhere                       |

   

7. What is **final** keyword? (Filed,Method,Class)?

   a) Define constants

   b) define methods - prevent to be overrided

   c) define class - prevent to be inherited and make class immutable

   

8. What is **static** keyword? (Filed,Method,Class). When do we usually use it?

   a) static variable and static block

   b) static methods - can directly call using class name

   

9. What is the differences between **overriding** and **overloading**?

   Overriding is to add specifc method in the child class, and happen in run time, and overloading is different num of arguments, different type arguments but same method name in the father class and happen in compile time.

   

10. What is the differences between **super** and **this**?

    The ***super*** keyword refers to superclass (parent) objects.

    The ***this*** keyword refers to the variables of current object, and it could also call other constructors in this constructor, but it must be called at the beginning.

    

11. What is the Java **load sequence**?

    The ***ClassLoader Delegation Hierarchy Model*** always functions in the order Application ClassLoader->Extension ClassLoader->Bootstrap ClassLoader. The Bootstrap ClassLoader is always given the higher priority, next is Extension ClassLoader and then Application ClassLoader.

    

12. What is **Polymorphism** ? And how Java implements it ?

    ***Ploymorphism*** in OOP refers to the same object exhibiting difference forms and behaviors, including both ***Static Polymorphism*** (compile time) and ***Dynamic Polymorphism*** (run time).

    

13. What is **Encapsulation** ? How Java implements it? And why we need encapsulation?

    ***Encapsulation*** in OOP refers to binding the data and the methods to manipulate that data together in a single class. Encapsulation in Java is mostly useful to hide the data. Or in other words, to decide about the access given to data as to who can access it, and who cannot.

    

14. What is **Interface** and what is **abstract** class? What are the differences between them?

​	***Interface*** is a completely "**abstract class**" that is used to group related methods with empty bodies and 	it can not be initiated. One class could implement mutiple interfaces.

​	***Abstract***  class is a restricted class that cannot be used to create objects (to access it, it must be inherited 	from another class). Child classes **must implement all the abstract methods** declared in the parent   	abstract class.



15. design a parking lot (put the code to **codingQuestions**/coding1 folder, )

\1. If you have no ability to design it, please find the solution in internet, then understand it, and re-type it.(**Do NOT just copy and paste**)

``

```java
// enum type for Vehicle
2enum VehicleSize {
3	Motorcycle,
4	Compact,
5	Large,
6}
7
8//abstract Vehicle class
9abstract class Vehicle {
10    // Write your code here
11	protected int spotsNeeded;
12	protected VehicleSize size;
13	protected String licensePlate;  // id for a vehicle
14
15	protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>(); // id for parking where may occupy multi
16
17	public int getSpotsNeeded() {
18		return spotsNeeded;
19	}
20	
21	public VehicleSize getSize() {
22		return size;
23	}
24
25	/* Park vehicle in this spot (among others, potentially) */
26	public void parkInSpot(ParkingSpot spot) {
27		parkingSpots.add(spot);
28	}
29	
30	/* Remove car from spot, and notify spot that it's gone */
31	public void clearSpots() {
32		for (int i = 0; i < parkingSpots.size(); i++) {
33			parkingSpots.get(i).removeVehicle();
34		}
35		parkingSpots.clear();
36	}
37	//this need to be implement in subclass
38	public abstract boolean canFitInSpot(ParkingSpot spot);
39    public abstract void print(); 
40}
41
42class Motorcycle extends Vehicle {
43    // Write your code here
44	public Motorcycle() {
45		spotsNeeded = 1;
46		size = VehicleSize.Motorcycle;
47	}
48	
49	public boolean canFitInSpot(ParkingSpot spot) {
50		return true;
51	}
52    
53    public void print() {  
54        System.out.print("M");  
55    }
56}
57
58class Car extends Vehicle {
59    // Write your code here
60	public Car() {
61		spotsNeeded = 1;
62		size = VehicleSize.Compact;
63	}
64	
65	public boolean canFitInSpot(ParkingSpot spot) {
66		return spot.getSize() == VehicleSize.Large || spot.getSize() == VehicleSize.Compact;
67	}
68
69    public void print() {  
70        System.out.print("C");  
71    } 
72}
73
74class Bus extends Vehicle {
75    // Write your code here
76	public Bus() {
77		spotsNeeded = 5;
78		size = VehicleSize.Large;
79	}
80
81	public boolean canFitInSpot(ParkingSpot spot) {
82		return spot.getSize() == VehicleSize.Large;
83	}
84
85    public void print() {  
86        System.out.print("B");  
87    } 
88}
89
90class ParkingSpot {
91    // Write your code here
92	private Vehicle vehicle;
93	private VehicleSize spotSize;
94	private int row;
95	private int spotNumber;
96	private Level level;
97
98	public ParkingSpot(Level lvl, int r, int n, VehicleSize sz) {
99		level = lvl;
100		row = r;
101		spotNumber = n;
102		spotSize = sz;
103	}
104	
105	public boolean isAvailable() {
106		return vehicle == null;
107	}
108	/* Checks if the spot is big enough for the vehicle (and is available). This compares
109	 * the SIZE only. It does not check if it has enough spots. */
110	public boolean canFitVehicle(Vehicle vehicle) {
111		return isAvailable() && vehicle.canFitInSpot(this);
112	}
113	/* Park vehicle in this spot. */
114	public boolean park(Vehicle v) {
115		if (!canFitVehicle(v)) {
116			return false;
117		}
118		vehicle = v;
119		vehicle.parkInSpot(this);
120		return true;
121	}
122	/* Remove vehicle from spot, and notify level that a new spot is available */
123	public void removeVehicle() {
124		level.spotFreed();
125		vehicle = null;
126	}
127	
128	public int getRow() {
129		return row;
130	}
131	
132	public int getSpotNumber() {
133		return spotNumber;
134	}
135	
136	public VehicleSize getSize() {
137		return spotSize;
138	}
139
140    public void print() {  
141        if (vehicle == null) {  
142            if (spotSize == VehicleSize.Compact) {  
143                System.out.print("c");  
144            } else if (spotSize == VehicleSize.Large) {  
145                System.out.print("l");  
146            } else if (spotSize == VehicleSize.Motorcycle) {  
147                System.out.print("m");  
148            }  
149        } else {  
150            vehicle.print();  
151        }  
152    }
153}
154
155/* Represents a level in a parking garage */
156class Level {
157    // Write your code here
158	private int floor;
159	private ParkingSpot[] spots;
160	private int availableSpots = 0; // number of free spots
161	private int SPOTS_PER_ROW;
162
163
164	public Level(int flr, int num_rows, int spots_per_row) {
165		floor = flr;
166        int SPOTS_PER_ROW = spots_per_row;
167        int numberSpots  = 0;
168		spots = new ParkingSpot[num_rows * spots_per_row];
169
170		//init size for each spot in array spots
171        for (int row = 0; row < num_rows; ++row) {
172            for (int spot = 0; spot < spots_per_row / 4; ++spot) {
173                VehicleSize sz = VehicleSize.Motorcycle;
174                spots[numberSpots] = new ParkingSpot(this, row, numberSpots, sz);
175                numberSpots ++;
176            }
177            for (int spot = spots_per_row / 4; spot < spots_per_row / 4 * 3; ++spot) {
178                VehicleSize sz = VehicleSize.Compact;
179                spots[numberSpots] = new ParkingSpot(this, row, numberSpots, sz);
180                numberSpots ++;
181            }
182            for (int spot = spots_per_row / 4 * 3; spot < spots_per_row; ++spot) {
183                VehicleSize sz = VehicleSize.Large;
184                spots[numberSpots] = new ParkingSpot(this, row, numberSpots, sz);
185                numberSpots ++;
186            }
187        }
188
189        availableSpots = numberSpots;
190	}
191
192	/* Try to find a place to park this vehicle. Return false if failed. */
193	public boolean parkVehicle(Vehicle vehicle) {
194		if (availableSpots() < vehicle.getSpotsNeeded()) {
195			return false; // no enough spots
196		}
197		int spotNumber = findAvailableSpots(vehicle);
198		if(spotNumber < 0) {
199			return false;
200		}
201		return parkStartingAtSpot(spotNumber, vehicle);
202	}
203
204	/* find a spot to park this vehicle. Return index of spot, or -1 on failure. */
205	private int findAvailableSpots(Vehicle vehicle) {
206		int spotsNeeded = vehicle.getSpotsNeeded();
207		int lastRow = -1;
208		int spotsFound = 0;
209
210		for(int i = 0; i < spots.length; i++){
211			ParkingSpot spot = spots[i];
212			if(lastRow != spot.getRow()){
213				spotsFound = 0;
214				lastRow = spot.getRow();
215			}
216			if(spot.canFitVehicle(vehicle)){
217				spotsFound++;
218			}else{
219				spotsFound = 0;
220			}
221			if(spotsFound == spotsNeeded){
222				return i - (spotsNeeded - 1); // index of spot
223			}
224		}
225		return -1;
226	}
227
228	/* Park a vehicle starting at the spot spotNumber, and continuing until vehicle.spotsNeeded. */
229	private boolean parkStartingAtSpot(int spotNumber, Vehicle vehicle) {
230		vehicle.clearSpots();
231
232		boolean success = true;
233		
234		for (int i = spotNumber; i < spotNumber + vehicle.spotsNeeded; i++) {
235			 success &= spots[i].park(vehicle);
236		}
237		
238		availableSpots -= vehicle.spotsNeeded;
239		return success;
240	}
241
242	/* When a car was removed from the spot, increment availableSpots */
243	public void spotFreed() {
244		availableSpots++;
245	}
246
247	public int availableSpots() {
248		return availableSpots;
249	}
250
251    public void print() {  
252        int lastRow = -1;  
253        for (int i = 0; i < spots.length; i++) {  
254            ParkingSpot spot = spots[i];  
255            if (spot.getRow() != lastRow) {  
256                System.out.print("  ");  
257                lastRow = spot.getRow();  
258            }  
259            spot.print();  
260        }  
261    }
262}
263
264public class ParkingLot {
265	private Level[] levels;
266	private int NUM_LEVELS;
267	
268    // @param n number of leves
269    // @param num_rows  each level has num_rows rows of spots
270    // @param spots_per_row each row has spots_per_row spots
271	public ParkingLot(int n, int num_rows, int spots_per_row) {
272        // Write your code here
273        NUM_LEVELS = n;
274		levels = new Level[NUM_LEVELS];
275		for (int i = 0; i < NUM_LEVELS; i++) {
276			levels[i] = new Level(i, num_rows, spots_per_row);
277		}
278	}
279
280	// Park the vehicle in a spot (or multiple spots)
281    // Return false if failed
282	public boolean parkVehicle(Vehicle vehicle) {
283        // Write your code here
284		for (int i = 0; i < levels.length; i++) {
285			if (levels[i].parkVehicle(vehicle)) {
286				return true;
287			}
288		}
289		return false;
290	}
291
292    // unPark the vehicle
293	public void unParkVehicle(Vehicle vehicle) {
294        // Write your code here
295		vehicle.clearSpots();
296	}
297
298    public void print() {  
299        for (int i = 0; i < levels.length; i++) {  
300            System.out.print("Level" + i + ": ");  
301            levels[i].print();
302            System.out.println("");  
303        }  
304        System.out.println("");  
305    } 
306}
```



16. What are Queue interface implementations and what are the differences and when to use what?

The ***Queue interface*** is present in [java.util](https://www.geeksforgeeks.org/java-util-package-java/) package and extends the [Collection interface](https://www.geeksforgeeks.org/collections-in-java-2/) is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the **FIFO** or the First-In-First-Out principle.

a) **Adding Elements:** In order to add an element in a queue, we can use the [add() method](https://www.geeksforgeeks.org/queue-add-method-in-java/). The insertion order is not retained in the PriorityQueue. The elements are stored based on the priority order which is ascending by default. 

b) **Removing Elements:** In order to remove an element from a queue, we can use the [remove() method.](https://www.geeksforgeeks.org/queue-remove-method-in-java/) If there are multiple such objects, then the first occurrence of the object is removed. Apart from that, poll() method is also used to remove the head and return it. 

c) **Iterating the Queue:** There are multiple ways to iterate through the Queue. The most famous way is converting the queue to the array and traversing using the for loop. However, the queue also has an inbuilt iterator which can be used to iterate through the queue. 

URL:https://www.geeksforgeeks.org/queue-interface-java/