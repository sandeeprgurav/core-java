package com.ocp;

public class Notes2 {
	/*
	 * https://books.google.com/books?id=yHhlDgAAQBAJ&pg=PA338&lpg=PA338&dq=Which+
	 * statements+about+executing+the+following+TicketTaker+application+multiple+
	 * times+are+true?&source=bl&ots=vP3Tq6gTKm&sig=
	 * ACfU3U00HQODLWpe4445kCODRg5r31fJDQ&hl=en&sa=X&ved=
	 * 2ahUKEwi3pvWOusfnAhUMq1kKHbuCAnQQ6AEwAHoECAcQAQ#v=onepage&q=Which%
	 * 20statements%20about%20executing%20the%20following%20TicketTaker%
	 * 20application%20multiple%20times%20are%20true%3F&f=false
	 * 
	 * # Which of the following statements about inheritance and object composition
	 * are correct? 1.Object composition requires a class variable to be declared
	 * public or accessible from a public method to be used by a class in a
	 * different package.| 2.Inheritance supports access to protected variables. 3.
	 * Object composition tends to promote greater code reuse than inheritance.
	 * 
	 * Writable : Compilation fails due to an error at line n3.
	 * 
	 * For which values of path inserted on the blank line would it be possible for
	 * the following code to output Success? Path path = ____________________;
	 * if(Files.isDirectory(path)) System.out.println(Files.deleteIfExists(path) ?
	 * "Success": "Try Again"); 1. path refers to a symbolic link in the file
	 * system. 2. path refers to an empty directory in the file system.
	 * 
	 * Which two statements are true for a two-dimensional array of primitive data
	 * type? 1. All methods of the class object may be invoked on the
	 * two-dimensional array. 2. At the declaration time, the number of elements of
	 * the array in each dimension must be specified.
	 * 
	 * * Which of the following can we add after line 5 for the code to run without
	 * error and not produce any output? 4: Longb Stream ls = LongStream.of(1, 2,
	 * 3); 5: Optional Long opt = ls.map(n -> n * 10).filter(n -> n <
	 * 5).findFirst(); ==>> 1. if (opt.isPresent())
	 * System.out.println(opt.getAsLong()); 2. opt.ifPresent(System.out::println)
	 * 
	 * 	 * What is the output of the following code snippet? Assume that the current
	 * directory is the root path. Path p1 = Paths.get("./found/../keys"); Path p2 =
	 * Paths.get("/lost/blue.txt"); System.out.println(p1.resolve(p2));
	 * System.out.println(p2.resolve(p1)); ==>> /lost/blue.txt
	 * /lost/blue.txt/./found/../keys
	 * 
	 */
}
