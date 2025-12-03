import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class ShipperDAO {
    private final BasicDataSource dataSource;

    public ShipperDAO() {
            this.dataSource = new BasicDataSource();
            dataSource.setUrl("jdbc:postgresql://localhost:3306/northwind");
            dataSource.setUsername("root");       // <-- your username
            dataSource.setPassword("yearup");      // <-- your password
    }

    public int insertShipper(Shipper shipper){
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement("INSERT INTO shippers (CompanyName, Phone) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS))
        {
            statement.setString(1, shipper.getShipperPhone());
            statement.setString(2, shipper.getShipperName());
            int rows = statement.executeUpdate();

            try(ResultSet resultSet = statement.getGeneratedKeys()){
                if (resultSet.next()){
                    int pk = resultSet.getInt(1);
                    System.out.println("%pk");
                    shipper.setShipperID(pk);
                    return pk;
                }
            }
        } catch (SQLException exception){
        System.out.println(exception);
    }
    return 0;
    }


}
