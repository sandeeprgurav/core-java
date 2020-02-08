package com.memoryManagement;

public class Notes {
	/*
	 * Q1. What Does the Statement “Memory Is Managed in Java” Mean? Memory is the
	 * key resource an application requires to run effectively and like any
	 * resource, it is scarce. As such, its allocation and deallocation to and from
	 * applications or different parts of an application require a lot of care and
	 * consideration.
	 * 
	 * However, in Java, a developer does not need to explicitly allocate and
	 * deallocate memory – the JVM and more specifically the Garbage Collector – has
	 * the duty of handling memory allocation so that the developer doesn't have to.
	 * 
	 * This is contrary to what happens in languages like C where a programmer has
	 * direct access to memory and literally references memory cells in his code,
	 * creating a lot of room for memory leaks.
	 * 
	 * Q2. What Is Garbage Collection and What Are Its Advantages? Garbage
	 * collection is the process of looking at heap memory, identifying which
	 * objects are in use and which are not, and deleting the unused objects.
	 * 
	 * An in-use object, or a referenced object, means that some part of your
	 * program still maintains a pointer to that object. An unused object, or
	 * unreferenced object, is no longer referenced by any part of your program. So
	 * the memory used by an unreferenced object can be reclaimed.
	 * 
	 * The biggest advantage of garbage collection is that it removes the burden of
	 * manual memory allocation/deallocation from us so that we can focus on solving
	 * the problem at hand.
	 * 
	 * Q3. Are There Any Disadvantages of Garbage Collection? Yes. Whenever the
	 * garbage collector runs, it has an effect on the application's performance.
	 * This is because all other threads in the application have to be stopped to
	 * allow the garbage collector thread to effectively do its work.
	 * 
	 * Depending on the requirements of the application, this can be a real problem
	 * that is unacceptable by the client. However, this problem can be greatly
	 * reduced or even eliminated through skillful optimization and garbage
	 * collector tuning and using different GC algorithms.
	 * 
	 * Q4. What Is the Meaning of the Term “Stop-The-World”? When the garbage
	 * collector thread is running, other threads are stopped, meaning the
	 * application is stopped momentarily. This is analogous to house cleaning or
	 * fumigation where occupants are denied access until the process is complete.
	 * 
	 * Q5. What Are Stack and Heap? What Is Stored in Each of These Memory
	 * Structures, and How Are They Interrelated? The stack is a part of memory that
	 * contains information about nested method calls down to the current position
	 * in the program. It also contains all local variables and references to
	 * objects on the heap defined in currently executing methods.
	 * 
	 * Q6. What Is Generational Garbage Collection and What Makes It a Popular
	 * Garbage Collection Approach? Generational garbage collection can be loosely
	 * defined as the strategy used by the garbage collector where the heap is
	 * divided into a number of sections called generations, each of which will hold
	 * objects according to their “age” on the heap.
	 * 
	 * Whenever the garbage collector is running, the first step in the process is
	 * called marking. This is where the garbage collector identifies which pieces
	 * of memory are in use and which are not. This can be a very time-consuming
	 * process if all objects in a system must be scanned.
	 * 
	 * As more and more objects are allocated, the list of objects grows and grows
	 * leading to longer and longer garbage collection time. However, empirical
	 * analysis of applications has shown that most objects are short-lived.
	 * 
	 * With generational garbage collection, objects are grouped according to their
	 * “age” in terms of how many garbage collection cycles they have survived. This
	 * way, the bulk of the work spread across various minor and major collection
	 * cycles.
	 * 
	 * Today, almost all garbage collectors are generational. This strategy is so
	 * popular because, over time, it has proven to be the optimal solution. This
	 * structure allows the runtime to return from the method knowing the address
	 * whence it was called, and also clear all local variables after exiting the
	 * method. Every thread has its own stack.
	 * 
	 * The heap is a large bulk of memory intended for allocation of objects. When
	 * you create an object with the new keyword, it gets allocated on the heap.
	 * However, the reference to this object lives on the stack.
	 * 
	 * 
	 * Q8. When Does an Object Become Eligible for Garbage Collection? Describe How
	 * the Gc Collects an Eligible Object? An object becomes eligible for Garbage
	 * collection or GC if it is not reachable from any live threads or by any
	 * static references.
	 * 
	 * The most straightforward case of an object becoming eligible for garbage
	 * collection is if all its references are null. Cyclic dependencies without any
	 * live external reference are also eligible for GC. So if object A references
	 * object B and object B references Object A and they don't have any other live
	 * reference then both Objects A and B will be eligible for Garbage collection.
	 * 
	 * Another obvious case is when a parent object is set to null. When a kitchen
	 * object internally references a fridge object and a sink object, and the
	 * kitchen object is set to null, both fridge and sink will become eligible for
	 * garbage collection alongside their parent, kitchen.
	 * 
	 * 
	 * Q9. How Do You Trigger Garbage Collection from Java Code? You, as Java
	 * programmer, can not force garbage collection in Java; it will only trigger if
	 * JVM thinks it needs a garbage collection based on Java heap size.
	 * 
	 * Before removing an object from memory garbage collection thread invokes
	 * finalize()method of that object and gives an opportunity to perform any sort
	 * of cleanup required. You can also invoke this method of an object code,
	 * however, there is no guarantee that garbage collection will occur when you
	 * call this method.
	 * 
	 * Additionally, there are methods like System.gc() and Runtime.gc() which is
	 * used to send request of Garbage collection to JVM but it’s not guaranteed
	 * that garbage collection will happen.
	 * 
	 * Q10. What Happens When There Is Not Enough Heap Space to Accommodate Storage
	 * of New Objects? If there is no memory space for creating a new object in
	 * Heap, Java Virtual Machine throws OutOfMemoryError or more specifically
	 * java.lang.OutOfMemoryError heap space.
	 */
}
