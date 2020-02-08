package com.ocp;

public class Notes {

	/*
	 * # Which of the following statements about inheritance and object composition
	 * are correct? 1.Object composition requires a class variable to be declared
	 * public or accessible from a public method to be used by a class in a
	 * different package.| 2.Inheritance supports access to protected variables.
	 * Object composition tends 3.to promote greater code reuse than inheritance.
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
	 * type? All methods of the class object may be invoked on the two-dimensional
	 * array. At the declaration time, the number of elements of the array in each
	 * dimension must be specified.
	 * 
	 * Which of the following are valid lambda expressions?() -> "" | (Camel c) ->
	 * {return;}
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
	 * Given the code fragment:
	 * 
	 * List<Integer> list1 = Arrays.asList(10, 20); List<Integer> list2 =
	 * Arrays.asList(15, 30); //line n1
	 * 
	 * Which code fragment, when inserted at line n1, prints 10 20 15 30?
	 * ==>>Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s ->
	 * System.out.print(s + " "));
	 * 
	 * Writer is__________ that related stream classes__________ . ==>> an abstarct
	 * class , extend
	 * 
	 * If the current working directory is /zoo, and the path /zoo/turkey does not
	 * exist, then what is the result of executing the following code?
	 * 
	 * Path path = Paths.get("turkey");
	 * if(Files.isSameFile(path,Paths.get("/zoo/turkey"))) // x1
	 * Files.createDirectory(path.resolve("info")); // x2 ==>> It compiles but
	 * throws an exception at runtime.
	 * 
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
	 * species private and final, Make the geter method final and remove the setter
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
	 * of executing the following code snippet?
	 * 
	 * Path w1 = Paths.get("../jungle/.././rain..") .toAbsolutePath().normalize();
	 * System.out.print(w1.resolve("snow.txt")); ==>> /rain../snow.txt
	 * 
	 * Which of the following could be inserted to fill in the blank?
	 * 
	 * public interface Otter { default void play() { } } class River Otter
	 * implements Otter { __} ==>> 1. @Override public boolean equals(Object o) {
	 * return false; } 2. @Override public int hashCode() { return 42; } 3.@Override
	 * public void play() { }
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
	 * 
	 * Path path1 = Paths.get("./goat.txt").normalize(); // k1 Path path2 =
	 * Paths.get("mule.png");
	 * Files.copy(path1,path2,StandardCopyOption.COPY_ATTRIBUTES); //k2
	 * System.out.println(Files.isSameFile(path1, path2)); //k3 ==>> It will output
	 * false.
	 * 
	 * Which can independently fill in the blank to output No dessert today?
	 * 
	 * import java.util.*; public class Dessert { public static void main(String[]
	 * yum) { eatDessert(Optional.of("Cupcake")); } private static void
	 * eatDessert(Optional<String> opt) { System.out.println(opt.____________); }
	 * }==>> None of the above
	 * 
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
	 * successfully?
	 * 
	 * int age = 22; final String name = "Josephine"; ==>> assert age!=age : (1<age
	 * ? "Error" : 10);
	 * 
	 * What is the output of the following code? Local Date Time d =
	 * LocalDateTime.of(2015, 5, 10, 11, 22, 33); Period p = Period.of(1, 2, 3); d =
	 * d.minus(p); Date Time Formatter f = Date Time Formatter. ofLocalized
	 * Time(FormatStyle.SHORT); System.out.println(d.format(f)); ==>> 11:22 AM
	 * 
	 * Which fills in the blank in the method signature to allow this code to
	 * compile? import java.util.*; public class ExtendingGenerics { private static
	 * <_____________ , U> U add(T list, U element) { list.add(element); return
	 * element; } public static void main(String[] args) { List<String> values = new
	 * ArrayList<>(); add(values, "duck"); add(values, "duck"); add(values,
	 * "goose"); System.out.println(values); } } ==>> T extends Collection<U>
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
	 * Which can fill in the blank to have the code print true? Stream<Integer>
	 * stream = Stream.iterate(1, i ‐> i+1); boolean b = stream.____________(i -> i
	 * > 5); System.out.println(b);==>> Non of the above
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
	 * Which of the following are properties of classes that define immutable
	 * objects? ==> 1. They don’t define any setter methods. 2.All of the instance
	 * variables marked private and final. 3.They prevent methods from being
	 * overridden.
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
	 * Starting with DoubleConsumer and going downward, fill in the missing values
	 * for the table. DoubleConsumer IntFunction LongSupplier ObjDoubleConsumer ==>>
	 * 1, 1, 0, 2
	 * 
	 * A developer tries to rewrite a method that uses flatMap() without using that
	 * intermediate operator. Which pair of method calls shows the withoutFlatMap()
	 * method is not equivalent to the withFlatMap() method?==>> withFlatMap(queue);
	 * withoutFlatMap(queue);
	 *
	 * public class Ticket Manager { private Ticket Manager() { super(); } private
	 * static Ticket Manager instance; public static synchronized Ticket Manager get
	 * Instance() { // k1 if (instance == null) instance = new Ticket Manager(); //
	 * k2 return instance; } private int tickets; public int get Ticket Count() {
	 * return tickets; } public void make Tickets Available(int value) { tickets +=
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
	 * u, Object v) -> u.length()+v.length()
	 * 
	 * ==>> walk,toddle,
	 * 
	 * ______________________________ return now.getMonth() == dateTime.getMonth()
	 * && now.getDayOfMonth() == dateTime.getDayOfMonth(); } ==>> LocalDate now =
	 * LocalDate.now();
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
	 * ==>> Both of the above
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
	 * System.out.println(fr.read()); fr.close(); ==>> 65
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
	 * "select * from people order by last_name asc")) {
	 * rs.afterLast(); rs.next(); rs.next(); rs.previous(); rs.previous();
	 * System.out.println(rs.getString(1)); } ==>> Elena
	 * 
	 */

}
