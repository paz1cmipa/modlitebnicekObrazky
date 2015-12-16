/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesMysqlobjectOther;

import Entity.Citat;
import Entity.SrdcovyBonus;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Šimon
 */
public class MysqlBonus implements SrdcovyBonusDao{

    private JdbcTemplate jdbcTemplate;

	public MysqlBonus() {
		MysqlDataSource dataSource = new MysqlDataSource();
		try {
			dataSource.setUrl("jdbc:mysql://localhost/Modlibnicek");

			dataSource.setUser("paz1cuser");
			dataSource.setPassword("simon.123");

			jdbcTemplate = new JdbcTemplate(dataSource);
			if (jdbcTemplate == null) {
				System.err.println("chyba");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
    
    @Override
    public SrdcovyBonus nahodneVyber() {

        	String nahoda = "SELECT * FROM bonus \n" + "ORDER BY RAND()\n" + "LIMIT 1";
		BeanPropertyRowMapper<SrdcovyBonus> mapper = BeanPropertyRowMapper.newInstance(SrdcovyBonus.class);

		return jdbcTemplate.query(nahoda, mapper).get(0);
    }

    @Override
    public List<SrdcovyBonus> dajVsetky() {

    	String sql = "SELECT * FROM bonus";

		BeanPropertyRowMapper<SrdcovyBonus> mapper = BeanPropertyRowMapper.newInstance(SrdcovyBonus.class);
		return jdbcTemplate.query(sql, mapper);

	}
    @Override
    public void pridaj(SrdcovyBonus sb) {

		String sql = "INSERT INTO citaty VALUES (?, ?)";
		jdbcTemplate.update(sql, sb.getText(), sb.getZdroj());
	}
    

    @Override
    public void odstranit(SrdcovyBonus sb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
