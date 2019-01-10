import java.io.*;

/**
 * 題目編號 Java-B10：匯入指定檔案的文字並印出
 *
 * @throws Exception if file can't find
 * @author Yuyi Lee
 * @version 1.0 Jan-03-2019
 * @since 1.0
 */
public class B10 {
    public static void main(String args[]){
//        System.out.println(System.getProperty("user.dir"));

        try {
            String inputTxtFileName = "src/B10-input.txt";
            String outputTxtFileName = "src/B10-output.txt";

            BufferedReader txtBufferedReader = inputTxtToBufferedReader(inputTxtFileName);
            PrintWriter txtPrintWriter = null;

            String line = "";

            try{
                txtPrintWriter = new PrintWriter(outputTxtFileName, "UTF8");

                while ((line = txtBufferedReader.readLine()) != null){
                    txtPrintWriter.println(line);
                    System.out.println(line);
                }
            } catch (IOException e){
                System.out.println("Exception occur when writing file.");
                e.printStackTrace();

            } finally {
                if(txtBufferedReader != null){
                    txtBufferedReader.close();
                }
                if(txtPrintWriter != null){
                    txtPrintWriter.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BufferedReader inputTxtToBufferedReader(String txtFileName){
        FileInputStream txtFileInputStream;
        InputStreamReader txtInputStreamReader = null;

        try {
            txtFileInputStream = new FileInputStream(txtFileName);
            txtInputStreamReader = new InputStreamReader(txtFileInputStream, "UTF8");

        } catch (FileNotFoundException e){
            System.out.println("Text file not found.");
            System.exit(0);
        } catch (UnsupportedEncodingException e){
            System.out.println("Charset is not supported.");
            System.exit(0);

        } finally {
            return new BufferedReader(txtInputStreamReader);
        }
    }
}