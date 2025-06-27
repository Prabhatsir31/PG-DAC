package mypack;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class CustomerDAOImpl implements CustomerDAO 
{
	private JdbcTemplate jdbcTemplate;
	@Override
	public void insertCustomer(Customer customer) 
	{
		String query="insert into customers values(?,?,?)";
		jdbcTemplate.update(query,new Object[]{customer.getCustomerId(),customer.getCustomerName(),customer.getAddress()});
		
	}


	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate=new JdbcTemplate(dataSource);
	}


	@Override
	public List<?> viewCustomers() {
		String query="select * from customers";
		return (List<?>)jdbcTemplate.queryForObject(query,new RowMapper<Object>()
		{
			@Override
			public Object mapRow(ResultSet resultSet,int rowNum)throws SQLException
			{
			 	List<Customer>ar=new ArrayList<Customer>();
				do
				{
				ar.add(new Customer(resultSet.getInt("customerid"),resultSet.getString("customername"),resultSet.getString("address")));
				}while(resultSet.next());
				return ar;
			}
		});
	}

}
