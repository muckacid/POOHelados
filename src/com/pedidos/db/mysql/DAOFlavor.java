package com.pedidos.db.mysql;

import com.pedidos.db.Conexion;
import com.pedidos.db.DAO;
import com.pedidos.model.iceScream.Flavor;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOFlavor implements DAO<Flavor> {

    private Conexion conn;

    public DAOFlavor(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Flavor t) throws SQLException {
        String query = "INSERT INTO flavors_iceScream VALUES(null, '" + t.getTag() + "', " + t.getPrice() + ");";
        conn.execute(query);
    }

    @Override
    public void update(Flavor t) throws SQLException {
        String query = "UPDATE flavors_iceScream SET name = '"+t.getTag()+"', price_per = '"+t.getPrice()+"' WHERE id = "+t.getId()+";";
        conn.execute(query);
    }

    @Override
    public void delete(Flavor t) throws SQLException {
        String query = "DELETE FROM flavors_iceScream WHERE id = "+t.getId()+";";
        conn.execute(query);
    }

    @Override
    public Flavor getOne(int id) throws SQLException {
        String query = "SELECT * FROM flavors_iceScream WHERE id = " + id + ";";
        ResultSet rs = conn.execute(query);
        Flavor flavor = new Flavor();
        if (rs.next()) {
            flavor.setId(rs.getInt("id"));
            flavor.setTag(rs.getString("name"));
            flavor.setPrice(rs.getInt("price_per"));
        }
        conn.close();
        return flavor;
    }

    @Override
    public List<Flavor> getAll() throws SQLException {
        String query = "SELECT * FROM flavors_iceScream;";
        ResultSet rs = conn.execute(query);
        List<Flavor> flavorList = new ArrayList<>();
        while (rs.next()) {
            Flavor flavor = new Flavor();
            flavor.setId(rs.getInt("id"));
            flavor.setTag(rs.getString("name"));
            flavor.setPrice(rs.getInt("price_per"));
            flavorList.add(flavor);
        }
        conn.close();
        return flavorList;
    }

    public List<Flavor> getByName(String filter) throws SQLException {
        String query = "SELECT * FROM flavors_iceScream WHERE name LIKE '%"+filter+"%'";
        ResultSet rs = conn.execute(query);
        
        List<Flavor> flavorList = new ArrayList<>();
        while(rs.next()){
            Flavor sabor = new Flavor();
            sabor.setId(rs.getInt("id"));
            sabor.setTag(rs.getString("name"));
            sabor.setPrice(rs.getInt("price_per"));
            flavorList.add(sabor);
        }
        
        conn.close();
        return flavorList;
    }

}
