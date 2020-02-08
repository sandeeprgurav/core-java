package com.ocp;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExecutorServiceTest3 {
	public static void main(String[] args) throws InterruptedException, ExecutionException { 
		/*ExecutorService e = Executors.newSingleThreadExecutor();
		Runnable r1 = () -> Stream.of(1, 2, 3).parallel();
		Callable r2 = () -> Stream.of(4, 5, 6).parallel();

		Future<Stream> f1 = e.submit(r1); // Cant pass Runnable to Future object 
		Future<Stream> f2 = e.submit(r2);

		//Stream<Integer> s = Stream.of(f1.get(), f2.get()).flatMap(p -> p).parallelStream(); // parallelStream on flatMap not exist
		 
		ConcurrentMap<Boolean, List<Integer>> r = s.collect(Collectors.groupingByConcurrent(i -> i % 2 == 0));
		System.out.println(r.get(false).size() + " " + r.get(true).size());*/
	}
}

// Ans: The code does not compile due to two errors.
