import java.io.*;
import java.util.Scanner;

public class Main1 {

public static void main(String[] args) {

String fileName = "student.txt";

// =========================================================
// 1. CREATE FILE
// =========================================================

System.out.println("----- 1. CREATE FILE -----");

File file = new File(fileName);

try {

if (file.createNewFile()) {
System.out.println("File created successfully");
} else {
System.out.println("File already exists");
}

} catch (IOException e) {
System.out.println("Error while creating file");
}


// =========================================================
// 2. FILE INFORMATION
// =========================================================

System.out.println("\n----- 2. FILE INFORMATION -----");

System.out.println("File Name: " + file.getName());
System.out.println("File Exists: " + file.exists());
System.out.println("Absolute Path: " + file.getAbsolutePath());
System.out.println("File Size: " + file.length() + " bytes");
System.out.println("Is File: " + file.isFile());
System.out.println("Is Directory: " + file.isDirectory());


// =========================================================
// 3. WRITE DATA INTO FILE
// =========================================================

System.out.println("\n----- 3. WRITE DATA -----");

try {

FileWriter writer = new FileWriter(fileName);

writer.write("Rahul\n");
writer.write("Priya\n");
writer.write("Amit\n");
writer.write("Sneha\n");

writer.close();

System.out.println("Data written successfully");

} catch (IOException e) {
System.out.println("Error while writing file");
}


// =========================================================
// 4. APPEND DATA INTO FILE
// =========================================================

System.out.println("\n----- 4. APPEND DATA -----");

try {

FileWriter writer = new FileWriter(fileName, true);

writer.write("Rohit\n");
writer.write("Neha\n");

writer.close();

System.out.println("Data appended successfully");

} catch (IOException e) {
System.out.println("Error while appending data");
}


// =========================================================
// 5. READ FILE USING FileReader
// =========================================================

System.out.println("\n----- 5. READ USING FileReader -----");

try {

FileReader reader = new FileReader(fileName);

int data;

while ((data = reader.read()) != -1) {

System.out.print((char) data);

}

reader.close();

} catch (IOException e) {
System.out.println("Error while reading file");
}


// =========================================================
// 6. READ FILE USING BufferedReader
// =========================================================

System.out.println("\n----- 6. READ USING BufferedReader -----");

try {

FileReader reader = new FileReader(fileName);

BufferedReader br = new BufferedReader(reader);

String line;

while ((line = br.readLine()) != null) {

System.out.println(line);

}

br.close();

} catch (IOException e) {
System.out.println("Error while reading file");
}


// =========================================================
// 7. READ FILE USING Scanner
// =========================================================

System.out.println("\n----- 7. READ USING Scanner -----");

try {

Scanner sc = new Scanner(file);

while (sc.hasNextLine()) {

String line = sc.nextLine();

System.out.println(line);

}

sc.close();

} catch (FileNotFoundException e) {

System.out.println("File not found");

}


// =========================================================
// 8. COUNT WORDS IN FILE
// =========================================================

System.out.println("\n----- 8. COUNT WORDS -----");

int wordCount = 0;

try {

Scanner sc = new Scanner(file);

while (sc.hasNext()) {

sc.next();

wordCount++;

}

sc.close();

System.out.println("Total Words: " + wordCount);

} catch (FileNotFoundException e) {

System.out.println("File not found");

}


// =========================================================
// 9. COUNT LINES IN FILE
// =========================================================

System.out.println("\n----- 9. COUNT LINES -----");

int lineCount = 0;

try {

BufferedReader br =
new BufferedReader(new FileReader(fileName));

while (br.readLine() != null) {

lineCount++;

}

br.close();

System.out.println("Total Lines: " + lineCount);

} catch (IOException e) {

System.out.println("Error while counting lines");

}


// =========================================================
// 10. FILE INPUT STREAM
// =========================================================

System.out.println("\n----- 10. FileInputStream -----");

try {

FileInputStream input =
new FileInputStream(fileName);

int data;

while ((data = input.read()) != -1) {

System.out.print((char) data);

}

input.close();

} catch (IOException e) {

System.out.println("Error while reading using stream");

}


// =========================================================
// 11. FILE OUTPUT STREAM
// =========================================================

System.out.println("\n----- 11. FileOutputStream -----");

try {

FileOutputStream output =
new FileOutputStream("output.txt");

String message = "Hello Students!";

output.write(message.getBytes());

output.close();

System.out.println("Data written using FileOutputStream");

} catch (IOException e) {

System.out.println("Error while writing using stream");

}


// =========================================================
// 12. COPY FILE USING STREAMS
// =========================================================

System.out.println("\n----- 12. COPY FILE -----");

try {

FileInputStream input =
new FileInputStream(fileName);

FileOutputStream output =
new FileOutputStream("copy.txt");

int data;

while ((data = input.read()) != -1) {

output.write(data);

}

input.close();
output.close();

System.out.println("File copied successfully");

} catch (IOException e) {

System.out.println("Error while copying file");

}


// =========================================================
// 13. DELETE FILE
// =========================================================

System.out.println("\n----- 13. DELETE FILE -----");

File deleteFile = new File("copy.txt");

if (deleteFile.delete()) {

System.out.println("File deleted successfully");

} else {

System.out.println("File could not be deleted");

}

}
}