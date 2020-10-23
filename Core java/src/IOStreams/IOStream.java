package IOStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOStream {

	public static void main(String[] args) throws IOException {
		// fileInputStream();
		// fileOutputStream();
		// fileIOStream();
		// byteArrayOutputStream();
		// sequenceInputStream();
		// bufferedOutputStream();
		// bufferedInputStream();
		fileReader();
		// fileWriter();
	}

	// Java FileWriter class is used to write character-oriented data to the
	// file.
	private static void fileWriter() throws IOException {

		FileWriter fw = new FileWriter("abc.txt");
		fw.write("Hiiii...");

		fw.close();
	}

	// Java FileReader class is used to read data from the file. It returns data
	// in byte format like FileInputStream class.
	private static void fileReader() throws IOException {

		FileReader fr = new FileReader("abc.txt");
		
		int i = 0;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		
		fr.close();
	}

	@SuppressWarnings("unused")
	private static void bufferedInputStream() throws IOException {

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
				"abc.txt"));
		int i = 0;

		while ((i = bis.read()) != -1)
			System.out.print((char) i);

		bis.close();

	}

	// Java BufferedOutputStream class uses an internal buffer to store data. It
	// adds more efficiency than to write data directly into a stream. So, it
	// makes the performance fast.
	@SuppressWarnings("unused")
	private static void bufferedOutputStream() throws IOException {

		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("abc.txt"));

		String str = "Ankit";
		byte[] b = str.getBytes();

		bos.write(b);
		bos.close();

	}

	// Java SequenceInputStream class is used to read data from multiple streams
	@SuppressWarnings("unused")
	private static void sequenceInputStream() throws IOException {

		FileInputStream fin1 = new FileInputStream("f1.txt");
		FileInputStream fin2 = new FileInputStream("f2.txt");

		SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
		int i;
		while ((i = sis.read()) != -1) {
			System.out.print((char) i);
		}
		sis.close();
		fin1.close();
		fin2.close();
	}

	// Java ByteArrayOutputStream class is used to write data into multiple
	// files
	@SuppressWarnings("unused")
	private static void byteArrayOutputStream() throws IOException {

		FileOutputStream fout1 = new FileOutputStream("f1.txt");
		FileOutputStream fout2 = new FileOutputStream("f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(169);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("success...");
	}

	@SuppressWarnings("unused")
	private static void fileIOStream() throws IOException {

		FileInputStream fis = new FileInputStream("abc.txt");
		FileOutputStream fos = new FileOutputStream("abd.txt");
		int i = 0;
		while ((i = fis.read()) != -1)
			fos.write(((byte) i));

		fis.close();
		fos.close();
	}

	@SuppressWarnings("unused")
	private static void fileOutputStream() throws IOException {

		FileOutputStream fos = new FileOutputStream("abc.txt");

		String str = "abc";

		byte[] b = str.getBytes();

		fos.write(b);
		fos.close();

	}

	@SuppressWarnings("unused")
	private static void fileInputStream() throws IOException {

		FileInputStream fis = new FileInputStream("abc.txt");
		int i = 0;

		while ((i = fis.read()) != -1)
			System.out.print((char) i);

		fis.close();

	}
}
