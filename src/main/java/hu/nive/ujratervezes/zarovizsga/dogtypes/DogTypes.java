package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.util.List;

public class DogTypes {
    DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country){


//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("select * from activities where id=?");
//        ) {
//            List<Activity> listfromDB = new ArrayList<>();
//            //ps.setLong(1, 1L);
//            stmt.setLong(1, id);
//            try (ResultSet rs = stmt.executeQuery()) {
//                while (rs.next()) {
//                    int idDb = rs.getInt("id");
//                    LocalDateTime start_time = rs.getTimestamp("start_time").toLocalDateTime();
//                    String desc = rs.getString("activity_desc");
//                    String type = rs.getString("activity_type");
//                    listfromDB.add(new Activity(idDb, start_time, desc, Type.valueOf(type)));
//                }
//                return listfromDB;
//            }
//        } catch (SQLException e) {
//            throw new IllegalArgumentException("Cannot insert", e);
//        }



        return null;
    }

}
