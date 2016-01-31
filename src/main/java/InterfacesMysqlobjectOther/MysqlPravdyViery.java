/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.PravdyViery;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Robert Link
 */
public class MysqlPravdyViery implements PravdyVieryDao{

    private JdbcTemplate jdbcTemplate;
    
    
    public MysqlPravdyViery(){
     	MysqlDataSource dataSource = new MysqlDataSource();
        
        dataSource.setUrl("jdbc:mysql://localhost/modlibnicek");
	dataSource.setUser("paz1cuser");
	dataSource.setPassword("simon.123");
	jdbcTemplate = new JdbcTemplate(dataSource);
	
    }
    
    
    @Override
    public void pridat(PravdyViery pravdy) {
        String sql="Insert into  PravdyViery values (?,?,?)";
        jdbcTemplate.update(sql, null,pravdy.getNazov(),pravdy.getObsah());
        
    }

    @Override
    public void odstranit(PravdyViery pravdy) {
        String sql="Delete from PravdyViery where ID= ?";
        jdbcTemplate.update(sql,pravdy.getID());

        
    }

    @Override
    public List<PravdyViery> dajVsetky() {
        String sql = "Select * from PravdyViery";
        BeanPropertyRowMapper<PravdyViery> mapper = BeanPropertyRowMapper.newInstance(PravdyViery.class);
        return jdbcTemplate.query(sql, mapper);

    }

    @Override
    public void upravit(PravdyViery pravdy) {
        String sql= "Update PravdyViery Set nazov=?, obsah=? where ID= ? ";
        jdbcTemplate.update(sql,pravdy.getNazov(),pravdy.getObsah(),pravdy.getID());
        
    }

    @Override
    public List<PravdyViery> hladat(String s) {
        String sql = "Select * from PravdyViery where nazov like '%"+s+"%'";
        BeanPropertyRowMapper<PravdyViery> mapper = BeanPropertyRowMapper.newInstance(PravdyViery.class);
        return jdbcTemplate.query(sql, mapper);


    }
    
    
    
    
    
}
