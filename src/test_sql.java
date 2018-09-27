import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author Meredith
 * @Date 2018/9/7 23:20
 * @Param
 * @Return
 * @Description:
 **/
class test_sql
{
    String sqlLines = "";
    String result[] = new String[10000];//用数组获取结果集合

    public void SQL()
    {
        // Create a variable for the connection string.
        String url = "jdbc:sqlserver://localhost:1433;databaseName=船只资料数据库;user=user01;password=33540@TAY";//user01身份连接

        // Declare the JDBC objects.
        ResultSet rs = null;
        Connection con = null;
        Statement stmt = null;
        try
        {

            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);

            // Create and execute an SQL statement that returns some data.
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqlLines);

            // Iterate through the data in the result set and display it.

            int count = rs.getMetaData().getColumnCount();//求列数
            while (rs.next())//遍历行
            {
                for (int i = 1; i < count+1; i++)//遍历列
                {
                    result[i] = rs.getString(i);
                }
            }
        }


        // Handle any errors that may have occurred.
        catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            if (rs != null)
                try
                {
                    rs.close();
                } catch (Exception e)
                {
                }
            if (stmt != null)
                try
                {
                    stmt.close();
                } catch (Exception e)
                {
                }
            if (con != null)
                try
                {
                    con.close();
                } catch (Exception e)
                {
                }
        }
    }
}