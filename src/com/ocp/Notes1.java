package com.ocp;

import java.util.Map;
import java.util.Properties;

public class Notes1 {

	/*
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
	 * 
	 * What is true about the following code? The resources are closed in the wrong
	 * order. | If using a JDBC 3.0 driver, this code throws an exception.
	 * 
	 * that March 13, 2016 >> LocalDate.of(2016, 11, 6) , LocalDate.of(2016, 11, 7),
	 * LocalDate.of(2016, 3, 13)
	 * 
	 * Which two statements are true for a two-dimensional array of primitive data
	 * type? 1. All methods of the class object may be invoked on the
	 * two-dimensional array. 2. At the declaration time, the number of elements of
	 * the array in each dimension must be specified.
	 * 
	 * Which of the following are valid lambda expressions? 1. () -> "" | 2. (Camel
	 * c) -> {return;}
	 * 
	 * Which of the following can we add after line 5 for the code to run without
	 * error and not produce any output? 4: Longb Stream ls = LongStream.of(1, 2,
	 * 3); 5: Optional Long opt = ls.map(n -> n * 10).filter(n -> n <
	 * 5).findFirst(); ==>> 1. if (opt.isPresent())
	 * System.out.println(opt.getAsLong()); 2. opt.ifPresent(System.out::println)
	 * 
	 * What is the output of the following code snippet? Assume that the current
	 * directory is the root path. Path p1 = Paths.get("./found/../keys"); Path p2 =
	 * Paths.get("/lost/blue.txt"); System.out.println(p1.resolve(p2));
	 * System.out.println(p2.resolve(p1)); ==>> /lost/blue.txt
	 * /lost/blue.txt/./found/../keys
	 * 
	 * Which of the following is most likely to be caused by a race condition?
	 * ==>>An int variable incorrectly reporting the number of times an operation
	 * was performed
	 * 
	 * Which of the following is a valid functional interface in the
	 * java.util.function package? =>>ToDoubleBiFunction
	 * 
	 * Which statement best describes how a class that implements the AutoCloseable
	 * interface should be written? ==>>The close() method should avoid modifying
	 * data after it has been run once.
	 * 
	 * Which of the following is a high-level stream class that can only be used to
	 * wrap a low-level stream?==>> ObjectInputStream
	 * 
	 * Which of the answer choices is true given the following?
	 * 2017-01-07T10:00-07:00[America/Phoenix]
	 * 2017-01-07T08:00-08:00[America/Vancouver] ==>> The first date/time is one
	 * hour later than the second.
	 * 
	 * Fill in the blanks: A(n) ____________and a(n) ____________can define static
	 * methods. ==>> enum, static inner class
	 * 
	 * What statement about the following code is true? Atomic Long value1 = new
	 * Atomic Long(0); final long[] value2 = {0}; IntStream.iterate(1, i ->
	 * 1).limit(100).parallel() .forEach(i -> value1.incrementAndGet());
	 * IntStream.iterate(1, i -> 1).limit(100).parallel() .forEach(i ->
	 * ++value2[0]); System.out.println(value1+" "+value2[0]) ==>> The output cannot
	 * be determined ahead of time.
	 * 
	 * Why shouldn’t every class be marked Serializable? ==>> 1. Classes that store
	 * most of their data in static fields would not be easily serialized. 2. The
	 * data of some classes cannot be easily serialized, such as those managing
	 * threads or processes.
	 * 
	 * Which statement about functional interfaces and lambda expressions is not
	 * true? ==>> The compiler uses deferred execution to skip determining whether a
	 * lambda expression compiles or not.
	 * 
	 * Given the code fragment: Path source = Paths.get ("/data/december/log.txt");
	 * Path destination = Paths.get("/data"); Files.copy (source, destination); ==>>
	 * A FileAlreadyExistsException is thrown at run time.
	 * 
	 * Which of these represents the earliest date/time? ==>>
	 * 2017-02-15T16:00+07:00[Asia/Bangkok]
	 * 
	 * A class that implements _________________ may be in a try-with-resource
	 * statement. ==>> 1. Closeable 2. AutoCloseable
	 * 
	 * Which of the following is not a true statement about interfaces and abstract
	 * classes? ==>> Unlike abstract classes, interfaces can be marked final.
	 * 
	 * List<Emp>li = Arrays.asList(new Emp(“Sam”, 20), New Emp(“John”, 60), New
	 * Emp(“Jim”, 51)); Predicate<Emp> agVal = s -> s.getEAge() > 50;//line n1 li =
	 * li.stream().filter(agVal).collect(Collectors.toList()); Stream<String> names
	 * = li.stream()map.(Emp::getEName);//line n2 names.forEach(n ->
	 * System.out.print(n + “ “)); ==>> JohnJim
	 * 
	 * Which lambda can replace the MySecret class to return the same value? public
	 * interface Secret { String magic(double d); } public class My Secret
	 * implements Secret { public String magic(double d) { return "Poof"; } }==>> 1.
	 * caller((e) -> { String f = ""; return "Poof"; }); 2. caller((e) -> "Poof");
	 * 
	 * private static void apply(Optional<Exception> opt) {
	 * opt.__________(IllegalArgumentException::new); }==>> orElseThrow
	 * 
	 * What best describes a reduction? ==>>A terminal operation where a single
	 * value is generated by reading each element in the prior step in a stream
	 * pipeline
	 * 
	 * Which lambda expression can be passed to the magic() method? package show;
	 * import java.util.function.*; public class Magician { public void
	 * magic(BinaryOperator<Long> lambda) { lambda.apply(3L, 7L); } } ==>>
	 * magic((b,w) -> (long)w.intValue())
	 * 
	 * Which of the following prints out all of the values in props? ==>>
	 * props.keySet().stream().map(k -> props.get(k)) .forEach(System.out::println);
	 * 
	 * Starting with DoubleBinaryOperator and going downward, fill in the values for
	 * the table. Functional Interface # Parameters DoubleBinaryOperator
	 * LongToIntFunction ToLongBiFunction IntSupplier ObjLongConsumer ==>> 2,1,2,0,2
	 * 
	 * Given that daylight savings time starts on March 12, 2017, at 2 a.m. and
	 * clocks jump from 1:59 a.m. to 03:00 a.m., which of the following can fill in
	 * the blank so the code doesn’t throw an exception? LocalDate localDate =
	 * LocalDate.of(2017, 3, 12); LocalTime localTime = LocalTime.of(__________);
	 * ZoneId zone = ZoneId.of("America/New_York"); ZonedDateTime z =
	 * ZonedDateTime.of(localDate, localTime, zone); ==>> Either of the above will
	 * run without throwing an exception.
	 * 
	 * System.out.print(halleysComet.equals(lexellsComet) ? "Same!" : "Different!");
	 * ==>> Same!
	 * 
	 * Given the code fragment: List<Integer> list1 = Arrays.asList(10, 20);
	 * List<Integer> list2 = Arrays.asList(15, 30); //line n1 Which code fragment,
	 * when inserted at line n1, prints 10 20 15 30? ==>>Stream.of(list1,
	 * list2).flatMap(list -> list.stream()).forEach(s -> System.out.print(s +
	 * " "));
	 * 
	 * Writer is__________ that related stream classes__________ . ==>> an abstarct
	 * class , extend
	 * 
	 * If the current working directory is /zoo, and the path /zoo/turkey does not
	 * exist, then what is the result of executing the following code? Path path =
	 * Paths.get("turkey"); if(Files.isSameFile(path,Paths.get("/zoo/turkey"))) //
	 * x1 Files.createDirectory(path.resolve("info")); // x2 ==>> It compiles but
	 * throws an exception at runtime.
	 * 
	 * When reading file information, what is an advantage of loading a
	 * BasicFileAttributeView over a BasicFileAttributes? ==>> Allows the last
	 * modified date to be changed
	 * 
	 * Which of the following statements, when run independently, produces a
	 * NullPointerException at runtime? ==>>
	 * Paths.get("../sung").getRoot().getParent()
	 * 
	 * What is the result of executing the following program? Assume the path
	 * /driveway exists and is non-empty, and the directory tree is fully accessible
	 * within the file system. ==>> The code not compile
	 * 
	 * Which of the following are true? ==>> 1. All resource bundles defined as
	 * property files can be expressed using the Java class list bundle format
	 * instead. 2. Changing the default locale lasts for only a single run of the
	 * program.
	 * 
	 * What is the output of the following code snippet? Assume all referenced paths
	 * exist within the file system. Path v1 =
	 * Path.get("/./desert/./").resolve(Paths.get("sand.doc")); Path v2 = new
	 * File("/desert/./cactus/../sand.doc").toPath();
	 * System.out.print(Files.isSameFile(v1,v2));
	 * System.out.print(" "+v1.equals(v2));
	 * System.out.print(" "+v1.normalize().equals(v2.normalize())); ==>>None of the
	 * above
	 * 
	 * Which are the minimum changes needed to make this class immutable? ==>> Make
	 * species private and final, Make the getter method final and remove the setter
	 * method.
	 * 
	 * Which of the following properties of concurrency are true? ==>> 1.
	 * Applications with many resource-heavy tasks tend to benefit more from
	 * concurrency than ones with CPU-intensive tasks. 2.By itself, concurrency does
	 * not guarantee which task will be completed first.
	 * 
	 * Given that /green.txt and /colors/yellow.txt are accessible, and the code
	 * fragment: Path source = Paths.get("/green.txt); Path target =
	 * Paths.get("/colors/yellow.txt); Files.move(source, target,
	 * StandardCopyOption.ATOMIC_MOVE); Files.delete(source); Which statement is
	 * true? ==>> The yellow.txt file content is replaced by the green.txt file
	 * content and an exception is thrown.
	 * 
	 * Locale.setDefault(new Locale("en", "US")); ResourceBundle rb =
	 * ResourceBundle.getBundle("Colors"); rb.getString("purple"); ==>>
	 * Colors_en.class
	 * 
	 * Of these choices, which data structures best represent the line to check out
	 * the book and the book lookup to mark it as checked out, respectivel ==>>
	 * ArrayDeque, TreeMap
	 * 
	 * Which line can replace line 18 without changing the output of the program?
	 * .filter(Runner::isFourMinuteMile) ==>> None of the above
	 * 
	 * Assuming the current working directory is /hail, what is the expected output
	 * of executing the following code snippet? Path w1 =
	 * Paths.get("../jungle/.././rain..") .toAbsolutePath().normalize();
	 * System.out.print(w1.resolve("snow.txt")); ==>> /rain../snow.txt
	 * 
	 * Which of the following could be inserted to fill in the blank? public
	 * interface Otter { default void play() { } } class River Otter implements
	 * Otter { __} ==>> 1. @Override public boolean equals(Object o) { return false;
	 * } 2. @Override public int hashCode() { return 42; } 3.@Override public void
	 * play() { }
	 * 
	 * Given the following four properties files, what does this code print? ==>>
	 * France moteur
	 * 
	 * System.out.print(products.peek()); System.out.print(products.poll());
	 * System.out.println(""); products.forEach(s -> System.out.print(s)) ==>>p1p1
	 * p2p3
	 * 
	 * LongStream stream = LongStream.of(6, 10); LongSummaryStatistics stats =
	 * stream.summaryStatistics(); System.out.println(____________); ==>
	 * stats.getAverage()
	 * 
	 * Which of the following is not a command that enables or disables assertions
	 * at runtime? ==>> -di
	 * 
	 * ==>> A compilation error occurs in the Daze class.
	 * 
	 * ==>> Susan Allen [David]
	 * 
	 * Assume the file referenced in the StudentManager class exists and contains
	 * data. Which statement about the following class is correct? ==>> The program
	 * runs but may only print some students in the files.
	 * 
	 * Why can’t String::charAt be used as a method reference? ==>> Method
	 * references can pass either the instance or the parameter from the lambda, but
	 * not both.
	 * 
	 * Which statements are correct? ==>> 1. The compare() and compareTo() methods
	 * have the same contract for the return value. 2.There can be multiple
	 * Comparator implementations for the same class.
	 * 
	 * 
	 * or the copy() method shown here, assume that the source exists as regular
	 * file and that the target does not. What is the result of the following code?
	 * Path path1 = Paths.get("./goat.txt").normalize(); // k1 Path path2 =
	 * Paths.get("mule.png");
	 * Files.copy(path1,path2,StandardCopyOption.COPY_ATTRIBUTES); //k2
	 * System.out.println(Files.isSameFile(path1, path2)); //k3 ==>> It will output
	 * false.
	 * 
	 * Which can independently fill in the blank to output No dessert today? import
	 * java.util.*; public class Dessert { public static void main(String[] yum) {
	 * eatDessert(Optional.of("Cupcake")); } private static void
	 * eatDessert(Optional<String> opt) { System.out.println(opt.____________); }
	 * }==>> None of the above
	 * 
	 * Let’s say you wanted to read data from a file stored on disk that consists of
	 * String, long, and Object values? Given that the file is quite large, you
	 * intend to use three classes to achieve this result. Which of the following is
	 * not one of the three classes you should use? ==>>BufferedReader
	 * 
	 * Which three are advantages of the Java exception mechanism? ==>> 1. allows
	 * the creation of new exceptions that are tailored to the particular program
	 * being created 2. improves the program structure because the programmer can
	 * choose where to handle exceptions 3. improves the program structure because
	 * the error handling code is separated from the normal program function
	 * 
	 * Given the following two variables, which assertion statement compiles
	 * successfully? int age = 22; final String name = "Josephine"; ==>> assert
	 * age!=age : (1<age ? "Error" : 10);
	 * 
	 * What is the output of the following code? Local Date Time d =
	 * LocalDateTime.of(2015, 5, 10, 11, 22, 33); Period p = Period.of(1, 2, 3); d =
	 * d.minus(p); Date Time Formatter f = Date Time Formatter. ofLocalized
	 * Time(FormatStyle.SHORT); System.out.println(d.format(f)); ==>> 11:22 AM
	 * 
	 *
	 * 
	 * Assume that there are two private integer variables called i and j in your
	 * class. Which of the following will prevent the memory consistency error? ==>>
	 * Public double divide(){synchronized(this) {return (i/j);}} Public void
	 * set(int i, int j){ synchronized(this) {this.i =I; this.j=j; }}
	 * 
	 * ==>>The code prints the content of the employee.txt file and throws an
	 * exception at line n3.
	 * 
	 * How long will the effects of calling Locale.setDefault() be active assuming
	 * no other calls to that method are made?==>>Until the program exits
	 * 
	 * What is the result of running this code? 12: LocalDate pieDay =
	 * LocalDate.of(2017, Month.JANUARY, 23); 13: LocalTime midnight =
	 * LocalTime.of(0, 0); 14: LocalDateTime pieTime = LocalDateTime.of(pieDay,
	 * midnight); 15: 16: DateTimeFormatter f = DateTimeFormatter 17:
	 * .ofLocalizedDate(FormatStyle.SHORT); 18: f.format(pieDay); 19:
	 * f.format(pieTime); 20: f.format(midnight); ==>>The code throws an exception
	 * on line 20.
	 * 
	 * If the key red is in all three of these files, which file will the following
	 * code use for the resource bundle? Locale loc = new Locale("zh", "CN");
	 * Locale.setDefault(new Locale("en", "US")); ResourceBundle rb =
	 * ResourceBundle.getBundle("Colors", loc); rb.getString("red");
	 * ==>>Colors_en.properties
	 * 
	 * System.out.print(stmt.executeUpdate("INSERT INTO Emp VALUES (500,'Murray')"))
	 * ; ==>> Returns 1
	 * 
	 * 
	 * 
	 * Which of the following is not a functional interface in the
	 * java.util.function package? =>>ShortSupplier
	 * 
	 * Which terminal operations on the Stream class are reductions? ==>> 1. count()
	 * 2. collect()
	 * 
	 * IntStream stream = IntStream.of(6, 10); LongStream longs = stream.mapToLong(i
	 * -> i); System.out.println(____________);==>> longs.average().getAsDouble()
	 * 
	 * What format pattern would you pass to a DateTimeFormatter so it creates hour
	 * and minute output such as 02:33? ==>> hh:mm
	 * 
	 * public static void main(String... emerald) { 11:
	 * System.out.print("AM I HOME? " 12: +(new Road().findHome() ? "yes" : " no"));
	 * 13: } ==>> AM I HOME ? no
	 * 
	 * Statement stmt = conn.createStatement( , b); ==>> 1.
	 * ResultSet.TYPE_SCROLL_SENSITIVE 2. ResultSet.TYPE_FORWARD_ONLY 3.
	 * ResultSet.TYPE_SCROLL_INSENSITIVE
	 * 
	 * Which of the following are true statements about serialization in Java? ==>>
	 * 1.The process of converting serialized data back into memory is called
	 * deserialization. 2. The readObject() method of ObjectInputStream may throw a
	 * ClassNotFoundException even if the return object is not explicitly cast.
	 * 
	 * Let’s say we want to write an instance of Cereal to disk, ==>> Non of the
	 * above (othe roptions: CornLoops, CaptainPebbles, SugarPops)
	 * 
	 * stream.xxxx.forEach(System.out::println). [filter()>flatMap()>map()] ==>>
	 * Zero or one, zero or more, exactly one
	 * 
	 * Result Set rs = stmt.executeQuery(sql); if (rs.next()) { } ==>> 1. String s =
	 * rs.getString(1); 2. Object s = rs.getObject(1);
	 * 
	 * Path path = Paths.get("/monkeys"); Files.find(path, 0, (p,a) ->
	 * a.isSymbolicLink()).map(p -> p.toString()) // y1
	 * .collect(Collectors.toList()) // y2 .stream() // y3 .filter(x ->
	 * x.toString().endsWith(".txt")) // y4 .forEach(System.out::println); ==>> It
	 * will print nothing.
	 * 
	 * Which of the following are common types to localize? ==>> 1. Dates 2.Numbers
	 * 3. Currency
	 * 
	 * Which of the following three functional interfaces is not equivalent to the
	 * other two?==>> DoubleFunction<Double>
	 * 
	 * class Computer { private Card sCard = new SoundCard(); private abstract class
	 * Card {} private class SoundCard extends Card {} } ==>> This code will compile
	 * 
	 * In a stream pipeline, which can return a value other than a Stream? ==>>
	 * Terminal operation
	 * 
	 * Which of the answer choices is true given the following code?
	 * 2016–08–28T05:00 GMT-04:00 2016–08–28T09:00 GMT-06:00 ==>> 1. The date/times
	 * are 6 hours apart. 2. The first date/time is earlier.
	 * 
	 * DBConfiguration configureDB (String uname, String password){ --- } ==>>
	 * Return DBConfiguration;
	 * 
	 * Which are valid ResultSet types? ==>> TYPE_FORWARD_ONLY
	 * 
	 * Which statements about try-with-resources are true? ==>> 1. Neither a catch
	 * nor a finally block is required. 2.If more than one resource is used, then
	 * the order in which they are closed is the reverse of the order in which they
	 * were created.
	 * 
	 * Which two are elements of a singleton class? ==>> 1. a public static method
	 * to return a copy of the singleton reference 2. a private constructor to the
	 * class
	 * 
	 * 
	 * Why does Console readPassword() return a char array rather than a String?
	 * ==>> It improves security.
	 * 
	 * Why does Console.readPassword() return a char[] array instead of a String
	 * object? ==>> 1.It is more secure. 2. Because Java puts all String values in a
	 * reusable pool. 3. So that the value can be removed from memory immediately
	 * after use.
	 * 
	 * Which method in InputStream can be used in place of calling skip(1) ==>>
	 * read()
	 * 
	 * 
	 * ==>> The program prints several values that total 55.
	 * 
	 * Which thread-safe class would you use to add elements to the front and back
	 * of an ordered data structure and includes methods for waiting a specified
	 * amount of time to do so? ==>> LinkedBlockingDeque
	 * 
	 * Which of the following Files methods requires the enclosing method to handle
	 * or declare a checked exception? ==>>isSameFile()
	 * 
	 * What statement about the following code is true? Atomic Long value1 = new
	 * Atomic Long(0); final long[] value2 = {0}; IntStream.iterate(1, i ->
	 * 1).limit(100).parallel() .forEach(i -> value1.incrementAndGet());
	 * IntStream.iterate(1, i -> 1).limit(100).parallel() .forEach(i ->
	 * ++value2[0]); System.out.println(value1+" "+value2[0]); ==>> The output
	 * cannot be determined ahead of time.
	 * 
	 * Integer number = Integer.valueOf("808.1"); ==>> A NumberFormatException will
	 * be throw.
	 *
	 *
	 * 
	 * ==>> !(o instanceof Button)
	 * 
	 * _ _ _ _ _ _ _ _ oldPassword = c.readPassword("password: "); ==>> char[]
	 * 
	 * Files.walk() performs a __________ traversal, while Files.find() performs a
	 * __________ traversal. ==>>depth-first, depth-first
	 * 
	 * Which of the following static methods does not exist in the Executors class?
	 * ==>> newFixedScheduledThreadPool()
	 * 
	 * Which of the answer choices make sense to implement with a lambda? ==>> 1.
	 * Comparator interface 2. removeIf method on a Collection
	 * 
	 * What are some advantages of using NIO.2 views to read metadata rather than
	 * individually from java.nio.Files methods? ==>> 1. It makes fewer round-trips
	 * to the file system. 2. It can be used to access file system–dependent
	 * attributes. 3.For reading multiple attributes, it is often more performant.
	 * 
	 * ==>> return list.stream().mapToInt(i -> i).sum();
	 * 
	 * Stream<Character> stream = Stream.of('c', 'b', 'a'); // z1
	 * stream.sorted().findAny().ifPresent(System.out::println); // z2 ==>> It can
	 * print any single character of a, b, or c.
	 * 
	 * Stream<Character> stream = Stream.of('c', 'b', 'a');
	 * System.out.println(stream.sorted().findFirst()); 1. It is guaranteed to print
	 * the single character a. 2. It can print any single character of a, b, or c.
	 * 3. None of the above 4. The code does not compile. ==>> 3
	 * 
	 * Starting with DoubleConsumer and going downward, fill in the missing values
	 * for the table. DoubleConsumer IntFunction LongSupplier ObjDoubleConsumer ==>>
	 * 1, 1, 0, 2
	 * 
	 * A developer tries to rewrite a method that uses flatMap() without using that
	 * intermediate operator. Which pair of method calls shows the withoutFlatMap()
	 * method is not equivalent to the withFlatMap() method?==>> withFlatMap(queue);
	 * withoutFlatMap(queue);
	 *
	 * public class TicketManager { private Ticket Manager() { super(); } private
	 * static TicketManager instance; public static synchronized TicketManager get
	 * Instance() { // k1 if (instance == null) instance = new TicketManager(); //
	 * k2 return instance; } private int tickets; public int getTicketCount() {
	 * return tickets; } public void makeTicketsAvailable(int value) { tickets +=
	 * value; } // k3 public void sell Tickets(int value) { synchronized (this) { //
	 * k4 tickets -= value; } } } ==>> 1. It compiles without issue. 2. At most one
	 * instance of TicketManager will be created in the application.
	 * 
	 * code to overwrite alldata.txt with data.txt ==>> bw.flush();
	 * 
	 * A(n)__________ is a file that contains a reference to another file or
	 * directory, while a(n)__________ is a file that contains content. ==>>
	 * symbolic link, regular file
	 * 
	 * public class Book { private int pageNumber; private class BookReader { public
	 * int getPage() { return pageNumber; } } } ==>> The code compiles successfully,
	 * and two bytecode files are generated: Book.class and Book$BookReader.class.
	 * 
	 * 
	 * Assume /kang exists as a symbolic link to the directory /mammal/kangaroo
	 * within the file system. Which of the following statements are correct about
	 * this code snippet? Path path = Paths.get("/kang"); if(Files.isDirectory(path)
	 * && Files.isSymbolicLink(path)) Files.createDirectory(path.resolve("joey"));
	 * ==>> 1. If the code creates a directory, it will be reachable at /kang/joey.
	 * 2. If the code creates a directory, it will be reachable at
	 * /mammal/kangaroo/joey. 3.A new directory will be created only if
	 * /mammal/kangaroo exists.
	 * 
	 * Which of the following are checked exceptions? ==>> class One extends
	 * RuntimeException{} class Two extends Exception{} class Three extends Error{}
	 * class Four extends One{} class Five extends Two{} class Six extends Three{}
	 * >> Class Two and Class Five
	 * 
	 * Which of these represents the earliest date/time? ==>> None of the above. We
	 * have a tie.
	 * 
	 * Console c = System.console(); String s = _______ ; ==>> c.readLine()
	 * 
	 * Which of the following are methods available to instances of the java.io.File
	 * class? ==>> 1. mkdir() 2. mkdirs() 3. renameTo()
	 * 
	 * Which of the followings is true? 1. The ForkJoinTask class can't return a
	 * result. 2. The ForkJoinTask is a sub class of RecursiveTask class. 3. The
	 * ForkJoinTask class has only the "fork()" and "join()" methods. 4. None of
	 * above. ==> 4
	 * 
	 * ==>> Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 100);
	 * This will give compiletime error
	 * 
	 * The name of the abstract method in the Function interface __________ is ,
	 * while the name of the abstract method in the Consumer interface is__________
	 * Response: ==>> apply(), accept()
	 * 
	 * A try statement__________ a catch or a finally block, while a
	 * try-with-resources statement __________. ==>> must contain, is not required
	 * to contain either
	 * 
	 * Which two class definitions fail to compile? ==>> Option B , Option C
	 * 
	 * Given an instance of a Stream, s, and a Collection, c, which are valid ways
	 * of creating a parallel stream? ==>> 1. c.parallelStream , 2. s.parallel()
	 * 
	 * class RateOfInterest { public static void main (String[] args) { int
	 * rateOfInterest = 0; String accountType = "LOAN"; switch (accountType) { case
	 * "RD"; rateOfInterest = 5; break; case "FD"; rateOfInterest = 10; break;
	 * default: assert false: "No interest for this account"; //line n1 }
	 * System.out.println ("Rate of interest:" + rateOfInterest); } } ==>> An
	 * AssertionError is thrown
	 * 
	 * Rewrite this lambda using a constructor reference: n -> new ArrayList<>(n)
	 * ==>> ArrayList::new;
	 * 
	 * Which of the following is a recommended way to define an asynchronous task?
	 * ==>> Create a Runnable expression and pass it to a Thread constructor.
	 * 
	 * Which of the following creates an Optional that returns true when calling
	 * opt.isPresent()? 1. Optional opt = Optional.empty(); 2. Optional opt =
	 * Optional.of(null); 3. Optional opt = Optional.ofNullable(null); ==>> Non of
	 * the above
	 * 
	 * Which of the answer choices is true given the following?
	 * 2017-01-07T10:00-07:00[America/Phoenix]
	 * 2017-01-07T08:00-08:00[America/Vancouver] ==>> The first date/time is one
	 * hour later than the second.
	 *
	 * Assuming the proper generic types are used, which lambda expression cannot be
	 * assigned to a ToDoubleBiFunction functional interface reference? ==>>String
	 * u, Object v) -> u.length()+v.length() ==>> walk,toddle,
	 * 
	 * __ return now.getMonth() == dateTime.getMonth() && now.getDayOfMonth() ==
	 * dateTime.getDayOfMonth(); } ==>> LocalDate now = LocalDate.now();
	 * 
	 * ==>> 4 : 4 : 4
	 * 
	 * Assume that all bundles mentioned in the answers exist and define the same
	 * keys. Which one will be used to find the key in line 8? Locale.setDefault(new
	 * Locale("en", "US"));Resource Bundle b = ResourceBundle.getBundle("Dolphins");
	 * b.getString("name"); ==>> Dolphins_en.java
	 * 
	 * The____________ functional interface does not take any inputs, while
	 * the____________ functional interface does not return any data. ==>> Supplier,
	 * DoubleConsumer
	 * 
	 * The following code snippet, which attempts to move a file system record from
	 * oldHardDrivePath to newHardDrivePath, results in an exception at runtime.
	 * Which of the following is the most likely type of exception to be thrown?
	 * Files.move(oldHardDrivePath,newHardDrivePath,REPLACE_EXISTING); ==>>
	 * DirectoryNotEmptyException
	 * 
	 * Comparator<String> so that it sorts the longest strings first. ==>> public
	 * int compare(String s1, String s2) { return s2.length() – s1.length(); }
	 * 
	 * Which correctly fills in the blank to print 2017-01-15? LocalDate hatDay =
	 * LocalDate.of(2017, Month.JANUARY, 15); DateFormatter f =
	 * DateFormatter.ISO_DATE; System.out.println(______________________________);
	 * ==>> Neither of the above
	 * 
	 * Under which circumstances does Files.deleteIfExists() not throw an exception?
	 * ==>> The path does not exist.
	 * 
	 * 
	 * In 2015. daylight saving time in New York, USA, begins on March 8th at 2:00
	 * AM. As a result, 2:00 AM becomes 3:00 AM. ==>> 4:00 -difference:2
	 * 
	 * Which functional interface takes a double value and has a test() method? ==>>
	 * DoublePredicate
	 * 
	 * Three of the four methods below always produce the same result whether they
	 * are executed on a serial or parallel ordered stream. Which one does not? ==>>
	 * findAny()
	 * 
	 * Which of the following is not a built-in stream in Java? ==>> System.info
	 * 
	 * Which statement about parallel streams is correct? ==>> All streams can be
	 * converted to a parallel stream.
	 * 
	 * Which of the following shows a valid Locale format? ==>> en
	 * 
	 * Which of the following statements are true? ==>> 1. Comparator is in the
	 * java.util package. 2. compare() is in the Comparator interface. 3. compare()
	 * takes two method parameters.
	 * 
	 * Which filename extension can hold a String property value in a resource
	 * bundle? 1. .java 2. .properties 3. Both of the above 4. Neither of the above
	 * ==>> .java
	 * 
	 * Which filename extension can define a LocalDateTime property value in a
	 * resource bundle? ==>> .java
	 * 
	 * What must be the first characters of a database URL? ==>> jdbc:
	 * 
	 * rs.absolute(2); // set row number ==>> The Employee table is not updated and
	 * the program prints: 112 Jerry
	 * 
	 * Which of the following are not required parameters for the NIO.2 Files.find()
	 * method? ==>> 1.FileVisitOption... 2. long
	 * 
	 * Which of the following is not true of using a try-with-resources statement?
	 * ==>> Associated catch blocks are run before the declared resources have been
	 * closed.
	 * 
	 * Which statement about a multi-catch statement is true? ==>>The variable of a
	 * multi-catch block with more than one exception cannot be reassigned within
	 * the block.
	 * 
	 * 
	 * ==> l instanceof Chipmunk does not compile. // cannot check instanceof with
	 * collection object with class object
	 * 
	 * Which two statements are true about the Fork/Join Framework? ==>> 1. The
	 * Fork/Join framework can help you take advantage of multicore hardware. 2. The
	 * Fork/Join framework implements a work-stealing algorithm.
	 * 
	 * Content of the new.txt : ABCD | FileReader fr = new FileReader("new.txt");
	 * System.out.println(fr.read()); fr.close(); ==>> 65 // fr.read() reads first
	 * character
	 * 
	 * ==>> Y YY
	 * 
	 * Which statements when inserted independently will throw an exception at
	 * runtime? ArrayDeque<Integer> d = new ArrayDeque<>(); d.offer(18); // INSERT
	 * CODE HERE ==>> 1. d.pop(); d.pop(); 2. d.remove(); d.remove();
	 * 
	 * try (Connection conn = DriverManager.getConnection(url); Statement stmt =
	 * conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,
	 * ResultSet.CONCUR_READ_ONLY); ResultSet rs = stmt.executeQuery(
	 * "select * from people order by last_name asc")) { rs.afterLast(); rs.next();
	 * rs.next(); rs.previous(); rs.previous(); System.out.println(rs.getString(1));
	 * } ==>> Elena
	 *
	 * Which functional interface returns a primitive value? ==>>BiPredicate
	 * 
	 * What is true of the following if the music database exists and contains a
	 * songs table with one row when run using a JDBC 4.0 driver? (Choose two.)
	 * import java.sql.*; public class Music { public static void main(String[]
	 * args) throws Exception { String url = "jdbc:derby:music"; Connection conn =
	 * DriverManager.getConnection(url); Statement stmt = conn.createStatement();
	 * stmt.execute("update songs set name = 'The New Song'"); } } ==>> 1. The code
	 * runs without error. 2.. The execute() method returns a boolean.
	 * 
	 * Which is true the regarding the java.nio.file.Path interface? ==>> The
	 * interface extends WatchService interface
	 * 
	 * What technique allows multiple variables from the same class to be shared
	 * across all instances of a class? ==>> static
	 * 
	 * Which NIO.2 method is most similar to the legacy java.io.File.listFiles()
	 * method? ==>> Files.list()
	 * 
	 * Which most accurately fills in the blanks in this sentence? With JDBC 3.0,
	 * the driver is__________ to contain a java.sql.Driver file, and the code
	 * getting a Connection is __________ to call Class.forName(). ==>> allowed,
	 * required
	 * 
	 * Which statements are true about the following date/times? (Choose two.)
	 * 2017-04-01T17:00+03:00[Africa/Nairobi] 2017-04-01T10:00-05:00[America/Panama]
	 * ==>> 1. The two date/times are one hour apart. 2. The first date/time is
	 * earlier.
	 * 
	 * What collector turns the stream at left to the Map at right? ==>>
	 * partitioningBy()
	 * 
	 * Which of the following are valid functional interfaces? ==>> 1. interface
	 * CanRun {void run(); static double runFaster() {return 2.0;}} 2. interface
	 * CanFly {abstract void fly();}
	 * 
	 * Which code fragment can be inserted at line n1 to enable the code to print
	 * only /company/emp? ==>> Correct Stream<Path> stream = Files.find( Paths.get
	 * ("/company"), 1, (p,b) -> b.isDirectory (), FileVisitOption.FOLLOW_LINKS);
	 * 
	 * ==>> Map<String, List<String>> category = new HashMap<String, List<String>>
	 * () ; Map<String, List<String>> category1 = new HashMap<> () ;
	 * 
	 * Given the for loop construct: for ( expr1 ; expr2 ; expr3 ) { statement; }
	 * Which two statements are true? ==>> 1. The expression expr1 is optional. it
	 * initializes the loop and is evaluated once, as the loop begin 2.When expr2
	 * evaluates to false, the loop terminates. It is evaluated only after each
	 * iteration through the loop.
	 * 
	 * Which of the following can be used to execute stored procedures that may
	 * contain both input and output parameters? =>>CallableStatement
	 *
	 * Which of the following concurrent collections is sorted? ==>>
	 * ConcurrentSkipListMap
	 * 
	 * The copyPidgin() method is used to copy the contents of one file to another.
	 * Which statement about the implementation is correct? package birds; import
	 * java.io.*; public class Pidgin { public void copyPidgin(File s, File t)
	 * throws Exception { try(InputStream is = new FileInputStream(s); OutputStream
	 * os = new FileOutputStream(t)) { byte[] data = new byte[123]; int chirps;
	 * while((chirps = is.read(data))>0) { os.write(data); }} }} ==>> The method
	 * correctly copies the contents of some files.
	 * 
	 * ==>> (x,y) -> {return x==null ? y : y+1;}
	 * 
	 * You want to create a singleton class by using the Singleton design pattern.
	 * Which two statements enforce the singleton nature of the design? ==>> 1. Make
	 * the constructor private. 2.Use a static reference to point to the single
	 * instance.
	 * 
	 * What are the requirements for a class that you want to serialize with Object
	 * Output Stream? ==>> The class must implement the Serializable interface.
	 * 
	 * Select from the following statements and indicate the order in which they
	 * would appear to output 10 lines: ==>>Stream.generate(() -> "1")
	 * .limit(10).forEach(System.out::println)
	 * 
	 * Which of the following methods cannot be used to obtain a Path instance? ==>>
	 * 1. new Path("jaguar.txt") 2. new FileSystem().getPath("leopard")
	 * 
	 * Which fills in the blank so the code is guaranteed to print 1?
	 * Stream<Integer> stream = Stream.of(1, 2, 3);
	 * System.out.println(stream.____________); 1. min() 2. first() 3. None of the
	 * above 4. findAny() ==>> None pf the above
	 * 
	 * Which of the following statements about design principles and design patterns
	 * are true? ==>>1. Design principles and design patterns tend to produce code
	 * that is easier to maintain and easier for other developers to read. 2. Design
	 * principles are often applied throughout an application, whereas design
	 * patterns are applied to solve specific problems.
	 * 
	 * A local inner class can access which type of local variables? ==>> 1. final
	 * 2.effectively final
	 * 
	 * List<String> list = new ArrayList<>(); list.add("Atlanta");
	 * list.add("Chicago"); list.add("New York");
	 * list.stream().filter(____________).forEach(System.out::println); 1. !
	 * String::isEmpty 2. String::! isEmpty 3. None of the above 4. String::isEmpty
	 * ==>> None of the above
	 * 
	 * The required database driver is configured in the classpath. The appropriate
	 * database is accessible with the dbURL, userName, and passWord exists. The
	 * Employee and Customer tables are available and each table has id column with
	 * a few records and the SQL queries are valid. What is the result of compiling
	 * and executing this code fragment? ==>> compilation fails on line 13.
	 * 
	 * Which of the following objects could contain the information “eastern
	 * standard time”? ==>>ZonedDateTime *
	 * 
	 * Which of the following lines can be inserted to make the code compile? class
	 * B extends A {} class C extends B {} class D<C> { // INSERT CODE HERE } ==>>
	 * 1. A a2 = new B(); 2.A a1 = new A();
	 * 
	 * Which class is used to read information about a directory within the file
	 * system? ==>> java.io.File
	 * 
	 * Which are true statements about terminal operations in a stream? =>> 1. At
	 * most one terminal operation can exist in a stream pipeline. 2. Terminal
	 * operations are a required part of the stream pipeline in order to get a
	 * result.
	 * 
	 * Which methods listed below are found in the NIO.2 Files class? ==>> only
	 * isSameFile()
	 * 
	 * If the current working directory is /user/home, then what is the output of
	 * the following code? Path path =
	 * Paths.get("/zoo/animals/bear/koala/food.txt");
	 * System.out.println(path.subpath(1,3).getName(1).toAbsolutePath()); ==>>
	 * /user/home/bear
	 * 
	 * ____________allow Java to support multiple inheritance, and anonymous inner
	 * classes can ____________of them. ==>>1. Interfaces, implement at most one
	 * 
	 * Suppose we want to store JellyBean objects. Which of the following pairs
	 * require JellyBean to implement the Comparable interface or create a
	 * Comparator in order to add them to the Collection? ==>>TreeMap and TreeSet
	 * 
	 * Which of the following are true statements? ==>> 1. A traditional try
	 * statement without a catch block requires a finally block. 2. A traditional
	 * try statement without a finally block requires a catch block.
	 * 
	 * Which statements about try-with-resources are true? ==>> 1. If more than one
	 * resource is used, then the order in which they are closed is the reverse of
	 * the order in which they were created. 2.Neither a catch nor a finally block
	 * is required.
	 * 
	 * The protected modifier on a Field declaration within a public class means
	 * that the field ____.==>>Can be read and written from this class and its
	 * subclasses defined in any package
	 * 
	 * ==>> 1. // leave line blank 2. Should have chosen e = new SniffleException();
	 * 3. e = new SneezeException();
	 * 
	 * Given an instance of Console c, which of the following method calls is not a
	 * way to read input from the user? ==>> c.reader().readLine()
	 * 
	 * Which two statements are true for a two-dimensional array of primitive data
	 * type? ==>> 1. All methods of the class object may be invoked on the
	 * two-dimensional array. 2. At the declaration time, the number of elements of
	 * the array in each dimension must be specified.
	 * 
	 * new InputStreamReader(fis);) { while (isr.ready()) { //line n1 isr.skip(2)
	 * ==>> skip first two letters and read ==>> ur:va
	 * 
	 * Suppose you have a stream pipeline where all the elements are of type String.
	 * Which of the following can be passed to the intermediate operation sorted()?
	 * ==>> (s,t)-> s.length()-t.length()
	 * 
	 * ==>> Java MyFile 1 3 2 2
	 * 
	 * The Files.__________ method returns a List, while the Files.__________ method
	 * returns a Stream. ==>> readAllLines(), lines()
	 * 
	 * class Building {} class House extends Building{} Building b = new House();
	 * House p = (House) b; ==>> class Cast Exception
	 * 
	 * ==>> 1. At line 17, insert super (x); 2. At line 20, use public void area ( )
	 * 
	 * What is the best reason for applying the @Override annotation to a method?
	 * ==>> The method will fail to compile if it is not actually overriding another
	 * method.
	 * 
	 * Which two statements are true about synchronization and locks? ==> 1. A
	 * thread automatically acquires the intrinsic lock on a synchronized statement
	 * when executed. 2. A thread automatically acquires the intrinsic lock on a
	 * synchronized method’s object when entering that method.
	 * 
	 * ==>> 1. It outputs a number 10 times. 2. It outputs a null value 10 times. 3.
	 * It outputs Exception! 10 times.
	 *
	 * OutputStream >> FilterOutputStream =>> BuffreredOutputStream and PrintStream
	 *
	 * Which of the following is not an advantage of using enumerated types in Java?
	 * ==>> Offer ability to create new enumerated values at runtime.
	 *
	 * Which functional interface takes two values and has an apply() method? ==>>
	 * BiFunction
	 *
	 * mystery=bag type=paper System.out.print(props.getProperty("mystery", "?"));
	 * System.out.print(" "); System.out.print(props.getProperty("more", "?")); ==>>
	 * bag ?
	 * 
	 * Which statement Is true about java.util.stream.stream? ==>> Streams support
	 * aggregate operations.
	 *
	 * Starting with DoubleConsumer and going downward, fill in the values for the
	 * table. For the choices below, assume R is a generic typ >> DoubleConsumer |
	 * IntFunction | LongSupplier | ObjDoubleConsumer ==>> void, R, long, void
	 * 
	 * Given a valid conn object of type Connection, what will happen if you run
	 * this code when the requested mode is not supported?
	 * conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	 * ResultSet.CONCUR_UPDATABLE); ==>> The code will run without throwing an
	 * exception.
	 * 
	 * public class HideAndSeek { public static void main(String[] args) {
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
	 * 
	 * =>> return list.stream() .sorted((a, b) -> b.compareTo(a))
	 * .collect(Collectors.toList());
	 * 
	 * Which of the following are true of interfaces? ==>> 1. They enable classes to
	 * have multiple inheritance 2. All members of an interface are public.
	 * 
	 * Which of these stream pipeline operations takes a Predicate as a parameter
	 * and returns an Optional? 1. filter() 2. findAny() 3.anyMatch() 4. None of the
	 * above ==>> NOne of the above
	 * 
	 * Suppose that you need to write data that consists of int, double, boolean,
	 * and String values to a file that maintains the format of the original data.
	 * For performance reasons, you also want to buffer the data. Which three
	 * java.io classes can be chained together to best achieve this result? ==>> 1.
	 * Object Output Stream 2. File Output Stream 3. Buffered Output Stream
	 * 
	 * RecursiveTask<Integer> > invokeAll ==>> 1. Results must be retrieved from the
	 * newly created MyTask instances and combined. 2. The compute() method must be
	 * changed to return an Integer result.
	 * 
	 * ==>> static void fly(consumer>Bird> bird (Bird. Accept {} fly {)?}
	 * 
	 * ==>> getAndDecrement() and incrementAndGet()
	 * 
	 * Which of the following prints OhNo with the assertion failure when the number
	 * is negative? ==>> 1. assert(n < 0): "OhNo"; 2. assert n < 0: "OhNo";
	 * 
	 * Which of the following can fill in the blank to print the month, date, year,
	 * hour, minute, and second? ==>> rs.getTimeStamp("d");
	 * 
	 * ==>> Dolphins_fr.properties and Dolphins.properties
	 * 
	 * public String checkLottoNumbers(Reader r) throws IOException {
	 * r.read();r.skip(1); r.mark(5); r.skip(1); r.reset(); return
	 * r.read()+"-"+r.read(new char[5]); } ==>> 1. An IOException on line r.reset();
	 * 2. 3-4 is returned.
	 * 
	 * Let’s say you needed a thread executor to create tasks for a CyclicBarrier
	 * that has a barrier limit of five threads. Which static method in
	 * ExecutorService should you use to obtain it? 1.None of these would work.
	 * 2.newSingleThreadExecutor() 3.newCachedThreadPool()
	 * 4.newSingleThreadScheduledExecutor() ==>> None of these would work
	 * 
	 * public class PiDay { public static void main(String[] args) { LocalDateTime
	 * pi = LocalDateTime.of(2017, 3, 14, 1, 59); DateTimeFormatter formatter =
	 * DateTimeFormatter .ofPattern("m.ddhhMM");
	 * System.out.println(formatter.format(pi)); } } ==>> 59.140103
	 * 
	 * LocalDateTime pi = LocalDateTime.of(2017, 3, 14, 1, 59); DateTimeFormatter
	 * formatter = DateTimeFormatter .ofPattern("M.ddhhmm");
	 * System.out.println(formatter.format(pi)); ==>> 3.140159
	 * 
	 * String url = "jdbc:derby:clowns"; try (Connection conn =
	 * DriverManager.getConnection(url); Statement stmt = conn.createStatement();
	 * ResultSet rs = stmt.executeQuery("select count(*) from clowns")) { rs.next();
	 * // r1 System.out.println(rs.getInt(1)); // r2 } ==>> The code compiles and
	 * runs without error.
	 * 
	 * Which java.io class does not have a complementary input stream? ==>>
	 * PrintWriter
	 * 
	 * ==>> Time of the Epoch (in milliseconds)
	 * 
	 * What changes need to be made to make the following immutable object pattern
	 * correct? import java.util.List; public class Seal { String name; private
	 * final List<Seal> friends; public Seal(String name, List<Seal> friends) {
	 * this.name = name; this.friends = friends; } public String getName() { return
	 * name; } public List<Seal> getFriends() { return friends; } } ==>> 1. Replace
	 * the get Friends() method with methods that do not give the caller direct
	 * access to the List friends. 2.Make a copy of the List friends in the
	 * constructor. 3.Mark name final and private. 4.Mark the Seal class final.
	 * 
	 * Which functional interface, when entered into the blank below, allows the
	 * class to compile? package groceries; import java.util.*; import
	 * java.util.function.*; public class Market { private static void
	 * checkPrices(List<Double> prices, ____________scanner) {
	 * prices.forEach(scanner); } public static void main(String[] right) {
	 * List<Double> prices = Arrays.asList(1.2, 6.5, 3.0); checkPrices(prices, p ->
	 * { String result = p<5 ? "Correct" : "Too high"; System.out.println(result);
	 * }); } 1. Consumer 2. DoubleConsumer 3. None of the above 4. Supplier<Double>
	 * ==>> None of the above
	 * 
	 * Which statements describe a java.io stream class and cannot be applied to a
	 * java.util.stream.Stream class? ==>> 1. Some classes contain a flush() method.
	 * 2. Can be used with try-with-resources statement 3. Includes a class or set
	 * of classes used solely for working with character data
	 *
	 * * LocalDateTime.of() has a number of overloads. Which of the following is not
	 * one of them? ==>> LocalDateTime.of(LocalDate date, int hour, int minute)
	 * 
	 * Which two reasons should you use interfaces instead of abstract classes? ==>>
	 * 1. You expect that unrelated classes would implement your interfaces. 2. You
	 * want to take advantage of multiple inheritance of type.
	 * 
	 * Which three statements describe the object-oriented features of the Java
	 * language?1. Objects can share behaviors with other objects. 2. A subclass can
	 * inherit from a superclass. 3. A main method must be declared in every class.
	 * 
	 * Which method is available on both List and Stream implementations? ==>>
	 * forEach
	 *
	 * Which of the following are stored in a Period object? 1.Year 2. Day 3 Month
	 * 
	 * ==>> squarecircle...
	 * 
	 * System.out.print(Files.walk(Paths.get("/again/and/again")).count()); ==>> A
	 * number is printed at runtime.
	 *
	 * Which of the following lambda can be used for String typed Comparable? ==>>
	 * s-> s.hasCode();
	 * 
	 * Which pair of statements is true when requesting a ResultSet to be both
	 * scroll sensitive and updatable? 1. The scroll sensitive option is passed as a
	 * parameter before the updatable parameter. 2. The updatable option is passed
	 * as a parameter before the scroll sensitive parameter. 3. If these options are
	 * not available, the database driver returns a ResultSet with different
	 * options. 4. If these options are not available, the database driver throws a
	 * SQLException. ==>> II III
	 * 
	 * Which are the minimum changes needed to properly implement the singleton
	 * pattern? 1. Add a private constructor. 2. Remove the setter method. 3. Remove
	 * the static block and change line 2 to instantiate Bookmark. ==>> I
	 * 
	 * Which statement about all UnaryOperator functional interfaces (generic and
	 * primitive) is correct? ==>> The input type must be compatible with the return
	 * type.
	 * 
	 * Which of the following statements about InputStream and Reader are correct?
	 * =>> 1. They can both be used to read character data. 2. They are both
	 * abstract classes.
	 * 
	 * What is true about the java.sql.Statement interface? ==>> It provides a class
	 * for executing SQL statements and returning the results.
	 * 
	 * Which expression is compatible with the IntSupplier functional interface?
	 * ==>> () -> {return 1/0;}
	 * 
	 * Which of the following statements about polymorphism are true? ==>> 1. If a
	 * method takes a class that is the superclass of three different object
	 * references, then any of those objects may be passed as a parameter to the
	 * method. 2.A reference to an object may be cast to a superclass of the object
	 * without an explicit cast.
	 * 
	 * Given an updatable ResultSet that contains the following and this code, what
	 * does the code snippet output? rs.afterLast(); rs.previous(); rs.updateInt(2,
	 * 10); rs = stmt.executeQuery("select * from pens where color = 'red'"); while
	 * (rs.next()) { System.out.println(rs.getInt(2)); }==>> 0
	 * 
	 * Which of the following are properties of classes that are properly
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
	 * Given the following file system diagram, in which forward is a symbolic link
	 * to the java directory, which value does not print /java/Sort.java at runtime?
	 * Path p = Paths.get("/", "objC", "bin");
	 * System.out.println(p.resolve("__________").toRealPath()); =>>
	 * ../java/./forward/Sort.java
	 * 
	 * Let’s say you want to write a lot of text data to a file in an efficient
	 * manner. Which two java.io stream classes are best to use? ==>> FileWriter and
	 * BufferedWriter
	 * 
	 * Which two can independently fill in the blank to output No dessert today?
	 * public class Dessert { public static void main(String[] yum) {
	 * eatDessert(Optional.empty()); } private static void
	 * eatDessert(Optional<String> opt) { System.out.println(opt.__________); } }
	 * ==>> 1. orElseGet(() -> "No dessert today") 2. orElse("No dessert today")
	 * 
	 * Inner class can have ENUM when inner class is static, for non static inner
	 * class it will throw compile error. Inner Static class object can not be
	 * created using instance of outer class, compile error
	 *
	 * What changes need to be made to make the following singleton pattern correct?
	 * public class Cheetah Manager { public static Cheetah Manager cheetah Manager;
	 * private Cheetah Manager() {} public static Cheetah Manager get Cheetah
	 * Manager() { if(cheetah Manager == null) { cheetah Manager = new Cheetah
	 * Manager(); } return cheetah Manager; } } ==>> 1. Add synchronized to get
	 * Cheetah Manager(). 2. Change the access modifier of cheetah Manager from
	 * public to private.
	 * 
	 * Which two statements are true about localizing an application? ==>> 1.
	 * Resource bundle files Include date and currency information. 2.Language and
	 * region-specific programs are created using localized data.
	 * 
	 * Which method in the NIO.2 Files class is equivalent to the java.io.File
	 * method length()? 1. size() 2. None of the above 3. length() 4. getLength()
	 * ==>> size()
	 * 
	 * 
	 * What are some advantages of using Files.lines() over Files.readAllLines( ==>>
	 * 1. It can be chained with stream methods directly. 2. It can be run on large
	 * files with very little memory available.
	 * 
	 * Given that version.txt is accessible and contains: 1234567890 and given the
	 * code fragment: syso(br.read()); br.mark(); syso(br.read()); br.reset();
	 * syso(br.read()); ==>> 122
	 * 
	 * Which of the following classes are checked exception? ==>> 1.
	 * java.io.NotSerializableException 2. java.text.ParseException 3.
	 * java.sql.SQLException
	 * 
	 * Which of the following methods is not available on an ExecutorService
	 * instance? 1. execute(Runnable) 2. submit(Runnable) 3. submit(Callable) 4.
	 * execute(Callable) ==>> execute(Callable)
	 * 
	 * What are some reasons to use a character stream, such as Reader/Writer, over
	 * a byte stream, such as Input Stream/Output Stream? 1. Character streams are
	 * high-level streams 2. Multi-threading support 3. Automatic character encoding
	 * 4. More convenient code syntax when working with String data 5. Built-in
	 * serialization and deserialization 6. Improved performance ==>> 3. Automatic
	 * character encoding 4. More convenient code syntax when working with String
	 * data
	 * 
	 * ==>> rs.refreshRow(); // Fetch record from the database which is commited
	 * data in DB.
	 * 
	 * Which of the following are runtime exceptions? ==>> 1.
	 * MissingResourceException 2. DateTimeParseException 3. IllegalStateException
	 * 
	 * Which statement best describes the difference between a Writer and an
	 * OutputStream class? ==>> Only one of them has built-in methods for writing
	 * character data.
	 * 
	 * What is lazy instantiation? ==>>A technique that can be used in a singleton
	 * to wait until the first use to create the object
	 * 
	 * Fill in the blank so the code correctly compiles and creates a Locale. Locale
	 * loc = Locale.____________________; 1. None of the above 2.
	 * getLocale("Italian") 3. get(Locale.ITALIAN) 4. get("Italian") ==>> None of
	 * the above
	 * 
	 * T - the type of the first argument to the function U - the type of the second
	 * argument to the function R - the type of the result of the function Which
	 * functional interface does not have the correct number of generic arguments?
	 * 1. BiFunction<T,U,R> 2. DoubleFunction<T,R> 3. ToIntBiFunction<T,U> 4.
	 * ToDoubleFunction<T> ==>> DoubleFunction<T,R>
	 * 
	 * Which technique or pattern requires instance variables to implement? ==>>
	 * Object composition
	 * 
	 * Which of the following lambda expressions can be passed to a method that
	 * takes IntFunction<Integer> as an argument? 1. (Integer f) -> f 2. (v) -> null
	 * 3. s -> s ==>> II and III only
	 * 
	 * ==>> import static my.sports.Football.*; to access TEAM_SIZE of Football in
	 * another class
	 * 
	 * Which of the following statements are true, assuming a and b are String
	 * objects? ==>> 1. If a.equals(b) is false, a.hashCode() == b.hashCode() can
	 * sometimes be true. 2. If a.equals(b) is true, a.hashCode() == b.hashCode() is
	 * always true.
	 * 
	 * Which two changes would encapsulate this class ==>> 1. Change the setArea
	 * method to private. 2. Change the area field to public.
	 * 
	 * Consider the three methods execute(), executeQuery(), and executeUpdate().
	 * Fill in the blanks: __________ of these methods is/are allowed to run a
	 * DELETE SQL statement while __________ of these methods is/are allowed to run
	 * an UPDATE SQL statement. ==>> Two, two
	 * 
	 * Which of the following return primitives? 1. StringSupplier 2.DoubleSupplier
	 * 3. CharSupplier 4.FloatSupplier 5. IntSupplier 6. BooleanSupplier ==>>
	 * DoubleSupplier ,IntSupplier, BooleanSupplier
	 * 
	 * Which of the answer choices is true given the following code?
	 * 2016–08–28T05:00 GMT-04:00 == 2016–08–28T09:00 GMT-06:00 ==>> 1. The
	 * date/times are 6 hours apart. 2. The first date/time is earlier.
	 * 
	 * Fill in the blank: The primary reason default interface methods were added to
	 * Java is to support____________ . ==>> backward compatibility
	 * 
	 * The following method is designed to delete a directory tree recursively.
	 * Which of the following properties reflect the method definition? 1: public
	 * static void delete Tree(File file) { 2: if(!file.isFile()) 3: for(File entry:
	 * file.listFiles()) 4: delete Tree(entry); 5: else file.delete(); 6: } ==>> 1.
	 * It can delete a single file. 2. It compiles but may throw an exception at
	 * runtime.
	 * 
	 * Which correctly fills in the blank to print 2017-01-15? LocalDate hatDay =
	 * LocalDate.of(2017, Month.JANUARY, 15); DateFormatter f =
	 * DateFormatter.ISO_DATE; System.out.println(______________________________);
	 * ==>> Neither of the above
	 * 
	 * How many of Connection, Driver, and DriverManager are JDBC interfaces
	 * included with the JDK? ==>>Two
	 * 
	 * Which of the following are valid lambda expressions? 1. (Long w) -> {Long
	 * w=5; return 5;} 2. (int count, vote) -> count*vote 3. name ->
	 * {name.toUpperCase()} 4. dog -> dog 5. (Double adder) -> {int y;
	 * System.out.print(adder); return adder;} 6. () -> {} ==>> 4, 5, 6
	 * 
	 * If the key purple is in all four of these files, which file will the
	 * following code use for the resource bundle? Locale.setDefault(new
	 * Locale("en", "US")); ResourceBundle rb = ResourceBundle.getBundle("Colors");
	 * rb.getString("purple"); = 1. Colors.class 2. Colors_en_US.class 3.
	 * Colors.properties 4. Colors_en_US.properties ==>> Colors_en_US.class
	 * 
	 * What is correct about the following code snippet?
	 * Files.move(Paths.get("monkey.txt"), Paths.get("/animals"),
	 * StandardCopyOption.ATOMIC_MOVE, LinkOption.NOFOLLOW_LINKS); =>> 1. If another
	 * process is monitoring the file system, it will not see an incomplete file at
	 * runtime. 2. The metadata of the monkey.txt will be moved along with the file.
	 * 
	 * 
	 * Given the following diagram, which two classes can be placed in the blank
	 * boxes? OutputStream -> FileOutputStream -> ? ? ==>> BufferedOutputStream and
	 * PrintStream
	 * 
	 * Given the following code snippet, which lambda expression is the best choice
	 * for the accumulator, based on the rules for applying a parallel reduction?
	 * public class GoodAccumulator { int i; public void test() {
	 * BiFunction<Integer,Integer,Integer> accumulator = _________________;
	 * System.out.print(Arrays.asList(1,2,3,4,5) .parallelStream()
	 * .reduce(0,accumulator,(s1, s2) -> s1 + s2)); } } :: 1. (a,b) -> i++ 2. (a,b)
	 * -> (a-b) 3. (a,b) -> 5 4. None of the above are appropriate.==>> (a,b) -> 5
	 * 
	 * Which of the following methods move the cursor without returning a boolean?
	 * :: 1. previous() 2. afterFirst 3. beforeFirst 4. beforeLast 5. absolute 6.
	 * afterLast ==>> beforeFirst and afterLast
	 * 
	 * submit(){ if(){ process(); #X# else{ List = splitTnhalf();#Y# for(){ submit()
	 * #z# } } ==>>Inserted submit at line z. Inserted process at line X. Inserted
	 * splitTnhalf at line Y.
	 * 
	 * Which classes will allow the following to compile? Inpu Stream is = new
	 * BufferedInput Stream(new File Input Stream("zoo.txt")); Input Stream wrapper
	 * = new _______ (is); 1. ObjectOutputStream 2. ObjectInputStream 3.
	 * FileInputStream 4. Buffered Reader 5. BufferedInput Stream 6. Buffered Writer
	 * ==>>ObjectInputStream and BufferedInputStream
	 * 
	 * Locale ENUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
	 * System.out.print(ENUS.getDisplayLanguage(new Locale("fr"))); ==>> Code will
	 * print the word "english" in French language (anglais).
	 * 
	 * Given the following two property files in the pod package, what does the
	 * following class output? pod.container.properties name=generic number=2
	 * pod.container_en.properties name=Docker type=container package pod; import
	 * java.util.*; public class WhatKind { public static void main(String[] args) {
	 * Locale.setDefault(new Locale("ja")); ResourceBundle rb =
	 * ResourceBundle.getBundle("pod.container"); String name =
	 * rb.getString("name"); // r1 String type = rb.getString("type"); // r2
	 * System.out.println(name + " " + type); } } ==>>Line r2 throws an exception.
	 * 
	 * Which interfaces or classes are in a database-specific JAR file? 1.
	 * Statement’s implementation 2.Driver 3. Statement 4. DriverManager 5. Driver’s
	 * implementation 6. DriverManager’s implementation ==>> 1 and 5
	 * 
	 * Which two statements are true about the walKfileTrac method of the files
	 * class? 1. The maxDepth parameter's value is the maximum number of directories
	 * to visit. 2. If the file is a directory, and If that directory could not be
	 * opened, the poatVisitDirectory method is Invoked with the I/O exception. 3.
	 * The file tree traversal Is breadth first with the given filevisitor Invoked
	 * for each file encountered. 4. If the file attributes cannot be lead due to on
	 * I/O exception, the visitFileFailed method is invoked With the I/O exception.
	 * 5. By default, symbolic links are not automatically followed by this method.
	 * ==>> 2 and 4
	 * 
	 * Which of the following is equivalent to this code? Unary Operator<Integer> u
	 * = x -> x * x; 1. Function f = x -> x*x; 2. Binary Operator<Integer, Integer>
	 * f = x -> x*x; 3. Function<Integer> f = x -> x*x; 4. Bi Function<Integer,
	 * Integer> f = x -> x*x; 5. Bi Function<Integer> f = x -> x*x; 6. None of the
	 * above ==>> 6
	 * 
	 * Assuming the proper generic types are used, which lambda expression cannot be
	 * assigned to a ToDoubleBiFunction functional interface reference? 1. (Integer
	 * a, Double b) -> {int c; return b;} 2. (String u, Object v) ->
	 * u.length()+v.length() 3. (x,y) -> {int z=2; return y/z;} 4. (h,i) -> (long)h
	 * ==>> 2
	 * 
	 * Which statement is not true about these two variables? Duration duration =
	 * Duration.ofDays(1); Period period = Period.ofDays(1); ==>> Both output the
	 * same value when calling toString().
	 * 
	 * If your application has all town names in a single file named
	 * strings.properties, what is the most specific process that has been
	 * implemented? 1. Specialization2. Translation 3. Localization 4.
	 * Internationalization ==>> Internationalization
	 * 
	 * System.out.print(Files.walk(Paths.get("/again/and/again")).count()); ==>> A
	 * number is printed at runtime
	 * 
	 * Which of the following cannot be instantiated directly by the caller using
	 * the constructor? 1. Locale 2. Properties 3. ResourceBundle ==>> 3.
	 * 
	 * mystery=bag type=paper 18: System.out.print(props.getProperty("mystery",
	 * "?")); 19: System.out.print(" "); 20:
	 * System.out.print(props.getProperty("more", "?")); ==>> bag ?
	 * 
	 * mystery=bag type=paper 18: System.out.print(props.getProperty("mystery"));
	 * 19: System.out.print(" "); 20: System.out.print(props.getProperty("more"));
	 * ==>> bag null
	 * 
	 * Which ExecutorService method guarantees all running tasks are stopped in an
	 * orderly fashion?1. None of the above 2. shutdown() 3. shutdownNow() 4. halt()
	 * =>> 1
	 * 
	 * Fill in the blanks: Given a valid Console instance, reader() returns
	 * a__________ , while writer() returns a __________ ==>> Reader, Writer
	 * 
	 * Which resources have their close() method called when this code runs? public
	 * static void runQuery(Connection conn) throws SQLException{ try (Statement
	 * stmt = conn.createStatement()) { ResultSet rs =
	 * stmt.executeQuery("select * from clowns"); rs.next(); } } =>> Only Statement
	 * and ResultSet
	 * 
	 * Which three scenarios would best benefit from using a singleton pattern? 1.
	 * Provide central access to application configuration data. 2. Allow multiple
	 * instances of a static object to be managed in memory. 3. Manage a reusable
	 * cache of objects. 4. Ensure that all objects are lazily instantiated. 5.
	 * Manage write access to a log file. 6. Create read‐only objects that are
	 * thread‐safe. ==>> 1, 3, 5
	 * 
	 * Which of the following statements about functional interfaces is true? 1. It
	 * is possible to define a primitive functional interface that uses float, char,
	 * or short. 2. It is possible to define a functional interface that returns two
	 * data types. 3. It is not possible to define a functional interface that does
	 * not take any arguments nor return any value. 4. None of the primitive
	 * functional interfaces include generic arguments. ==>> 1
	 * 
	 * Which of the following statements are true about the equals() method? ==>> 1.
	 * If equals(null) is called, the method should return false. 2. If equals() is
	 * passed the wrong type, the method should return false.
	 * 
	 * Which statement about Closeable and AutoCloseable is true? 1. The close()
	 * method in a class that implements Closeable cannot throw an Exception. 2.
	 * AutoCloseable extends Closeable. 3. There is no difference; one was added for
	 * backward compatibility. 4. The close() method in a class that implements
	 * AutoCloseable cannot throw an IOException. ==>> 1
	 * 
	 * There are currently 100 rows in the table species before inserting a new row.
	 * What is the output of the following code? try (Connection conn =
	 * DriverManager.getConnection("jdbc:derby:zoo"); Statement stmt =
	 * conn.createStatement()) { Result Set rs =
	 * stmt.executeQuery("select count(*) from species"); int num =
	 * stmt.executeUpdate("INSERT INTO species VALUES (3, 'Ant', .05)"); rs.next();
	 * System.out.println(rs.getInt(1)); ==>> A SQLException is thrown. }
	 * 
	 * What package is the LocalTime class in? ==>> java.time
	 * 
	 * Which NIO.2 Files methods return a Stream? 1. lines() 2. readAllLines() 3.
	 * walkFileTree() 4. list() 5. listFiles() 6. find() ==>> 1 , 4, 6
	 * 
	 * Which of the following is required in a database driver implementation? 1. A
	 * file named jdbc.driver 2. A file named java.sql.Driver 3. At least one
	 * implementation of the Connection interface 4. None of the above ==>> 3
	 * 
	 * Which of the following statements about DoubleSupplier and Supplier<Double>
	 * is not true? 1. One supports a generic type, the other does not. 2. Lambdas
	 * for both can return a double value. 3. Both are functional interfaces. 4.
	 * Lambdas for both cannot return a null value. ==>> 4
	 * 
	 * Which two conditions best describe a thread that appears to be active but is
	 * perpetually stuck and never able to finish its task? 1. Livelock 2. Deadlock
	 * 3. Out of memory error 4. Starvation 5. Race condition 6. Loss of precision
	 * ==>> Livelock and Starvation
	 * 
	 * Which ScheduledExecutorService method can result in the same action being
	 * executed by two threads at the same time? 1. There is no such method in
	 * ScheduledExecutorService. 2. scheduleWithFixedDelay() 3.
	 * scheduleAtFixedDelay() 4. scheduleAtFixedRate() ==>>scheduleAtFixedRate()
	 *
	 * Daylight savings time ends on November 5, 2017 at 2 a.m. when we repeat the
	 * hour. Suppose we have a ZonedDateTime that outputs
	 * 2017-11-05T01:00-04:00[America/ New_York] when calling toString(). What is a
	 * possible value of the ZonedDateTime obtained by adding an hour to this value?
	 * 1. 2017-11-05T01:00-05:00[America/New_York] 2.
	 * 2017-11-05T02:00-05:00[America/New_York] 3.
	 * 2017-11-05T01:00-04:00[America/New_York] 4.
	 * 2017-11-05T02:00-04:00[America/New_York] ==>>
	 * 2017-11-05T01:00-05:00[America/New_York]
	 * 
	 * Which of the following is not an advantage of using an NIO.2 Path instead of
	 * a java.io.File to work with files? 1. Provides a single method for deleting a
	 * directory tree 2. Has ability to read operating-system-specific attributes 3.
	 * Provides efficient access of file metadata 4. Contains built-in support for
	 * symbolic links ==>> Provides a single method for deleting a directory tree
	 * 
	 * What is a common reason for a stream pipeline not to run? 1. The source
	 * doesn’t generate any items. 2. The terminal operation is missing. 3. There
	 * are no intermediate operations. 4. None of the above ==>> 2
	 * 
	 * Suppose that the file c:\book\java exists. Which of the following lines of
	 * code creates an object that represents the file? Should have chosen 1. new
	 * File("c:/book/java"); 2. None of the above 3. new File("c://book//java"); 4.
	 * new File("c:\book\java"); 5. new File("c:\\book\\java"); ==>> new
	 * File("c:/book/java"); and new File("c:\\book\\java");
	 * 
	 * Which of the following statements about the Callable call() and Runnable
	 * run() methods are correct? 1. Runnable returns a generic type. 2. Both
	 * methods return void. 3. Callable can throw a checked exception. 4. Both can
	 * be implemented with lambda expressions. 5. Callable returns a generic type.
	 * 6. Both can throw unchecked exceptions. 7. Callable takes a generic method
	 * argument. ==>> 3, 4, 5, 6
	 *
	 * Fill in the blank: ____________is the only functional interface that does not
	 * involve double, int, or long. ==>> BooleanSupplier
	 * 
	 * Which of the following static methods does not exist in the Executors class?
	 * 1. newSingleThreadExecutor() 2. newFixedThreadPool() 3.
	 * newSingleThreadScheduledExecutor() 4. newFixedScheduledThreadPool() ==>> 4
	 * 
	 * Which statement about ListResourceBundle is true? 1. A disadvantage over
	 * properties files is that you cannot create the value at runtime. 2. Values of
	 * type Integer are not allowed. 3. None of the above 4. Names-fr.java is a bad
	 * implementation class name. ==>> 4
	 * 
	 * Which of the following are valid Callable expressions? 1. () -> 5 2. () ->
	 * {String s = "";} 3. (int count) -> count+1 4. () ->
	 * {System.out.println("Giraffe"); return 10;} 5. () -> "The" + "Zoo" 6. () ->
	 * {return null} 7. a -> {return 10;} ==>> 1, 4, 5
	 * 
	 * Which of the following are not java.io classes? 1. FileWriter 2. PrintReader
	 * 3. FileReader 4. BufferedWriter 5. PrintWriter 6. BufferedReader ==>>
	 * PrintReader
	 * 
	 * Which of the following are JDBC interfaces in the java.sql package? 1. Driver
	 * 2. DriverManager 3. Query 4. ResultSet ==>> I, IV
	 * 
	 * Which statement is true about the JDBC core classes? ==>> A Statement
	 * automatically starts in auto-commit mode.
	 * 
	 * Which of the following lambda expressions can be passed to a method that
	 * takes IntUnaryOperator as an argument? 1. (Integer w) -> w.intValue() 2. (int
	 * q) -> q/3.1 3. (long x) -> (int)x 4. (int j) -> (int)30L 5. v ->
	 * {System.out.print("Hello!"); return 2%1;} 6. z -> z ==>> 4, 5, 6
	 * 
	 * Which of the following are true? ==>> 1. DriverManager.getConnection() throws
	 * a SQLException if the driver class is not found. 2. Class.forName() throws a
	 * ClassNotFoundException if the driver class is not found.
	 * 
	 */

}
