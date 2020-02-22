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
	 * * What is the output of the following code snippet? Assume that the current
	 * directory is the root path. Path p1 = Paths.get("./found/../keys"); Path p2 =
	 * Paths.get("/lost/blue.txt"); System.out.println(p1.resolve(p2));
	 * System.out.println(p2.resolve(p1)); ==>> /lost/blue.txt
	 * /lost/blue.txt/./found/../keys
	 * 
	 * * Assume /kang exists as a symbolic link to the directory /mammal/kangaroo
	 * within the file system. Which of the following statements are correct about
	 * this code snippet? Path path = Paths.get("/kang"); if(Files.isDirectory(path)
	 * && Files.isSymbolicLink(path)) Files.createDirectory(path.resolve("joey"));
	 * ==>> 1. If the code creates a directory, it will be reachable at /kang/joey.
	 * 2. If the code creates a directory, it will be reachable at
	 * /mammal/kangaroo/joey. 3.A new directory will be created only if
	 * /mammal/kangaroo exists.
	 * 
	 * * class RateOfInterest { public static void main (String[] args) { int
	 * rateOfInterest = 0; String accountType = "LOAN"; switch (accountType) { case
	 * "RD"; rateOfInterest = 5; break; case "FD"; rateOfInterest = 10; break;
	 * default: assert false: "No interest for this account"; //line n1 }
	 * System.out.println ("Rate of interest:" + rateOfInterest); } } ==>> An
	 * AssertionError is thrown
	 * 
	 * Which of the following is not a built-in stream in Java? ==>> System.info
	 * 
	 * Which statement about parallel streams is correct? ==>> All streams can be
	 * converted to a parallel stream.
	 * 
	 * Content of the new.txt : ABCD | FileReader fr = new FileReader("new.txt");
	 * System.out.println(fr.read()); fr.close(); ==>> 65 // fr.read() reads first
	 * character
	 * 
	 * Which is true the regarding the java.nio.file.Path interface? ==>> The
	 * interface extends the WatchService interface.
	 * 
	 * Which statements are true about the following date/times? (Choose two.)
	 * 2017-04-01T17:00+03:00[Africa/Nairobi] 2017-04-01T10:00-05:00[America/Panama]
	 * ==>> 1. The two date/times are one hour apart. 2. The first date/time is
	 * earlier.
	 * 
	 * What collector turns the stream at left to the Map at right? ==>>
	 * partitioningBy()
	 * 
	 * Which of the following concurrent collections is sorted? ==>>
	 * ConcurrentSkipListMap
	 * 
	 * The Files.__________ method returns a List, while the Files.__________ method
	 * returns a Stream. ==>> readAllLines(), lines()
	 * 
	 * mystery=bag type=paper System.out.print(props.getProperty("mystery", "?"));
	 * System.out.print(" "); System.out.print(props.getProperty("more", "?")); ==>>
	 * bag ?
	 * 
	 * * public class HideAndSeek { public static void main(String[] args) {
	 * Stream<Boolean> hide = Stream.of(true, false, true); Predicate<Boolean> pred
	 * = b ‐> b; boolean found = hide.filter(pred).__________(pred);
	 * System.out.println(found); } } ==>> Both anyMatch() and allMatch()
	 * 
	 * Which values when inserted into the blank would allow the code to compile? 1:
	 * Console console = System.console(); 2: String color =
	 * console.readLine("What is your favorite color? "); 3: console. _____
	 * ("Your favorite color is "+color); ==>> 1. printf 2. format 3.
	 * writer().println
	 * 
	 * RecursiveTask<Integer> > invokeAll ==>> 1. Results must be retrieved from the
	 * newly created MyTask instances and combined. 2. The compute() method must be
	 * changed to return an Integer result.
	 * 
	 * Which java.io class does not have a complementary input stream? ==>>
	 * PrintWriter
	 * 
	 * Which statements describe a java.io stream class and cannot be applied to a
	 * java.util.stream.Stream class? ==>> 1. Some classes contain a flush() method.
	 * 2. Can be used with try-with-resources statement 3. Includes a class or set
	 * of classes used solely for working with character data
	 * 
	 * Which pair of statements is true when requesting a ResultSet to be both
	 * scroll sensitive and updatable? 1. The scroll sensitive option is passed as a
	 * parameter before the updatable parameter. 2. The updatable option is passed
	 * as a parameter before the scroll sensitive parameter. 3. If these options are
	 * not available, the database driver returns a ResultSet with different
	 * options. 4. If these options are not available, the database driver throws a
	 * SQLException. ==>> II III
	 * 
	 * * Which of the following statements about InputStream and Reader are correct?
	 * =>> 1. They can both be used to read character data. 2. They are both
	 * abstract classes
	 * 
	 * * Which of the following statements about polymorphism are true? ==>> 1. If a
	 * method takes a class that is the superclass of three different object
	 * references, then any of those objects may be passed as a parameter to the
	 * method. 2.A reference to an object may be cast to a superclass of the object
	 * without an explicit cast.
	 * 
	 * * Which of the following are properties of classes that are properly
	 * encapsulated as a JavaBean? ==>> 1. boolean instance variables are accessed
	 * with is or get 2. All instances variables are marked private.
	 * 
	 * Three of the four following options make up the requirements for performing a
	 * parallel reduction with the collect() method, which takes a Collector
	 * argument. Choose the one that is not a requirement. ==>> The elements of the
	 * stream implement the Comparable interface.
	 * 
	 * Which of the following stream classes are high-level? ==>> 1. PrintStream 2.
	 * ObjectOutputStream 3. ObjectInputStream 4. PrintWriter
	 * 
	 */
}
