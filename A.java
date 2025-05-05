import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class A{
	public static void main(String[] args) throws IOException{
		File file = new File("randomSubSubDir");
		System.out.println(file.mkdir());
	}
}