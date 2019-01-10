
/**
 * 題目編號 Java-B2：將兩個句子以 StringBuffer 串接
 *
 * @author Yuyi Lee
 * @version 1.0 Jan-02-2019
 * @since 1.0
 */
public class B2 {
    public static void main(String args[]){
        try {
            StringBuffer sqlStatementBuffer = new StringBuffer();
            String selectStatement = "select * from abc ";
            String whereStatement = "where id=2;";

            sqlStatementBuffer.append(selectStatement);
            sqlStatementBuffer.append(whereStatement);

            String sqlStatement = sqlStatementBuffer.toString();
            System.out.println(sqlStatement);

            // delete(m, n)
            sqlStatementBuffer.delete(0, sqlStatementBuffer.length());
            System.out.println(sqlStatementBuffer.length());    // 0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
