Why Use Factory Method?
• 	Decouples object creation from usage
• 	Promotes flexibility and extensibility
• 	Avoids tight coupling to specific classes
Let’s say you’re building an app for a vehicle manufacturer. You want to create different types of vehicles—like Car and Motorcycle—but you don’t want your client code to know the exact class being instantiated.

The Factory Method lets you write code that works with interfaces, not concrete classes. This makes your code easier to maintain and extend—especially when new types of products are added.
Want to explore how this compares to the Abstract Factory pattern or see a real-world use case from Java libraries?