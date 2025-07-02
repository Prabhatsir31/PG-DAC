package mypack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CustomerDAOImpl implements CustomerDAO 
{
	private DataSource dataSource;
	@Override
	public void insertCustomer(Customer customer) 
	{
	/* Specifying statement. */
		String query="insert into customers values(?,?,?)";
	/* defining the connection and prepared statement parameters */
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		try
		{
			/* opening a connection */
			connection=dataSource.getConnection();
			/* preparing the statement */
			preparedstatement=connection.prepareStatement(query);
			/* binding the parameters to the PreparedStatement */
			preparedstatement.setInt(1,customer.getCustomerId());
			preparedstatement.setString(2,customer.getCustomerName());
			preparedstatement.setString(3,customer.getAddress());
			/* executing the statement */
			preparedstatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				/* closing the prepared statement */
				if(preparedstatement!=null)
				{
					preparedstatement.close();
				}
				/* closing the connection */
				if(connection!=null)
				{
					connection.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}








